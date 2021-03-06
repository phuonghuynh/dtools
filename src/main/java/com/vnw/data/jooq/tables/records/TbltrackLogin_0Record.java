/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbltrackLogin_0;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


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
public class TbltrackLogin_0Record extends TableRecordImpl<TbltrackLogin_0Record> implements Record6<UInteger, String, UByte, Timestamp, String, Byte> {

    private static final long serialVersionUID = 118368632;

    /**
     * Setter for <code>vnw_core.tbltrack_login_0.userid</code>.
     */
    public void setUserid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login_0.userid</code>.
     */
    public UInteger getUserid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login_0.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login_0.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login_0.youareid</code>.
     */
    public void setYouareid(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login_0.youareid</code>.
     */
    public UByte getYouareid() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login_0.loginTime</code>.
     */
    public void setLogintime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login_0.loginTime</code>.
     */
    public Timestamp getLogintime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login_0.sessionId</code>.
     */
    public void setSessionid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login_0.sessionId</code>.
     */
    public String getSessionid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login_0.loginbyid</code>.  1: vietnamworks  2: Facebook  3: Google  4: Linkedin 
     */
    public void setLoginbyid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login_0.loginbyid</code>.  1: vietnamworks  2: Facebook  3: Google  4: Linkedin 
     */
    public Byte getLoginbyid() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, UByte, Timestamp, String, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, UByte, Timestamp, String, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbltrackLogin_0.TBLTRACK_LOGIN_0.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbltrackLogin_0.TBLTRACK_LOGIN_0.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TbltrackLogin_0.TBLTRACK_LOGIN_0.YOUAREID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbltrackLogin_0.TBLTRACK_LOGIN_0.LOGINTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbltrackLogin_0.TBLTRACK_LOGIN_0.SESSIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TbltrackLogin_0.TBLTRACK_LOGIN_0.LOGINBYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getYouareid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLogintime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSessionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getLoginbyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record value1(UInteger value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record value3(UByte value) {
        setYouareid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record value4(Timestamp value) {
        setLogintime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record value5(String value) {
        setSessionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record value6(Byte value) {
        setLoginbyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLogin_0Record values(UInteger value1, String value2, UByte value3, Timestamp value4, String value5, Byte value6) {
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
     * Create a detached TbltrackLogin_0Record
     */
    public TbltrackLogin_0Record() {
        super(TbltrackLogin_0.TBLTRACK_LOGIN_0);
    }

    /**
     * Create a detached, initialised TbltrackLogin_0Record
     */
    public TbltrackLogin_0Record(UInteger userid, String username, UByte youareid, Timestamp logintime, String sessionid, Byte loginbyid) {
        super(TbltrackLogin_0.TBLTRACK_LOGIN_0);

        set(0, userid);
        set(1, username);
        set(2, youareid);
        set(3, logintime);
        set(4, sessionid);
        set(5, loginbyid);
    }
}
