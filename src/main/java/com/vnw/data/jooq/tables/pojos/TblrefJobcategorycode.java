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
public class TblrefJobcategorycode implements Serializable {

    private static final long serialVersionUID = -1471290044;

    private Short  jobcategoryid;
    private String jobcategorycode;
    private Short  industryid;

    public TblrefJobcategorycode() {}

    public TblrefJobcategorycode(TblrefJobcategorycode value) {
        this.jobcategoryid = value.jobcategoryid;
        this.jobcategorycode = value.jobcategorycode;
        this.industryid = value.industryid;
    }

    public TblrefJobcategorycode(
        Short  jobcategoryid,
        String jobcategorycode,
        Short  industryid
    ) {
        this.jobcategoryid = jobcategoryid;
        this.jobcategorycode = jobcategorycode;
        this.industryid = industryid;
    }

    public Short getJobcategoryid() {
        return this.jobcategoryid;
    }

    public void setJobcategoryid(Short jobcategoryid) {
        this.jobcategoryid = jobcategoryid;
    }

    public String getJobcategorycode() {
        return this.jobcategorycode;
    }

    public void setJobcategorycode(String jobcategorycode) {
        this.jobcategorycode = jobcategorycode;
    }

    public Short getIndustryid() {
        return this.industryid;
    }

    public void setIndustryid(Short industryid) {
        this.industryid = industryid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJobcategorycode (");

        sb.append(jobcategoryid);
        sb.append(", ").append(jobcategorycode);
        sb.append(", ").append(industryid);

        sb.append(")");
        return sb.toString();
    }
}
