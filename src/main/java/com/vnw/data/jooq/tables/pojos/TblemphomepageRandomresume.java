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
public class TblemphomepageRandomresume implements Serializable {

    private static final long serialVersionUID = -2059113675;

    private UInteger  entryid;
    private UInteger  resumeid;
    private UInteger  randomresumecategoryid;
    private String    title;
    private String    description;
    private Timestamp createdate;
    private Timestamp lastupdate;

    public TblemphomepageRandomresume() {}

    public TblemphomepageRandomresume(TblemphomepageRandomresume value) {
        this.entryid = value.entryid;
        this.resumeid = value.resumeid;
        this.randomresumecategoryid = value.randomresumecategoryid;
        this.title = value.title;
        this.description = value.description;
        this.createdate = value.createdate;
        this.lastupdate = value.lastupdate;
    }

    public TblemphomepageRandomresume(
        UInteger  entryid,
        UInteger  resumeid,
        UInteger  randomresumecategoryid,
        String    title,
        String    description,
        Timestamp createdate,
        Timestamp lastupdate
    ) {
        this.entryid = entryid;
        this.resumeid = resumeid;
        this.randomresumecategoryid = randomresumecategoryid;
        this.title = title;
        this.description = description;
        this.createdate = createdate;
        this.lastupdate = lastupdate;
    }

    public UInteger getEntryid() {
        return this.entryid;
    }

    public void setEntryid(UInteger entryid) {
        this.entryid = entryid;
    }

    public UInteger getResumeid() {
        return this.resumeid;
    }

    public void setResumeid(UInteger resumeid) {
        this.resumeid = resumeid;
    }

    public UInteger getRandomresumecategoryid() {
        return this.randomresumecategoryid;
    }

    public void setRandomresumecategoryid(UInteger randomresumecategoryid) {
        this.randomresumecategoryid = randomresumecategoryid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getLastupdate() {
        return this.lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblemphomepageRandomresume (");

        sb.append(entryid);
        sb.append(", ").append(resumeid);
        sb.append(", ").append(randomresumecategoryid);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(createdate);
        sb.append(", ").append(lastupdate);

        sb.append(")");
        return sb.toString();
    }
}