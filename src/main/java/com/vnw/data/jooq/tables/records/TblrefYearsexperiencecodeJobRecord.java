/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefYearsexperiencecodeJob;

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
public class TblrefYearsexperiencecodeJobRecord extends UpdatableRecordImpl<TblrefYearsexperiencecodeJobRecord> implements Record2<Byte, String> {

    private static final long serialVersionUID = -464438840;

    /**
     * Setter for <code>vnw_core.tblref_yearsexperiencecode_job.yearsexperienceid</code>.
     */
    public void setYearsexperienceid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_yearsexperiencecode_job.yearsexperienceid</code>.
     */
    public Byte getYearsexperienceid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_yearsexperiencecode_job.yearsexperiencecode</code>.
     */
    public void setYearsexperiencecode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_yearsexperiencecode_job.yearsexperiencecode</code>.
     */
    public String getYearsexperiencecode() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Byte, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Byte, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefYearsexperiencecodeJob.TBLREF_YEARSEXPERIENCECODE_JOB.YEARSEXPERIENCEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefYearsexperiencecodeJob.TBLREF_YEARSEXPERIENCECODE_JOB.YEARSEXPERIENCECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getYearsexperienceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getYearsexperiencecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperiencecodeJobRecord value1(Byte value) {
        setYearsexperienceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperiencecodeJobRecord value2(String value) {
        setYearsexperiencecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperiencecodeJobRecord values(Byte value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefYearsexperiencecodeJobRecord
     */
    public TblrefYearsexperiencecodeJobRecord() {
        super(TblrefYearsexperiencecodeJob.TBLREF_YEARSEXPERIENCECODE_JOB);
    }

    /**
     * Create a detached, initialised TblrefYearsexperiencecodeJobRecord
     */
    public TblrefYearsexperiencecodeJobRecord(Byte yearsexperienceid, String yearsexperiencecode) {
        super(TblrefYearsexperiencecodeJob.TBLREF_YEARSEXPERIENCECODE_JOB);

        set(0, yearsexperienceid);
        set(1, yearsexperiencecode);
    }
}
