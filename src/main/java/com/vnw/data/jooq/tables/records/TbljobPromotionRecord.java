/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobPromotion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TbljobPromotionRecord extends UpdatableRecordImpl<TbljobPromotionRecord> implements Record7<UInteger, UInteger, UByte, Timestamp, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1510712329;

    /**
     * Setter for <code>vnw_core.tbljob_promotion.entryid</code>.
     */
    public void setEntryid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.entryid</code>.
     */
    public UInteger getEntryid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_promotion.jobid</code>.
     */
    public void setJobid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.jobid</code>.
     */
    public UInteger getJobid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_promotion.jobpromote_bitmask</code>.
     */
    public void setJobpromoteBitmask(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.jobpromote_bitmask</code>.
     */
    public UByte getJobpromoteBitmask() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_promotion.createdate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.createdate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbljob_promotion.lastupdate</code>.
     */
    public void setLastupdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.lastupdate</code>.
     */
    public Timestamp getLastupdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbljob_promotion.expireddate</code>.
     */
    public void setExpireddate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.expireddate</code>.
     */
    public Timestamp getExpireddate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbljob_promotion.onlinedate</code>.
     */
    public void setOnlinedate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_promotion.onlinedate</code>.
     */
    public Timestamp getOnlinedate() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, UInteger, UByte, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, UInteger, UByte, Timestamp, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbljobPromotion.TBLJOB_PROMOTION.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TbljobPromotion.TBLJOB_PROMOTION.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TbljobPromotion.TBLJOB_PROMOTION.JOBPROMOTE_BITMASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbljobPromotion.TBLJOB_PROMOTION.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TbljobPromotion.TBLJOB_PROMOTION.LASTUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TbljobPromotion.TBLJOB_PROMOTION.EXPIREDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TbljobPromotion.TBLJOB_PROMOTION.ONLINEDATE;
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
        return getJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getJobpromoteBitmask();
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
    public Timestamp value5() {
        return getLastupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getExpireddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getOnlinedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value1(UInteger value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value2(UInteger value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value3(UByte value) {
        setJobpromoteBitmask(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value4(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value5(Timestamp value) {
        setLastupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value6(Timestamp value) {
        setExpireddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord value7(Timestamp value) {
        setOnlinedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotionRecord values(UInteger value1, UInteger value2, UByte value3, Timestamp value4, Timestamp value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached TbljobPromotionRecord
     */
    public TbljobPromotionRecord() {
        super(TbljobPromotion.TBLJOB_PROMOTION);
    }

    /**
     * Create a detached, initialised TbljobPromotionRecord
     */
    public TbljobPromotionRecord(UInteger entryid, UInteger jobid, UByte jobpromoteBitmask, Timestamp createdate, Timestamp lastupdate, Timestamp expireddate, Timestamp onlinedate) {
        super(TbljobPromotion.TBLJOB_PROMOTION);

        set(0, entryid);
        set(1, jobid);
        set(2, jobpromoteBitmask);
        set(3, createdate);
        set(4, lastupdate);
        set(5, expireddate);
        set(6, onlinedate);
    }
}
