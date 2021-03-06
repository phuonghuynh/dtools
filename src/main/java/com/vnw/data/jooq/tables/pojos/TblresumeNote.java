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
public class TblresumeNote implements Serializable {

    private static final long serialVersionUID = -2017209574;

    private Integer   resumenoteId;
    private Integer   userid;
    private Integer   resumeid;
    private Integer   jobid;
    private Integer   sdid;
    private Timestamp resumenoteCreatedate;
    private String    resumenoteContent;

    public TblresumeNote() {}

    public TblresumeNote(TblresumeNote value) {
        this.resumenoteId = value.resumenoteId;
        this.userid = value.userid;
        this.resumeid = value.resumeid;
        this.jobid = value.jobid;
        this.sdid = value.sdid;
        this.resumenoteCreatedate = value.resumenoteCreatedate;
        this.resumenoteContent = value.resumenoteContent;
    }

    public TblresumeNote(
        Integer   resumenoteId,
        Integer   userid,
        Integer   resumeid,
        Integer   jobid,
        Integer   sdid,
        Timestamp resumenoteCreatedate,
        String    resumenoteContent
    ) {
        this.resumenoteId = resumenoteId;
        this.userid = userid;
        this.resumeid = resumeid;
        this.jobid = jobid;
        this.sdid = sdid;
        this.resumenoteCreatedate = resumenoteCreatedate;
        this.resumenoteContent = resumenoteContent;
    }

    public Integer getResumenoteId() {
        return this.resumenoteId;
    }

    public void setResumenoteId(Integer resumenoteId) {
        this.resumenoteId = resumenoteId;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getResumeid() {
        return this.resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getJobid() {
        return this.jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getSdid() {
        return this.sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
    }

    public Timestamp getResumenoteCreatedate() {
        return this.resumenoteCreatedate;
    }

    public void setResumenoteCreatedate(Timestamp resumenoteCreatedate) {
        this.resumenoteCreatedate = resumenoteCreatedate;
    }

    public String getResumenoteContent() {
        return this.resumenoteContent;
    }

    public void setResumenoteContent(String resumenoteContent) {
        this.resumenoteContent = resumenoteContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumeNote (");

        sb.append(resumenoteId);
        sb.append(", ").append(userid);
        sb.append(", ").append(resumeid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(sdid);
        sb.append(", ").append(resumenoteCreatedate);
        sb.append(", ").append(resumenoteContent);

        sb.append(")");
        return sb.toString();
    }
}
