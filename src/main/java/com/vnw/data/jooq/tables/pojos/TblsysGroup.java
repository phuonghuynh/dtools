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
public class TblsysGroup implements Serializable {

    private static final long serialVersionUID = -185253311;

    private Short     groupid;
    private Short     parentid;
    private String    groupname;
    private String    description;
    private Byte      isadmin;
    private Byte      isactive;
    private Timestamp createddate;
    private String    userupdated;

    public TblsysGroup() {}

    public TblsysGroup(TblsysGroup value) {
        this.groupid = value.groupid;
        this.parentid = value.parentid;
        this.groupname = value.groupname;
        this.description = value.description;
        this.isadmin = value.isadmin;
        this.isactive = value.isactive;
        this.createddate = value.createddate;
        this.userupdated = value.userupdated;
    }

    public TblsysGroup(
        Short     groupid,
        Short     parentid,
        String    groupname,
        String    description,
        Byte      isadmin,
        Byte      isactive,
        Timestamp createddate,
        String    userupdated
    ) {
        this.groupid = groupid;
        this.parentid = parentid;
        this.groupname = groupname;
        this.description = description;
        this.isadmin = isadmin;
        this.isactive = isactive;
        this.createddate = createddate;
        this.userupdated = userupdated;
    }

    public Short getGroupid() {
        return this.groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getParentid() {
        return this.parentid;
    }

    public void setParentid(Short parentid) {
        this.parentid = parentid;
    }

    public String getGroupname() {
        return this.groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getIsadmin() {
        return this.isadmin;
    }

    public void setIsadmin(Byte isadmin) {
        this.isadmin = isadmin;
    }

    public Byte getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getUserupdated() {
        return this.userupdated;
    }

    public void setUserupdated(String userupdated) {
        this.userupdated = userupdated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysGroup (");

        sb.append(groupid);
        sb.append(", ").append(parentid);
        sb.append(", ").append(groupname);
        sb.append(", ").append(description);
        sb.append(", ").append(isadmin);
        sb.append(", ").append(isactive);
        sb.append(", ").append(createddate);
        sb.append(", ").append(userupdated);

        sb.append(")");
        return sb.toString();
    }
}
