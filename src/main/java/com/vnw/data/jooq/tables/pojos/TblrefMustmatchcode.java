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
public class TblrefMustmatchcode implements Serializable {

    private static final long serialVersionUID = 646039452;

    private Byte   mustmatchid;
    private String mustmatchcode;
    private String mustmatchfuncname;

    public TblrefMustmatchcode() {}

    public TblrefMustmatchcode(TblrefMustmatchcode value) {
        this.mustmatchid = value.mustmatchid;
        this.mustmatchcode = value.mustmatchcode;
        this.mustmatchfuncname = value.mustmatchfuncname;
    }

    public TblrefMustmatchcode(
        Byte   mustmatchid,
        String mustmatchcode,
        String mustmatchfuncname
    ) {
        this.mustmatchid = mustmatchid;
        this.mustmatchcode = mustmatchcode;
        this.mustmatchfuncname = mustmatchfuncname;
    }

    public Byte getMustmatchid() {
        return this.mustmatchid;
    }

    public void setMustmatchid(Byte mustmatchid) {
        this.mustmatchid = mustmatchid;
    }

    public String getMustmatchcode() {
        return this.mustmatchcode;
    }

    public void setMustmatchcode(String mustmatchcode) {
        this.mustmatchcode = mustmatchcode;
    }

    public String getMustmatchfuncname() {
        return this.mustmatchfuncname;
    }

    public void setMustmatchfuncname(String mustmatchfuncname) {
        this.mustmatchfuncname = mustmatchfuncname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefMustmatchcode (");

        sb.append(mustmatchid);
        sb.append(", ").append(mustmatchcode);
        sb.append(", ").append(mustmatchfuncname);

        sb.append(")");
        return sb.toString();
    }
}
