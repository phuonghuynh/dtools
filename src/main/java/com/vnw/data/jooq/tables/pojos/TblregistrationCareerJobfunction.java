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
public class TblregistrationCareerJobfunction implements Serializable {

    private static final long serialVersionUID = 414554845;

    private Integer userid;
    private Short   jobfunctionid;

    public TblregistrationCareerJobfunction() {}

    public TblregistrationCareerJobfunction(TblregistrationCareerJobfunction value) {
        this.userid = value.userid;
        this.jobfunctionid = value.jobfunctionid;
    }

    public TblregistrationCareerJobfunction(
        Integer userid,
        Short   jobfunctionid
    ) {
        this.userid = userid;
        this.jobfunctionid = jobfunctionid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Short getJobfunctionid() {
        return this.jobfunctionid;
    }

    public void setJobfunctionid(Short jobfunctionid) {
        this.jobfunctionid = jobfunctionid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblregistrationCareerJobfunction (");

        sb.append(userid);
        sb.append(", ").append(jobfunctionid);

        sb.append(")");
        return sb.toString();
    }
}
