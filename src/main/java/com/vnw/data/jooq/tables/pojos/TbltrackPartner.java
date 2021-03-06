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
public class TbltrackPartner implements Serializable {

    private static final long serialVersionUID = -7613048;

    private Short     partnerid;
    private String    partnername;
    private Byte      isapproved;
    private Timestamp approveddate;
    private Timestamp expireddate;
    private Timestamp createddate;
    private String    partnerdomain;

    public TbltrackPartner() {}

    public TbltrackPartner(TbltrackPartner value) {
        this.partnerid = value.partnerid;
        this.partnername = value.partnername;
        this.isapproved = value.isapproved;
        this.approveddate = value.approveddate;
        this.expireddate = value.expireddate;
        this.createddate = value.createddate;
        this.partnerdomain = value.partnerdomain;
    }

    public TbltrackPartner(
        Short     partnerid,
        String    partnername,
        Byte      isapproved,
        Timestamp approveddate,
        Timestamp expireddate,
        Timestamp createddate,
        String    partnerdomain
    ) {
        this.partnerid = partnerid;
        this.partnername = partnername;
        this.isapproved = isapproved;
        this.approveddate = approveddate;
        this.expireddate = expireddate;
        this.createddate = createddate;
        this.partnerdomain = partnerdomain;
    }

    public Short getPartnerid() {
        return this.partnerid;
    }

    public void setPartnerid(Short partnerid) {
        this.partnerid = partnerid;
    }

    public String getPartnername() {
        return this.partnername;
    }

    public void setPartnername(String partnername) {
        this.partnername = partnername;
    }

    public Byte getIsapproved() {
        return this.isapproved;
    }

    public void setIsapproved(Byte isapproved) {
        this.isapproved = isapproved;
    }

    public Timestamp getApproveddate() {
        return this.approveddate;
    }

    public void setApproveddate(Timestamp approveddate) {
        this.approveddate = approveddate;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getPartnerdomain() {
        return this.partnerdomain;
    }

    public void setPartnerdomain(String partnerdomain) {
        this.partnerdomain = partnerdomain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbltrackPartner (");

        sb.append(partnerid);
        sb.append(", ").append(partnername);
        sb.append(", ").append(isapproved);
        sb.append(", ").append(approveddate);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(createddate);
        sb.append(", ").append(partnerdomain);

        sb.append(")");
        return sb.toString();
    }
}
