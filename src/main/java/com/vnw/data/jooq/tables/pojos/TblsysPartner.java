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
public class TblsysPartner implements Serializable {

    private static final long serialVersionUID = -1306317407;

    private Short  partnerid;
    private String partnername;
    private String contactname;
    private String phoneno;
    private String faxno;
    private String cellno;
    private String email;
    private String website;
    private Short  partnerorder;
    private Short  searchtype;
    private String sqlstring;
    private Short  maxrows;

    public TblsysPartner() {}

    public TblsysPartner(TblsysPartner value) {
        this.partnerid = value.partnerid;
        this.partnername = value.partnername;
        this.contactname = value.contactname;
        this.phoneno = value.phoneno;
        this.faxno = value.faxno;
        this.cellno = value.cellno;
        this.email = value.email;
        this.website = value.website;
        this.partnerorder = value.partnerorder;
        this.searchtype = value.searchtype;
        this.sqlstring = value.sqlstring;
        this.maxrows = value.maxrows;
    }

    public TblsysPartner(
        Short  partnerid,
        String partnername,
        String contactname,
        String phoneno,
        String faxno,
        String cellno,
        String email,
        String website,
        Short  partnerorder,
        Short  searchtype,
        String sqlstring,
        Short  maxrows
    ) {
        this.partnerid = partnerid;
        this.partnername = partnername;
        this.contactname = contactname;
        this.phoneno = phoneno;
        this.faxno = faxno;
        this.cellno = cellno;
        this.email = email;
        this.website = website;
        this.partnerorder = partnerorder;
        this.searchtype = searchtype;
        this.sqlstring = sqlstring;
        this.maxrows = maxrows;
    }

    public Short getPartnerid() {
        return this.partnerid;
    }

    public void setPartnerid(Short partnerid) {
        this.partnerid = partnerid;
    }

    public String getPartnername() {
        return this.partnername;
    }

    public void setPartnername(String partnername) {
        this.partnername = partnername;
    }

    public String getContactname() {
        return this.contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getPhoneno() {
        return this.phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getFaxno() {
        return this.faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno;
    }

    public String getCellno() {
        return this.cellno;
    }

    public void setCellno(String cellno) {
        this.cellno = cellno;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Short getPartnerorder() {
        return this.partnerorder;
    }

    public void setPartnerorder(Short partnerorder) {
        this.partnerorder = partnerorder;
    }

    public Short getSearchtype() {
        return this.searchtype;
    }

    public void setSearchtype(Short searchtype) {
        this.searchtype = searchtype;
    }

    public String getSqlstring() {
        return this.sqlstring;
    }

    public void setSqlstring(String sqlstring) {
        this.sqlstring = sqlstring;
    }

    public Short getMaxrows() {
        return this.maxrows;
    }

    public void setMaxrows(Short maxrows) {
        this.maxrows = maxrows;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysPartner (");

        sb.append(partnerid);
        sb.append(", ").append(partnername);
        sb.append(", ").append(contactname);
        sb.append(", ").append(phoneno);
        sb.append(", ").append(faxno);
        sb.append(", ").append(cellno);
        sb.append(", ").append(email);
        sb.append(", ").append(website);
        sb.append(", ").append(partnerorder);
        sb.append(", ").append(searchtype);
        sb.append(", ").append(sqlstring);
        sb.append(", ").append(maxrows);

        sb.append(")");
        return sb.toString();
    }
}
