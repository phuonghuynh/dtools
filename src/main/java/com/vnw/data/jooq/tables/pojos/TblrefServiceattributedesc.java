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
public class TblrefServiceattributedesc implements Serializable {

    private static final long serialVersionUID = 493364457;

    private Integer attrId;
    private Short   languageid;
    private String  attrdescName;
    private String  attrdescDescription;

    public TblrefServiceattributedesc() {}

    public TblrefServiceattributedesc(TblrefServiceattributedesc value) {
        this.attrId = value.attrId;
        this.languageid = value.languageid;
        this.attrdescName = value.attrdescName;
        this.attrdescDescription = value.attrdescDescription;
    }

    public TblrefServiceattributedesc(
        Integer attrId,
        Short   languageid,
        String  attrdescName,
        String  attrdescDescription
    ) {
        this.attrId = attrId;
        this.languageid = languageid;
        this.attrdescName = attrdescName;
        this.attrdescDescription = attrdescDescription;
    }

    public Integer getAttrId() {
        return this.attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Short getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Short languageid) {
        this.languageid = languageid;
    }

    public String getAttrdescName() {
        return this.attrdescName;
    }

    public void setAttrdescName(String attrdescName) {
        this.attrdescName = attrdescName;
    }

    public String getAttrdescDescription() {
        return this.attrdescDescription;
    }

    public void setAttrdescDescription(String attrdescDescription) {
        this.attrdescDescription = attrdescDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefServiceattributedesc (");

        sb.append(attrId);
        sb.append(", ").append(languageid);
        sb.append(", ").append(attrdescName);
        sb.append(", ").append(attrdescDescription);

        sb.append(")");
        return sb.toString();
    }
}
