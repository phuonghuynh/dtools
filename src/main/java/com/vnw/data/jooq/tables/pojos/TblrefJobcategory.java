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
public class TblrefJobcategory implements Serializable {

    private static final long serialVersionUID = 316040279;

    private Short  jobcategoryid;
    private Short  languageid;
    private String jobcategoryname;
    private Short  jobcategoryorder;

    public TblrefJobcategory() {}

    public TblrefJobcategory(TblrefJobcategory value) {
        this.jobcategoryid = value.jobcategoryid;
        this.languageid = value.languageid;
        this.jobcategoryname = value.jobcategoryname;
        this.jobcategoryorder = value.jobcategoryorder;
    }

    public TblrefJobcategory(
        Short  jobcategoryid,
        Short  languageid,
        String jobcategoryname,
        Short  jobcategoryorder
    ) {
        this.jobcategoryid = jobcategoryid;
        this.languageid = languageid;
        this.jobcategoryname = jobcategoryname;
        this.jobcategoryorder = jobcategoryorder;
    }

    public Short getJobcategoryid() {
        return this.jobcategoryid;
    }

    public void setJobcategoryid(Short jobcategoryid) {
        this.jobcategoryid = jobcategoryid;
    }

    public Short getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Short languageid) {
        this.languageid = languageid;
    }

    public String getJobcategoryname() {
        return this.jobcategoryname;
    }

    public void setJobcategoryname(String jobcategoryname) {
        this.jobcategoryname = jobcategoryname;
    }

    public Short getJobcategoryorder() {
        return this.jobcategoryorder;
    }

    public void setJobcategoryorder(Short jobcategoryorder) {
        this.jobcategoryorder = jobcategoryorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJobcategory (");

        sb.append(jobcategoryid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(jobcategoryname);
        sb.append(", ").append(jobcategoryorder);

        sb.append(")");
        return sb.toString();
    }
}