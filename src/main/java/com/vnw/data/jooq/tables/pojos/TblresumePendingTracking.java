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
public class TblresumePendingTracking implements Serializable {

    private static final long serialVersionUID = 1533218965;

    private UInteger  dataid;
    private Byte      typeid;
    private String    path;
    private String    pathunpaidfile;
    private Byte      isdeleted;
    private Timestamp logdatetime;

    public TblresumePendingTracking() {}

    public TblresumePendingTracking(TblresumePendingTracking value) {
        this.dataid = value.dataid;
        this.typeid = value.typeid;
        this.path = value.path;
        this.pathunpaidfile = value.pathunpaidfile;
        this.isdeleted = value.isdeleted;
        this.logdatetime = value.logdatetime;
    }

    public TblresumePendingTracking(
        UInteger  dataid,
        Byte      typeid,
        String    path,
        String    pathunpaidfile,
        Byte      isdeleted,
        Timestamp logdatetime
    ) {
        this.dataid = dataid;
        this.typeid = typeid;
        this.path = path;
        this.pathunpaidfile = pathunpaidfile;
        this.isdeleted = isdeleted;
        this.logdatetime = logdatetime;
    }

    public UInteger getDataid() {
        return this.dataid;
    }

    public void setDataid(UInteger dataid) {
        this.dataid = dataid;
    }

    public Byte getTypeid() {
        return this.typeid;
    }

    public void setTypeid(Byte typeid) {
        this.typeid = typeid;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPathunpaidfile() {
        return this.pathunpaidfile;
    }

    public void setPathunpaidfile(String pathunpaidfile) {
        this.pathunpaidfile = pathunpaidfile;
    }

    public Byte getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Timestamp getLogdatetime() {
        return this.logdatetime;
    }

    public void setLogdatetime(Timestamp logdatetime) {
        this.logdatetime = logdatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumePendingTracking (");

        sb.append(dataid);
        sb.append(", ").append(typeid);
        sb.append(", ").append(path);
        sb.append(", ").append(pathunpaidfile);
        sb.append(", ").append(isdeleted);
        sb.append(", ").append(logdatetime);

        sb.append(")");
        return sb.toString();
    }
}
