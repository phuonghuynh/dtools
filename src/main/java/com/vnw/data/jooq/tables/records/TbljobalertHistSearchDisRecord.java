/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobalertHistSearchDis;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * [TRACK-SLAVE]user don't want to hist. search jobalert
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TbljobalertHistSearchDisRecord extends UpdatableRecordImpl<TbljobalertHistSearchDisRecord> implements Record1<UInteger> {

    private static final long serialVersionUID = 858083151;

    /**
     * Setter for <code>vnw_core.tbljobalert_hist_search_dis.userid</code>.
     */
    public void setUserid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljobalert_hist_search_dis.userid</code>.
     */
    public UInteger getUserid() {
        return (UInteger) get(0);
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
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<UInteger> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<UInteger> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbljobalertHistSearchDis.TBLJOBALERT_HIST_SEARCH_DIS.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobalertHistSearchDisRecord value1(UInteger value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobalertHistSearchDisRecord values(UInteger value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbljobalertHistSearchDisRecord
     */
    public TbljobalertHistSearchDisRecord() {
        super(TbljobalertHistSearchDis.TBLJOBALERT_HIST_SEARCH_DIS);
    }

    /**
     * Create a detached, initialised TbljobalertHistSearchDisRecord
     */
    public TbljobalertHistSearchDisRecord(UInteger userid) {
        super(TbljobalertHistSearchDis.TBLJOBALERT_HIST_SEARCH_DIS);

        set(0, userid);
    }
}
