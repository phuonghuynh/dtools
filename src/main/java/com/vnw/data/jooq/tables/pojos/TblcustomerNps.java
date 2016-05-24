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
public class TblcustomerNps implements Serializable {

    private static final long serialVersionUID = 337658065;

    private UInteger  entryid;
    private Integer   userid;
    private Byte      templatetype;
    private Timestamp sentdate;
    private Timestamp feedbackdate;
    private Byte      npsscore;

    public TblcustomerNps() {}

    public TblcustomerNps(TblcustomerNps value) {
        this.entryid = value.entryid;
        this.userid = value.userid;
        this.templatetype = value.templatetype;
        this.sentdate = value.sentdate;
        this.feedbackdate = value.feedbackdate;
        this.npsscore = value.npsscore;
    }

    public TblcustomerNps(
        UInteger  entryid,
        Integer   userid,
        Byte      templatetype,
        Timestamp sentdate,
        Timestamp feedbackdate,
        Byte      npsscore
    ) {
        this.entryid = entryid;
        this.userid = userid;
        this.templatetype = templatetype;
        this.sentdate = sentdate;
        this.feedbackdate = feedbackdate;
        this.npsscore = npsscore;
    }

    public UInteger getEntryid() {
        return this.entryid;
    }

    public void setEntryid(UInteger entryid) {
        this.entryid = entryid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getTemplatetype() {
        return this.templatetype;
    }

    public void setTemplatetype(Byte templatetype) {
        this.templatetype = templatetype;
    }

    public Timestamp getSentdate() {
        return this.sentdate;
    }

    public void setSentdate(Timestamp sentdate) {
        this.sentdate = sentdate;
    }

    public Timestamp getFeedbackdate() {
        return this.feedbackdate;
    }

    public void setFeedbackdate(Timestamp feedbackdate) {
        this.feedbackdate = feedbackdate;
    }

    public Byte getNpsscore() {
        return this.npsscore;
    }

    public void setNpsscore(Byte npsscore) {
        this.npsscore = npsscore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblcustomerNps (");

        sb.append(entryid);
        sb.append(", ").append(userid);
        sb.append(", ").append(templatetype);
        sb.append(", ").append(sentdate);
        sb.append(", ").append(feedbackdate);
        sb.append(", ").append(npsscore);

        sb.append(")");
        return sb.toString();
    }
}
