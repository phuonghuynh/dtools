/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumePendingTracking;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


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
public class TblresumePendingTrackingRecord extends UpdatableRecordImpl<TblresumePendingTrackingRecord> implements Record6<UInteger, Byte, String, String, Byte, Timestamp> {

    private static final long serialVersionUID = 1594332132;

    /**
     * Setter for <code>vnw_core.tblresume_pending_tracking.dataId</code>. sdid : tblresume_sentdirectly ; entryId : tbljob_applyonline 
     */
    public void setDataid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_pending_tracking.dataId</code>. sdid : tblresume_sentdirectly ; entryId : tbljob_applyonline 
     */
    public UInteger getDataid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_pending_tracking.typeId</code>. 0 : applyOnline 1: sentdirectly 
     */
    public void setTypeid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_pending_tracking.typeId</code>. 0 : applyOnline 1: sentdirectly 
     */
    public Byte getTypeid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_pending_tracking.path</code>. path of resume file 
     */
    public void setPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_pending_tracking.path</code>. path of resume file 
     */
    public String getPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblresume_pending_tracking.pathUnpaidFile</code>. path of file which is enable ( isapprove = 0 and not disable ) 
     */
    public void setPathunpaidfile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_pending_tracking.pathUnpaidFile</code>. path of file which is enable ( isapprove = 0 and not disable ) 
     */
    public String getPathunpaidfile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblresume_pending_tracking.isDeleted</code>. 0 : this application can not send ; 1: this application can send to employer 
     */
    public void setIsdeleted(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_pending_tracking.isDeleted</code>. 0 : this application can not send ; 1: this application can send to employer 
     */
    public Byte getIsdeleted() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblresume_pending_tracking.logDateTime</code>.  tracking time 
     */
    public void setLogdatetime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_pending_tracking.logDateTime</code>.  tracking time 
     */
    public Timestamp getLogdatetime() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UInteger, Byte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, Byte, String, String, Byte, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, Byte, String, String, Byte, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblresumePendingTracking.TBLRESUME_PENDING_TRACKING.DATAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblresumePendingTracking.TBLRESUME_PENDING_TRACKING.TYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblresumePendingTracking.TBLRESUME_PENDING_TRACKING.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblresumePendingTracking.TBLRESUME_PENDING_TRACKING.PATHUNPAIDFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblresumePendingTracking.TBLRESUME_PENDING_TRACKING.ISDELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TblresumePendingTracking.TBLRESUME_PENDING_TRACKING.LOGDATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getDataid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getTypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPathunpaidfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsdeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLogdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord value1(UInteger value) {
        setDataid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord value2(Byte value) {
        setTypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord value3(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord value4(String value) {
        setPathunpaidfile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord value5(Byte value) {
        setIsdeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord value6(Timestamp value) {
        setLogdatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumePendingTrackingRecord values(UInteger value1, Byte value2, String value3, String value4, Byte value5, Timestamp value6) {
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
     * Create a detached TblresumePendingTrackingRecord
     */
    public TblresumePendingTrackingRecord() {
        super(TblresumePendingTracking.TBLRESUME_PENDING_TRACKING);
    }

    /**
     * Create a detached, initialised TblresumePendingTrackingRecord
     */
    public TblresumePendingTrackingRecord(UInteger dataid, Byte typeid, String path, String pathunpaidfile, Byte isdeleted, Timestamp logdatetime) {
        super(TblresumePendingTracking.TBLRESUME_PENDING_TRACKING);

        set(0, dataid);
        set(1, typeid);
        set(2, path);
        set(3, pathunpaidfile);
        set(4, isdeleted);
        set(5, logdatetime);
    }
}