package com.vnw.data.service;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TblemployerCompanyimage;
import com.vnw.data.jooq.tables.pojos.TblsysCompany;

/**
 * Created by phuonghqh on 5/19/16.
 */
public interface CompanyService {

  com.vnw.data.jooq.tables.pojos.TblAsset findImageByJobId(Env env, Integer jobId);
}
