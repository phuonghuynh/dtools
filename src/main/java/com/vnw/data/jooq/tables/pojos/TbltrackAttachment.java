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
public class TbltrackAttachment implements Serializable {

    private static final long serialVersionUID = 862452128;

    private UInteger  id;
    private UInteger  userid;
    private UInteger  jobid;
    private Byte      flowid;
    private String    eventid;
    private Timestamp logdatetime;
    private String    clientip;

    public TbltrackAttachment() {}

    public TbltrackAttachment(TbltrackAttachment value) {
        this.id = value.id;
        this.userid = value.userid;
        this.jobid = value.jobid;
        this.flowid = value.flowid;
        this.eventid = value.eventid;
        this.logdatetime = value.logdatetime;
        this.clientip = value.clientip;
    }

    public TbltrackAttachment(
        UInteger  id,
        UInteger  userid,
        UInteger  jobid,
        Byte      flowid,
        String    eventid,
        Timestamp logdatetime,
        String    clientip
    ) {
        this.id = id;
        this.userid = userid;
        this.jobid = jobid;
        this.flowid = flowid;
        this.eventid = eventid;
        this.logdatetime = logdatetime;
        this.clientip = clientip;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getUserid() {
        return this.userid;
    }

    public void setUserid(UInteger userid) {
        this.userid = userid;
    }

    public UInteger getJobid() {
        return this.jobid;
    }

    public void setJobid(UInteger jobid) {
        this.jobid = jobid;
    }

    public Byte getFlowid() {
        return this.flowid;
    }

    public void setFlowid(Byte flowid) {
        this.flowid = flowid;
    }

    public String getEventid() {
        return this.eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public Timestamp getLogdatetime() {
        return this.logdatetime;
    }

    public void setLogdatetime(Timestamp logdatetime) {
        this.logdatetime = logdatetime;
    }

    public String getClientip() {
        return this.clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbltrackAttachment (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(flowid);
        sb.append(", ").append(eventid);
        sb.append(", ").append(logdatetime);
        sb.append(", ").append(clientip);

        sb.append(")");
        return sb.toString();
    }
}
