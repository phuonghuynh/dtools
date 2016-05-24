/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefJobfunctioncode;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TblrefJobfunctioncodeRecord extends UpdatableRecordImpl<TblrefJobfunctioncodeRecord> implements Record2<Short, String> {

    private static final long serialVersionUID = 119492766;

    /**
     * Setter for <code>vnw_core.tblref_jobfunctioncode.jobfunctionid</code>.
     */
    public void setJobfunctionid(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobfunctioncode.jobfunctionid</code>.
     */
    public Short getJobfunctionid() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobfunctioncode.jobfunctioncode</code>.
     */
    public void setJobfunctioncode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobfunctioncode.jobfunctioncode</code>.
     */
    public String getJobfunctioncode() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Short, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Short, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return TblrefJobfunctioncode.TBLREF_JOBFUNCTIONCODE.JOBFUNCTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefJobfunctioncode.TBLREF_JOBFUNCTIONCODE.JOBFUNCTIONCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getJobfunctionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getJobfunctioncode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobfunctioncodeRecord value1(Short value) {
        setJobfunctionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobfunctioncodeRecord value2(String value) {
        setJobfunctioncode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobfunctioncodeRecord values(Short value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefJobfunctioncodeRecord
     */
    public TblrefJobfunctioncodeRecord() {
        super(TblrefJobfunctioncode.TBLREF_JOBFUNCTIONCODE);
    }

    /**
     * Create a detached, initialised TblrefJobfunctioncodeRecord
     */
    public TblrefJobfunctioncodeRecord(Short jobfunctionid, String jobfunctioncode) {
        super(TblrefJobfunctioncode.TBLREF_JOBFUNCTIONCODE);

        set(0, jobfunctionid);
        set(1, jobfunctioncode);
    }
}