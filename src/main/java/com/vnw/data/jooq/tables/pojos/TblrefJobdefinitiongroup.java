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
public class TblrefJobdefinitiongroup implements Serializable {

    private static final long serialVersionUID = -507511119;

    private Integer groupId;
    private Short   languageid;
    private String  groupName;
    private Short   groupOrder;

    public TblrefJobdefinitiongroup() {}

    public TblrefJobdefinitiongroup(TblrefJobdefinitiongroup value) {
        this.groupId = value.groupId;
        this.languageid = value.languageid;
        this.groupName = value.groupName;
        this.groupOrder = value.groupOrder;
    }

    public TblrefJobdefinitiongroup(
        Integer groupId,
        Short   languageid,
        String  groupName,
        Short   groupOrder
    ) {
        this.groupId = groupId;
        this.languageid = languageid;
        this.groupName = groupName;
        this.groupOrder = groupOrder;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Short getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Short languageid) {
        this.languageid = languageid;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Short getGroupOrder() {
        return this.groupOrder;
    }

    public void setGroupOrder(Short groupOrder) {
        this.groupOrder = groupOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJobdefinitiongroup (");

        sb.append(groupId);
        sb.append(", ").append(languageid);
        sb.append(", ").append(groupName);
        sb.append(", ").append(groupOrder);

        sb.append(")");
        return sb.toString();
    }
}