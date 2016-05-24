package com.vnw.data;

import com.vnw.data.enu.Env;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Arrays;

/**
 * Created by phuonghqh on 5/13/16.
 */
@Configuration
public class CoreConfiguration {

  @Resource
  private Environment environment;

  @Bean(name = "devDataSource")
  @Primary
  @ConfigurationProperties(prefix = "datasource.dev")
  public DataSource devDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "stagingDataSource")
  @ConfigurationProperties(prefix = "datasource.staging")
  public DataSource stagingDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "productionDataSource")
  @ConfigurationProperties(prefix = "datasource.production")
  public DataSource productionDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  public AlgoliaBean devAlgoliaBean() {
    AlgoliaBean bean = new AlgoliaBean(
      environment.getProperty("algolia.dev.apiKey"),
      environment.getProperty("algolia.dev.appId"),
      environment.getProperty("algolia.dev.indexName")
    );
    Env.DEV.setAlgoliaIndex(bean.index());
    return bean;
  }

  @Bean
  public AlgoliaBean stagingAlgoliaBean() {
    AlgoliaBean bean = new AlgoliaBean(
      environment.getProperty("algolia.staging.apiKey"),
      environment.getProperty("algolia.staging.appId"),
      environment.getProperty("algolia.staging.indexName")
    );
    Env.STAGING.setAlgoliaIndex(bean.index());
    return bean;
  }

  @Bean
  public AlgoliaBean productionAlgoliaBean() {
    AlgoliaBean bean = new AlgoliaBean(
      environment.getProperty("algolia.production.apiKey"),
      environment.getProperty("algolia.production.appId"),
      environment.getProperty("algolia.production.indexName")
    );
    Env.PRODUCTION.setAlgoliaIndex(bean.index());
    return bean;
  }

  @Bean
  public DataSourceConnectionProvider devConnectionProvider() {
    return new DataSourceConnectionProvider(stagingDataSource());
  }

  @Bean
  public DataSourceConnectionProvider stagingConnectionProvider() {
    return new DataSourceConnectionProvider(stagingDataSource());
  }

  @Bean
  public DataSourceConnectionProvider productionConnectionProvider() {
    return new DataSourceConnectionProvider(productionDataSource());
  }

  @Bean
  public org.jooq.Configuration devJooqConfig() {
    return new DefaultConfiguration()
      .derive(devConnectionProvider())
      .derive(SQLDialect.MYSQL);
  }

  @Bean
  public org.jooq.Configuration stagingJooqConfig() {
    return new DefaultConfiguration()
      .derive(stagingConnectionProvider())
      .derive(SQLDialect.MYSQL);
  }

  @Bean
  public org.jooq.Configuration productionJooqConfig() {
    return new DefaultConfiguration()
      .derive(productionConnectionProvider())
      .derive(SQLDialect.MYSQL);
  }

  @Bean
  public DefaultDSLContext devDsl() {
    DefaultDSLContext dsl = new DefaultDSLContext(devJooqConfig());
    Env.DEV.setDsl(dsl);
    return dsl;
  }

  @Bean
  public DefaultDSLContext stagingDsl() {
    DefaultDSLContext dsl = new DefaultDSLContext(stagingJooqConfig());
    Env.STAGING.setDsl(dsl);
    return dsl;
  }

  @Bean
  public DefaultDSLContext productionDsl() {
    DefaultDSLContext dsl = new DefaultDSLContext(productionJooqConfig());
    Env.PRODUCTION.setDsl(dsl);
    return dsl;
  }

//  @Bean
//  public EhCacheCacheManager cacheManager() {
//    EhCacheCacheManager manager = new EhCacheCacheManager();
//    manager.setCacheManager(cacheFactory().getObject());
//    return manager;
//
////    SimpleCacheManager cacheManager = new SimpleCacheManager();
////    cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("default")));
////    return cacheManager;
//  }

//    @Bean
//  public CacheManager cacheManager() {
//    SimpleCacheManager cacheManager = new SimpleCacheManager();
//    cacheManager.setCaches(Arrays.asList(cacheFactory().getObject()));
//    return cacheManager;
//  }
//
//  @Bean
//  public ConcurrentMapCacheFactoryBean cacheFactory() {
//    ConcurrentMapCacheFactoryBean cacheFactoryBean = new ConcurrentMapCacheFactoryBean();
//    cacheFactoryBean.setName("default");
//    return cacheFactoryBean;
//  }
}
