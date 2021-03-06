/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefHighestdegreecode;

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
public class TblrefHighestdegreecodeRecord extends UpdatableRecordImpl<TblrefHighestdegreecodeRecord> implements Record5<Byte, String, Short, Short, Short> {

    private static final long serialVersionUID = -593840786;

    /**
     * Setter for <code>vnw_core.tblref_highestdegreecode.highestdegreeid</code>.
     */
    public void setHighestdegreeid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegreecode.highestdegreeid</code>.
     */
    public Byte getHighestdegreeid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegreecode.highestdegreecode</code>.
     */
    public void setHighestdegreecode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegreecode.highestdegreecode</code>.
     */
    public String getHighestdegreecode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegreecode.weight</code>.
     */
    public void setWeight(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegreecode.weight</code>.
     */
    public Short getWeight() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegreecode.isexact</code>.
     */
    public void setIsexact(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegreecode.isexact</code>.
     */
    public Short getIsexact() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegreecode.isresume</code>.
     */
    public void setIsresume(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegreecode.isresume</code>.
     */
    public Short getIsresume() {
        return (Short) get(4);
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
    public Row5<Byte, String, Short, Short, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Byte, String, Short, Short, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE.HIGHESTDEGREEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE.HIGHESTDEGREECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE.ISEXACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE.ISRESUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getHighestdegreeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHighestdegreecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getIsexact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getIsresume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreecodeRecord value1(Byte value) {
        setHighestdegreeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreecodeRecord value2(String value) {
        setHighestdegreecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreecodeRecord value3(Short value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreecodeRecord value4(Short value) {
        setIsexact(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreecodeRecord value5(Short value) {
        setIsresume(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreecodeRecord values(Byte value1, String value2, Short value3, Short value4, Short value5) {
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
     * Create a detached TblrefHighestdegreecodeRecord
     */
    public TblrefHighestdegreecodeRecord() {
        super(TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE);
    }

    /**
     * Create a detached, initialised TblrefHighestdegreecodeRecord
     */
    public TblrefHighestdegreecodeRecord(Byte highestdegreeid, String highestdegreecode, Short weight, Short isexact, Short isresume) {
        super(TblrefHighestdegreecode.TBLREF_HIGHESTDEGREECODE);

        set(0, highestdegreeid);
        set(1, highestdegreecode);
        set(2, weight);
        set(3, isexact);
        set(4, isresume);
    }
}
