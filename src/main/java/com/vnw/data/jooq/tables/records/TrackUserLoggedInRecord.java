/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TrackUserLoggedIn;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class TrackUserLoggedInRecord extends UpdatableRecordImpl<TrackUserLoggedInRecord> implements Record4<ULong, UInteger, UByte, Timestamp> {

    private static final long serialVersionUID = -371795074;

    /**
     * Setter for <code>vnw_core.track_user_logged_in.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_logged_in.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>vnw_core.track_user_logged_in.user_id</code>.
     */
    public void setUserId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_logged_in.user_id</code>.
     */
    public UInteger getUserId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.track_user_logged_in.usertype_id</code>. 1: Jobseekers, 2: Employers
     */
    public void setUsertypeId(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_logged_in.usertype_id</code>. 1: Jobseekers, 2: Employers
     */
    public UByte getUsertypeId() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.track_user_logged_in.create_at</code>.
     */
    public void setCreateAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_logged_in.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, UInteger, UByte, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, UInteger, UByte, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TrackUserLoggedIn.TRACK_USER_LOGGED_IN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TrackUserLoggedIn.TRACK_USER_LOGGED_IN.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TrackUserLoggedIn.TRACK_USER_LOGGED_IN.USERTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TrackUserLoggedIn.TRACK_USER_LOGGED_IN.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getUsertypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserLoggedInRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserLoggedInRecord value2(UInteger value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserLoggedInRecord value3(UByte value) {
        setUsertypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserLoggedInRecord value4(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserLoggedInRecord values(ULong value1, UInteger value2, UByte value3, Timestamp value4) {
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
     * Create a detached TrackUserLoggedInRecord
     */
    public TrackUserLoggedInRecord() {
        super(TrackUserLoggedIn.TRACK_USER_LOGGED_IN);
    }

    /**
     * Create a detached, initialised TrackUserLoggedInRecord
     */
    public TrackUserLoggedInRecord(ULong id, UInteger userId, UByte usertypeId, Timestamp createAt) {
        super(TrackUserLoggedIn.TRACK_USER_LOGGED_IN);

        set(0, id);
        set(1, userId);
        set(2, usertypeId);
        set(3, createAt);
    }
}