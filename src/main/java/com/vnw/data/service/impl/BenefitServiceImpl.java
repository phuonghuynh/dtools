package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.TbljobBenefit;
import com.vnw.data.jooq.tables.pojos.TblrefBenefit;
import com.vnw.data.model.JobBenefit;
import com.vnw.data.service.BenefitService;
import org.jooq.types.UByte;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by phuonghqh on 5/21/16.
 */
@Service
public class BenefitServiceImpl implements BenefitService {

  @Resource
  private BenefitService benefitService;

  public List<JobBenefit> findBenefitsByJobId(Env env, Integer jobId) {
    List<com.vnw.data.jooq.tables.pojos.TbljobBenefit> jobBenefits = env.getDsl()
      .select(
        TbljobBenefit.TBLJOB_BENEFIT.BENEFITID,
        TbljobBenefit.TBLJOB_BENEFIT.BENEFITVALUE
      )
      .from(TbljobBenefit.TBLJOB_BENEFIT)
      .where(TbljobBenefit.TBLJOB_BENEFIT.JOBID.cast(Integer.class).eq(jobId))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TbljobBenefit.class);

    return jobBenefits.stream()
      .map(j -> new JobBenefit()
        .setTbljobBenefit(j)
        .setTblrefBenefit(benefitService.findBenefitById(env, j.getBenefitid())))
      .collect(Collectors.toList());
  }


  public TblrefBenefit findBenefitById(Env env, UByte id) {
    return env.getDsl()
      .select(
        com.vnw.data.jooq.tables.TblrefBenefit.TBLREF_BENEFIT.BENEFITID,
        com.vnw.data.jooq.tables.TblrefBenefit.TBLREF_BENEFIT.BENEFITNAME,
        com.vnw.data.jooq.tables.TblrefBenefit.TBLREF_BENEFIT.BENEFITICONNAME
      )
      .from(com.vnw.data.jooq.tables.TblrefBenefit.TBLREF_BENEFIT)
      .where(com.vnw.data.jooq.tables.TblrefBenefit.TBLREF_BENEFIT.BENEFITID.eq(id))
      .fetchOneInto(TblrefBenefit.class);
  }
}
