/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

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
public class TblresumeExtraInfo implements Serializable {

    private static final long serialVersionUID = -1477901287;

    private UInteger resumeid;
    private Byte     completionrate;
    private Byte     completionlevelid;
    private String   completionsuggestion;
    private Short    completionsuggestionversion;

    public TblresumeExtraInfo() {}

    public TblresumeExtraInfo(TblresumeExtraInfo value) {
        this.resumeid = value.resumeid;
        this.completionrate = value.completionrate;
        this.completionlevelid = value.completionlevelid;
        this.completionsuggestion = value.completionsuggestion;
        this.completionsuggestionversion = value.completionsuggestionversion;
    }

    public TblresumeExtraInfo(
        UInteger resumeid,
        Byte     completionrate,
        Byte     completionlevelid,
        String   completionsuggestion,
        Short    completionsuggestionversion
    ) {
        this.resumeid = resumeid;
        this.completionrate = completionrate;
        this.completionlevelid = completionlevelid;
        this.completionsuggestion = completionsuggestion;
        this.completionsuggestionversion = completionsuggestionversion;
    }

    public UInteger getResumeid() {
        return this.resumeid;
    }

    public void setResumeid(UInteger resumeid) {
        this.resumeid = resumeid;
    }

    public Byte getCompletionrate() {
        return this.completionrate;
    }

    public void setCompletionrate(Byte completionrate) {
        this.completionrate = completionrate;
    }

    public Byte getCompletionlevelid() {
        return this.completionlevelid;
    }

    public void setCompletionlevelid(Byte completionlevelid) {
        this.completionlevelid = completionlevelid;
    }

    public String getCompletionsuggestion() {
        return this.completionsuggestion;
    }

    public void setCompletionsuggestion(String completionsuggestion) {
        this.completionsuggestion = completionsuggestion;
    }

    public Short getCompletionsuggestionversion() {
        return this.completionsuggestionversion;
    }

    public void setCompletionsuggestionversion(Short completionsuggestionversion) {
        this.completionsuggestionversion = completionsuggestionversion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblresumeExtraInfo (");

        sb.append(resumeid);
        sb.append(", ").append(completionrate);
        sb.append(", ").append(completionlevelid);
        sb.append(", ").append(completionsuggestion);
        sb.append(", ").append(completionsuggestionversion);

        sb.append(")");
        return sb.toString();
    }
}
