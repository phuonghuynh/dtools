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
public class TblrefServiceattributevalue implements Serializable {

    private static final long serialVersionUID = -222333829;

    private Integer attrvalueId;
    private Integer attrId;
    private Integer attrvalueKey;

    public TblrefServiceattributevalue() {}

    public TblrefServiceattributevalue(TblrefServiceattributevalue value) {
        this.attrvalueId = value.attrvalueId;
        this.attrId = value.attrId;
        this.attrvalueKey = value.attrvalueKey;
    }

    public TblrefServiceattributevalue(
        Integer attrvalueId,
        Integer attrId,
        Integer attrvalueKey
    ) {
        this.attrvalueId = attrvalueId;
        this.attrId = attrId;
        this.attrvalueKey = attrvalueKey;
    }

    public Integer getAttrvalueId() {
        return this.attrvalueId;
    }

    public void setAttrvalueId(Integer attrvalueId) {
        this.attrvalueId = attrvalueId;
    }

    public Integer getAttrId() {
        return this.attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getAttrvalueKey() {
        return this.attrvalueKey;
    }

    public void setAttrvalueKey(Integer attrvalueKey) {
        this.attrvalueKey = attrvalueKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefServiceattributevalue (");

        sb.append(attrvalueId);
        sb.append(", ").append(attrId);
        sb.append(", ").append(attrvalueKey);

        sb.append(")");
        return sb.toString();
    }
}
