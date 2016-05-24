/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefResumestatuscode;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


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
public class TblrefResumestatuscodeRecord extends UpdatableRecordImpl<TblrefResumestatuscodeRecord> implements Record2<UByte, String> {

    private static final long serialVersionUID = -1849219119;

    /**
     * Setter for <code>vnw_core.tblref_resumestatuscode.resumestatus_id</code>.
     */
    public void setResumestatusId(UByte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_resumestatuscode.resumestatus_id</code>.
     */
    public UByte getResumestatusId() {
        return (UByte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_resumestatuscode.resumestatus_code</code>.
     */
    public void setResumestatusCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_resumestatuscode.resumestatus_code</code>.
     */
    public String getResumestatusCode() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UByte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UByte, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UByte, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field1() {
        return TblrefResumestatuscode.TBLREF_RESUMESTATUSCODE.RESUMESTATUS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefResumestatuscode.TBLREF_RESUMESTATUSCODE.RESUMESTATUS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value1() {
        return getResumestatusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getResumestatusCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumestatuscodeRecord value1(UByte value) {
        setResumestatusId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumestatuscodeRecord value2(String value) {
        setResumestatusCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumestatuscodeRecord values(UByte value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefResumestatuscodeRecord
     */
    public TblrefResumestatuscodeRecord() {
        super(TblrefResumestatuscode.TBLREF_RESUMESTATUSCODE);
    }

    /**
     * Create a detached, initialised TblrefResumestatuscodeRecord
     */
    public TblrefResumestatuscodeRecord(UByte resumestatusId, String resumestatusCode) {
        super(TblrefResumestatuscode.TBLREF_RESUMESTATUSCODE);

        set(0, resumestatusId);
        set(1, resumestatusCode);
    }
}