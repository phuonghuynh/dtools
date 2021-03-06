/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblsysTracker;

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
public class TblsysTrackerRecord extends UpdatableRecordImpl<TblsysTrackerRecord> implements Record7<Integer, Integer, Integer, Timestamp, String, String, String> {

    private static final long serialVersionUID = -1810542489;

    /**
     * Setter for <code>vnw_core.tblsys_tracker.trackerid</code>.
     */
    public void setTrackerid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.trackerid</code>.
     */
    public Integer getTrackerid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblsys_tracker.userid</code>.
     */
    public void setUserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblsys_tracker.dataid</code>.
     */
    public void setDataid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.dataid</code>.
     */
    public Integer getDataid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblsys_tracker.updateddate</code>.
     */
    public void setUpdateddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.updateddate</code>.
     */
    public Timestamp getUpdateddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblsys_tracker.tablename</code>.
     */
    public void setTablename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.tablename</code>.
     */
    public String getTablename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblsys_tracker.action</code>.
     */
    public void setAction(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.action</code>.
     */
    public String getAction() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblsys_tracker.sqlstring</code>.
     */
    public void setSqlstring(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_tracker.sqlstring</code>.
     */
    public String getSqlstring() {
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
    public Row7<Integer, Integer, Integer, Timestamp, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Timestamp, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblsysTracker.TBLSYS_TRACKER.TRACKERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblsysTracker.TBLSYS_TRACKER.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TblsysTracker.TBLSYS_TRACKER.DATAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TblsysTracker.TBLSYS_TRACKER.UPDATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblsysTracker.TBLSYS_TRACKER.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblsysTracker.TBLSYS_TRACKER.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblsysTracker.TBLSYS_TRACKER.SQLSTRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTrackerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDataid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSqlstring();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value1(Integer value) {
        setTrackerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value2(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value3(Integer value) {
        setDataid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value4(Timestamp value) {
        setUpdateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value5(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value6(String value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord value7(String value) {
        setSqlstring(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysTrackerRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, String value5, String value6, String value7) {
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
     * Create a detached TblsysTrackerRecord
     */
    public TblsysTrackerRecord() {
        super(TblsysTracker.TBLSYS_TRACKER);
    }

    /**
     * Create a detached, initialised TblsysTrackerRecord
     */
    public TblsysTrackerRecord(Integer trackerid, Integer userid, Integer dataid, Timestamp updateddate, String tablename, String action, String sqlstring) {
        super(TblsysTracker.TBLSYS_TRACKER);

        set(0, trackerid);
        set(1, userid);
        set(2, dataid);
        set(3, updateddate);
        set(4, tablename);
        set(5, action);
        set(6, sqlstring);
    }
}
