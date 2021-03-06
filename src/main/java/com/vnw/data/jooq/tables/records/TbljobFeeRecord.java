/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobFee;

import java.math.BigDecimal;

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
public class TbljobFeeRecord extends UpdatableRecordImpl<TbljobFeeRecord> implements Record7<Short, Short, Short, BigDecimal, String, Byte, Double> {

    private static final long serialVersionUID = 656126452;

    /**
     * Setter for <code>vnw_core.tbljob_fee.jobfeeid</code>.
     */
    public void setJobfeeid(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.jobfeeid</code>.
     */
    public Short getJobfeeid() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_fee.cityid</code>.
     */
    public void setCityid(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.cityid</code>.
     */
    public Short getCityid() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_fee.joboptionid</code>.
     */
    public void setJoboptionid(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.joboptionid</code>.
     */
    public Short getJoboptionid() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_fee.jobfee</code>.
     */
    public void setJobfee(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.jobfee</code>.
     */
    public BigDecimal getJobfee() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbljob_fee.currencytype</code>.
     */
    public void setCurrencytype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.currencytype</code>.
     */
    public String getCurrencytype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbljob_fee.discountid</code>.
     */
    public void setDiscountid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.discountid</code>.
     */
    public Byte getDiscountid() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbljob_fee.discountpercent</code>.
     */
    public void setDiscountpercent(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_fee.discountpercent</code>.
     */
    public Double getDiscountpercent() {
        return (Double) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Short, Short, Short, BigDecimal, String, Byte, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Short, Short, Short, BigDecimal, String, Byte, Double> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return TbljobFee.TBLJOB_FEE.JOBFEEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TbljobFee.TBLJOB_FEE.CITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TbljobFee.TBLJOB_FEE.JOBOPTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TbljobFee.TBLJOB_FEE.JOBFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbljobFee.TBLJOB_FEE.CURRENCYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TbljobFee.TBLJOB_FEE.DISCOUNTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return TbljobFee.TBLJOB_FEE.DISCOUNTPERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getJobfeeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getCityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getJoboptionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getJobfee();
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
    public TbljobFeeRecord value1(Short value) {
        setJobfeeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord value2(Short value) {
        setCityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord value3(Short value) {
        setJoboptionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord value4(BigDecimal value) {
        setJobfee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord value5(String value) {
        setCurrencytype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord value6(Byte value) {
        setDiscountid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord value7(Double value) {
        setDiscountpercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeeRecord values(Short value1, Short value2, Short value3, BigDecimal value4, String value5, Byte value6, Double value7) {
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
     * Create a detached TbljobFeeRecord
     */
    public TbljobFeeRecord() {
        super(TbljobFee.TBLJOB_FEE);
    }

    /**
     * Create a detached, initialised TbljobFeeRecord
     */
    public TbljobFeeRecord(Short jobfeeid, Short cityid, Short joboptionid, BigDecimal jobfee, String currencytype, Byte discountid, Double discountpercent) {
        super(TbljobFee.TBLJOB_FEE);

        set(0, jobfeeid);
        set(1, cityid);
        set(2, joboptionid);
        set(3, jobfee);
        set(4, currencytype);
        set(5, discountid);
        set(6, discountpercent);
    }
}
