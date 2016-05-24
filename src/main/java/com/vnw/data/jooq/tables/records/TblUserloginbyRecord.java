/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblUserloginby;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TblUserloginbyRecord extends UpdatableRecordImpl<TblUserloginbyRecord> implements Record5<Integer, Byte, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = -1647019622;

    /**
     * Setter for <code>vnw_core.tbl_userloginby.userid</code>.
     */
    public void setUserid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_userloginby.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbl_userloginby.loginbyid</code>.  1: vietnamworks  2: Facebook  3: Google  4: Linkedin 
     */
    public void setLoginbyid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_userloginby.loginbyid</code>.  1: vietnamworks  2: Facebook  3: Google  4: Linkedin 
     */
    public Byte getLoginbyid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbl_userloginby.createddate</code>.  First day of login by other account
     */
    public void setCreateddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_userloginby.createddate</code>.  First day of login by other account
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbl_userloginby.lastdatelogin</code>.  the last login date by other account
     */
    public void setLastdatelogin(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_userloginby.lastdatelogin</code>.  the last login date by other account
     */
    public Timestamp getLastdatelogin() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbl_userloginby.isrealuser</code>. 1 : yes 0: no  -- set 1 when this account signed up successfully or updated profile in tblregistrationinfo
     */
    public void setIsrealuser(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_userloginby.isrealuser</code>. 1 : yes 0: no  -- set 1 when this account signed up successfully or updated profile in tblregistrationinfo
     */
    public Byte getIsrealuser() {
        return (Byte) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Byte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Byte, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Byte, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblUserloginby.TBL_USERLOGINBY.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblUserloginby.TBL_USERLOGINBY.LOGINBYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TblUserloginby.TBL_USERLOGINBY.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TblUserloginby.TBL_USERLOGINBY.LASTDATELOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblUserloginby.TBL_USERLOGINBY.ISREALUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getLoginbyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastdatelogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsrealuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginbyRecord value1(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginbyRecord value2(Byte value) {
        setLoginbyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginbyRecord value3(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginbyRecord value4(Timestamp value) {
        setLastdatelogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginbyRecord value5(Byte value) {
        setIsrealuser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginbyRecord values(Integer value1, Byte value2, Timestamp value3, Timestamp value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblUserloginbyRecord
     */
    public TblUserloginbyRecord() {
        super(TblUserloginby.TBL_USERLOGINBY);
    }

    /**
     * Create a detached, initialised TblUserloginbyRecord
     */
    public TblUserloginbyRecord(Integer userid, Byte loginbyid, Timestamp createddate, Timestamp lastdatelogin, Byte isrealuser) {
        super(TblUserloginby.TBL_USERLOGINBY);

        set(0, userid);
        set(1, loginbyid);
        set(2, createddate);
        set(3, lastdatelogin);
        set(4, isrealuser);
    }
}