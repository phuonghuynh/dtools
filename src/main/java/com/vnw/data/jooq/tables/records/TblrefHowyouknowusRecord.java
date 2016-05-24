/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefHowyouknowus;

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
public class TblrefHowyouknowusRecord extends UpdatableRecordImpl<TblrefHowyouknowusRecord> implements Record4<Byte, Byte, String, Byte> {

    private static final long serialVersionUID = -1671312003;

    /**
     * Setter for <code>vnw_core.tblref_howyouknowus.howyouknowusid</code>.
     */
    public void setHowyouknowusid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_howyouknowus.howyouknowusid</code>.
     */
    public Byte getHowyouknowusid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_howyouknowus.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_howyouknowus.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_howyouknowus.howyouknowusname</code>.
     */
    public void setHowyouknowusname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_howyouknowus.howyouknowusname</code>.
     */
    public String getHowyouknowusname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_howyouknowus.howyouknowusorder</code>.
     */
    public void setHowyouknowusorder(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_howyouknowus.howyouknowusorder</code>.
     */
    public Byte getHowyouknowusorder() {
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
        return TblrefHowyouknowus.TBLREF_HOWYOUKNOWUS.HOWYOUKNOWUSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefHowyouknowus.TBLREF_HOWYOUKNOWUS.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefHowyouknowus.TBLREF_HOWYOUKNOWUS.HOWYOUKNOWUSNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblrefHowyouknowus.TBLREF_HOWYOUKNOWUS.HOWYOUKNOWUSORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getHowyouknowusid();
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
        return getHowyouknowusname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getHowyouknowusorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHowyouknowusRecord value1(Byte value) {
        setHowyouknowusid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHowyouknowusRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHowyouknowusRecord value3(String value) {
        setHowyouknowusname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHowyouknowusRecord value4(Byte value) {
        setHowyouknowusorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHowyouknowusRecord values(Byte value1, Byte value2, String value3, Byte value4) {
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
     * Create a detached TblrefHowyouknowusRecord
     */
    public TblrefHowyouknowusRecord() {
        super(TblrefHowyouknowus.TBLREF_HOWYOUKNOWUS);
    }

    /**
     * Create a detached, initialised TblrefHowyouknowusRecord
     */
    public TblrefHowyouknowusRecord(Byte howyouknowusid, Byte languageid, String howyouknowusname, Byte howyouknowusorder) {
        super(TblrefHowyouknowus.TBLREF_HOWYOUKNOWUS);

        set(0, howyouknowusid);
        set(1, languageid);
        set(2, howyouknowusname);
        set(3, howyouknowusorder);
    }
}
