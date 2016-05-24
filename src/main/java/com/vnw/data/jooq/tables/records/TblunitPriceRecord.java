/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblunitPrice;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class TblunitPriceRecord extends UpdatableRecordImpl<TblunitPriceRecord> implements Record4<Integer, Integer, Double, Timestamp> {

    private static final long serialVersionUID = 2005015474;

    /**
     * Setter for <code>vnw_core.tblunit_price.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblunit_price.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblunit_price.product_id</code>.
     */
    public void setProductId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblunit_price.product_id</code>.
     */
    public Integer getProductId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblunit_price.price</code>.
     */
    public void setPrice(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblunit_price.price</code>.
     */
    public Double getPrice() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblunit_price.effective_date</code>.
     */
    public void setEffectiveDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblunit_price.effective_date</code>.
     */
    public Timestamp getEffectiveDate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Double, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Double, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblunitPrice.TBLUNIT_PRICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblunitPrice.TBLUNIT_PRICE.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return TblunitPrice.TBLUNIT_PRICE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TblunitPrice.TBLUNIT_PRICE.EFFECTIVE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getEffectiveDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblunitPriceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblunitPriceRecord value2(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblunitPriceRecord value3(Double value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblunitPriceRecord value4(Timestamp value) {
        setEffectiveDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblunitPriceRecord values(Integer value1, Integer value2, Double value3, Timestamp value4) {
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
     * Create a detached TblunitPriceRecord
     */
    public TblunitPriceRecord() {
        super(TblunitPrice.TBLUNIT_PRICE);
    }

    /**
     * Create a detached, initialised TblunitPriceRecord
     */
    public TblunitPriceRecord(Integer id, Integer productId, Double price, Timestamp effectiveDate) {
        super(TblunitPrice.TBLUNIT_PRICE);

        set(0, id);
        set(1, productId);
        set(2, price);
        set(3, effectiveDate);
    }
}
