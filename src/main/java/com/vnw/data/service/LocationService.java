package com.vnw.data.service;

import com.vnw.data.enu.Env;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by phuonghqh on 5/19/16.
 */
public interface LocationService {
  List<com.vnw.data.jooq.tables.pojos.TblrefCity> findLocationByJobId(Env env, Integer jobId);

  @Cacheable("locations")
  List<com.vnw.data.jooq.tables.pojos.TblrefCity> findLocationById(Env env, Integer id);
}
