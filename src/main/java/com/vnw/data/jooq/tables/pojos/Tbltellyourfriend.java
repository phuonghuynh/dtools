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
public class Tbltellyourfriend implements Serializable {

    private static final long serialVersionUID = -325528647;

    private Integer   entryid;
    private Byte      languageid;
    private String    sendername;
    private String    senderemail;
    private String    recipientemail;
    private Timestamp createddate;

    public Tbltellyourfriend() {}

    public Tbltellyourfriend(Tbltellyourfriend value) {
        this.entryid = value.entryid;
        this.languageid = value.languageid;
        this.sendername = value.sendername;
        this.senderemail = value.senderemail;
        this.recipientemail = value.recipientemail;
        this.createddate = value.createddate;
    }

    public Tbltellyourfriend(
        Integer   entryid,
        Byte      languageid,
        String    sendername,
        String    senderemail,
        String    recipientemail,
        Timestamp createddate
    ) {
        this.entryid = entryid;
        this.languageid = languageid;
        this.sendername = sendername;
        this.senderemail = senderemail;
        this.recipientemail = recipientemail;
        this.createddate = createddate;
    }

    public Integer getEntryid() {
        return this.entryid;
    }

    public void setEntryid(Integer entryid) {
        this.entryid = entryid;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getSendername() {
        return this.sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername;
    }

    public String getSenderemail() {
        return this.senderemail;
    }

    public void setSenderemail(String senderemail) {
        this.senderemail = senderemail;
    }

    public String getRecipientemail() {
        return this.recipientemail;
    }

    public void setRecipientemail(String recipientemail) {
        this.recipientemail = recipientemail;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tbltellyourfriend (");

        sb.append(entryid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(sendername);
        sb.append(", ").append(senderemail);
        sb.append(", ").append(recipientemail);
        sb.append(", ").append(createddate);

        sb.append(")");
        return sb.toString();
    }
}
