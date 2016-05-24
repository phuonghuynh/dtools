/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblappVersion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


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
public class TblappVersionRecord extends UpdatableRecordImpl<TblappVersionRecord> implements Record6<UShort, String, UByte, String, Timestamp, String> {

    private static final long serialVersionUID = 1277582894;

    /**
     * Setter for <code>vnw_core.tblapp_version.id</code>.
     */
    public void setId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblapp_version.id</code>.
     */
    public UShort getId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblapp_version.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblapp_version.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblapp_version.appType</code>.
     */
    public void setApptype(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblapp_version.appType</code>.
     */
    public UByte getApptype() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblapp_version.os</code>.
     */
    public void setOs(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblapp_version.os</code>.
     */
    public String getOs() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblapp_version.applyTime</code>.
     */
    public void setApplytime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblapp_version.applyTime</code>.
     */
    public Timestamp getApplytime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblapp_version.descr</code>.
     */
    public void setDescr(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblapp_version.descr</code>.
     */
    public String getDescr() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UShort, String, UByte, String, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UShort, String, UByte, String, Timestamp, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return TblappVersion.TBLAPP_VERSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblappVersion.TBLAPP_VERSION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TblappVersion.TBLAPP_VERSION.APPTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblappVersion.TBLAPP_VERSION.OS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblappVersion.TBLAPP_VERSION.APPLYTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblappVersion.TBLAPP_VERSION.DESCR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getApptype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getApplytime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord value1(UShort value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord value3(UByte value) {
        setApptype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord value4(String value) {
        setOs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord value5(Timestamp value) {
        setApplytime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord value6(String value) {
        setDescr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblappVersionRecord values(UShort value1, String value2, UByte value3, String value4, Timestamp value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblappVersionRecord
     */
    public TblappVersionRecord() {
        super(TblappVersion.TBLAPP_VERSION);
    }

    /**
     * Create a detached, initialised TblappVersionRecord
     */
    public TblappVersionRecord(UShort id, String name, UByte apptype, String os, Timestamp applytime, String descr) {
        super(TblappVersion.TBLAPP_VERSION);

        set(0, id);
        set(1, name);
        set(2, apptype);
        set(3, os);
        set(4, applytime);
        set(5, descr);
    }
}
