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
public class TblrefHowyouknowus implements Serializable {

    private static final long serialVersionUID = -1712643200;

    private Byte   howyouknowusid;
    private Byte   languageid;
    private String howyouknowusname;
    private Byte   howyouknowusorder;

    public TblrefHowyouknowus() {}

    public TblrefHowyouknowus(TblrefHowyouknowus value) {
        this.howyouknowusid = value.howyouknowusid;
        this.languageid = value.languageid;
        this.howyouknowusname = value.howyouknowusname;
        this.howyouknowusorder = value.howyouknowusorder;
    }

    public TblrefHowyouknowus(
        Byte   howyouknowusid,
        Byte   languageid,
        String howyouknowusname,
        Byte   howyouknowusorder
    ) {
        this.howyouknowusid = howyouknowusid;
        this.languageid = languageid;
        this.howyouknowusname = howyouknowusname;
        this.howyouknowusorder = howyouknowusorder;
    }

    public Byte getHowyouknowusid() {
        return this.howyouknowusid;
    }

    public void setHowyouknowusid(Byte howyouknowusid) {
        this.howyouknowusid = howyouknowusid;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getHowyouknowusname() {
        return this.howyouknowusname;
    }

    public void setHowyouknowusname(String howyouknowusname) {
        this.howyouknowusname = howyouknowusname;
    }

    public Byte getHowyouknowusorder() {
        return this.howyouknowusorder;
    }

    public void setHowyouknowusorder(Byte howyouknowusorder) {
        this.howyouknowusorder = howyouknowusorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefHowyouknowus (");

        sb.append(howyouknowusid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(howyouknowusname);
        sb.append(", ").append(howyouknowusorder);

        sb.append(")");
        return sb.toString();
    }
}
