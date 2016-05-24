/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbluserSuspended;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class TbluserSuspendedRecord extends UpdatableRecordImpl<TbluserSuspendedRecord> implements Record6<UInteger, UInteger, Timestamp, Timestamp, Byte, Byte> {

    private static final long serialVersionUID = -1021171094;

    /**
     * Setter for <code>vnw_core.tbluser_suspended.entryid</code>.
     */
    public void setEntryid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_suspended.entryid</code>.
     */
    public UInteger getEntryid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbluser_suspended.userid</code>.
     */
    public void setUserid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_suspended.userid</code>.
     */
    public UInteger getUserid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbluser_suspended.suspended_date</code>.
     */
    public void setSuspendedDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_suspended.suspended_date</code>.
     */
    public Timestamp getSuspendedDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbluser_suspended.suspended_to</code>.
     */
    public void setSuspendedTo(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_suspended.suspended_to</code>.
     */
    public Timestamp getSuspendedTo() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbluser_suspended.is_banned</code>.
     */
    public void setIsBanned(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_suspended.is_banned</code>.
     */
    public Byte getIsBanned() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbluser_suspended.rule_id</code>. 1: Applyonline, 2: Send directly
     */
    public void setRuleId(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_suspended.rule_id</code>. 1: Applyonline, 2: Send directly
     */
    public Byte getRuleId() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, Timestamp, Timestamp, Byte, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, Timestamp, Timestamp, Byte, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbluserSuspended.TBLUSER_SUSPENDED.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TbluserSuspended.TBLUSER_SUSPENDED.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TbluserSuspended.TBLUSER_SUSPENDED.SUSPENDED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbluserSuspended.TBLUSER_SUSPENDED.SUSPENDED_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TbluserSuspended.TBLUSER_SUSPENDED.IS_BANNED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TbluserSuspended.TBLUSER_SUSPENDED.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getEntryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getSuspendedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getSuspendedTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsBanned();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord value1(UInteger value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord value2(UInteger value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord value3(Timestamp value) {
        setSuspendedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord value4(Timestamp value) {
        setSuspendedTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord value5(Byte value) {
        setIsBanned(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord value6(Byte value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserSuspendedRecord values(UInteger value1, UInteger value2, Timestamp value3, Timestamp value4, Byte value5, Byte value6) {
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
     * Create a detached TbluserSuspendedRecord
     */
    public TbluserSuspendedRecord() {
        super(TbluserSuspended.TBLUSER_SUSPENDED);
    }

    /**
     * Create a detached, initialised TbluserSuspendedRecord
     */
    public TbluserSuspendedRecord(UInteger entryid, UInteger userid, Timestamp suspendedDate, Timestamp suspendedTo, Byte isBanned, Byte ruleId) {
        super(TbluserSuspended.TBLUSER_SUSPENDED);

        set(0, entryid);
        set(1, userid);
        set(2, suspendedDate);
        set(3, suspendedTo);
        set(4, isBanned);
        set(5, ruleId);
    }
}
