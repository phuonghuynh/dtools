/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefDiscountRate;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TblrefDiscountRateRecord extends UpdatableRecordImpl<TblrefDiscountRateRecord> implements Record5<UInteger, Byte, Double, Timestamp, Timestamp> {

    private static final long serialVersionUID = 534726174;

    /**
     * Setter for <code>vnw_core.tblref_discount_rate.id</code>.  id primary key 
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_discount_rate.id</code>.  id primary key 
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_discount_rate.quantity</code>.  Job pack size 1, 2, 3, 5, 10 
     */
    public void setQuantity(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_discount_rate.quantity</code>.  Job pack size 1, 2, 3, 5, 10 
     */
    public Byte getQuantity() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_discount_rate.discountRate</code>.  discount rate (1=1)  (2 = .82) (3 = .78) (5=.76)  or (10=.7)
     */
    public void setDiscountrate(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_discount_rate.discountRate</code>.  discount rate (1=1)  (2 = .82) (3 = .78) (5=.76)  or (10=.7)
     */
    public Double getDiscountrate() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_discount_rate.createdDate</code>.  Created date of discount rate  
     */
    public void setCreateddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_discount_rate.createdDate</code>.  Created date of discount rate  
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_discount_rate.lastUpdateDate</code>.  Last updated date of discount 
     */
    public void setLastupdatedate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_discount_rate.lastUpdateDate</code>.  Last updated date of discount 
     */
    public Timestamp getLastupdatedate() {
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
    public Row5<UInteger, Byte, Double, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, Byte, Double, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblrefDiscountRate.TBLREF_DISCOUNT_RATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefDiscountRate.TBLREF_DISCOUNT_RATE.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return TblrefDiscountRate.TBLREF_DISCOUNT_RATE.DISCOUNTRATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TblrefDiscountRate.TBLREF_DISCOUNT_RATE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblrefDiscountRate.TBLREF_DISCOUNT_RATE.LASTUPDATEDATE;
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
    public Byte value2() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getDiscountrate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLastupdatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDiscountRateRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDiscountRateRecord value2(Byte value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDiscountRateRecord value3(Double value) {
        setDiscountrate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDiscountRateRecord value4(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDiscountRateRecord value5(Timestamp value) {
        setLastupdatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDiscountRateRecord values(UInteger value1, Byte value2, Double value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached TblrefDiscountRateRecord
     */
    public TblrefDiscountRateRecord() {
        super(TblrefDiscountRate.TBLREF_DISCOUNT_RATE);
    }

    /**
     * Create a detached, initialised TblrefDiscountRateRecord
     */
    public TblrefDiscountRateRecord(UInteger id, Byte quantity, Double discountrate, Timestamp createddate, Timestamp lastupdatedate) {
        super(TblrefDiscountRate.TBLREF_DISCOUNT_RATE);

        set(0, id);
        set(1, quantity);
        set(2, discountrate);
        set(3, createddate);
        set(4, lastupdatedate);
    }
}
