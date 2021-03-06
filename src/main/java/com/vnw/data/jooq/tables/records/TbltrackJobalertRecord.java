/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbltrackJobalert;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TbltrackJobalertRecord extends UpdatableRecordImpl<TbltrackJobalertRecord> implements Record8<Integer, Timestamp, UInteger, Integer, Integer, UInteger, UInteger, UByte> {

    private static final long serialVersionUID = -1412297837;

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.trackingid</code>.
     */
    public void setTrackingid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.trackingid</code>.
     */
    public Integer getTrackingid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.sendingdate</code>.
     */
    public void setSendingdate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.sendingdate</code>.
     */
    public Timestamp getSendingdate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.noofjobalert</code>.
     */
    public void setNoofjobalert(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.noofjobalert</code>.
     */
    public UInteger getNoofjobalert() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.totalmatch</code>.
     */
    public void setTotalmatch(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.totalmatch</code>.
     */
    public Integer getTotalmatch() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.totalnotmatch</code>.
     */
    public void setTotalnotmatch(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.totalnotmatch</code>.
     */
    public Integer getTotalnotmatch() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.totalInvalidEmail</code>. invalid email will not be gotten matched jobs
     */
    public void setTotalinvalidemail(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.totalInvalidEmail</code>. invalid email will not be gotten matched jobs
     */
    public UInteger getTotalinvalidemail() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.totalSent</code>. sent by code, ie. put mail into mail pool successfully only, not mean mail is deliveried to recipient
     */
    public void setTotalsent(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.totalSent</code>. sent by code, ie. put mail into mail pool successfully only, not mean mail is deliveried to recipient
     */
    public UInteger getTotalsent() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_jobalert.alertType</code>. 0: job alert created by user; 1: job alert using history search
     */
    public void setAlerttype(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_jobalert.alertType</code>. 0: job alert created by user; 1: job alert using history search
     */
    public UByte getAlerttype() {
        return (UByte) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, UInteger, Integer, Integer, UInteger, UInteger, UByte> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, UInteger, Integer, Integer, UInteger, UInteger, UByte> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.TRACKINGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.SENDINGDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.NOOFJOBALERT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.TOTALMATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.TOTALNOTMATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.TOTALINVALIDEMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.TOTALSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field8() {
        return TbltrackJobalert.TBLTRACK_JOBALERT.ALERTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTrackingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getSendingdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getNoofjobalert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTotalmatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTotalnotmatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getTotalinvalidemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value7() {
        return getTotalsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value8() {
        return getAlerttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value1(Integer value) {
        setTrackingid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value2(Timestamp value) {
        setSendingdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value3(UInteger value) {
        setNoofjobalert(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value4(Integer value) {
        setTotalmatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value5(Integer value) {
        setTotalnotmatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value6(UInteger value) {
        setTotalinvalidemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value7(UInteger value) {
        setTotalsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord value8(UByte value) {
        setAlerttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackJobalertRecord values(Integer value1, Timestamp value2, UInteger value3, Integer value4, Integer value5, UInteger value6, UInteger value7, UByte value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbltrackJobalertRecord
     */
    public TbltrackJobalertRecord() {
        super(TbltrackJobalert.TBLTRACK_JOBALERT);
    }

    /**
     * Create a detached, initialised TbltrackJobalertRecord
     */
    public TbltrackJobalertRecord(Integer trackingid, Timestamp sendingdate, UInteger noofjobalert, Integer totalmatch, Integer totalnotmatch, UInteger totalinvalidemail, UInteger totalsent, UByte alerttype) {
        super(TbltrackJobalert.TBLTRACK_JOBALERT);

        set(0, trackingid);
        set(1, sendingdate);
        set(2, noofjobalert);
        set(3, totalmatch);
        set(4, totalnotmatch);
        set(5, totalinvalidemail);
        set(6, totalsent);
        set(7, alerttype);
    }
}
