/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefIndustrycode;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class TblrefIndustrycodeRecord extends UpdatableRecordImpl<TblrefIndustrycodeRecord> implements Record4<Short, String, Integer, Integer> {

    private static final long serialVersionUID = -1801993511;

    /**
     * Setter for <code>vnw_core.tblref_industrycode.industryid</code>.
     */
    public void setIndustryid(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_industrycode.industryid</code>.
     */
    public Short getIndustryid() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_industrycode.industrycode</code>.
     */
    public void setIndustrycode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_industrycode.industrycode</code>.
     */
    public String getIndustrycode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_industrycode.industryjobcount</code>.
     */
    public void setIndustryjobcount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_industrycode.industryjobcount</code>.
     */
    public Integer getIndustryjobcount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_industrycode.industryresumecount</code>.
     */
    public void setIndustryresumecount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_industrycode.industryresumecount</code>.
     */
    public Integer getIndustryresumecount() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return TblrefIndustrycode.TBLREF_INDUSTRYCODE.INDUSTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefIndustrycode.TBLREF_INDUSTRYCODE.INDUSTRYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TblrefIndustrycode.TBLREF_INDUSTRYCODE.INDUSTRYJOBCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblrefIndustrycode.TBLREF_INDUSTRYCODE.INDUSTRYRESUMECOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getIndustryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIndustrycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIndustryjobcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIndustryresumecount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefIndustrycodeRecord value1(Short value) {
        setIndustryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefIndustrycodeRecord value2(String value) {
        setIndustrycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefIndustrycodeRecord value3(Integer value) {
        setIndustryjobcount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefIndustrycodeRecord value4(Integer value) {
        setIndustryresumecount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefIndustrycodeRecord values(Short value1, String value2, Integer value3, Integer value4) {
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
     * Create a detached TblrefIndustrycodeRecord
     */
    public TblrefIndustrycodeRecord() {
        super(TblrefIndustrycode.TBLREF_INDUSTRYCODE);
    }

    /**
     * Create a detached, initialised TblrefIndustrycodeRecord
     */
    public TblrefIndustrycodeRecord(Short industryid, String industrycode, Integer industryjobcount, Integer industryresumecount) {
        super(TblrefIndustrycode.TBLREF_INDUSTRYCODE);

        set(0, industryid);
        set(1, industrycode);
        set(2, industryjobcount);
        set(3, industryresumecount);
    }
}
