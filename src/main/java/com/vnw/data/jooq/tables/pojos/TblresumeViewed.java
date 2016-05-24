/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class TblresumeViewed implements Serializable {

    private static final long serialVersionUID = -997501425;

    private Integer   userid;
    private Integer   resumeid;
    private Timestamp lastviewed;
    private Timestamp expireddate;
    private Integer   noofviewed;
    private Byte      isbought;
    private UByte     isviewedbysearching;

    public TblresumeViewed() {}

    public TblresumeViewed(TblresumeViewed value) {
        this.userid = value.userid;
        this.resumeid = value.resumeid;
        this.lastviewed = value.lastviewed;
        this.expireddate = value.expireddate;
        this.noofviewed = value.noofviewed;
        this.isbought = value.isbought;
        this.isviewedbysearching = value.isviewedbysearching;
    }

    public TblresumeViewed(
        Integer   userid,
        Integer   resumeid,
        Timestamp lastviewed,
        Timestamp expireddate,
        Integer   noofviewed,
        Byte      isbought,
        UByte     isviewedbysearching
    ) {
        this.userid = userid;
        this.resumeid = resumeid;
        this.lastviewed = lastviewed;
        this.expireddate = expireddate;
        this.noofviewed = noofviewed;
        this.isbought = isbought;
        this.isviewedbysearching = isviewedbysearching;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getResumeid() {
        return this.resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Timestamp getLastviewed() {
        return this.lastviewed;
    }

    public void setLastviewed(Timestamp lastviewed) {
        this.lastviewed = lastviewed;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public Integer getNoofviewed() {
        return this.noofviewed;
    }

    public void setNoofviewed(Integer noofviewed) {
        this.noofviewed = noofviewed;
    }

    public Byte getIsbought() {
        return this.isbought;
    }

    public void setIsbought(Byte isbought) {
        this.isbought = isbought;
    }

    public UByte getIsviewedbysearching() {
        return this.isviewedbysearching;
    }

    public void setIsviewedbysearching(UByte isviewedbysearching) {
        this.isviewedbysearching = isviewedbysearching;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumeViewed (");

        sb.append(userid);
        sb.append(", ").append(resumeid);
        sb.append(", ").append(lastviewed);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(noofviewed);
        sb.append(", ").append(isbought);
        sb.append(", ").append(isviewedbysearching);

        sb.append(")");
        return sb.toString();
    }
}
