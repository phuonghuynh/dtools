package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.service.AlgoliaService;
import com.vnw.data.service.CronService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by phuonghqh on 5/23/16.
 */
@Service
public class CronServiceImpl implements CronService {

  @Resource
  private AlgoliaService algoliaService;

  @Value("${vnw.env}")
  private Env env;

  @Scheduled(cron = "${vnw.algolia.import.lastJob.cron}")
  public void importLastJobs2Algolia() {
    updateLastJobs();
  }

  public int updateLastJobs() {
    algoliaService.deleteDeprecatedJobs(env);
    return algoliaService.importJobs(env, true);
  }
}
