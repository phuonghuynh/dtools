package com.vnw.data.model;

/**
 * Created by phuonghqh on 5/24/16.
 */
public class PageSeek {

  private Integer minId;
  private Integer maxId;
  private int count;

  public Integer getMinId() {
    return minId;
  }

  public PageSeek setMinId(Integer minId) {
    this.minId = minId;
    return this;
  }

  public Integer getMaxId() {
    return maxId;
  }

  public PageSeek setMaxId(Integer maxId) {
    this.maxId = maxId;
    return this;
  }

  public int getCount() {
    return count;
  }

  public PageSeek setCount(int count) {
    this.count = count;
    return this;
  }
}
