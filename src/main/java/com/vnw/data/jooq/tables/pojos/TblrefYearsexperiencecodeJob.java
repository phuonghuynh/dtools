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
public class TblrefYearsexperiencecodeJob implements Serializable {

    private static final long serialVersionUID = -1052935571;

    private Byte   yearsexperienceid;
    private String yearsexperiencecode;

    public TblrefYearsexperiencecodeJob() {}

    public TblrefYearsexperiencecodeJob(TblrefYearsexperiencecodeJob value) {
        this.yearsexperienceid = value.yearsexperienceid;
        this.yearsexperiencecode = value.yearsexperiencecode;
    }

    public TblrefYearsexperiencecodeJob(
        Byte   yearsexperienceid,
        String yearsexperiencecode
    ) {
        this.yearsexperienceid = yearsexperienceid;
        this.yearsexperiencecode = yearsexperiencecode;
    }

    public Byte getYearsexperienceid() {
        return this.yearsexperienceid;
    }

    public void setYearsexperienceid(Byte yearsexperienceid) {
        this.yearsexperienceid = yearsexperienceid;
    }

    public String getYearsexperiencecode() {
        return this.yearsexperiencecode;
    }

    public void setYearsexperiencecode(String yearsexperiencecode) {
        this.yearsexperiencecode = yearsexperiencecode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefYearsexperiencecodeJob (");

        sb.append(yearsexperienceid);
        sb.append(", ").append(yearsexperiencecode);

        sb.append(")");
        return sb.toString();
    }
}
