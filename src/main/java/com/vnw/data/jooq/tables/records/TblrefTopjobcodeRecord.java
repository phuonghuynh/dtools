/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefTopjobcode;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TblrefTopjobcodeRecord extends UpdatableRecordImpl<TblrefTopjobcodeRecord> implements Record5<Byte, String, Double, String, Byte> {

    private static final long serialVersionUID = -988377162;

    /**
     * Setter for <code>vnw_core.tblref_topjobcode.topjobtypeid</code>.
     */
    public void setTopjobtypeid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_topjobcode.topjobtypeid</code>.
     */
    public Byte getTopjobtypeid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_topjobcode.topjobtypecode</code>.
     */
    public void setTopjobtypecode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_topjobcode.topjobtypecode</code>.
     */
    public String getTopjobtypecode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_topjobcode.topjobtypefee</code>.
     */
    public void setTopjobtypefee(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_topjobcode.topjobtypefee</code>.
     */
    public Double getTopjobtypefee() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_topjobcode.currencytype</code>.
     */
    public void setCurrencytype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_topjobcode.currencytype</code>.
     */
    public String getCurrencytype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_topjobcode.durationdays</code>.
     */
    public void setDurationdays(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_topjobcode.durationdays</code>.
     */
    public Byte getDurationdays() {
        return (Byte) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Byte, String, Double, String, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Byte, String, Double, String, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefTopjobcode.TBLREF_TOPJOBCODE.TOPJOBTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefTopjobcode.TBLREF_TOPJOBCODE.TOPJOBTYPECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return TblrefTopjobcode.TBLREF_TOPJOBCODE.TOPJOBTYPEFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefTopjobcode.TBLREF_TOPJOBCODE.CURRENCYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblrefTopjobcode.TBLREF_TOPJOBCODE.DURATIONDAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getTopjobtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTopjobtypecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getTopjobtypefee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCurrencytype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getDurationdays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjobcodeRecord value1(Byte value) {
        setTopjobtypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjobcodeRecord value2(String value) {
        setTopjobtypecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjobcodeRecord value3(Double value) {
        setTopjobtypefee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjobcodeRecord value4(String value) {
        setCurrencytype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjobcodeRecord value5(Byte value) {
        setDurationdays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjobcodeRecord values(Byte value1, String value2, Double value3, String value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefTopjobcodeRecord
     */
    public TblrefTopjobcodeRecord() {
        super(TblrefTopjobcode.TBLREF_TOPJOBCODE);
    }

    /**
     * Create a detached, initialised TblrefTopjobcodeRecord
     */
    public TblrefTopjobcodeRecord(Byte topjobtypeid, String topjobtypecode, Double topjobtypefee, String currencytype, Byte durationdays) {
        super(TblrefTopjobcode.TBLREF_TOPJOBCODE);

        set(0, topjobtypeid);
        set(1, topjobtypecode);
        set(2, topjobtypefee);
        set(3, currencytype);
        set(4, durationdays);
    }
}