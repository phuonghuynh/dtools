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
public class TblrefLanguageproficiency implements Serializable {

    private static final long serialVersionUID = -1332891520;

    private Short  languageproficiencyid;
    private String languageproficiencyname;
    private Short  languageproficiencyorder;

    public TblrefLanguageproficiency() {}

    public TblrefLanguageproficiency(TblrefLanguageproficiency value) {
        this.languageproficiencyid = value.languageproficiencyid;
        this.languageproficiencyname = value.languageproficiencyname;
        this.languageproficiencyorder = value.languageproficiencyorder;
    }

    public TblrefLanguageproficiency(
        Short  languageproficiencyid,
        String languageproficiencyname,
        Short  languageproficiencyorder
    ) {
        this.languageproficiencyid = languageproficiencyid;
        this.languageproficiencyname = languageproficiencyname;
        this.languageproficiencyorder = languageproficiencyorder;
    }

    public Short getLanguageproficiencyid() {
        return this.languageproficiencyid;
    }

    public void setLanguageproficiencyid(Short languageproficiencyid) {
        this.languageproficiencyid = languageproficiencyid;
    }

    public String getLanguageproficiencyname() {
        return this.languageproficiencyname;
    }

    public void setLanguageproficiencyname(String languageproficiencyname) {
        this.languageproficiencyname = languageproficiencyname;
    }

    public Short getLanguageproficiencyorder() {
        return this.languageproficiencyorder;
    }

    public void setLanguageproficiencyorder(Short languageproficiencyorder) {
        this.languageproficiencyorder = languageproficiencyorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefLanguageproficiency (");

        sb.append(languageproficiencyid);
        sb.append(", ").append(languageproficiencyname);
        sb.append(", ").append(languageproficiencyorder);

        sb.append(")");
        return sb.toString();
    }
}