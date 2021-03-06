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
public class TbljobExtraService implements Serializable {

    private static final long serialVersionUID = -34736888;

    private UInteger  entryid;
    private UInteger  jobid;
    private String    servicecode;
    private Timestamp onlinedate;
    private Timestamp expireddate;
    private Timestamp _Timestamp;

    public TbljobExtraService() {}

    public TbljobExtraService(TbljobExtraService value) {
        this.entryid = value.entryid;
        this.jobid = value.jobid;
        this.servicecode = value.servicecode;
        this.onlinedate = value.onlinedate;
        this.expireddate = value.expireddate;
        this._Timestamp = value._Timestamp;
    }

    public TbljobExtraService(
        UInteger  entryid,
        UInteger  jobid,
        String    servicecode,
        Timestamp onlinedate,
        Timestamp expireddate,
        Timestamp _Timestamp
    ) {
        this.entryid = entryid;
        this.jobid = jobid;
        this.servicecode = servicecode;
        this.onlinedate = onlinedate;
        this.expireddate = expireddate;
        this._Timestamp = _Timestamp;
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

    public String getServicecode() {
        return this.servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public Timestamp getOnlinedate() {
        return this.onlinedate;
    }

    public void setOnlinedate(Timestamp onlinedate) {
        this.onlinedate = onlinedate;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public Timestamp get_Timestamp() {
        return this._Timestamp;
    }

    public void set_Timestamp(Timestamp _Timestamp) {
        this._Timestamp = _Timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobExtraService (");

        sb.append(entryid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(servicecode);
        sb.append(", ").append(onlinedate);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(_Timestamp);

        sb.append(")");
        return sb.toString();
    }
}
