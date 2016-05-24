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

  public PageSeek jobPageSeek(Env env) {
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

  public int importJobs(Env env, boolean onlyLastJobs) {
    int count = 0;
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

    SelectSeekStep1<Record10<Integer, Integer, String, String, String, String, Integer, Integer, Timestamp, Byte>, Integer> select = selectWhere.orderBy(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID.asc());

    log.debug("SQL generate: {}", select.getSQL());

    Integer lastJobId = null;
    while (true) {
      List<Tbljob> jobs = lastJobId == null || lastJobId == 0 ?
        select.limit(limit).fetchInto(Tbljob.class) :
        select.seek(lastJobId).limit(limit).fetchInto(Tbljob.class);
      if (jobs.size() == 0) {
        break;
      }

      List<AlgoliaJob> algoliaJobs = jobs.stream().map(job -> algoliaJobMapper.from(env, job)).collect(Collectors.toList());
      lastJobId = jobs.stream().reduce((a, b) -> b).orElse(new Tbljob()).getJobid();
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
    Set<Integer> deprecatedJobIds = env.getDsl()
      .select(com.vnw.data.jooq.tables.Tbljob.TBLJOB.JOBID)
      .from(com.vnw.data.jooq.tables.Tbljob.TBLJOB)
      .where(expiredDateFromYesterdayCondition())
      .or(timestampFromLastTimeInMinsCondition(com.vnw.data.jooq.tables.Tbljob.TBLJOB.LASTUPDATEDDATE, lastMins)
        .andNot(activeJobCondition())
      )
      .fetchInto(Tbljob.class)
      .stream().map(j -> j.getJobid()).collect(Collectors.toSet());
    System.out.println(deprecatedJobIds);
  }
}
