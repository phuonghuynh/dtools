/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblsysCompany;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TblsysCompanyRecord extends UpdatableRecordImpl<TblsysCompanyRecord> implements Record8<Integer, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 16941434;

    /**
     * Setter for <code>vnw_core.tblsys_company.companyid</code>.
     */
    public void setCompanyid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.companyid</code>.
     */
    public Integer getCompanyid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.companyname</code>.
     */
    public void setCompanyname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.companyname</code>.
     */
    public String getCompanyname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.phoneno</code>.
     */
    public void setPhoneno(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.phoneno</code>.
     */
    public String getPhoneno() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.cellno</code>.
     */
    public void setCellno(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.cellno</code>.
     */
    public String getCellno() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.faxno</code>.
     */
    public void setFaxno(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.faxno</code>.
     */
    public String getFaxno() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.email</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.email</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblsys_company.contactname</code>.
     */
    public void setContactname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_company.contactname</code>.
     */
    public String getContactname() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblsysCompany.TBLSYS_COMPANY.COMPANYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblsysCompany.TBLSYS_COMPANY.COMPANYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblsysCompany.TBLSYS_COMPANY.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblsysCompany.TBLSYS_COMPANY.PHONENO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblsysCompany.TBLSYS_COMPANY.CELLNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblsysCompany.TBLSYS_COMPANY.FAXNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblsysCompany.TBLSYS_COMPANY.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TblsysCompany.TBLSYS_COMPANY.CONTACTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCompanyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCompanyname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhoneno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCellno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFaxno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getContactname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value1(Integer value) {
        setCompanyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value2(String value) {
        setCompanyname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value3(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value4(String value) {
        setPhoneno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value5(String value) {
        setCellno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value6(String value) {
        setFaxno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value7(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord value8(String value) {
        setContactname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysCompanyRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblsysCompanyRecord
     */
    public TblsysCompanyRecord() {
        super(TblsysCompany.TBLSYS_COMPANY);
    }

    /**
     * Create a detached, initialised TblsysCompanyRecord
     */
    public TblsysCompanyRecord(Integer companyid, String companyname, String address, String phoneno, String cellno, String faxno, String email, String contactname) {
        super(TblsysCompany.TBLSYS_COMPANY);

        set(0, companyid);
        set(1, companyname);
        set(2, address);
        set(3, phoneno);
        set(4, cellno);
        set(5, faxno);
        set(6, email);
        set(7, contactname);
    }
}
