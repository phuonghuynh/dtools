package com.vnw.data.service;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TblskillTerm;
import org.jooq.types.UInteger;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by phuonghqh on 5/20/16.
 */
public interface SkillService {

  List<TblskillTerm> findSkillTermByJobId(Env env, Integer jobId);

  @Cacheable("skillTerms")
  com.vnw.data.jooq.tables.pojos.TblskillTerm findSkillTermById(Env env, UInteger id);
}
