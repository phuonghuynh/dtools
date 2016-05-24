package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.TblAsset;
import com.vnw.data.jooq.tables.TblemployerCompanyinfo;
import com.vnw.data.jooq.tables.Tbljob;
import com.vnw.data.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by phuonghqh on 5/19/16.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

  public com.vnw.data.jooq.tables.pojos.TblAsset findImageByJobId(Env env, Integer jobId) {
    return Optional.ofNullable(
      env.getDsl()
        .select(TblAsset.TBL_ASSET.ASS_WS_PATH)
        .from(TblemployerCompanyinfo.TBLEMPLOYER_COMPANYINFO)
        .join(com.vnw.data.jooq.tables.Tblregistrationinfo.TBLREGISTRATIONINFO)
        .on(TblemployerCompanyinfo.TBLEMPLOYER_COMPANYINFO.COMPANYID.eq(com.vnw.data.jooq.tables.Tblregistrationinfo.TBLREGISTRATIONINFO.COMPANYID))
        .join(TblAsset.TBL_ASSET)
        .on(TblAsset.TBL_ASSET.ASS_ID.eq(TblemployerCompanyinfo.TBLEMPLOYER_COMPANYINFO.COMPANYLOGO.cast(Integer.class)))
        .join(Tbljob.TBLJOB)
        .on(Tbljob.TBLJOB.USERID.eq(com.vnw.data.jooq.tables.Tblregistrationinfo.TBLREGISTRATIONINFO.USERID))
        .where(Tbljob.TBLJOB.JOBID.eq(jobId))
        .limit(1)
        .fetchOneInto(com.vnw.data.jooq.tables.pojos.TblAsset.class))
      .orElse(new com.vnw.data.jooq.tables.pojos.TblAsset());
  }
}
