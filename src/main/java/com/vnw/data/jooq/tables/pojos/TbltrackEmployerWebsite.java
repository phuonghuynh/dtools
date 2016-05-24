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
public class TbltrackEmployerWebsite implements Serializable {

    private static final long serialVersionUID = -589874122;

    private Integer   companyid;
    private String    profilebasename;
    private Timestamp createddate;
    private Timestamp lastupdateddate;
    private UInteger  noofview;
    private UInteger  noofshare;

    public TbltrackEmployerWebsite() {}

    public TbltrackEmployerWebsite(TbltrackEmployerWebsite value) {
        this.companyid = value.companyid;
        this.profilebasename = value.profilebasename;
        this.createddate = value.createddate;
        this.lastupdateddate = value.lastupdateddate;
        this.noofview = value.noofview;
        this.noofshare = value.noofshare;
    }

    public TbltrackEmployerWebsite(
        Integer   companyid,
        String    profilebasename,
        Timestamp createddate,
        Timestamp lastupdateddate,
        UInteger  noofview,
        UInteger  noofshare
    ) {
        this.companyid = companyid;
        this.profilebasename = profilebasename;
        this.createddate = createddate;
        this.lastupdateddate = lastupdateddate;
        this.noofview = noofview;
        this.noofshare = noofshare;
    }

    public Integer getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getProfilebasename() {
        return this.profilebasename;
    }

    public void setProfilebasename(String profilebasename) {
        this.profilebasename = profilebasename;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public Timestamp getLastupdateddate() {
        return this.lastupdateddate;
    }

    public void setLastupdateddate(Timestamp lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    public UInteger getNoofview() {
        return this.noofview;
    }

    public void setNoofview(UInteger noofview) {
        this.noofview = noofview;
    }

    public UInteger getNoofshare() {
        return this.noofshare;
    }

    public void setNoofshare(UInteger noofshare) {
        this.noofshare = noofshare;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbltrackEmployerWebsite (");

        sb.append(companyid);
        sb.append(", ").append(profilebasename);
        sb.append(", ").append(createddate);
        sb.append(", ").append(lastupdateddate);
        sb.append(", ").append(noofview);
        sb.append(", ").append(noofshare);

        sb.append(")");
        return sb.toString();
    }
}
