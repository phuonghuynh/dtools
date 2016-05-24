package com.vnw.data.service;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TblrefIndustry;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by phuonghqh on 5/20/16.
 */
public interface JobCategoryService {

  List<com.vnw.data.jooq.tables.pojos.TblrefIndustry> findCategoriesByJobId(Env env, Integer jobId);

  @Cacheable("categories")
  List<com.vnw.data.jooq.tables.pojos.TblrefIndustry> findCategoryById(Env env, Short id);
}
