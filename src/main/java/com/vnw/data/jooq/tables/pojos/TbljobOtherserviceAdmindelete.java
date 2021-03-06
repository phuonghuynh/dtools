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
public class TbljobOtherserviceAdmindelete implements Serializable {

    private static final long serialVersionUID = -1932697351;

    private Integer   entryid;
    private Integer   jobid;
    private Integer   serviceid;
    private Double    servicefee;
    private String    currencytype;
    private Timestamp createddate;
    private Integer   durationdays;
    private Timestamp expireddate;
    private String    servicetype;
    private Timestamp startdate;
    private Byte      startfrom;

    public TbljobOtherserviceAdmindelete() {}

    public TbljobOtherserviceAdmindelete(TbljobOtherserviceAdmindelete value) {
        this.entryid = value.entryid;
        this.jobid = value.jobid;
        this.serviceid = value.serviceid;
        this.servicefee = value.servicefee;
        this.currencytype = value.currencytype;
        this.createddate = value.createddate;
        this.durationdays = value.durationdays;
        this.expireddate = value.expireddate;
        this.servicetype = value.servicetype;
        this.startdate = value.startdate;
        this.startfrom = value.startfrom;
    }

    public TbljobOtherserviceAdmindelete(
        Integer   entryid,
        Integer   jobid,
        Integer   serviceid,
        Double    servicefee,
        String    currencytype,
        Timestamp createddate,
        Integer   durationdays,
        Timestamp expireddate,
        String    servicetype,
        Timestamp startdate,
        Byte      startfrom
    ) {
        this.entryid = entryid;
        this.jobid = jobid;
        this.serviceid = serviceid;
        this.servicefee = servicefee;
        this.currencytype = currencytype;
        this.createddate = createddate;
        this.durationdays = durationdays;
        this.expireddate = expireddate;
        this.servicetype = servicetype;
        this.startdate = startdate;
        this.startfrom = startfrom;
    }

    public Integer getEntryid() {
        return this.entryid;
    }

    public void setEntryid(Integer entryid) {
        this.entryid = entryid;
    }

    public Integer getJobid() {
        return this.jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getServiceid() {
        return this.serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Double getServicefee() {
        return this.servicefee;
    }

    public void setServicefee(Double servicefee) {
        this.servicefee = servicefee;
    }

    public String getCurrencytype() {
        return this.currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public Integer getDurationdays() {
        return this.durationdays;
    }

    public void setDurationdays(Integer durationdays) {
        this.durationdays = durationdays;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public String getServicetype() {
        return this.servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    public Timestamp getStartdate() {
        return this.startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    public Byte getStartfrom() {
        return this.startfrom;
    }

    public void setStartfrom(Byte startfrom) {
        this.startfrom = startfrom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobOtherserviceAdmindelete (");

        sb.append(entryid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(serviceid);
        sb.append(", ").append(servicefee);
        sb.append(", ").append(currencytype);
        sb.append(", ").append(createddate);
        sb.append(", ").append(durationdays);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(servicetype);
        sb.append(", ").append(startdate);
        sb.append(", ").append(startfrom);

        sb.append(")");
        return sb.toString();
    }
}
