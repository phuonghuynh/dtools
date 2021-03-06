/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblNewsletterReminder;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class TblNewsletterReminderRecord extends UpdatableRecordImpl<TblNewsletterReminderRecord> implements Record4<UInteger, String, Byte, Timestamp> {

    private static final long serialVersionUID = 463904196;

    /**
     * Setter for <code>vnw_core.tbl_newsletter_reminder.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_newsletter_reminder.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbl_newsletter_reminder.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_newsletter_reminder.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbl_newsletter_reminder.isaddnewletter</code>.
     */
    public void setIsaddnewletter(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_newsletter_reminder.isaddnewletter</code>.
     */
    public Byte getIsaddnewletter() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbl_newsletter_reminder.createdate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_newsletter_reminder.createdate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, String, Byte, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, String, Byte, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblNewsletterReminder.TBL_NEWSLETTER_REMINDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblNewsletterReminder.TBL_NEWSLETTER_REMINDER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TblNewsletterReminder.TBL_NEWSLETTER_REMINDER.ISADDNEWLETTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TblNewsletterReminder.TBL_NEWSLETTER_REMINDER.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getIsaddnewletter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterReminderRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterReminderRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterReminderRecord value3(Byte value) {
        setIsaddnewletter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterReminderRecord value4(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterReminderRecord values(UInteger value1, String value2, Byte value3, Timestamp value4) {
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
     * Create a detached TblNewsletterReminderRecord
     */
    public TblNewsletterReminderRecord() {
        super(TblNewsletterReminder.TBL_NEWSLETTER_REMINDER);
    }

    /**
     * Create a detached, initialised TblNewsletterReminderRecord
     */
    public TblNewsletterReminderRecord(UInteger id, String email, Byte isaddnewletter, Timestamp createdate) {
        super(TblNewsletterReminder.TBL_NEWSLETTER_REMINDER);

        set(0, id);
        set(1, email);
        set(2, isaddnewletter);
        set(3, createdate);
    }
}
