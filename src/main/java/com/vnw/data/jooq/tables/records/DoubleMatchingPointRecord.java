/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.DoubleMatchingPoint;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class DoubleMatchingPointRecord extends UpdatableRecordImpl<DoubleMatchingPointRecord> implements Record9<Integer, Integer, Integer, Short, Short, Short, Short, Short, Short> {

    private static final long serialVersionUID = -1623024056;

    /**
     * Setter for <code>vnw_core.double_matching_point.att_id</code>.
     */
    public void setAttId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.att_id</code>.
     */
    public Integer getAttId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.att_name_em</code>.
     */
    public void setAttNameEm(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.att_name_em</code>.
     */
    public Integer getAttNameEm() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.att_name_js</code>.
     */
    public void setAttNameJs(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.att_name_js</code>.
     */
    public Integer getAttNameJs() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.point_em_js</code>.
     */
    public void setPointEmJs(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.point_em_js</code>.
     */
    public Short getPointEmJs() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.point_js_em</code>.
     */
    public void setPointJsEm(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.point_js_em</code>.
     */
    public Short getPointJsEm() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.em_min</code>.
     */
    public void setEmMin(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.em_min</code>.
     */
    public Short getEmMin() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.em_max</code>.
     */
    public void setEmMax(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.em_max</code>.
     */
    public Short getEmMax() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.js_min</code>.
     */
    public void setJsMin(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.js_min</code>.
     */
    public Short getJsMin() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>vnw_core.double_matching_point.js_max</code>.
     */
    public void setJsMax(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.double_matching_point.js_max</code>.
     */
    public Short getJsMax() {
        return (Short) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Short, Short, Short, Short, Short, Short> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Short, Short, Short, Short, Short, Short> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.ATT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.ATT_NAME_EM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.ATT_NAME_JS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.POINT_EM_JS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.POINT_JS_EM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.EM_MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.EM_MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.JS_MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return DoubleMatchingPoint.DOUBLE_MATCHING_POINT.JS_MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAttId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAttNameEm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAttNameJs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getPointEmJs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getPointJsEm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getEmMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getEmMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getJsMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getJsMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value1(Integer value) {
        setAttId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value2(Integer value) {
        setAttNameEm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value3(Integer value) {
        setAttNameJs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value4(Short value) {
        setPointEmJs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value5(Short value) {
        setPointJsEm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value6(Short value) {
        setEmMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value7(Short value) {
        setEmMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value8(Short value) {
        setJsMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord value9(Short value) {
        setJsMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoubleMatchingPointRecord values(Integer value1, Integer value2, Integer value3, Short value4, Short value5, Short value6, Short value7, Short value8, Short value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DoubleMatchingPointRecord
     */
    public DoubleMatchingPointRecord() {
        super(DoubleMatchingPoint.DOUBLE_MATCHING_POINT);
    }

    /**
     * Create a detached, initialised DoubleMatchingPointRecord
     */
    public DoubleMatchingPointRecord(Integer attId, Integer attNameEm, Integer attNameJs, Short pointEmJs, Short pointJsEm, Short emMin, Short emMax, Short jsMin, Short jsMax) {
        super(DoubleMatchingPoint.DOUBLE_MATCHING_POINT);

        set(0, attId);
        set(1, attNameEm);
        set(2, attNameJs);
        set(3, pointEmJs);
        set(4, pointJsEm);
        set(5, emMin);
        set(6, emMax);
        set(7, jsMin);
        set(8, jsMax);
    }
}
