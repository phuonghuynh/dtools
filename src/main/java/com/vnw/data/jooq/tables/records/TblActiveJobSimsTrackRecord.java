/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblActiveJobSimsTrack;

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
public class TblActiveJobSimsTrackRecord extends UpdatableRecordImpl<TblActiveJobSimsTrackRecord> implements Record7<Integer, Integer, Integer, Integer, Timestamp, Integer, String> {

    private static final long serialVersionUID = -1777635417;

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.user_id</code>. employer id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.user_id</code>. employer id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.job_id</code>.
     */
    public void setJobId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.job_id</code>.
     */
    public Integer getJobId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.po_product_id</code>.
     */
    public void setPoProductId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.po_product_id</code>.
     */
    public Integer getPoProductId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.active_date</code>.
     */
    public void setActiveDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.active_date</code>.
     */
    public Timestamp getActiveDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.vnw_user_id</code>.
     */
    public void setVnwUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.vnw_user_id</code>.
     */
    public Integer getVnwUserId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbl_active_job_sims_track.vnw_user_name</code>.
     */
    public void setVnwUserName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_active_job_sims_track.vnw_user_name</code>.
     */
    public String getVnwUserName() {
        return (String) get(6);
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
    public Row7<Integer, Integer, Integer, Integer, Timestamp, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Timestamp, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.JOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.PO_PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.ACTIVE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.VNW_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK.VNW_USER_NAME;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPoProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getActiveDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getVnwUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVnwUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value3(Integer value) {
        setJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value4(Integer value) {
        setPoProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value5(Timestamp value) {
        setActiveDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value6(Integer value) {
        setVnwUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord value7(String value) {
        setVnwUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblActiveJobSimsTrackRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Integer value6, String value7) {
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
     * Create a detached TblActiveJobSimsTrackRecord
     */
    public TblActiveJobSimsTrackRecord() {
        super(TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK);
    }

    /**
     * Create a detached, initialised TblActiveJobSimsTrackRecord
     */
    public TblActiveJobSimsTrackRecord(Integer id, Integer userId, Integer jobId, Integer poProductId, Timestamp activeDate, Integer vnwUserId, String vnwUserName) {
        super(TblActiveJobSimsTrack.TBL_ACTIVE_JOB_SIMS_TRACK);

        set(0, id);
        set(1, userId);
        set(2, jobId);
        set(3, poProductId);
        set(4, activeDate);
        set(5, vnwUserId);
        set(6, vnwUserName);
    }
}
