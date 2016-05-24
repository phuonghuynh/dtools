/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefResumeviewingoptioncode;

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
public class TblrefResumeviewingoptioncodeRecord extends UpdatableRecordImpl<TblrefResumeviewingoptioncodeRecord> implements Record4<Byte, String, Short, Double> {

    private static final long serialVersionUID = -1837773246;

    /**
     * Setter for <code>vnw_core.tblref_resumeviewingoptioncode.resumeviewingoptionid</code>.
     */
    public void setResumeviewingoptionid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_resumeviewingoptioncode.resumeviewingoptionid</code>.
     */
    public Byte getResumeviewingoptionid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_resumeviewingoptioncode.resumeviewingoptioncode</code>.
     */
    public void setResumeviewingoptioncode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_resumeviewingoptioncode.resumeviewingoptioncode</code>.
     */
    public String getResumeviewingoptioncode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_resumeviewingoptioncode.durationdays</code>.
     */
    public void setDurationdays(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_resumeviewingoptioncode.durationdays</code>.
     */
    public Short getDurationdays() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_resumeviewingoptioncode.resumeviewingoptionfee</code>.
     */
    public void setResumeviewingoptionfee(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_resumeviewingoptioncode.resumeviewingoptionfee</code>.
     */
    public Double getResumeviewingoptionfee() {
        return (Double) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Byte, String, Short, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Byte, String, Short, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefResumeviewingoptioncode.TBLREF_RESUMEVIEWINGOPTIONCODE.RESUMEVIEWINGOPTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefResumeviewingoptioncode.TBLREF_RESUMEVIEWINGOPTIONCODE.RESUMEVIEWINGOPTIONCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TblrefResumeviewingoptioncode.TBLREF_RESUMEVIEWINGOPTIONCODE.DURATIONDAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return TblrefResumeviewingoptioncode.TBLREF_RESUMEVIEWINGOPTIONCODE.RESUMEVIEWINGOPTIONFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getResumeviewingoptionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getResumeviewingoptioncode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getDurationdays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getResumeviewingoptionfee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumeviewingoptioncodeRecord value1(Byte value) {
        setResumeviewingoptionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumeviewingoptioncodeRecord value2(String value) {
        setResumeviewingoptioncode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumeviewingoptioncodeRecord value3(Short value) {
        setDurationdays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumeviewingoptioncodeRecord value4(Double value) {
        setResumeviewingoptionfee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumeviewingoptioncodeRecord values(Byte value1, String value2, Short value3, Double value4) {
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
     * Create a detached TblrefResumeviewingoptioncodeRecord
     */
    public TblrefResumeviewingoptioncodeRecord() {
        super(TblrefResumeviewingoptioncode.TBLREF_RESUMEVIEWINGOPTIONCODE);
    }

    /**
     * Create a detached, initialised TblrefResumeviewingoptioncodeRecord
     */
    public TblrefResumeviewingoptioncodeRecord(Byte resumeviewingoptionid, String resumeviewingoptioncode, Short durationdays, Double resumeviewingoptionfee) {
        super(TblrefResumeviewingoptioncode.TBLREF_RESUMEVIEWINGOPTIONCODE);

        set(0, resumeviewingoptionid);
        set(1, resumeviewingoptioncode);
        set(2, durationdays);
        set(3, resumeviewingoptionfee);
    }
}
