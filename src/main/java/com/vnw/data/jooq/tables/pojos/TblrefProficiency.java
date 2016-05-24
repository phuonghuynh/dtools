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
public class TblrefProficiency implements Serializable {

    private static final long serialVersionUID = 1212877719;

    private Byte   proficiencyId;
    private Byte   languageid;
    private String proficiencyName;
    private Short  proficiencyOrder;

    public TblrefProficiency() {}

    public TblrefProficiency(TblrefProficiency value) {
        this.proficiencyId = value.proficiencyId;
        this.languageid = value.languageid;
        this.proficiencyName = value.proficiencyName;
        this.proficiencyOrder = value.proficiencyOrder;
    }

    public TblrefProficiency(
        Byte   proficiencyId,
        Byte   languageid,
        String proficiencyName,
        Short  proficiencyOrder
    ) {
        this.proficiencyId = proficiencyId;
        this.languageid = languageid;
        this.proficiencyName = proficiencyName;
        this.proficiencyOrder = proficiencyOrder;
    }

    public Byte getProficiencyId() {
        return this.proficiencyId;
    }

    public void setProficiencyId(Byte proficiencyId) {
        this.proficiencyId = proficiencyId;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getProficiencyName() {
        return this.proficiencyName;
    }

    public void setProficiencyName(String proficiencyName) {
        this.proficiencyName = proficiencyName;
    }

    public Short getProficiencyOrder() {
        return this.proficiencyOrder;
    }

    public void setProficiencyOrder(Short proficiencyOrder) {
        this.proficiencyOrder = proficiencyOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefProficiency (");

        sb.append(proficiencyId);
        sb.append(", ").append(languageid);
        sb.append(", ").append(proficiencyName);
        sb.append(", ").append(proficiencyOrder);

        sb.append(")");
        return sb.toString();
    }
}