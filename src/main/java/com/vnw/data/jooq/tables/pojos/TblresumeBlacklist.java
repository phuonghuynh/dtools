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
public class TblresumeBlacklist implements Serializable {

    private static final long serialVersionUID = -1922129670;

    private UInteger  empuserid;
    private UInteger  cdduserid;
    private UInteger  resumeid;
    private Timestamp createddate;
    private String    empmsg;

    public TblresumeBlacklist() {}

    public TblresumeBlacklist(TblresumeBlacklist value) {
        this.empuserid = value.empuserid;
        this.cdduserid = value.cdduserid;
        this.resumeid = value.resumeid;
        this.createddate = value.createddate;
        this.empmsg = value.empmsg;
    }

    public TblresumeBlacklist(
        UInteger  empuserid,
        UInteger  cdduserid,
        UInteger  resumeid,
        Timestamp createddate,
        String    empmsg
    ) {
        this.empuserid = empuserid;
        this.cdduserid = cdduserid;
        this.resumeid = resumeid;
        this.createddate = createddate;
        this.empmsg = empmsg;
    }

    public UInteger getEmpuserid() {
        return this.empuserid;
    }

    public void setEmpuserid(UInteger empuserid) {
        this.empuserid = empuserid;
    }

    public UInteger getCdduserid() {
        return this.cdduserid;
    }

    public void setCdduserid(UInteger cdduserid) {
        this.cdduserid = cdduserid;
    }

    public UInteger getResumeid() {
        return this.resumeid;
    }

    public void setResumeid(UInteger resumeid) {
        this.resumeid = resumeid;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getEmpmsg() {
        return this.empmsg;
    }

    public void setEmpmsg(String empmsg) {
        this.empmsg = empmsg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumeBlacklist (");

        sb.append(empuserid);
        sb.append(", ").append(cdduserid);
        sb.append(", ").append(resumeid);
        sb.append(", ").append(createddate);
        sb.append(", ").append(empmsg);

        sb.append(")");
        return sb.toString();
    }
}
