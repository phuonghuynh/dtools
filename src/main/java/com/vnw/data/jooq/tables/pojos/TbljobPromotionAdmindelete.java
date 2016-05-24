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
public class TbljobPromotionAdmindelete implements Serializable {

    private static final long serialVersionUID = -92499257;

    private UInteger  entryid;
    private UInteger  jobid;
    private UByte     jobpromoteBitmask;
    private Timestamp createdate;
    private Timestamp lastupdate;
    private Timestamp expireddate;
    private Timestamp onlinedate;

    public TbljobPromotionAdmindelete() {}

    public TbljobPromotionAdmindelete(TbljobPromotionAdmindelete value) {
        this.entryid = value.entryid;
        this.jobid = value.jobid;
        this.jobpromoteBitmask = value.jobpromoteBitmask;
        this.createdate = value.createdate;
        this.lastupdate = value.lastupdate;
        this.expireddate = value.expireddate;
        this.onlinedate = value.onlinedate;
    }

    public TbljobPromotionAdmindelete(
        UInteger  entryid,
        UInteger  jobid,
        UByte     jobpromoteBitmask,
        Timestamp createdate,
        Timestamp lastupdate,
        Timestamp expireddate,
        Timestamp onlinedate
    ) {
        this.entryid = entryid;
        this.jobid = jobid;
        this.jobpromoteBitmask = jobpromoteBitmask;
        this.createdate = createdate;
        this.lastupdate = lastupdate;
        this.expireddate = expireddate;
        this.onlinedate = onlinedate;
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

    public UByte getJobpromoteBitmask() {
        return this.jobpromoteBitmask;
    }

    public void setJobpromoteBitmask(UByte jobpromoteBitmask) {
        this.jobpromoteBitmask = jobpromoteBitmask;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getLastupdate() {
        return this.lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public Timestamp getOnlinedate() {
        return this.onlinedate;
    }

    public void setOnlinedate(Timestamp onlinedate) {
        this.onlinedate = onlinedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobPromotionAdmindelete (");

        sb.append(entryid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(jobpromoteBitmask);
        sb.append(", ").append(createdate);
        sb.append(", ").append(lastupdate);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(onlinedate);

        sb.append(")");
        return sb.toString();
    }
}
