package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TbljobExtraInfo;
import com.vnw.data.service.JobExtraInfoService;
import org.jooq.types.UInteger;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by phuonghqh on 5/20/16.
 */
@Service
public class JobExtraInfoServiceImpl implements JobExtraInfoService {

  public TbljobExtraInfo findExtraInfoByJobId(Env env, Integer jobId) {
    return Optional
      .ofNullable(
        env.getDsl()
          .select(
            com.vnw.data.jooq.tables.TbljobExtraInfo.TBLJOB_EXTRA_INFO.JOBID,
            com.vnw.data.jooq.tables.TbljobExtraInfo.TBLJOB_EXTRA_INFO.ISSALARYVISIBLE
          )
          .from(com.vnw.data.jooq.tables.TbljobExtraInfo.TBLJOB_EXTRA_INFO)
          .where(com.vnw.data.jooq.tables.TbljobExtraInfo.TBLJOB_EXTRA_INFO.JOBID.cast(Integer.class).eq(jobId))
          .fetchOneInto(TbljobExtraInfo.class)
      )
      .orElse(new TbljobExtraInfo());
  }
}
