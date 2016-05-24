package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.TbljobCity;
import com.vnw.data.jooq.tables.TblrefCity;
import com.vnw.data.service.LocationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by phuonghqh on 5/19/16.
 */
@Service
public class LocationServiceImpl implements LocationService {

  @Resource
  private LocationService locationService;

  public List<com.vnw.data.jooq.tables.pojos.TblrefCity> findLocationById(Env env, Integer id) {
    List<com.vnw.data.jooq.tables.pojos.TblrefCity> cities = env.getDsl()
      .select(TblrefCity.TBLREF_CITY.CITYID, TblrefCity.TBLREF_CITY.LANGUAGEID, TblrefCity.TBLREF_CITY.CITYNAME)
      .from(TblrefCity.TBLREF_CITY)
      .where(TblrefCity.TBLREF_CITY.CITYID.eq(id))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TblrefCity.class);
    return cities;
  }

  public List<com.vnw.data.jooq.tables.pojos.TblrefCity> findLocationByJobId(Env env, Integer jobId) {
    final List<com.vnw.data.jooq.tables.pojos.TblrefCity> cities = new ArrayList<>();
    env.getDsl()
      .select(TbljobCity.TBLJOB_CITY.CITYID)
      .from(TbljobCity.TBLJOB_CITY)
      .where(TbljobCity.TBLJOB_CITY.JOBID.eq(jobId))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TbljobCity.class)
      .stream()
      .map(city -> locationService.findLocationById(env, city.getCityid()))
      .forEach(cities::addAll);
    return cities;
  }
}
