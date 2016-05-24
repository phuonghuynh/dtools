package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.TbljobIndustryExtra;
import com.vnw.data.jooq.tables.TblrefIndustry;
import com.vnw.data.service.JobCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by phuonghqh on 5/20/16.
 */
@Service
public class JobCategoryServiceImpl implements JobCategoryService {

  @Resource
  private JobCategoryService jobCategoryService;

  public List<com.vnw.data.jooq.tables.pojos.TblrefIndustry> findCategoryById(Env env, Short id) {
    return env.getDsl()
      .select(
        TblrefIndustry.TBLREF_INDUSTRY.INDUSTRYID,
        TblrefIndustry.TBLREF_INDUSTRY.INDUSTRYNAME,
        TblrefIndustry.TBLREF_INDUSTRY.LANGUAGEID
      )
      .from(TblrefIndustry.TBLREF_INDUSTRY)
      .where(TblrefIndustry.TBLREF_INDUSTRY.INDUSTRYID.eq(id))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TblrefIndustry.class);
  }

  public List<com.vnw.data.jooq.tables.pojos.TblrefIndustry> findCategoriesByJobId(Env env, Integer jobId) {
    final List<com.vnw.data.jooq.tables.pojos.TblrefIndustry> industries = new ArrayList<>();
    env.getDsl()
      .select(TbljobIndustryExtra.TBLJOB_INDUSTRY_EXTRA.INDUSTRYID)
      .from(TbljobIndustryExtra.TBLJOB_INDUSTRY_EXTRA)
      .where(TbljobIndustryExtra.TBLJOB_INDUSTRY_EXTRA.JOBID.eq(jobId))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TbljobIndustryExtra.class)
      .stream()
      .map(i -> jobCategoryService.findCategoryById(env, i.getIndustryid()))
      .forEach(industries::addAll);
    return industries;
  }
}
