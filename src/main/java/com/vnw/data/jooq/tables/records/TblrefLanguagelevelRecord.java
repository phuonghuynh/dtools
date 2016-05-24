/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefLanguagelevel;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
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
public class TblrefLanguagelevelRecord extends UpdatableRecordImpl<TblrefLanguagelevelRecord> implements Record4<Byte, Byte, String, Byte> {

    private static final long serialVersionUID = 1516396007;

    /**
     * Setter for <code>vnw_core.tblref_languagelevel.languagelevelid</code>.
     */
    public void setLanguagelevelid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_languagelevel.languagelevelid</code>.
     */
    public Byte getLanguagelevelid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_languagelevel.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_languagelevel.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_languagelevel.languagelevelname</code>.
     */
    public void setLanguagelevelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_languagelevel.languagelevelname</code>.
     */
    public String getLanguagelevelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_languagelevel.languagelevelorder</code>.
     */
    public void setLanguagelevelorder(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_languagelevel.languagelevelorder</code>.
     */
    public Byte getLanguagelevelorder() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Byte, Byte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Byte, Byte, String, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Byte, Byte, String, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefLanguagelevel.TBLREF_LANGUAGELEVEL.LANGUAGELEVELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefLanguagelevel.TBLREF_LANGUAGELEVEL.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefLanguagelevel.TBLREF_LANGUAGELEVEL.LANGUAGELEVELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblrefLanguagelevel.TBLREF_LANGUAGELEVEL.LANGUAGELEVELORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getLanguagelevelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLanguagelevelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getLanguagelevelorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefLanguagelevelRecord value1(Byte value) {
        setLanguagelevelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefLanguagelevelRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefLanguagelevelRecord value3(String value) {
        setLanguagelevelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefLanguagelevelRecord value4(Byte value) {
        setLanguagelevelorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefLanguagelevelRecord values(Byte value1, Byte value2, String value3, Byte value4) {
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
     * Create a detached TblrefLanguagelevelRecord
     */
    public TblrefLanguagelevelRecord() {
        super(TblrefLanguagelevel.TBLREF_LANGUAGELEVEL);
    }

    /**
     * Create a detached, initialised TblrefLanguagelevelRecord
     */
    public TblrefLanguagelevelRecord(Byte languagelevelid, Byte languageid, String languagelevelname, Byte languagelevelorder) {
        super(TblrefLanguagelevel.TBLREF_LANGUAGELEVEL);

        set(0, languagelevelid);
        set(1, languageid);
        set(2, languagelevelname);
        set(3, languagelevelorder);
    }
}