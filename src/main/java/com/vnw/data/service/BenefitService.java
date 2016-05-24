package com.vnw.data.service;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TblrefBenefit;
import com.vnw.data.model.JobBenefit;
import org.jooq.types.UByte;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by phuonghqh on 5/21/16.
 */
public interface BenefitService {

  List<JobBenefit> findBenefitsByJobId(Env env, Integer jobId);

  @Cacheable("benefits")
  TblrefBenefit findBenefitById(Env env, UByte id);
}
