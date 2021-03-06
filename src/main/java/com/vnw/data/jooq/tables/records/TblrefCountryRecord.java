/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefCountry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class TblrefCountryRecord extends UpdatableRecordImpl<TblrefCountryRecord> implements Record4<Short, Short, String, Short> {

    private static final long serialVersionUID = 1336380127;

    /**
     * Setter for <code>vnw_core.tblref_country.countryid</code>.
     */
    public void setCountryid(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_country.countryid</code>.
     */
    public Short getCountryid() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_country.languageid</code>.
     */
    public void setLanguageid(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_country.languageid</code>.
     */
    public Short getLanguageid() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_country.countryname</code>.
     */
    public void setCountryname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_country.countryname</code>.
     */
    public String getCountryname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_country.countryorder</code>.
     */
    public void setCountryorder(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_country.countryorder</code>.
     */
    public Short getCountryorder() {
        return (Short) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Short, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Short, String, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Short, String, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return TblrefCountry.TBLREF_COUNTRY.COUNTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TblrefCountry.TBLREF_COUNTRY.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefCountry.TBLREF_COUNTRY.COUNTRYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TblrefCountry.TBLREF_COUNTRY.COUNTRYORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getCountryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCountryname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getCountryorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefCountryRecord value1(Short value) {
        setCountryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefCountryRecord value2(Short value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefCountryRecord value3(String value) {
        setCountryname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefCountryRecord value4(Short value) {
        setCountryorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefCountryRecord values(Short value1, Short value2, String value3, Short value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefCountryRecord
     */
    public TblrefCountryRecord() {
        super(TblrefCountry.TBLREF_COUNTRY);
    }

    /**
     * Create a detached, initialised TblrefCountryRecord
     */
    public TblrefCountryRecord(Short countryid, Short languageid, String countryname, Short countryorder) {
        super(TblrefCountry.TBLREF_COUNTRY);

        set(0, countryid);
        set(1, languageid);
        set(2, countryname);
        set(3, countryorder);
    }
}
