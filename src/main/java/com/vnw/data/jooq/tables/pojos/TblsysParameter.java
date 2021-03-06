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
public class TblsysParameter implements Serializable {

    private static final long serialVersionUID = 692108193;

    private String parcode;
    private String parname;
    private String parvalue;

    public TblsysParameter() {}

    public TblsysParameter(TblsysParameter value) {
        this.parcode = value.parcode;
        this.parname = value.parname;
        this.parvalue = value.parvalue;
    }

    public TblsysParameter(
        String parcode,
        String parname,
        String parvalue
    ) {
        this.parcode = parcode;
        this.parname = parname;
        this.parvalue = parvalue;
    }

    public String getParcode() {
        return this.parcode;
    }

    public void setParcode(String parcode) {
        this.parcode = parcode;
    }

    public String getParname() {
        return this.parname;
    }

    public void setParname(String parname) {
        this.parname = parname;
    }

    public String getParvalue() {
        return this.parvalue;
    }

    public void setParvalue(String parvalue) {
        this.parvalue = parvalue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysParameter (");

        sb.append(parcode);
        sb.append(", ").append(parname);
        sb.append(", ").append(parvalue);

        sb.append(")");
        return sb.toString();
    }
}
