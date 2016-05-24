package com.vnw.data.enu;

import com.algolia.search.saas.Index;
import org.jooq.impl.DefaultDSLContext;

/**
 * Created by phuonghqh on 5/19/16.
 */
public enum Env {
  DEV, STAGING, PRODUCTION;

  private DefaultDSLContext dsl;
  private Index algoliaIndex;

  public DefaultDSLContext getDsl() {
    return dsl;
  }

  public void setDsl(DefaultDSLContext dsl) {
    this.dsl = dsl;
  }

  public Index getAlgoliaIndex() {
    return algoliaIndex;
  }

  public void setAlgoliaIndex(Index algoliaIndex) {
    this.algoliaIndex = algoliaIndex;
  }


}
