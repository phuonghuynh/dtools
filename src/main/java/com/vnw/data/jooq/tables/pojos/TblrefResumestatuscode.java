/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;


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
public class TblrefResumestatuscode implements Serializable {

    private static final long serialVersionUID = -1470789628;

    private UByte  resumestatusId;
    private String resumestatusCode;

    public TblrefResumestatuscode() {}

    public TblrefResumestatuscode(TblrefResumestatuscode value) {
        this.resumestatusId = value.resumestatusId;
        this.resumestatusCode = value.resumestatusCode;
    }

    public TblrefResumestatuscode(
        UByte  resumestatusId,
        String resumestatusCode
    ) {
        this.resumestatusId = resumestatusId;
        this.resumestatusCode = resumestatusCode;
    }

    public UByte getResumestatusId() {
        return this.resumestatusId;
    }

    public void setResumestatusId(UByte resumestatusId) {
        this.resumestatusId = resumestatusId;
    }

    public String getResumestatusCode() {
        return this.resumestatusCode;
    }

    public void setResumestatusCode(String resumestatusCode) {
        this.resumestatusCode = resumestatusCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefResumestatuscode (");

        sb.append(resumestatusId);
        sb.append(", ").append(resumestatusCode);

        sb.append(")");
        return sb.toString();
    }
}
