/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobVip;

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
public class TbljobVipRecord extends UpdatableRecordImpl<TbljobVipRecord> implements Record4<UInteger, UInteger, Timestamp, Timestamp> {

    private static final long serialVersionUID = 920545799;

    /**
     * Setter for <code>vnw_core.tbljob_vip.entryId</code>. One job can use VIP more than one times
     */
    public void setEntryid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_vip.entryId</code>. One job can use VIP more than one times
     */
    public UInteger getEntryid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_vip.jobId</code>.
     */
    public void setJobid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_vip.jobId</code>.
     */
    public UInteger getJobid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_vip.onlineDate</code>.
     */
    public void setOnlinedate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_vip.onlineDate</code>.
     */
    public Timestamp getOnlinedate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_vip.expiredDate</code>.
     */
    public void setExpireddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_vip.expiredDate</code>.
     */
    public Timestamp getExpireddate() {
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
    public Row4<UInteger, UInteger, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, UInteger, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbljobVip.TBLJOB_VIP.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TbljobVip.TBLJOB_VIP.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TbljobVip.TBLJOB_VIP.ONLINEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbljobVip.TBLJOB_VIP.EXPIREDDATE;
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
    public Timestamp value3() {
        return getOnlinedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getExpireddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobVipRecord value1(UInteger value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobVipRecord value2(UInteger value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobVipRecord value3(Timestamp value) {
        setOnlinedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobVipRecord value4(Timestamp value) {
        setExpireddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobVipRecord values(UInteger value1, UInteger value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached TbljobVipRecord
     */
    public TbljobVipRecord() {
        super(TbljobVip.TBLJOB_VIP);
    }

    /**
     * Create a detached, initialised TbljobVipRecord
     */
    public TbljobVipRecord(UInteger entryid, UInteger jobid, Timestamp onlinedate, Timestamp expireddate) {
        super(TbljobVip.TBLJOB_VIP);

        set(0, entryid);
        set(1, jobid);
        set(2, onlinedate);
        set(3, expireddate);
    }
}
