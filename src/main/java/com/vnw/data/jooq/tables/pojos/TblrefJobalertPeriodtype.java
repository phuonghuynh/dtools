/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblrefJobalertPeriodtype implements Serializable {

    private static final long serialVersionUID = 1287264944;

    private Byte    periodtypeid;
    private Byte    languageid;
    private String  periodtypename;
    private Integer noofdays;
    private Byte    periodtypeorder;

    public TblrefJobalertPeriodtype() {}

    public TblrefJobalertPeriodtype(TblrefJobalertPeriodtype value) {
        this.periodtypeid = value.periodtypeid;
        this.languageid = value.languageid;
        this.periodtypename = value.periodtypename;
        this.noofdays = value.noofdays;
        this.periodtypeorder = value.periodtypeorder;
    }

    public TblrefJobalertPeriodtype(
        Byte    periodtypeid,
        Byte    languageid,
        String  periodtypename,
        Integer noofdays,
        Byte    periodtypeorder
    ) {
        this.periodtypeid = periodtypeid;
        this.languageid = languageid;
        this.periodtypename = periodtypename;
        this.noofdays = noofdays;
        this.periodtypeorder = periodtypeorder;
    }

    public Byte getPeriodtypeid() {
        return this.periodtypeid;
    }

    public void setPeriodtypeid(Byte periodtypeid) {
        this.periodtypeid = periodtypeid;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getPeriodtypename() {
        return this.periodtypename;
    }

    public void setPeriodtypename(String periodtypename) {
        this.periodtypename = periodtypename;
    }

    public Integer getNoofdays() {
        return this.noofdays;
    }

    public void setNoofdays(Integer noofdays) {
        this.noofdays = noofdays;
    }

    public Byte getPeriodtypeorder() {
        return this.periodtypeorder;
    }

    public void setPeriodtypeorder(Byte periodtypeorder) {
        this.periodtypeorder = periodtypeorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJobalertPeriodtype (");

        sb.append(periodtypeid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(periodtypename);
        sb.append(", ").append(noofdays);
        sb.append(", ").append(periodtypeorder);

        sb.append(")");
        return sb.toString();
    }
}