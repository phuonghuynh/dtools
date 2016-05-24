package com.vnw.data.service;

import com.vnw.data.enu.Env;

/**
 * Created by phuonghqh on 5/13/16.
 */
public interface AlgoliaService {

  int importJobs(Env env, boolean onlyLastJobs);

  void deleteDeprecatedJobs(Env env);

}
