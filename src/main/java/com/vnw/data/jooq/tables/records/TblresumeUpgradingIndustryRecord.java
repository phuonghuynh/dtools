/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumeUpgradingIndustry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class TblresumeUpgradingIndustryRecord extends UpdatableRecordImpl<TblresumeUpgradingIndustryRecord> implements Record3<Integer, Integer, Short> {

    private static final long serialVersionUID = -1652153949;

    /**
     * Setter for <code>vnw_core.tblresume_upgrading_industry.entryid</code>.
     */
    public void setEntryid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading_industry.entryid</code>.
     */
    public Integer getEntryid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading_industry.resumeid</code>.
     */
    public void setResumeid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading_industry.resumeid</code>.
     */
    public Integer getResumeid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading_industry.industryid</code>.
     */
    public void setIndustryid(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading_industry.industryid</code>.
     */
    public Short getIndustryid() {
        return (Short) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblresumeUpgradingIndustry.TBLRESUME_UPGRADING_INDUSTRY.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblresumeUpgradingIndustry.TBLRESUME_UPGRADING_INDUSTRY.RESUMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TblresumeUpgradingIndustry.TBLRESUME_UPGRADING_INDUSTRY.INDUSTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEntryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getResumeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getIndustryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgradingIndustryRecord value1(Integer value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgradingIndustryRecord value2(Integer value) {
        setResumeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgradingIndustryRecord value3(Short value) {
        setIndustryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgradingIndustryRecord values(Integer value1, Integer value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblresumeUpgradingIndustryRecord
     */
    public TblresumeUpgradingIndustryRecord() {
        super(TblresumeUpgradingIndustry.TBLRESUME_UPGRADING_INDUSTRY);
    }

    /**
     * Create a detached, initialised TblresumeUpgradingIndustryRecord
     */
    public TblresumeUpgradingIndustryRecord(Integer entryid, Integer resumeid, Short industryid) {
        super(TblresumeUpgradingIndustry.TBLRESUME_UPGRADING_INDUSTRY);

        set(0, entryid);
        set(1, resumeid);
        set(2, industryid);
    }
}
