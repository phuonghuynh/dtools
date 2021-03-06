/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefServicemodifyingprice;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TblrefServicemodifyingpriceRecord extends UpdatableRecordImpl<TblrefServicemodifyingpriceRecord> implements Record7<Integer, Integer, Integer, Integer, String, Double, Integer> {

    private static final long serialVersionUID = 1386470851;

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.modifying_id</code>.
     */
    public void setModifyingId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.modifying_id</code>.
     */
    public Integer getModifyingId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.modifying_start</code>.
     */
    public void setModifyingStart(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.modifying_start</code>.
     */
    public Integer getModifyingStart() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.modifying_end</code>.
     */
    public void setModifyingEnd(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.modifying_end</code>.
     */
    public Integer getModifyingEnd() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.modifying_operator</code>.
     */
    public void setModifyingOperator(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.modifying_operator</code>.
     */
    public String getModifyingOperator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.modifying_value</code>.
     */
    public void setModifyingValue(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.modifying_value</code>.
     */
    public Double getModifyingValue() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicemodifyingprice.modifying_rule</code>.
     */
    public void setModifyingRule(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicemodifyingprice.modifying_rule</code>.
     */
    public Integer getModifyingRule() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, String, Double, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, String, Double, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.MODIFYING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.MODIFYING_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.MODIFYING_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.MODIFYING_OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.MODIFYING_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE.MODIFYING_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getModifyingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getModifyingStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getModifyingEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModifyingOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getModifyingValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getModifyingRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value1(Integer value) {
        setModifyingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value2(Integer value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value3(Integer value) {
        setModifyingStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value4(Integer value) {
        setModifyingEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value5(String value) {
        setModifyingOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value6(Double value) {
        setModifyingValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord value7(Integer value) {
        setModifyingRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicemodifyingpriceRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Double value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefServicemodifyingpriceRecord
     */
    public TblrefServicemodifyingpriceRecord() {
        super(TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE);
    }

    /**
     * Create a detached, initialised TblrefServicemodifyingpriceRecord
     */
    public TblrefServicemodifyingpriceRecord(Integer modifyingId, Integer serviceId, Integer modifyingStart, Integer modifyingEnd, String modifyingOperator, Double modifyingValue, Integer modifyingRule) {
        super(TblrefServicemodifyingprice.TBLREF_SERVICEMODIFYINGPRICE);

        set(0, modifyingId);
        set(1, serviceId);
        set(2, modifyingStart);
        set(3, modifyingEnd);
        set(4, modifyingOperator);
        set(5, modifyingValue);
        set(6, modifyingRule);
    }
}
