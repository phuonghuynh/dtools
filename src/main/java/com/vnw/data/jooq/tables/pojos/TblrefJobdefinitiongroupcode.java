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
public class TblrefJobdefinitiongroupcode implements Serializable {

    private static final long serialVersionUID = 46986815;

    private Integer groupId;
    private Integer groupParentid;
    private String  groupCode;

    public TblrefJobdefinitiongroupcode() {}

    public TblrefJobdefinitiongroupcode(TblrefJobdefinitiongroupcode value) {
        this.groupId = value.groupId;
        this.groupParentid = value.groupParentid;
        this.groupCode = value.groupCode;
    }

    public TblrefJobdefinitiongroupcode(
        Integer groupId,
        Integer groupParentid,
        String  groupCode
    ) {
        this.groupId = groupId;
        this.groupParentid = groupParentid;
        this.groupCode = groupCode;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupParentid() {
        return this.groupParentid;
    }

    public void setGroupParentid(Integer groupParentid) {
        this.groupParentid = groupParentid;
    }

    public String getGroupCode() {
        return this.groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJobdefinitiongroupcode (");

        sb.append(groupId);
        sb.append(", ").append(groupParentid);
        sb.append(", ").append(groupCode);

        sb.append(")");
        return sb.toString();
    }
}