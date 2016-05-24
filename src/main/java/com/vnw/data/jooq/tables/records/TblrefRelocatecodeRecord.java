/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefRelocatecode;

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
public class TblrefRelocatecodeRecord extends UpdatableRecordImpl<TblrefRelocatecodeRecord> implements Record2<Byte, String> {

    private static final long serialVersionUID = 1120362656;

    /**
     * Setter for <code>vnw_core.tblref_relocatecode.relocateid</code>.
     */
    public void setRelocateid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_relocatecode.relocateid</code>.
     */
    public Byte getRelocateid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_relocatecode.relocatecode</code>.
     */
    public void setRelocatecode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_relocatecode.relocatecode</code>.
     */
    public String getRelocatecode() {
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
        return TblrefRelocatecode.TBLREF_RELOCATECODE.RELOCATEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefRelocatecode.TBLREF_RELOCATECODE.RELOCATECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getRelocateid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRelocatecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefRelocatecodeRecord value1(Byte value) {
        setRelocateid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefRelocatecodeRecord value2(String value) {
        setRelocatecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefRelocatecodeRecord values(Byte value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefRelocatecodeRecord
     */
    public TblrefRelocatecodeRecord() {
        super(TblrefRelocatecode.TBLREF_RELOCATECODE);
    }

    /**
     * Create a detached, initialised TblrefRelocatecodeRecord
     */
    public TblrefRelocatecodeRecord(Byte relocateid, String relocatecode) {
        super(TblrefRelocatecode.TBLREF_RELOCATECODE);

        set(0, relocateid);
        set(1, relocatecode);
    }
}
