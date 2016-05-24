/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class TbljobRefresh implements Serializable {

    private static final long serialVersionUID = 696698141;

    private UInteger  entryid;
    private UInteger  jobid;
    private Timestamp refreshtime;

    public TbljobRefresh() {}

    public TbljobRefresh(TbljobRefresh value) {
        this.entryid = value.entryid;
        this.jobid = value.jobid;
        this.refreshtime = value.refreshtime;
    }

    public TbljobRefresh(
        UInteger  entryid,
        UInteger  jobid,
        Timestamp refreshtime
    ) {
        this.entryid = entryid;
        this.jobid = jobid;
        this.refreshtime = refreshtime;
    }

    public UInteger getEntryid() {
        return this.entryid;
    }

    public void setEntryid(UInteger entryid) {
        this.entryid = entryid;
    }

    public UInteger getJobid() {
        return this.jobid;
    }

    public void setJobid(UInteger jobid) {
        this.jobid = jobid;
    }

    public Timestamp getRefreshtime() {
        return this.refreshtime;
    }

    public void setRefreshtime(Timestamp refreshtime) {
        this.refreshtime = refreshtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobRefresh (");

        sb.append(entryid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(refreshtime);

        sb.append(")");
        return sb.toString();
    }
}
