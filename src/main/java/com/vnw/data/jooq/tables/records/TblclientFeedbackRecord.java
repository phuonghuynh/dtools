/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblclientFeedback;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
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
public class TblclientFeedbackRecord extends UpdatableRecordImpl<TblclientFeedbackRecord> implements Record5<UInteger, UInteger, String, UByte, Timestamp> {

    private static final long serialVersionUID = 1470295657;

    /**
     * Setter for <code>vnw_core.tblclient_feedback.feedbackid</code>.
     */
    public void setFeedbackid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblclient_feedback.feedbackid</code>.
     */
    public UInteger getFeedbackid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblclient_feedback.clientid</code>.
     */
    public void setClientid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblclient_feedback.clientid</code>.
     */
    public UInteger getClientid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblclient_feedback.suggestion</code>.
     */
    public void setSuggestion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblclient_feedback.suggestion</code>.
     */
    public String getSuggestion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblclient_feedback.useserviceagain</code>.
     */
    public void setUseserviceagain(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblclient_feedback.useserviceagain</code>.
     */
    public UByte getUseserviceagain() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblclient_feedback.feedbackdate</code>.
     */
    public void setFeedbackdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblclient_feedback.feedbackdate</code>.
     */
    public Timestamp getFeedbackdate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, UInteger, String, UByte, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, UInteger, String, UByte, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblclientFeedback.TBLCLIENT_FEEDBACK.FEEDBACKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TblclientFeedback.TBLCLIENT_FEEDBACK.CLIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblclientFeedback.TBLCLIENT_FEEDBACK.SUGGESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field4() {
        return TblclientFeedback.TBLCLIENT_FEEDBACK.USESERVICEAGAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblclientFeedback.TBLCLIENT_FEEDBACK.FEEDBACKDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getFeedbackid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getClientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSuggestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value4() {
        return getUseserviceagain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getFeedbackdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedbackRecord value1(UInteger value) {
        setFeedbackid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedbackRecord value2(UInteger value) {
        setClientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedbackRecord value3(String value) {
        setSuggestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedbackRecord value4(UByte value) {
        setUseserviceagain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedbackRecord value5(Timestamp value) {
        setFeedbackdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedbackRecord values(UInteger value1, UInteger value2, String value3, UByte value4, Timestamp value5) {
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
     * Create a detached TblclientFeedbackRecord
     */
    public TblclientFeedbackRecord() {
        super(TblclientFeedback.TBLCLIENT_FEEDBACK);
    }

    /**
     * Create a detached, initialised TblclientFeedbackRecord
     */
    public TblclientFeedbackRecord(UInteger feedbackid, UInteger clientid, String suggestion, UByte useserviceagain, Timestamp feedbackdate) {
        super(TblclientFeedback.TBLCLIENT_FEEDBACK);

        set(0, feedbackid);
        set(1, clientid);
        set(2, suggestion);
        set(3, useserviceagain);
        set(4, feedbackdate);
    }
}
