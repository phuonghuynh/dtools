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
public class TblNewsletterTrackSent implements Serializable {

    private static final long serialVersionUID = -729149773;

    private Integer id;
    private String  message;

    public TblNewsletterTrackSent() {}

    public TblNewsletterTrackSent(TblNewsletterTrackSent value) {
        this.id = value.id;
        this.message = value.message;
    }

    public TblNewsletterTrackSent(
        Integer id,
        String  message
    ) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblNewsletterTrackSent (");

        sb.append(id);
        sb.append(", ").append(message);

        sb.append(")");
        return sb.toString();
    }
}
