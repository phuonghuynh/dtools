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
public class TblrefPaymentmethod implements Serializable {

    private static final long serialVersionUID = -1153122783;

    private Byte   paymentmethodid;
    private Byte   languageid;
    private String paymentmethodname;
    private Byte   paymentmethodorder;

    public TblrefPaymentmethod() {}

    public TblrefPaymentmethod(TblrefPaymentmethod value) {
        this.paymentmethodid = value.paymentmethodid;
        this.languageid = value.languageid;
        this.paymentmethodname = value.paymentmethodname;
        this.paymentmethodorder = value.paymentmethodorder;
    }

    public TblrefPaymentmethod(
        Byte   paymentmethodid,
        Byte   languageid,
        String paymentmethodname,
        Byte   paymentmethodorder
    ) {
        this.paymentmethodid = paymentmethodid;
        this.languageid = languageid;
        this.paymentmethodname = paymentmethodname;
        this.paymentmethodorder = paymentmethodorder;
    }

    public Byte getPaymentmethodid() {
        return this.paymentmethodid;
    }

    public void setPaymentmethodid(Byte paymentmethodid) {
        this.paymentmethodid = paymentmethodid;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getPaymentmethodname() {
        return this.paymentmethodname;
    }

    public void setPaymentmethodname(String paymentmethodname) {
        this.paymentmethodname = paymentmethodname;
    }

    public Byte getPaymentmethodorder() {
        return this.paymentmethodorder;
    }

    public void setPaymentmethodorder(Byte paymentmethodorder) {
        this.paymentmethodorder = paymentmethodorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefPaymentmethod (");

        sb.append(paymentmethodid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(paymentmethodname);
        sb.append(", ").append(paymentmethodorder);

        sb.append(")");
        return sb.toString();
    }
}
