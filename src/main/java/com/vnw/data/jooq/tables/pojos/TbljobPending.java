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
public class TbljobPending implements Serializable {

    private static final long serialVersionUID = -1009695989;

    private Integer   jobid;
    private Integer   userid;
    private String    jobdata;
    private Timestamp updateddate;
    private Byte      isnew;

    public TbljobPending() {}

    public TbljobPending(TbljobPending value) {
        this.jobid = value.jobid;
        this.userid = value.userid;
        this.jobdata = value.jobdata;
        this.updateddate = value.updateddate;
        this.isnew = value.isnew;
    }

    public TbljobPending(
        Integer   jobid,
        Integer   userid,
        String    jobdata,
        Timestamp updateddate,
        Byte      isnew
    ) {
        this.jobid = jobid;
        this.userid = userid;
        this.jobdata = jobdata;
        this.updateddate = updateddate;
        this.isnew = isnew;
    }

    public Integer getJobid() {
        return this.jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getJobdata() {
        return this.jobdata;
    }

    public void setJobdata(String jobdata) {
        this.jobdata = jobdata;
    }

    public Timestamp getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Timestamp updateddate) {
        this.updateddate = updateddate;
    }

    public Byte getIsnew() {
        return this.isnew;
    }

    public void setIsnew(Byte isnew) {
        this.isnew = isnew;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobPending (");

        sb.append(jobid);
        sb.append(", ").append(userid);
        sb.append(", ").append(jobdata);
        sb.append(", ").append(updateddate);
        sb.append(", ").append(isnew);

        sb.append(")");
        return sb.toString();
    }
}