package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.TblrefJoblevel;
import com.vnw.data.service.JobLevelService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by phuonghqh on 5/20/16.
 */
@Service
public class JobLevelServiceImpl implements JobLevelService {

  public List<com.vnw.data.jooq.tables.pojos.TblrefJoblevel> findJobLevelById(Env env, Byte id) {
    List<com.vnw.data.jooq.tables.pojos.TblrefJoblevel> levels = env.getDsl()
      .select(TblrefJoblevel.TBLREF_JOBLEVEL.JOBLEVELID, TblrefJoblevel.TBLREF_JOBLEVEL.LANGUAGEID, TblrefJoblevel.TBLREF_JOBLEVEL.JOBLEVELNAME)
      .from(TblrefJoblevel.TBLREF_JOBLEVEL)
      .where(TblrefJoblevel.TBLREF_JOBLEVEL.JOBLEVELID.eq(id))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TblrefJoblevel.class);
    return levels;
  }
}
