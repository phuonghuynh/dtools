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
public class TblsysCompany implements Serializable {

    private static final long serialVersionUID = 1973981492;

    private Integer companyid;
    private String  companyname;
    private String  address;
    private String  phoneno;
    private String  cellno;
    private String  faxno;
    private String  email;
    private String  contactname;

    public TblsysCompany() {}

    public TblsysCompany(TblsysCompany value) {
        this.companyid = value.companyid;
        this.companyname = value.companyname;
        this.address = value.address;
        this.phoneno = value.phoneno;
        this.cellno = value.cellno;
        this.faxno = value.faxno;
        this.email = value.email;
        this.contactname = value.contactname;
    }

    public TblsysCompany(
        Integer companyid,
        String  companyname,
        String  address,
        String  phoneno,
        String  cellno,
        String  faxno,
        String  email,
        String  contactname
    ) {
        this.companyid = companyid;
        this.companyname = companyname;
        this.address = address;
        this.phoneno = phoneno;
        this.cellno = cellno;
        this.faxno = faxno;
        this.email = email;
        this.contactname = contactname;
    }

    public Integer getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return this.phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCellno() {
        return this.cellno;
    }

    public void setCellno(String cellno) {
        this.cellno = cellno;
    }

    public String getFaxno() {
        return this.faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactname() {
        return this.contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblsysCompany (");

        sb.append(companyid);
        sb.append(", ").append(companyname);
        sb.append(", ").append(address);
        sb.append(", ").append(phoneno);
        sb.append(", ").append(cellno);
        sb.append(", ").append(faxno);
        sb.append(", ").append(email);
        sb.append(", ").append(contactname);

        sb.append(")");
        return sb.toString();
    }
}
