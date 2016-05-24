/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblonlineOrderPaymentStatus;

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
public class TblonlineOrderPaymentStatusRecord extends UpdatableRecordImpl<TblonlineOrderPaymentStatusRecord> implements Record6<UInteger, UInteger, Byte, String, Byte, Timestamp> {

    private static final long serialVersionUID = -1032887343;

    /**
     * Setter for <code>vnw_core.tblonline_order_payment_status.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblonline_order_payment_status.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblonline_order_payment_status.orderId</code>. Payment Online Id
     */
    public void setOrderid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblonline_order_payment_status.orderId</code>. Payment Online Id
     */
    public UInteger getOrderid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblonline_order_payment_status.paidType</code>. 1: visa card, 2: ATM card, 0: offline
     */
    public void setPaidtype(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblonline_order_payment_status.paidType</code>. 1: visa card, 2: ATM card, 0: offline
     */
    public Byte getPaidtype() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblonline_order_payment_status.paidCode</code>.
     */
    public void setPaidcode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblonline_order_payment_status.paidCode</code>.
     */
    public String getPaidcode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblonline_order_payment_status.status</code>. 0: created, 1: success, 2: fail, 3: re-open
     */
    public void setStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblonline_order_payment_status.status</code>. 0: created, 1: success, 2: fail, 3: re-open
     */
    public Byte getStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblonline_order_payment_status.createdDate</code>.  created date of test
     */
    public void setCreateddate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblonline_order_payment_status.createdDate</code>.  created date of test
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(5);
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
    public Row6<UInteger, UInteger, Byte, String, Byte, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, Byte, String, Byte, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS.ORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS.PAIDTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS.PAIDCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS.CREATEDDATE;
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
    public UInteger value2() {
        return getOrderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getPaidtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPaidcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord value2(UInteger value) {
        setOrderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord value3(Byte value) {
        setPaidtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord value4(String value) {
        setPaidcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord value5(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord value6(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatusRecord values(UInteger value1, UInteger value2, Byte value3, String value4, Byte value5, Timestamp value6) {
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
     * Create a detached TblonlineOrderPaymentStatusRecord
     */
    public TblonlineOrderPaymentStatusRecord() {
        super(TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS);
    }

    /**
     * Create a detached, initialised TblonlineOrderPaymentStatusRecord
     */
    public TblonlineOrderPaymentStatusRecord(UInteger id, UInteger orderid, Byte paidtype, String paidcode, Byte status, Timestamp createddate) {
        super(TblonlineOrderPaymentStatus.TBLONLINE_ORDER_PAYMENT_STATUS);

        set(0, id);
        set(1, orderid);
        set(2, paidtype);
        set(3, paidcode);
        set(4, status);
        set(5, createddate);
    }
}
