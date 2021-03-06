/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefExtraprioritycode;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TblrefExtraprioritycodeRecord extends UpdatableRecordImpl<TblrefExtraprioritycodeRecord> implements Record6<Byte, String, Short, Byte, Double, String> {

    private static final long serialVersionUID = 1834914301;

    /**
     * Setter for <code>vnw_core.tblref_extraprioritycode.extrapriorityid</code>.
     */
    public void setExtrapriorityid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_extraprioritycode.extrapriorityid</code>.
     */
    public Byte getExtrapriorityid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_extraprioritycode.extraprioritycode</code>.
     */
    public void setExtraprioritycode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_extraprioritycode.extraprioritycode</code>.
     */
    public String getExtraprioritycode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_extraprioritycode.durationdays</code>.
     */
    public void setDurationdays(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_extraprioritycode.durationdays</code>.
     */
    public Short getDurationdays() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_extraprioritycode.toplevelpriority</code>.
     */
    public void setToplevelpriority(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_extraprioritycode.toplevelpriority</code>.
     */
    public Byte getToplevelpriority() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_extraprioritycode.extrapriorityfee</code>.
     */
    public void setExtrapriorityfee(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_extraprioritycode.extrapriorityfee</code>.
     */
    public Double getExtrapriorityfee() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblref_extraprioritycode.currencytype</code>.
     */
    public void setCurrencytype(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_extraprioritycode.currencytype</code>.
     */
    public String getCurrencytype() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Byte, String, Short, Byte, Double, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Byte, String, Short, Byte, Double, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE.EXTRAPRIORITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE.EXTRAPRIORITYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE.DURATIONDAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE.TOPLEVELPRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE.EXTRAPRIORITYFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE.CURRENCYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getExtrapriorityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getExtraprioritycode();
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
    public Byte value4() {
        return getToplevelpriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getExtrapriorityfee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCurrencytype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord value1(Byte value) {
        setExtrapriorityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord value2(String value) {
        setExtraprioritycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord value3(Short value) {
        setDurationdays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord value4(Byte value) {
        setToplevelpriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord value5(Double value) {
        setExtrapriorityfee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord value6(String value) {
        setCurrencytype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraprioritycodeRecord values(Byte value1, String value2, Short value3, Byte value4, Double value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefExtraprioritycodeRecord
     */
    public TblrefExtraprioritycodeRecord() {
        super(TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE);
    }

    /**
     * Create a detached, initialised TblrefExtraprioritycodeRecord
     */
    public TblrefExtraprioritycodeRecord(Byte extrapriorityid, String extraprioritycode, Short durationdays, Byte toplevelpriority, Double extrapriorityfee, String currencytype) {
        super(TblrefExtraprioritycode.TBLREF_EXTRAPRIORITYCODE);

        set(0, extrapriorityid);
        set(1, extraprioritycode);
        set(2, durationdays);
        set(3, toplevelpriority);
        set(4, extrapriorityfee);
        set(5, currencytype);
    }
}
