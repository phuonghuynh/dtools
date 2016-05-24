/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefBitmaskcode;

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
public class TblrefBitmaskcodeRecord extends UpdatableRecordImpl<TblrefBitmaskcodeRecord> implements Record4<Integer, String, Long, String> {

    private static final long serialVersionUID = -1152787317;

    /**
     * Setter for <code>vnw_core.tblref_bitmaskcode.bitmask_id</code>.
     */
    public void setBitmaskId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_bitmaskcode.bitmask_id</code>.
     */
    public Integer getBitmaskId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_bitmaskcode.bitmask_code</code>.
     */
    public void setBitmaskCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_bitmaskcode.bitmask_code</code>.
     */
    public String getBitmaskCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_bitmaskcode.bitmask_mask</code>.
     */
    public void setBitmaskMask(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_bitmaskcode.bitmask_mask</code>.
     */
    public Long getBitmaskMask() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_bitmaskcode.group_code</code>.
     */
    public void setGroupCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_bitmaskcode.group_code</code>.
     */
    public String getGroupCode() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Long, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblrefBitmaskcode.TBLREF_BITMASKCODE.BITMASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefBitmaskcode.TBLREF_BITMASKCODE.BITMASK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TblrefBitmaskcode.TBLREF_BITMASKCODE.BITMASK_MASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefBitmaskcode.TBLREF_BITMASKCODE.GROUP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getBitmaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBitmaskCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getBitmaskMask();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGroupCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmaskcodeRecord value1(Integer value) {
        setBitmaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmaskcodeRecord value2(String value) {
        setBitmaskCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmaskcodeRecord value3(Long value) {
        setBitmaskMask(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmaskcodeRecord value4(String value) {
        setGroupCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmaskcodeRecord values(Integer value1, String value2, Long value3, String value4) {
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
     * Create a detached TblrefBitmaskcodeRecord
     */
    public TblrefBitmaskcodeRecord() {
        super(TblrefBitmaskcode.TBLREF_BITMASKCODE);
    }

    /**
     * Create a detached, initialised TblrefBitmaskcodeRecord
     */
    public TblrefBitmaskcodeRecord(Integer bitmaskId, String bitmaskCode, Long bitmaskMask, String groupCode) {
        super(TblrefBitmaskcode.TBLREF_BITMASKCODE);

        set(0, bitmaskId);
        set(1, bitmaskCode);
        set(2, bitmaskMask);
        set(3, groupCode);
    }
}
