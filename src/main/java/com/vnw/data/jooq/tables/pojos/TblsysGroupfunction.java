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
public class TblsysGroupfunction implements Serializable {

    private static final long serialVersionUID = -803216248;

    private Short groupid;
    private Short functionid;

    public TblsysGroupfunction() {}

    public TblsysGroupfunction(TblsysGroupfunction value) {
        this.groupid = value.groupid;
        this.functionid = value.functionid;
    }

    public TblsysGroupfunction(
        Short groupid,
        Short functionid
    ) {
        this.groupid = groupid;
        this.functionid = functionid;
    }

    public Short getGroupid() {
        return this.groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getFunctionid() {
        return this.functionid;
    }

    public void setFunctionid(Short functionid) {
        this.functionid = functionid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysGroupfunction (");

        sb.append(groupid);
        sb.append(", ").append(functionid);

        sb.append(")");
        return sb.toString();
    }
}