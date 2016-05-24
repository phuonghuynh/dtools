package com.vnw.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.ContextConfiguration;

@SpringBootApplication
@ComponentScan("com.vnw.data")
@EnableConfigurationProperties
@EnableCaching
@EnableScheduling
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
@ContextConfiguration(locations = {"classpath*:ehcache.xml"})
public class DataSyncApplication {

  public static void main(String[] args) {
    SpringApplication.run(DataSyncApplication.class, args);
  }
}
