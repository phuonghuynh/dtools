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
public class TblNewsletterSentFail implements Serializable {

    private static final long serialVersionUID = -938952252;

    private String    emails;
    private Timestamp datefail;

    public TblNewsletterSentFail() {}

    public TblNewsletterSentFail(TblNewsletterSentFail value) {
        this.emails = value.emails;
        this.datefail = value.datefail;
    }

    public TblNewsletterSentFail(
        String    emails,
        Timestamp datefail
    ) {
        this.emails = emails;
        this.datefail = datefail;
    }

    public String getEmails() {
        return this.emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public Timestamp getDatefail() {
        return this.datefail;
    }

    public void setDatefail(Timestamp datefail) {
        this.datefail = datefail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblNewsletterSentFail (");

        sb.append(emails);
        sb.append(", ").append(datefail);

        sb.append(")");
        return sb.toString();
    }
}