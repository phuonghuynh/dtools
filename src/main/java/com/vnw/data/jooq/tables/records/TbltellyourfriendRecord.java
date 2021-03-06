/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.Tbltellyourfriend;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TbltellyourfriendRecord extends UpdatableRecordImpl<TbltellyourfriendRecord> implements Record6<Integer, Byte, String, String, String, Timestamp> {

    private static final long serialVersionUID = -714712132;

    /**
     * Setter for <code>vnw_core.tbltellyourfriend.entryid</code>.
     */
    public void setEntryid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbltellyourfriend.entryid</code>.
     */
    public Integer getEntryid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbltellyourfriend.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbltellyourfriend.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbltellyourfriend.sendername</code>.
     */
    public void setSendername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbltellyourfriend.sendername</code>.
     */
    public String getSendername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbltellyourfriend.senderemail</code>.
     */
    public void setSenderemail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbltellyourfriend.senderemail</code>.
     */
    public String getSenderemail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbltellyourfriend.recipientemail</code>.
     */
    public void setRecipientemail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbltellyourfriend.recipientemail</code>.
     */
    public String getRecipientemail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbltellyourfriend.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbltellyourfriend.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Byte, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Byte, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tbltellyourfriend.TBLTELLYOURFRIEND.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return Tbltellyourfriend.TBLTELLYOURFRIEND.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tbltellyourfriend.TBLTELLYOURFRIEND.SENDERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tbltellyourfriend.TBLTELLYOURFRIEND.SENDEREMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tbltellyourfriend.TBLTELLYOURFRIEND.RECIPIENTEMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Tbltellyourfriend.TBLTELLYOURFRIEND.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEntryid();
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
        return getSendername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSenderemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRecipientemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord value1(Integer value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord value3(String value) {
        setSendername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord value4(String value) {
        setSenderemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord value5(String value) {
        setRecipientemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord value6(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltellyourfriendRecord values(Integer value1, Byte value2, String value3, String value4, String value5, Timestamp value6) {
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
     * Create a detached TbltellyourfriendRecord
     */
    public TbltellyourfriendRecord() {
        super(Tbltellyourfriend.TBLTELLYOURFRIEND);
    }

    /**
     * Create a detached, initialised TbltellyourfriendRecord
     */
    public TbltellyourfriendRecord(Integer entryid, Byte languageid, String sendername, String senderemail, String recipientemail, Timestamp createddate) {
        super(Tbltellyourfriend.TBLTELLYOURFRIEND);

        set(0, entryid);
        set(1, languageid);
        set(2, sendername);
        set(3, senderemail);
        set(4, recipientemail);
        set(5, createddate);
    }
}
