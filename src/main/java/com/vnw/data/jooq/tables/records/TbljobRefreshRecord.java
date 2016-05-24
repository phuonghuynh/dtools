/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobRefresh;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class TbljobRefreshRecord extends UpdatableRecordImpl<TbljobRefreshRecord> implements Record3<UInteger, UInteger, Timestamp> {

    private static final long serialVersionUID = 156110147;

    /**
     * Setter for <code>vnw_core.tbljob_refresh.entryId</code>.
     */
    public void setEntryid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_refresh.entryId</code>.
     */
    public UInteger getEntryid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_refresh.jobId</code>.
     */
    public void setJobid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_refresh.jobId</code>.
     */
    public UInteger getJobid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_refresh.refreshTime</code>.
     */
    public void setRefreshtime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_refresh.refreshTime</code>.
     */
    public Timestamp getRefreshtime() {
        return (Timestamp) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, UInteger, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, UInteger, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbljobRefresh.TBLJOB_REFRESH.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TbljobRefresh.TBLJOB_REFRESH.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TbljobRefresh.TBLJOB_REFRESH.REFRESHTIME;
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
        return getRefreshtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobRefreshRecord value1(UInteger value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobRefreshRecord value2(UInteger value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobRefreshRecord value3(Timestamp value) {
        setRefreshtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobRefreshRecord values(UInteger value1, UInteger value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbljobRefreshRecord
     */
    public TbljobRefreshRecord() {
        super(TbljobRefresh.TBLJOB_REFRESH);
    }

    /**
     * Create a detached, initialised TbljobRefreshRecord
     */
    public TbljobRefreshRecord(UInteger entryid, UInteger jobid, Timestamp refreshtime) {
        super(TbljobRefresh.TBLJOB_REFRESH);

        set(0, entryid);
        set(1, jobid);
        set(2, refreshtime);
    }
}
