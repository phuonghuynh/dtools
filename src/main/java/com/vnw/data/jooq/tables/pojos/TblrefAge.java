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
public class TblrefAge implements Serializable {

    private static final long serialVersionUID = 49491250;

    private Byte   ageid;
    private String agevalue;
    private Byte   ageorder;

    public TblrefAge() {}

    public TblrefAge(TblrefAge value) {
        this.ageid = value.ageid;
        this.agevalue = value.agevalue;
        this.ageorder = value.ageorder;
    }

    public TblrefAge(
        Byte   ageid,
        String agevalue,
        Byte   ageorder
    ) {
        this.ageid = ageid;
        this.agevalue = agevalue;
        this.ageorder = ageorder;
    }

    public Byte getAgeid() {
        return this.ageid;
    }

    public void setAgeid(Byte ageid) {
        this.ageid = ageid;
    }

    public String getAgevalue() {
        return this.agevalue;
    }

    public void setAgevalue(String agevalue) {
        this.agevalue = agevalue;
    }

    public Byte getAgeorder() {
        return this.ageorder;
    }

    public void setAgeorder(Byte ageorder) {
        this.ageorder = ageorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefAge (");

        sb.append(ageid);
        sb.append(", ").append(agevalue);
        sb.append(", ").append(ageorder);

        sb.append(")");
        return sb.toString();
    }
}
