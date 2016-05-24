package com.vnw.data;

import com.algolia.search.saas.APIClient;
import com.algolia.search.saas.Index;

/**
 * Created by phuonghqh on 5/19/16.
 */
public class AlgoliaBean {
  private String apiKey;
  private String appId;
  private String indexName;

  public AlgoliaBean(String apiKey, String appId, String indexName) {
    this.apiKey = apiKey;
    this.appId = appId;
    this.indexName = indexName;
  }


  public Index index() {
    return new APIClient(appId, apiKey).initIndex(indexName);
  }
}
