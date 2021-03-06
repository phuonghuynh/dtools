/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TrackEmailChanged;

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
public class TrackEmailChangedRecord extends UpdatableRecordImpl<TrackEmailChangedRecord> implements Record7<Integer, Timestamp, String, String, Integer, String, String> {

    private static final long serialVersionUID = -1188404719;

    /**
     * Setter for <code>vnw_core.track_email_changed.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.track_email_changed.changedTime</code>.
     */
    public void setChangedtime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.changedTime</code>.
     */
    public Timestamp getChangedtime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>vnw_core.track_email_changed.tableName</code>. tbljob or tblregistrationinfo, maybe more
     */
    public void setTablename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.tableName</code>. tbljob or tblregistrationinfo, maybe more
     */
    public String getTablename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.track_email_changed.fieldName</code>. Updated field on the table
     */
    public void setFieldname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.fieldName</code>. Updated field on the table
     */
    public String getFieldname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.track_email_changed.objectId</code>. JserId or JobId
     */
    public void setObjectid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.objectId</code>. JserId or JobId
     */
    public Integer getObjectid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vnw_core.track_email_changed.oldEmail</code>.
     */
    public void setOldemail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.oldEmail</code>.
     */
    public String getOldemail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.track_email_changed.newEmail</code>.
     */
    public void setNewemail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.track_email_changed.newEmail</code>.
     */
    public String getNewemail() {
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
    public Row7<Integer, Timestamp, String, String, Integer, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Timestamp, String, String, Integer, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.CHANGEDTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.FIELDNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.OBJECTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.OLDEMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TrackEmailChanged.TRACK_EMAIL_CHANGED.NEWEMAIL;
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
    public Timestamp value2() {
        return getChangedtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFieldname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getObjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOldemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getNewemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value2(Timestamp value) {
        setChangedtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value3(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value4(String value) {
        setFieldname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value5(Integer value) {
        setObjectid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value6(String value) {
        setOldemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord value7(String value) {
        setNewemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackEmailChangedRecord values(Integer value1, Timestamp value2, String value3, String value4, Integer value5, String value6, String value7) {
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
     * Create a detached TrackEmailChangedRecord
     */
    public TrackEmailChangedRecord() {
        super(TrackEmailChanged.TRACK_EMAIL_CHANGED);
    }

    /**
     * Create a detached, initialised TrackEmailChangedRecord
     */
    public TrackEmailChangedRecord(Integer id, Timestamp changedtime, String tablename, String fieldname, Integer objectid, String oldemail, String newemail) {
        super(TrackEmailChanged.TRACK_EMAIL_CHANGED);

        set(0, id);
        set(1, changedtime);
        set(2, tablename);
        set(3, fieldname);
        set(4, objectid);
        set(5, oldemail);
        set(6, newemail);
    }
}
