/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


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
public class Tblppl implements Serializable {

    private static final long serialVersionUID = -985479340;

    private UInteger  id;
    private UInteger  userid;
    private String    fullname;
    private String    cellphone;
    private String    email;
    private UShort    location;
    private UByte     monthlyincome;
    private UByte     paymentmethod;
    private Timestamp submittime;
    private String    companylead;
    private String    source;

    public Tblppl() {}

    public Tblppl(Tblppl value) {
        this.id = value.id;
        this.userid = value.userid;
        this.fullname = value.fullname;
        this.cellphone = value.cellphone;
        this.email = value.email;
        this.location = value.location;
        this.monthlyincome = value.monthlyincome;
        this.paymentmethod = value.paymentmethod;
        this.submittime = value.submittime;
        this.companylead = value.companylead;
        this.source = value.source;
    }

    public Tblppl(
        UInteger  id,
        UInteger  userid,
        String    fullname,
        String    cellphone,
        String    email,
        UShort    location,
        UByte     monthlyincome,
        UByte     paymentmethod,
        Timestamp submittime,
        String    companylead,
        String    source
    ) {
        this.id = id;
        this.userid = userid;
        this.fullname = fullname;
        this.cellphone = cellphone;
        this.email = email;
        this.location = location;
        this.monthlyincome = monthlyincome;
        this.paymentmethod = paymentmethod;
        this.submittime = submittime;
        this.companylead = companylead;
        this.source = source;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getUserid() {
        return this.userid;
    }

    public void setUserid(UInteger userid) {
        this.userid = userid;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UShort getLocation() {
        return this.location;
    }

    public void setLocation(UShort location) {
        this.location = location;
    }

    public UByte getMonthlyincome() {
        return this.monthlyincome;
    }

    public void setMonthlyincome(UByte monthlyincome) {
        this.monthlyincome = monthlyincome;
    }

    public UByte getPaymentmethod() {
        return this.paymentmethod;
    }

    public void setPaymentmethod(UByte paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Timestamp getSubmittime() {
        return this.submittime;
    }

    public void setSubmittime(Timestamp submittime) {
        this.submittime = submittime;
    }

    public String getCompanylead() {
        return this.companylead;
    }

    public void setCompanylead(String companylead) {
        this.companylead = companylead;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tblppl (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(fullname);
        sb.append(", ").append(cellphone);
        sb.append(", ").append(email);
        sb.append(", ").append(location);
        sb.append(", ").append(monthlyincome);
        sb.append(", ").append(paymentmethod);
        sb.append(", ").append(submittime);
        sb.append(", ").append(companylead);
        sb.append(", ").append(source);

        sb.append(")");
        return sb.toString();
    }
}
