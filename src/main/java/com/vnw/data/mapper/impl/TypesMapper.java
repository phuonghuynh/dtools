package com.vnw.data.mapper.impl;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created by phuonghqh on 5/20/16.
 */
@Component
public class TypesMapper {

  public Long asSeconds(Timestamp timestamp) {
    return timestamp == null ? null : timestamp.getTime() / 1000;
  }

  public Integer asInt(org.jooq.types.UByte uByte) {
    return  uByte == null ? null : uByte.intValue();
  }
}
