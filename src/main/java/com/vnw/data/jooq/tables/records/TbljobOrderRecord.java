/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobOrder;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class TbljobOrderRecord extends UpdatableRecordImpl<TbljobOrderRecord> implements Record12<Integer, Integer, Integer, Double, String, Byte, Double, Timestamp, Byte, Timestamp, String, Integer> {

    private static final long serialVersionUID = 1035694243;

    /**
     * Setter for <code>vnw_core.tbljob_order.joborderid</code>.
     */
    public void setJoborderid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.joborderid</code>.
     */
    public Integer getJoborderid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.jobid</code>.
     */
    public void setJobid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.jobid</code>.
     */
    public Integer getJobid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.jobfeeid</code>.
     */
    public void setJobfeeid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.jobfeeid</code>.
     */
    public Integer getJobfeeid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.paymentfee</code>.
     */
    public void setPaymentfee(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.paymentfee</code>.
     */
    public Double getPaymentfee() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.currencytype</code>.
     */
    public void setCurrencytype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.currencytype</code>.
     */
    public String getCurrencytype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.discountid</code>.
     */
    public void setDiscountid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.discountid</code>.
     */
    public Byte getDiscountid() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.discountpercent</code>.
     */
    public void setDiscountpercent(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.discountpercent</code>.
     */
    public Double getDiscountpercent() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.ispaid</code>.
     */
    public void setIspaid(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.ispaid</code>.
     */
    public Byte getIspaid() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.paiddate</code>.
     */
    public void setPaiddate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.paiddate</code>.
     */
    public Timestamp getPaiddate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.paidperson</code>.
     */
    public void setPaidperson(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.paidperson</code>.
     */
    public String getPaidperson() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vnw_core.tbljob_order.updateduserid</code>.
     */
    public void setUpdateduserid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_order.updateduserid</code>.
     */
    public Integer getUpdateduserid() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Double, String, Byte, Double, Timestamp, Byte, Timestamp, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Double, String, Byte, Double, Timestamp, Byte, Timestamp, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TbljobOrder.TBLJOB_ORDER.JOBORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TbljobOrder.TBLJOB_ORDER.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TbljobOrder.TBLJOB_ORDER.JOBFEEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return TbljobOrder.TBLJOB_ORDER.PAYMENTFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbljobOrder.TBLJOB_ORDER.CURRENCYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TbljobOrder.TBLJOB_ORDER.DISCOUNTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return TbljobOrder.TBLJOB_ORDER.DISCOUNTPERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TbljobOrder.TBLJOB_ORDER.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TbljobOrder.TBLJOB_ORDER.ISPAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TbljobOrder.TBLJOB_ORDER.PAIDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TbljobOrder.TBLJOB_ORDER.PAIDPERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return TbljobOrder.TBLJOB_ORDER.UPDATEDUSERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getJoborderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getJobfeeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getPaymentfee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrencytype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getDiscountid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getDiscountpercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIspaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getPaiddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPaidperson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUpdateduserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value1(Integer value) {
        setJoborderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value2(Integer value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value3(Integer value) {
        setJobfeeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value4(Double value) {
        setPaymentfee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value5(String value) {
        setCurrencytype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value6(Byte value) {
        setDiscountid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value7(Double value) {
        setDiscountpercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value8(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value9(Byte value) {
        setIspaid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value10(Timestamp value) {
        setPaiddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value11(String value) {
        setPaidperson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord value12(Integer value) {
        setUpdateduserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrderRecord values(Integer value1, Integer value2, Integer value3, Double value4, String value5, Byte value6, Double value7, Timestamp value8, Byte value9, Timestamp value10, String value11, Integer value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbljobOrderRecord
     */
    public TbljobOrderRecord() {
        super(TbljobOrder.TBLJOB_ORDER);
    }

    /**
     * Create a detached, initialised TbljobOrderRecord
     */
    public TbljobOrderRecord(Integer joborderid, Integer jobid, Integer jobfeeid, Double paymentfee, String currencytype, Byte discountid, Double discountpercent, Timestamp createddate, Byte ispaid, Timestamp paiddate, String paidperson, Integer updateduserid) {
        super(TbljobOrder.TBLJOB_ORDER);

        set(0, joborderid);
        set(1, jobid);
        set(2, jobfeeid);
        set(3, paymentfee);
        set(4, currencytype);
        set(5, discountid);
        set(6, discountpercent);
        set(7, createddate);
        set(8, ispaid);
        set(9, paiddate);
        set(10, paidperson);
        set(11, updateduserid);
    }
}
