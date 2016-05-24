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
public class TblsysIndustryMetatag implements Serializable {

    private static final long serialVersionUID = -1061305051;

    private Short   entryid;
    private Integer industryid;
    private Byte    languageid;
    private String  robots;
    private String  pagetitle;
    private String  pagefooter;
    private String  pagedesc;
    private String  keyword;

    public TblsysIndustryMetatag() {}

    public TblsysIndustryMetatag(TblsysIndustryMetatag value) {
        this.entryid = value.entryid;
        this.industryid = value.industryid;
        this.languageid = value.languageid;
        this.robots = value.robots;
        this.pagetitle = value.pagetitle;
        this.pagefooter = value.pagefooter;
        this.pagedesc = value.pagedesc;
        this.keyword = value.keyword;
    }

    public TblsysIndustryMetatag(
        Short   entryid,
        Integer industryid,
        Byte    languageid,
        String  robots,
        String  pagetitle,
        String  pagefooter,
        String  pagedesc,
        String  keyword
    ) {
        this.entryid = entryid;
        this.industryid = industryid;
        this.languageid = languageid;
        this.robots = robots;
        this.pagetitle = pagetitle;
        this.pagefooter = pagefooter;
        this.pagedesc = pagedesc;
        this.keyword = keyword;
    }

    public Short getEntryid() {
        return this.entryid;
    }

    public void setEntryid(Short entryid) {
        this.entryid = entryid;
    }

    public Integer getIndustryid() {
        return this.industryid;
    }

    public void setIndustryid(Integer industryid) {
        this.industryid = industryid;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getRobots() {
        return this.robots;
    }

    public void setRobots(String robots) {
        this.robots = robots;
    }

    public String getPagetitle() {
        return this.pagetitle;
    }

    public void setPagetitle(String pagetitle) {
        this.pagetitle = pagetitle;
    }

    public String getPagefooter() {
        return this.pagefooter;
    }

    public void setPagefooter(String pagefooter) {
        this.pagefooter = pagefooter;
    }

    public String getPagedesc() {
        return this.pagedesc;
    }

    public void setPagedesc(String pagedesc) {
        this.pagedesc = pagedesc;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysIndustryMetatag (");

        sb.append(entryid);
        sb.append(", ").append(industryid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(robots);
        sb.append(", ").append(pagetitle);
        sb.append(", ").append(pagefooter);
        sb.append(", ").append(pagedesc);
        sb.append(", ").append(keyword);

        sb.append(")");
        return sb.toString();
    }
}