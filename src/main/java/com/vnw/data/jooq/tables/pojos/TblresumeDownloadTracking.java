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
public class TblresumeDownloadTracking implements Serializable {

    private static final long serialVersionUID = 1637563398;

    private UInteger  downloadtrackingId;
    private UInteger  userid;
    private UInteger  resumeid;
    private UInteger  orderid;
    private UByte     credit;
    private Timestamp downloadtrackingCreateddate;

    public TblresumeDownloadTracking() {}

    public TblresumeDownloadTracking(TblresumeDownloadTracking value) {
        this.downloadtrackingId = value.downloadtrackingId;
        this.userid = value.userid;
        this.resumeid = value.resumeid;
        this.orderid = value.orderid;
        this.credit = value.credit;
        this.downloadtrackingCreateddate = value.downloadtrackingCreateddate;
    }

    public TblresumeDownloadTracking(
        UInteger  downloadtrackingId,
        UInteger  userid,
        UInteger  resumeid,
        UInteger  orderid,
        UByte     credit,
        Timestamp downloadtrackingCreateddate
    ) {
        this.downloadtrackingId = downloadtrackingId;
        this.userid = userid;
        this.resumeid = resumeid;
        this.orderid = orderid;
        this.credit = credit;
        this.downloadtrackingCreateddate = downloadtrackingCreateddate;
    }

    public UInteger getDownloadtrackingId() {
        return this.downloadtrackingId;
    }

    public void setDownloadtrackingId(UInteger downloadtrackingId) {
        this.downloadtrackingId = downloadtrackingId;
    }

    public UInteger getUserid() {
        return this.userid;
    }

    public void setUserid(UInteger userid) {
        this.userid = userid;
    }

    public UInteger getResumeid() {
        return this.resumeid;
    }

    public void setResumeid(UInteger resumeid) {
        this.resumeid = resumeid;
    }

    public UInteger getOrderid() {
        return this.orderid;
    }

    public void setOrderid(UInteger orderid) {
        this.orderid = orderid;
    }

    public UByte getCredit() {
        return this.credit;
    }

    public void setCredit(UByte credit) {
        this.credit = credit;
    }

    public Timestamp getDownloadtrackingCreateddate() {
        return this.downloadtrackingCreateddate;
    }

    public void setDownloadtrackingCreateddate(Timestamp downloadtrackingCreateddate) {
        this.downloadtrackingCreateddate = downloadtrackingCreateddate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumeDownloadTracking (");

        sb.append(downloadtrackingId);
        sb.append(", ").append(userid);
        sb.append(", ").append(resumeid);
        sb.append(", ").append(orderid);
        sb.append(", ").append(credit);
        sb.append(", ").append(downloadtrackingCreateddate);

        sb.append(")");
        return sb.toString();
    }
}
