/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UByte;
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
public class TblresumeTracker implements Serializable {

    private static final long serialVersionUID = -1614029164;

    private Integer   userid;
    private Integer   resumeid;
    private Byte      isbought;
    private UInteger  folderId;
    private Byte      resumestatusId;
    private Timestamp createddate;
    private Short     durationdays;
    private Timestamp expireddate;
    private UByte     isdeleted;

    public TblresumeTracker() {}

    public TblresumeTracker(TblresumeTracker value) {
        this.userid = value.userid;
        this.resumeid = value.resumeid;
        this.isbought = value.isbought;
        this.folderId = value.folderId;
        this.resumestatusId = value.resumestatusId;
        this.createddate = value.createddate;
        this.durationdays = value.durationdays;
        this.expireddate = value.expireddate;
        this.isdeleted = value.isdeleted;
    }

    public TblresumeTracker(
        Integer   userid,
        Integer   resumeid,
        Byte      isbought,
        UInteger  folderId,
        Byte      resumestatusId,
        Timestamp createddate,
        Short     durationdays,
        Timestamp expireddate,
        UByte     isdeleted
    ) {
        this.userid = userid;
        this.resumeid = resumeid;
        this.isbought = isbought;
        this.folderId = folderId;
        this.resumestatusId = resumestatusId;
        this.createddate = createddate;
        this.durationdays = durationdays;
        this.expireddate = expireddate;
        this.isdeleted = isdeleted;
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

    public Byte getIsbought() {
        return this.isbought;
    }

    public void setIsbought(Byte isbought) {
        this.isbought = isbought;
    }

    public UInteger getFolderId() {
        return this.folderId;
    }

    public void setFolderId(UInteger folderId) {
        this.folderId = folderId;
    }

    public Byte getResumestatusId() {
        return this.resumestatusId;
    }

    public void setResumestatusId(Byte resumestatusId) {
        this.resumestatusId = resumestatusId;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public Short getDurationdays() {
        return this.durationdays;
    }

    public void setDurationdays(Short durationdays) {
        this.durationdays = durationdays;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public UByte getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(UByte isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumeTracker (");

        sb.append(userid);
        sb.append(", ").append(resumeid);
        sb.append(", ").append(isbought);
        sb.append(", ").append(folderId);
        sb.append(", ").append(resumestatusId);
        sb.append(", ").append(createddate);
        sb.append(", ").append(durationdays);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(isdeleted);

        sb.append(")");
        return sb.toString();
    }
}
