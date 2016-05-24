package com.vnw.data.service.impl;

import com.algolia.search.saas.AlgoliaException;
import com.vnw.data.Utils;
import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.Tbljob;
import com.vnw.data.jooq.tables.records.TbljobRecord;
import com.vnw.data.mapper.AlgoliaJobMapper;
import com.vnw.data.model.AlgoliaJob;
import com.vnw.data.model.PageSeek;
import com.vnw.data.service.AlgoliaService;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Condition;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.SelectConditionStep;
import org.jooq.SelectJoinStep;
import org.jooq.SelectSeekStep1;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by phuonghqh on 5/19/16.
 */
@Slf4j
@Service
public class AlgoliaServiceImpl implements AlgoliaService {

  @Resource
  private AlgoliaJobMapper algoliaJobMapper;

  @Value("${vnw.sql.limit}")
  private int limit;

  @Value("${vnw.importJobs.lastMins}")
  private int lastMins;

  private SelectJoinStep<Record10<Integer, Integer, String, String, String, String, Integer, Integer, Timestamp, Byte>> selectJobs(Env env) {
    return env.getDsl()
      .select(
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.COMPANYID,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.COMPANYDESC,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBTITLE,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBDESCRIPTION,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.SKILLEXPERIENCE,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.SALARYMIN,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.SALARYMAX,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.EXPIREDDATE,
        com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBLEVELID
      )
      .from(com.vnw.data.jooq.tables.Tbljob.TBLJOB);
  }

  //TODO support threads
  private PageSeek jobPageSeek(Env env) {
    return new PageSeek()
      .setMinId(
        env.getDsl()
          .select(DSL.min(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID))
          .from(com.vnw.data.jooq.tables.Tbljob.TBLJOB)
          .fetchOneInto(Integer.class)
      )
      .setMaxId(
        env.getDsl()
          .select(DSL.min(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID))
          .from(com.vnw.data.jooq.tables.Tbljob.TBLJOB)
          .fetchOneInto(Integer.class)
      )
      .setCount(
        env.getDsl()
          .select(DSL.count(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID))
          .from(com.vnw.data.jooq.tables.Tbljob.TBLJOB)
          .fetchOneInto(Integer.class)
      );
  }

  private SelectSeekStep1<Record10<Integer, Integer, String, String, String, String, Integer, Integer, Timestamp, Byte>, Integer> selectImportJobs(Env env, boolean onlyLastJobs) {
    SelectConditionStep<Record10<Integer, Integer, String, String, String, String, Integer, Integer, Timestamp, Byte>> selectWhere = selectJobs(env)
      .where(activeJobCondition()
        .and(com.vnw.data.jooq.tables.Tbljob.TBLJOB.EXPIREDDATE.ge(new Timestamp(new Date().getTime())))
      );

    if (onlyLastJobs) {
      selectWhere = selectWhere
        .and(timestampFromLastTimeInMinsCondition(com.vnw.data.jooq.tables.Tbljob.TBLJOB.LASTUPDATEDDATE, this.lastMins)
          .or(timestampFromLastTimeInMinsCondition(com.vnw.data.jooq.tables.Tbljob.TBLJOB.APPROVEDDATE, this.lastMins))
        );
    }

    return selectWhere.orderBy(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID.asc());
  }

  public int importJobs(Env env, boolean onlyLastJobs) {
    log.debug("{}", onlyLastJobs ? "Going to update new jobs" : "Import all jobs");

    int count = 0;
    Integer lastJobId = null;
    while (true) {
      SelectSeekStep1<Record10<Integer, Integer, String, String, String, String, Integer, Integer, Timestamp, Byte>, Integer> select = selectImportJobs(env, onlyLastJobs);
      List<Tbljob> jobs = lastJobId == null ?
        select.limit(limit).fetchInto(Tbljob.class) :
        select.seek(lastJobId).limit(limit).fetchInto(Tbljob.class);
      log.debug("SQL generated :\n {}", select.toString());
      if (jobs.size() == 0) {
        break;
      }

      List<AlgoliaJob> algoliaJobs = jobs.stream().map(job -> algoliaJobMapper.from(env, job)).collect(Collectors.toList());
      lastJobId = jobs.get(jobs.size() - 1).getJobid();

      JSONArray comingJobs = new JSONArray(algoliaJobs);

      try {
        JSONObject objs = env.getAlgoliaIndex().saveObjects(comingJobs);
        count += objs.getJSONArray("objectIDs").length();
        log.debug("Algolia successful saved objs = {}", objs);
      }
      catch (AlgoliaException e) {
        log.debug("Failed to save to Algolia", e);
      }

      log.debug("Completed post to Algolia {} jobs", count);
    }

    log.debug("Done post to Algolia {} jobs", count);
    return count;
  }

  private Condition expiredDateFromYesterdayCondition() {
    Date now = new Date();
    Date yesterday = Utils.add(now, Calendar.DATE, -1);
    return com.vnw.data.jooq.tables.Tbljob.TBLJOB.EXPIREDDATE.lt(new Timestamp(now.getTime()))
      .and(com.vnw.data.jooq.tables.Tbljob.TBLJOB.EXPIREDDATE.ge(new Timestamp(yesterday.getTime())));
  }

  private Condition timestampFromLastTimeInMinsCondition(TableField<TbljobRecord, Timestamp> field, int lastTimeInMins) {
    Date now = new Date();
    Date lastTime = Utils.add(now, Calendar.MINUTE, lastTimeInMins);
    return field.between(new Timestamp(lastTime.getTime()), new Timestamp(now.getTime()));
  }

  private Condition activeJobCondition() {
    return com.vnw.data.jooq.tables.Tbljob.TBLJOB.ISAPPROVED.eq((byte) 1)
      .and(com.vnw.data.jooq.tables.Tbljob.TBLJOB.ISACTIVE.eq((byte) 1))
      .and(com.vnw.data.jooq.tables.Tbljob.TBLJOB.ISCOMPLETED.eq((byte) 1))
      .and(com.vnw.data.jooq.tables.Tbljob.TBLJOB.ISDELETED.eq((byte) 0))
      .and(com.vnw.data.jooq.tables.Tbljob.TBLJOB.ISUNPAIDDISABLE.ne((byte) 1));
  }

  public void deleteDeprecatedJobs(Env env) {
    SelectConditionStep<Record1<Integer>> select = env.getDsl()
      .select(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID)
      .from(com.vnw.data.jooq.tables.Tbljob.TBLJOB)
      .where(expiredDateFromYesterdayCondition())
      .or(timestampFromLastTimeInMinsCondition(com.vnw.data.jooq.tables.Tbljob.TBLJOB.LASTUPDATEDDATE, lastMins)
        .andNot(activeJobCondition())
      );
    log.debug("Deprecated job sql: \n{}", select.toString());

    List<String> deprecatedJobIds = select
      .fetchInto(Tbljob.class)
      .stream().map(j -> j.getJobid() + "").collect(Collectors.toList());
    log.debug("Going to delete {} deprecated-job-ids: {}", deprecatedJobIds.size(), deprecatedJobIds);
    try {
      JSONObject objs = env.getAlgoliaIndex().deleteObjects(deprecatedJobIds);
      JSONArray objectIDs = objs.getJSONArray("objectIDs");
      log.debug("Deleted {} object-ids: {}", objectIDs.length(), objectIDs);
    }
    catch (AlgoliaException e) {
      log.debug("Failed delete Algolia Jobs: {}", e);
    }
  }
}
