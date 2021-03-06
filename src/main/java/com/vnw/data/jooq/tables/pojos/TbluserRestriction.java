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
public class TbluserRestriction implements Serializable {

    private static final long serialVersionUID = 2059998204;

    private UInteger  entryid;
    private UInteger  userid;
    private UInteger  employerid;
    private Timestamp createdate;
    private Timestamp lastdatelogin;

    public TbluserRestriction() {}

    public TbluserRestriction(TbluserRestriction value) {
        this.entryid = value.entryid;
        this.userid = value.userid;
        this.employerid = value.employerid;
        this.createdate = value.createdate;
        this.lastdatelogin = value.lastdatelogin;
    }

    public TbluserRestriction(
        UInteger  entryid,
        UInteger  userid,
        UInteger  employerid,
        Timestamp createdate,
        Timestamp lastdatelogin
    ) {
        this.entryid = entryid;
        this.userid = userid;
        this.employerid = employerid;
        this.createdate = createdate;
        this.lastdatelogin = lastdatelogin;
    }

    public UInteger getEntryid() {
        return this.entryid;
    }

    public void setEntryid(UInteger entryid) {
        this.entryid = entryid;
    }

    public UInteger getUserid() {
        return this.userid;
    }

    public void setUserid(UInteger userid) {
        this.userid = userid;
    }

    public UInteger getEmployerid() {
        return this.employerid;
    }

    public void setEmployerid(UInteger employerid) {
        this.employerid = employerid;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getLastdatelogin() {
        return this.lastdatelogin;
    }

    public void setLastdatelogin(Timestamp lastdatelogin) {
        this.lastdatelogin = lastdatelogin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbluserRestriction (");

        sb.append(entryid);
        sb.append(", ").append(userid);
        sb.append(", ").append(employerid);
        sb.append(", ").append(createdate);
        sb.append(", ").append(lastdatelogin);

        sb.append(")");
        return sb.toString();
    }
}
