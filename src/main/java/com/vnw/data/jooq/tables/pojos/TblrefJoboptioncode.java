/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

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
public class TblrefJoboptioncode implements Serializable {

    private static final long serialVersionUID = 1002133768;

    private Byte   joboptionid;
    private String joboptioncode;
    private Byte   durationdays;
    private Byte   noofjobfree;
    private Byte   noofjobpost;

    public TblrefJoboptioncode() {}

    public TblrefJoboptioncode(TblrefJoboptioncode value) {
        this.joboptionid = value.joboptionid;
        this.joboptioncode = value.joboptioncode;
        this.durationdays = value.durationdays;
        this.noofjobfree = value.noofjobfree;
        this.noofjobpost = value.noofjobpost;
    }

    public TblrefJoboptioncode(
        Byte   joboptionid,
        String joboptioncode,
        Byte   durationdays,
        Byte   noofjobfree,
        Byte   noofjobpost
    ) {
        this.joboptionid = joboptionid;
        this.joboptioncode = joboptioncode;
        this.durationdays = durationdays;
        this.noofjobfree = noofjobfree;
        this.noofjobpost = noofjobpost;
    }

    public Byte getJoboptionid() {
        return this.joboptionid;
    }

    public void setJoboptionid(Byte joboptionid) {
        this.joboptionid = joboptionid;
    }

    public String getJoboptioncode() {
        return this.joboptioncode;
    }

    public void setJoboptioncode(String joboptioncode) {
        this.joboptioncode = joboptioncode;
    }

    public Byte getDurationdays() {
        return this.durationdays;
    }

    public void setDurationdays(Byte durationdays) {
        this.durationdays = durationdays;
    }

    public Byte getNoofjobfree() {
        return this.noofjobfree;
    }

    public void setNoofjobfree(Byte noofjobfree) {
        this.noofjobfree = noofjobfree;
    }

    public Byte getNoofjobpost() {
        return this.noofjobpost;
    }

    public void setNoofjobpost(Byte noofjobpost) {
        this.noofjobpost = noofjobpost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJoboptioncode (");

        sb.append(joboptionid);
        sb.append(", ").append(joboptioncode);
        sb.append(", ").append(durationdays);
        sb.append(", ").append(noofjobfree);
        sb.append(", ").append(noofjobpost);

        sb.append(")");
        return sb.toString();
    }
}