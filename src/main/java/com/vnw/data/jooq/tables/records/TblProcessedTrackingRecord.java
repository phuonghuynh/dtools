/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblProcessedTracking;

import java.sql.Timestamp;

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
public class TblProcessedTrackingRecord extends UpdatableRecordImpl<TblProcessedTrackingRecord> implements Record7<Integer, String, String, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 538146600;

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.processed_id</code>.
     */
    public void setProcessedId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.processed_id</code>.
     */
    public Integer getProcessedId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.processed_code</code>.
     */
    public void setProcessedCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.processed_code</code>.
     */
    public String getProcessedCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.data_type</code>.
     */
    public void setDataType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.data_type</code>.
     */
    public String getDataType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.data_id</code>.
     */
    public void setDataId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.data_id</code>.
     */
    public Integer getDataId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.begindate</code>.
     */
    public void setBegindate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.begindate</code>.
     */
    public Timestamp getBegindate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.processeddate</code>.
     */
    public void setProcesseddate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.processeddate</code>.
     */
    public Timestamp getProcesseddate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbl_processed_tracking.processedhour</code>.
     */
    public void setProcessedhour(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_processed_tracking.processedhour</code>.
     */
    public Integer getProcessedhour() {
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
    public Row7<Integer, String, String, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.PROCESSED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.PROCESSED_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.DATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.BEGINDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.PROCESSEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TblProcessedTracking.TBL_PROCESSED_TRACKING.PROCESSEDHOUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProcessedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProcessedCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getBegindate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getProcesseddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getProcessedhour();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value1(Integer value) {
        setProcessedId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value2(String value) {
        setProcessedCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value3(String value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value4(Integer value) {
        setDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value5(Timestamp value) {
        setBegindate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value6(Timestamp value) {
        setProcesseddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord value7(Integer value) {
        setProcessedhour(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTrackingRecord values(Integer value1, String value2, String value3, Integer value4, Timestamp value5, Timestamp value6, Integer value7) {
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
     * Create a detached TblProcessedTrackingRecord
     */
    public TblProcessedTrackingRecord() {
        super(TblProcessedTracking.TBL_PROCESSED_TRACKING);
    }

    /**
     * Create a detached, initialised TblProcessedTrackingRecord
     */
    public TblProcessedTrackingRecord(Integer processedId, String processedCode, String dataType, Integer dataId, Timestamp begindate, Timestamp processeddate, Integer processedhour) {
        super(TblProcessedTracking.TBL_PROCESSED_TRACKING);

        set(0, processedId);
        set(1, processedCode);
        set(2, dataType);
        set(3, dataId);
        set(4, begindate);
        set(5, processeddate);
        set(6, processedhour);
    }
}
