package com.vnw.data.controller;

import com.vnw.data.enu.Env;
import com.vnw.data.service.AlgoliaService;
import com.vnw.data.service.CronService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by phuonghqh on 5/13/16.
 */
@RestController
public class AlgoliaJobController {

  @Resource
  private AlgoliaService algoliaService;

  @Resource
  private CronService cronService;

  @Value("${vnw.env}")
  private Env env;

  @RequestMapping("/")
  @ResponseBody
  public String home() {
    return "Hello World!";
  }

  @RequestMapping("/importAllJobs")
  @ResponseBody
  public String importAllJobs() {
    int count = algoliaService.importJobs(env, false);
    return "DONE import " + count + " Jobs!!!!";
  }

  @RequestMapping("/updateLastJobs")
  @ResponseBody
  public String updateLastJobs() {
    int count = cronService.updateLastJobs();
    return "DONE update last job " + count + " Jobs!!!!";
  }
}
