/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class TblsysTracker implements Serializable {

    private static final long serialVersionUID = -529150402;

    private Integer   trackerid;
    private Integer   userid;
    private Integer   dataid;
    private Timestamp updateddate;
    private String    tablename;
    private String    action;
    private String    sqlstring;

    public TblsysTracker() {}

    public TblsysTracker(TblsysTracker value) {
        this.trackerid = value.trackerid;
        this.userid = value.userid;
        this.dataid = value.dataid;
        this.updateddate = value.updateddate;
        this.tablename = value.tablename;
        this.action = value.action;
        this.sqlstring = value.sqlstring;
    }

    public TblsysTracker(
        Integer   trackerid,
        Integer   userid,
        Integer   dataid,
        Timestamp updateddate,
        String    tablename,
        String    action,
        String    sqlstring
    ) {
        this.trackerid = trackerid;
        this.userid = userid;
        this.dataid = dataid;
        this.updateddate = updateddate;
        this.tablename = tablename;
        this.action = action;
        this.sqlstring = sqlstring;
    }

    public Integer getTrackerid() {
        return this.trackerid;
    }

    public void setTrackerid(Integer trackerid) {
        this.trackerid = trackerid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDataid() {
        return this.dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Timestamp getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Timestamp updateddate) {
        this.updateddate = updateddate;
    }

    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSqlstring() {
        return this.sqlstring;
    }

    public void setSqlstring(String sqlstring) {
        this.sqlstring = sqlstring;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysTracker (");

        sb.append(trackerid);
        sb.append(", ").append(userid);
        sb.append(", ").append(dataid);
        sb.append(", ").append(updateddate);
        sb.append(", ").append(tablename);
        sb.append(", ").append(action);
        sb.append(", ").append(sqlstring);

        sb.append(")");
        return sb.toString();
    }
}
