/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefPublication;

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
public class TblrefPublicationRecord extends UpdatableRecordImpl<TblrefPublicationRecord> implements Record4<Byte, Byte, String, Byte> {

    private static final long serialVersionUID = -1462720089;

    /**
     * Setter for <code>vnw_core.tblref_publication.publicationid</code>.
     */
    public void setPublicationid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_publication.publicationid</code>.
     */
    public Byte getPublicationid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_publication.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_publication.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_publication.publicationname</code>.
     */
    public void setPublicationname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_publication.publicationname</code>.
     */
    public String getPublicationname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_publication.publicationorder</code>.
     */
    public void setPublicationorder(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_publication.publicationorder</code>.
     */
    public Byte getPublicationorder() {
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
        return TblrefPublication.TBLREF_PUBLICATION.PUBLICATIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefPublication.TBLREF_PUBLICATION.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefPublication.TBLREF_PUBLICATION.PUBLICATIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblrefPublication.TBLREF_PUBLICATION.PUBLICATIONORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getPublicationid();
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
        return getPublicationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getPublicationorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefPublicationRecord value1(Byte value) {
        setPublicationid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefPublicationRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefPublicationRecord value3(String value) {
        setPublicationname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefPublicationRecord value4(Byte value) {
        setPublicationorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefPublicationRecord values(Byte value1, Byte value2, String value3, Byte value4) {
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
     * Create a detached TblrefPublicationRecord
     */
    public TblrefPublicationRecord() {
        super(TblrefPublication.TBLREF_PUBLICATION);
    }

    /**
     * Create a detached, initialised TblrefPublicationRecord
     */
    public TblrefPublicationRecord(Byte publicationid, Byte languageid, String publicationname, Byte publicationorder) {
        super(TblrefPublication.TBLREF_PUBLICATION);

        set(0, publicationid);
        set(1, languageid);
        set(2, publicationname);
        set(3, publicationorder);
    }
}
