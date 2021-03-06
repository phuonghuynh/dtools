/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.ExtentTracking;

import java.sql.Timestamp;

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
public class ExtentTrackingRecord extends UpdatableRecordImpl<ExtentTrackingRecord> implements Record5<Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1873469136;

    /**
     * Setter for <code>vnw_core.extent_tracking.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.extent_tracking.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.extent_tracking.dataid</code>.
     */
    public void setDataid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.extent_tracking.dataid</code>.
     */
    public Integer getDataid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.extent_tracking.datatype</code>.
     */
    public void setDatatype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.extent_tracking.datatype</code>.
     */
    public String getDatatype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.extent_tracking.old_expireddate</code>.
     */
    public void setOldExpireddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.extent_tracking.old_expireddate</code>.
     */
    public Timestamp getOldExpireddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.extent_tracking.new_expireddate</code>.
     */
    public void setNewExpireddate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.extent_tracking.new_expireddate</code>.
     */
    public Timestamp getNewExpireddate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ExtentTracking.EXTENT_TRACKING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ExtentTracking.EXTENT_TRACKING.DATAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ExtentTracking.EXTENT_TRACKING.DATATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ExtentTracking.EXTENT_TRACKING.OLD_EXPIREDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ExtentTracking.EXTENT_TRACKING.NEW_EXPIREDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDataid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getOldExpireddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getNewExpireddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtentTrackingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtentTrackingRecord value2(Integer value) {
        setDataid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtentTrackingRecord value3(String value) {
        setDatatype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtentTrackingRecord value4(Timestamp value) {
        setOldExpireddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtentTrackingRecord value5(Timestamp value) {
        setNewExpireddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtentTrackingRecord values(Integer value1, Integer value2, String value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached ExtentTrackingRecord
     */
    public ExtentTrackingRecord() {
        super(ExtentTracking.EXTENT_TRACKING);
    }

    /**
     * Create a detached, initialised ExtentTrackingRecord
     */
    public ExtentTrackingRecord(Integer id, Integer dataid, String datatype, Timestamp oldExpireddate, Timestamp newExpireddate) {
        super(ExtentTracking.EXTENT_TRACKING);

        set(0, id);
        set(1, dataid);
        set(2, datatype);
        set(3, oldExpireddate);
        set(4, newExpireddate);
    }
}
