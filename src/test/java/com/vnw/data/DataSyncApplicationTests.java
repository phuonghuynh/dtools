package com.vnw.data;

import com.vnw.data.enu.Env;
import com.vnw.data.service.AlgoliaService;
import com.vnw.data.service.CronService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DataSyncApplication.class})
public class DataSyncApplicationTests {

  @Resource
  private AlgoliaService algoliaService;

  @Resource
  private CronService cronService;

  @Test
  public void testEmpty() {
    System.out.println("Empty test");
  }

//  @Test
  public void testMe() {
    algoliaService.importJobs(Env.DEV, false);
  }

}
