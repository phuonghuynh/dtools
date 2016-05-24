package com.vnw.data.service;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.TblrefJoblevel;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import javax.cache.annotation.CacheResult;
import java.util.List;

/**
 * Created by phuonghqh on 5/20/16.
 */
public interface JobLevelService {

  @Cacheable("jobLevels")
  List<TblrefJoblevel> findJobLevelById(Env env, Byte id);
}
