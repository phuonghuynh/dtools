/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefErrortype;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TblrefErrortypeRecord extends UpdatableRecordImpl<TblrefErrortypeRecord> implements Record2<Byte, String> {

    private static final long serialVersionUID = -287297025;

    /**
     * Setter for <code>vnw_core.tblref_errortype.errorTypeId</code>. error type id
     */
    public void setErrortypeid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_errortype.errorTypeId</code>. error type id
     */
    public Byte getErrortypeid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_errortype.description</code>. description of error
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_errortype.description</code>. description of error
     */
    public String getDescription() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Byte, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Byte, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefErrortype.TBLREF_ERRORTYPE.ERRORTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefErrortype.TBLREF_ERRORTYPE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getErrortypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefErrortypeRecord value1(Byte value) {
        setErrortypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefErrortypeRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefErrortypeRecord values(Byte value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefErrortypeRecord
     */
    public TblrefErrortypeRecord() {
        super(TblrefErrortype.TBLREF_ERRORTYPE);
    }

    /**
     * Create a detached, initialised TblrefErrortypeRecord
     */
    public TblrefErrortypeRecord(Byte errortypeid, String description) {
        super(TblrefErrortype.TBLREF_ERRORTYPE);

        set(0, errortypeid);
        set(1, description);
    }
}
