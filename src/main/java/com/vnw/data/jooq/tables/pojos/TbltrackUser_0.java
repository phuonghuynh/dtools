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
public class TbltrackUser_0 implements Serializable {

    private static final long serialVersionUID = 561983368;

    private UByte     versionid;
    private String    appid;
    private UInteger  userid;
    private UByte     functionid;
    private UInteger  objectid;
    private Timestamp accesstime;

    public TbltrackUser_0() {}

    public TbltrackUser_0(TbltrackUser_0 value) {
        this.versionid = value.versionid;
        this.appid = value.appid;
        this.userid = value.userid;
        this.functionid = value.functionid;
        this.objectid = value.objectid;
        this.accesstime = value.accesstime;
    }

    public TbltrackUser_0(
        UByte     versionid,
        String    appid,
        UInteger  userid,
        UByte     functionid,
        UInteger  objectid,
        Timestamp accesstime
    ) {
        this.versionid = versionid;
        this.appid = appid;
        this.userid = userid;
        this.functionid = functionid;
        this.objectid = objectid;
        this.accesstime = accesstime;
    }

    public UByte getVersionid() {
        return this.versionid;
    }

    public void setVersionid(UByte versionid) {
        this.versionid = versionid;
    }

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public UInteger getUserid() {
        return this.userid;
    }

    public void setUserid(UInteger userid) {
        this.userid = userid;
    }

    public UByte getFunctionid() {
        return this.functionid;
    }

    public void setFunctionid(UByte functionid) {
        this.functionid = functionid;
    }

    public UInteger getObjectid() {
        return this.objectid;
    }

    public void setObjectid(UInteger objectid) {
        this.objectid = objectid;
    }

    public Timestamp getAccesstime() {
        return this.accesstime;
    }

    public void setAccesstime(Timestamp accesstime) {
        this.accesstime = accesstime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbltrackUser_0 (");

        sb.append(versionid);
        sb.append(", ").append(appid);
        sb.append(", ").append(userid);
        sb.append(", ").append(functionid);
        sb.append(", ").append(objectid);
        sb.append(", ").append(accesstime);

        sb.append(")");
        return sb.toString();
    }
}
