package com.vnw.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by phuonghqh on 5/21/16.
 */
public class Utils {

  public static Date add(Date date, int type, int interval) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(type, interval);
    return cal.getTime();
  }

  public static String format(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sdf.format(date);
  }
}
