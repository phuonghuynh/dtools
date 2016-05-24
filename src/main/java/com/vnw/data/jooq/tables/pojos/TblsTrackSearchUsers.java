/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class TblsTrackSearchUsers implements Serializable {

    private static final long serialVersionUID = 347119819;

    private UInteger  userid;
    private String    keyword;
    private Integer   cityid;
    private Short     industryid;
    private Byte      joblevelid;
    private Integer   salarymin;
    private Timestamp searchtime;
    private String    clientip;

    public TblsTrackSearchUsers() {}

    public TblsTrackSearchUsers(TblsTrackSearchUsers value) {
        this.userid = value.userid;
        this.keyword = value.keyword;
        this.cityid = value.cityid;
        this.industryid = value.industryid;
        this.joblevelid = value.joblevelid;
        this.salarymin = value.salarymin;
        this.searchtime = value.searchtime;
        this.clientip = value.clientip;
    }

    public TblsTrackSearchUsers(
        UInteger  userid,
        String    keyword,
        Integer   cityid,
        Short     industryid,
        Byte      joblevelid,
        Integer   salarymin,
        Timestamp searchtime,
        String    clientip
    ) {
        this.userid = userid;
        this.keyword = keyword;
        this.cityid = cityid;
        this.industryid = industryid;
        this.joblevelid = joblevelid;
        this.salarymin = salarymin;
        this.searchtime = searchtime;
        this.clientip = clientip;
    }

    public UInteger getUserid() {
        return this.userid;
    }

    public void setUserid(UInteger userid) {
        this.userid = userid;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCityid() {
        return this.cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Short getIndustryid() {
        return this.industryid;
    }

    public void setIndustryid(Short industryid) {
        this.industryid = industryid;
    }

    public Byte getJoblevelid() {
        return this.joblevelid;
    }

    public void setJoblevelid(Byte joblevelid) {
        this.joblevelid = joblevelid;
    }

    public Integer getSalarymin() {
        return this.salarymin;
    }

    public void setSalarymin(Integer salarymin) {
        this.salarymin = salarymin;
    }

    public Timestamp getSearchtime() {
        return this.searchtime;
    }

    public void setSearchtime(Timestamp searchtime) {
        this.searchtime = searchtime;
    }

    public String getClientip() {
        return this.clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsTrackSearchUsers (");

        sb.append(userid);
        sb.append(", ").append(keyword);
        sb.append(", ").append(cityid);
        sb.append(", ").append(industryid);
        sb.append(", ").append(joblevelid);
        sb.append(", ").append(salarymin);
        sb.append(", ").append(searchtime);
        sb.append(", ").append(clientip);

        sb.append(")");
        return sb.toString();
    }
}