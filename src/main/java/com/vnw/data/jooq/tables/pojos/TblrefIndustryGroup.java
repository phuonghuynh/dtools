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
public class TblrefIndustryGroup implements Serializable {

    private static final long serialVersionUID = -1391475301;

    private Short  groupid;
    private Short  languageid;
    private String groupname;
    private Short  grouporder;

    public TblrefIndustryGroup() {}

    public TblrefIndustryGroup(TblrefIndustryGroup value) {
        this.groupid = value.groupid;
        this.languageid = value.languageid;
        this.groupname = value.groupname;
        this.grouporder = value.grouporder;
    }

    public TblrefIndustryGroup(
        Short  groupid,
        Short  languageid,
        String groupname,
        Short  grouporder
    ) {
        this.groupid = groupid;
        this.languageid = languageid;
        this.groupname = groupname;
        this.grouporder = grouporder;
    }

    public Short getGroupid() {
        return this.groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Short languageid) {
        this.languageid = languageid;
    }

    public String getGroupname() {
        return this.groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Short getGrouporder() {
        return this.grouporder;
    }

    public void setGrouporder(Short grouporder) {
        this.grouporder = grouporder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefIndustryGroup (");

        sb.append(groupid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(groupname);
        sb.append(", ").append(grouporder);

        sb.append(")");
        return sb.toString();
    }
}
