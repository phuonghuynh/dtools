/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.Tblmailer;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TblmailerRecord extends UpdatableRecordImpl<TblmailerRecord> implements Record11<Integer, String, String, String, Byte, Short, Timestamp, Timestamp, String, Byte, Byte> {

    private static final long serialVersionUID = 237604124;

    /**
     * Setter for <code>vnw_core.tblmailer.subscriberid</code>.
     */
    public void setSubscriberid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.subscriberid</code>.
     */
    public Integer getSubscriberid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.subscriberemail</code>.
     */
    public void setSubscriberemail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.subscriberemail</code>.
     */
    public String getSubscriberemail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.firstname</code>.
     */
    public void setFirstname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.lastname</code>.
     */
    public void setLastname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.lastname</code>.
     */
    public String getLastname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.genderid</code>.
     */
    public void setGenderid(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.genderid</code>.
     */
    public Byte getGenderid() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.ageid</code>.
     */
    public void setAgeid(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.ageid</code>.
     */
    public Short getAgeid() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.dateupdate</code>.
     */
    public void setDateupdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.dateupdate</code>.
     */
    public Timestamp getDateupdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.keysent</code>.
     */
    public void setKeysent(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.keysent</code>.
     */
    public String getKeysent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.ischecked</code>.
     */
    public void setIschecked(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.ischecked</code>.
     */
    public Byte getIschecked() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblmailer.isactive</code>.
     */
    public void setIsactive(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblmailer.isactive</code>.
     */
    public Byte getIsactive() {
        return (Byte) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Byte, Short, Timestamp, Timestamp, String, Byte, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Byte, Short, Timestamp, Timestamp, String, Byte, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tblmailer.TBLMAILER.SUBSCRIBERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tblmailer.TBLMAILER.SUBSCRIBEREMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tblmailer.TBLMAILER.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tblmailer.TBLMAILER.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Tblmailer.TBLMAILER.GENDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Tblmailer.TBLMAILER.AGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Tblmailer.TBLMAILER.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Tblmailer.TBLMAILER.DATEUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Tblmailer.TBLMAILER.KEYSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return Tblmailer.TBLMAILER.ISCHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return Tblmailer.TBLMAILER.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSubscriberid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSubscriberemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getGenderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getAgeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getDateupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getKeysent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIschecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value1(Integer value) {
        setSubscriberid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value2(String value) {
        setSubscriberemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value4(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value5(Byte value) {
        setGenderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value6(Short value) {
        setAgeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value7(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value8(Timestamp value) {
        setDateupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value9(String value) {
        setKeysent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value10(Byte value) {
        setIschecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord value11(Byte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerRecord values(Integer value1, String value2, String value3, String value4, Byte value5, Short value6, Timestamp value7, Timestamp value8, String value9, Byte value10, Byte value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblmailerRecord
     */
    public TblmailerRecord() {
        super(Tblmailer.TBLMAILER);
    }

    /**
     * Create a detached, initialised TblmailerRecord
     */
    public TblmailerRecord(Integer subscriberid, String subscriberemail, String firstname, String lastname, Byte genderid, Short ageid, Timestamp createddate, Timestamp dateupdate, String keysent, Byte ischecked, Byte isactive) {
        super(Tblmailer.TBLMAILER);

        set(0, subscriberid);
        set(1, subscriberemail);
        set(2, firstname);
        set(3, lastname);
        set(4, genderid);
        set(5, ageid);
        set(6, createddate);
        set(7, dateupdate);
        set(8, keysent);
        set(9, ischecked);
        set(10, isactive);
    }
}
