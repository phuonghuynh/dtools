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
public class TblregistrationCareerIndustry implements Serializable {

    private static final long serialVersionUID = 2058536246;

    private Integer userid;
    private Short   industryid;

    public TblregistrationCareerIndustry() {}

    public TblregistrationCareerIndustry(TblregistrationCareerIndustry value) {
        this.userid = value.userid;
        this.industryid = value.industryid;
    }

    public TblregistrationCareerIndustry(
        Integer userid,
        Short   industryid
    ) {
        this.userid = userid;
        this.industryid = industryid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Short getIndustryid() {
        return this.industryid;
    }

    public void setIndustryid(Short industryid) {
        this.industryid = industryid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblregistrationCareerIndustry (");

        sb.append(userid);
        sb.append(", ").append(industryid);

        sb.append(")");
        return sb.toString();
    }
}
