/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class TbltrackPageview implements Serializable {

    private static final long serialVersionUID = 705936441;

    private Integer   entryid;
    private Integer   trackingid;
    private Short     pageid;
    private String    pageuri;
    private Byte      pagedepth;
    private Timestamp visiteddate;

    public TbltrackPageview() {}

    public TbltrackPageview(TbltrackPageview value) {
        this.entryid = value.entryid;
        this.trackingid = value.trackingid;
        this.pageid = value.pageid;
        this.pageuri = value.pageuri;
        this.pagedepth = value.pagedepth;
        this.visiteddate = value.visiteddate;
    }

    public TbltrackPageview(
        Integer   entryid,
        Integer   trackingid,
        Short     pageid,
        String    pageuri,
        Byte      pagedepth,
        Timestamp visiteddate
    ) {
        this.entryid = entryid;
        this.trackingid = trackingid;
        this.pageid = pageid;
        this.pageuri = pageuri;
        this.pagedepth = pagedepth;
        this.visiteddate = visiteddate;
    }

    public Integer getEntryid() {
        return this.entryid;
    }

    public void setEntryid(Integer entryid) {
        this.entryid = entryid;
    }

    public Integer getTrackingid() {
        return this.trackingid;
    }

    public void setTrackingid(Integer trackingid) {
        this.trackingid = trackingid;
    }

    public Short getPageid() {
        return this.pageid;
    }

    public void setPageid(Short pageid) {
        this.pageid = pageid;
    }

    public String getPageuri() {
        return this.pageuri;
    }

    public void setPageuri(String pageuri) {
        this.pageuri = pageuri;
    }

    public Byte getPagedepth() {
        return this.pagedepth;
    }

    public void setPagedepth(Byte pagedepth) {
        this.pagedepth = pagedepth;
    }

    public Timestamp getVisiteddate() {
        return this.visiteddate;
    }

    public void setVisiteddate(Timestamp visiteddate) {
        this.visiteddate = visiteddate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbltrackPageview (");

        sb.append(entryid);
        sb.append(", ").append(trackingid);
        sb.append(", ").append(pageid);
        sb.append(", ").append(pageuri);
        sb.append(", ").append(pagedepth);
        sb.append(", ").append(visiteddate);

        sb.append(")");
        return sb.toString();
    }
}
