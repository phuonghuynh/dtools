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
public class TblrefTempnewletter implements Serializable {

    private static final long serialVersionUID = -200093691;

    private Short  tempid;
    private String temppath;
    private Byte   isactive;

    public TblrefTempnewletter() {}

    public TblrefTempnewletter(TblrefTempnewletter value) {
        this.tempid = value.tempid;
        this.temppath = value.temppath;
        this.isactive = value.isactive;
    }

    public TblrefTempnewletter(
        Short  tempid,
        String temppath,
        Byte   isactive
    ) {
        this.tempid = tempid;
        this.temppath = temppath;
        this.isactive = isactive;
    }

    public Short getTempid() {
        return this.tempid;
    }

    public void setTempid(Short tempid) {
        this.tempid = tempid;
    }

    public String getTemppath() {
        return this.temppath;
    }

    public void setTemppath(String temppath) {
        this.temppath = temppath;
    }

    public Byte getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefTempnewletter (");

        sb.append(tempid);
        sb.append(", ").append(temppath);
        sb.append(", ").append(isactive);

        sb.append(")");
        return sb.toString();
    }
}