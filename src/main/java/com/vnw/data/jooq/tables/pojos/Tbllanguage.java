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
public class Tbllanguage implements Serializable {

    private static final long serialVersionUID = -2087282864;

    private Byte   languageid;
    private String languagename;
    private String languagefolder;
    private Byte   languageorder;
    private String languagecode;

    public Tbllanguage() {}

    public Tbllanguage(Tbllanguage value) {
        this.languageid = value.languageid;
        this.languagename = value.languagename;
        this.languagefolder = value.languagefolder;
        this.languageorder = value.languageorder;
        this.languagecode = value.languagecode;
    }

    public Tbllanguage(
        Byte   languageid,
        String languagename,
        String languagefolder,
        Byte   languageorder,
        String languagecode
    ) {
        this.languageid = languageid;
        this.languagename = languagename;
        this.languagefolder = languagefolder;
        this.languageorder = languageorder;
        this.languagecode = languagecode;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public String getLanguagename() {
        return this.languagename;
    }

    public void setLanguagename(String languagename) {
        this.languagename = languagename;
    }

    public String getLanguagefolder() {
        return this.languagefolder;
    }

    public void setLanguagefolder(String languagefolder) {
        this.languagefolder = languagefolder;
    }

    public Byte getLanguageorder() {
        return this.languageorder;
    }

    public void setLanguageorder(Byte languageorder) {
        this.languageorder = languageorder;
    }

    public String getLanguagecode() {
        return this.languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tbllanguage (");

        sb.append(languageid);
        sb.append(", ").append(languagename);
        sb.append(", ").append(languagefolder);
        sb.append(", ").append(languageorder);
        sb.append(", ").append(languagecode);

        sb.append(")");
        return sb.toString();
    }
}
