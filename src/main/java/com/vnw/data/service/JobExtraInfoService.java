package com.vnw.data.service;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TbljobExtraInfo;

/**
 * Created by phuonghqh on 5/20/16.
 */
public interface JobExtraInfoService {

  TbljobExtraInfo findExtraInfoByJobId(Env env, Integer jobId);
}
