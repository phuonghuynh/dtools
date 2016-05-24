/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.Tblmailbox;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TblmailboxRecord extends UpdatableRecordImpl<TblmailboxRecord> implements Record11<UInteger, Integer, Integer, Integer, Integer, Byte, String, String, Timestamp, Byte, Byte> {

    private static final long serialVersionUID = 613777342;

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_id</code>.
     */
    public void setMailboxId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_id</code>.
     */
    public UInteger getMailboxId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_senderid</code>.
     */
    public void setMailboxSenderid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_senderid</code>.
     */
    public Integer getMailboxSenderid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_receiverid</code>.
     */
    public void setMailboxReceiverid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_receiverid</code>.
     */
    public Integer getMailboxReceiverid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.jobid</code>.
     */
    public void setJobid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.jobid</code>.
     */
    public Integer getJobid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.resumeid</code>.
     */
    public void setResumeid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.resumeid</code>.
     */
    public Integer getResumeid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.templatetypeid</code>.
     */
    public void setTemplatetypeid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.templatetypeid</code>.
     */
    public Byte getTemplatetypeid() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_subject</code>.
     */
    public void setMailboxSubject(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_subject</code>.
     */
    public String getMailboxSubject() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_content</code>.
     */
    public void setMailboxContent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_content</code>.
     */
    public String getMailboxContent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_datesent</code>.
     */
    public void setMailboxDatesent(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_datesent</code>.
     */
    public Timestamp getMailboxDatesent() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.mailbox_isviewedbyreceiver</code>.
     */
    public void setMailboxIsviewedbyreceiver(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.mailbox_isviewedbyreceiver</code>.
     */
    public Byte getMailboxIsviewedbyreceiver() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblmailbox.isdeleted</code>.
     */
    public void setIsdeleted(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailbox.isdeleted</code>.
     */
    public Byte getIsdeleted() {
        return (Byte) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, Integer, Integer, Integer, Integer, Byte, String, String, Timestamp, Byte, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, Integer, Integer, Integer, Integer, Byte, String, String, Timestamp, Byte, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_SENDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_RECEIVERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Tblmailbox.TBLMAILBOX.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Tblmailbox.TBLMAILBOX.RESUMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return Tblmailbox.TBLMAILBOX.TEMPLATETYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_SUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_DATESENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return Tblmailbox.TBLMAILBOX.MAILBOX_ISVIEWEDBYRECEIVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return Tblmailbox.TBLMAILBOX.ISDELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getMailboxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMailboxSenderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMailboxReceiverid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getResumeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getTemplatetypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMailboxSubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMailboxContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getMailboxDatesent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getMailboxIsviewedbyreceiver();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsdeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value1(UInteger value) {
        setMailboxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value2(Integer value) {
        setMailboxSenderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value3(Integer value) {
        setMailboxReceiverid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value4(Integer value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value5(Integer value) {
        setResumeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value6(Byte value) {
        setTemplatetypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value7(String value) {
        setMailboxSubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value8(String value) {
        setMailboxContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value9(Timestamp value) {
        setMailboxDatesent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value10(Byte value) {
        setMailboxIsviewedbyreceiver(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord value11(Byte value) {
        setIsdeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailboxRecord values(UInteger value1, Integer value2, Integer value3, Integer value4, Integer value5, Byte value6, String value7, String value8, Timestamp value9, Byte value10, Byte value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblmailboxRecord
     */
    public TblmailboxRecord() {
        super(Tblmailbox.TBLMAILBOX);
    }

    /**
     * Create a detached, initialised TblmailboxRecord
     */
    public TblmailboxRecord(UInteger mailboxId, Integer mailboxSenderid, Integer mailboxReceiverid, Integer jobid, Integer resumeid, Byte templatetypeid, String mailboxSubject, String mailboxContent, Timestamp mailboxDatesent, Byte mailboxIsviewedbyreceiver, Byte isdeleted) {
        super(Tblmailbox.TBLMAILBOX);

        set(0, mailboxId);
        set(1, mailboxSenderid);
        set(2, mailboxReceiverid);
        set(3, jobid);
        set(4, resumeid);
        set(5, templatetypeid);
        set(6, mailboxSubject);
        set(7, mailboxContent);
        set(8, mailboxDatesent);
        set(9, mailboxIsviewedbyreceiver);
        set(10, isdeleted);
    }
}