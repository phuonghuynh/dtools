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
public class TblscreenTestJob implements Serializable {

    private static final long serialVersionUID = 582605455;

    private UInteger  jobid;
    private UInteger  testid;
    private UByte     allow2skip;
    private UByte     isactive;
    private Timestamp assigndate;

    public TblscreenTestJob() {}

    public TblscreenTestJob(TblscreenTestJob value) {
        this.jobid = value.jobid;
        this.testid = value.testid;
        this.allow2skip = value.allow2skip;
        this.isactive = value.isactive;
        this.assigndate = value.assigndate;
    }

    public TblscreenTestJob(
        UInteger  jobid,
        UInteger  testid,
        UByte     allow2skip,
        UByte     isactive,
        Timestamp assigndate
    ) {
        this.jobid = jobid;
        this.testid = testid;
        this.allow2skip = allow2skip;
        this.isactive = isactive;
        this.assigndate = assigndate;
    }

    public UInteger getJobid() {
        return this.jobid;
    }

    public void setJobid(UInteger jobid) {
        this.jobid = jobid;
    }

    public UInteger getTestid() {
        return this.testid;
    }

    public void setTestid(UInteger testid) {
        this.testid = testid;
    }

    public UByte getAllow2skip() {
        return this.allow2skip;
    }

    public void setAllow2skip(UByte allow2skip) {
        this.allow2skip = allow2skip;
    }

    public UByte getIsactive() {
        return this.isactive;
    }

    public void setIsactive(UByte isactive) {
        this.isactive = isactive;
    }

    public Timestamp getAssigndate() {
        return this.assigndate;
    }

    public void setAssigndate(Timestamp assigndate) {
        this.assigndate = assigndate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblscreenTestJob (");

        sb.append(jobid);
        sb.append(", ").append(testid);
        sb.append(", ").append(allow2skip);
        sb.append(", ").append(isactive);
        sb.append(", ").append(assigndate);

        sb.append(")");
        return sb.toString();
    }
}