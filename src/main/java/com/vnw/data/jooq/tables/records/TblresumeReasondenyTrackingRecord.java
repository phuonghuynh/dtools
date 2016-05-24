/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumeReasondenyTracking;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class TblresumeReasondenyTrackingRecord extends TableRecordImpl<TblresumeReasondenyTrackingRecord> implements Record3<Integer, Byte, String> {

    private static final long serialVersionUID = -132668717;

    /**
     * Setter for <code>vnw_core.tblresume_reasondeny_tracking.denieid</code>.
     */
    public void setDenieid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_reasondeny_tracking.denieid</code>.
     */
    public Integer getDenieid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_reasondeny_tracking.reasonid</code>.
     */
    public void setReasonid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_reasondeny_tracking.reasonid</code>.
     */
    public Byte getReasonid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_reasondeny_tracking.reasondesc</code>.
     */
    public void setReasondesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_reasondeny_tracking.reasondesc</code>.
     */
    public String getReasondesc() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Byte, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Byte, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblresumeReasondenyTracking.TBLRESUME_REASONDENY_TRACKING.DENIEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblresumeReasondenyTracking.TBLRESUME_REASONDENY_TRACKING.REASONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblresumeReasondenyTracking.TBLRESUME_REASONDENY_TRACKING.REASONDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDenieid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getReasonid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReasondesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeReasondenyTrackingRecord value1(Integer value) {
        setDenieid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeReasondenyTrackingRecord value2(Byte value) {
        setReasonid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeReasondenyTrackingRecord value3(String value) {
        setReasondesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeReasondenyTrackingRecord values(Integer value1, Byte value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblresumeReasondenyTrackingRecord
     */
    public TblresumeReasondenyTrackingRecord() {
        super(TblresumeReasondenyTracking.TBLRESUME_REASONDENY_TRACKING);
    }

    /**
     * Create a detached, initialised TblresumeReasondenyTrackingRecord
     */
    public TblresumeReasondenyTrackingRecord(Integer denieid, Byte reasonid, String reasondesc) {
        super(TblresumeReasondenyTracking.TBLRESUME_REASONDENY_TRACKING);

        set(0, denieid);
        set(1, reasonid);
        set(2, reasondesc);
    }
}
