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
public class TblrefPublicationcode implements Serializable {

    private static final long serialVersionUID = 1772386169;

    private Byte   publicationid;
    private String publicationcode;

    public TblrefPublicationcode() {}

    public TblrefPublicationcode(TblrefPublicationcode value) {
        this.publicationid = value.publicationid;
        this.publicationcode = value.publicationcode;
    }

    public TblrefPublicationcode(
        Byte   publicationid,
        String publicationcode
    ) {
        this.publicationid = publicationid;
        this.publicationcode = publicationcode;
    }

    public Byte getPublicationid() {
        return this.publicationid;
    }

    public void setPublicationid(Byte publicationid) {
        this.publicationid = publicationid;
    }

    public String getPublicationcode() {
        return this.publicationcode;
    }

    public void setPublicationcode(String publicationcode) {
        this.publicationcode = publicationcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefPublicationcode (");

        sb.append(publicationid);
        sb.append(", ").append(publicationcode);

        sb.append(")");
        return sb.toString();
    }
}
