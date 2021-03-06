/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblmsUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TblmsUserRecord extends UpdatableRecordImpl<TblmsUserRecord> implements Record6<UInteger, String, Timestamp, String, Byte, UInteger> {

    private static final long serialVersionUID = -1012213494;

    /**
     * Setter for <code>vnw_core.tblms_user.userid</code>.
     */
    public void setUserid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblms_user.userid</code>.
     */
    public UInteger getUserid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblms_user.siteName</code>.
     */
    public void setSitename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblms_user.siteName</code>.
     */
    public String getSitename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblms_user.registerDate</code>. Same createddate for user register via microsite, diff for old user update require info for microsite
     */
    public void setRegisterdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblms_user.registerDate</code>. Same createddate for user register via microsite, diff for old user update require info for microsite
     */
    public Timestamp getRegisterdate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblms_user.descr</code>.
     */
    public void setDescr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblms_user.descr</code>.
     */
    public String getDescr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblms_user.status</code>. 1:active; 0: inactive
     */
    public void setStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblms_user.status</code>. 1:active; 0: inactive
     */
    public Byte getStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblms_user.djCount</code>.
     */
    public void setDjcount(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblms_user.djCount</code>.
     */
    public UInteger getDjcount() {
        return (UInteger) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UInteger, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, Timestamp, String, Byte, UInteger> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, Timestamp, String, Byte, UInteger> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblmsUser.TBLMS_USER.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblmsUser.TBLMS_USER.SITENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TblmsUser.TBLMS_USER.REGISTERDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblmsUser.TBLMS_USER.DESCR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblmsUser.TBLMS_USER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return TblmsUser.TBLMS_USER.DJCOUNT;
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
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getRegisterdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getDjcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord value1(UInteger value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord value2(String value) {
        setSitename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord value3(Timestamp value) {
        setRegisterdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord value4(String value) {
        setDescr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord value5(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord value6(UInteger value) {
        setDjcount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmsUserRecord values(UInteger value1, String value2, Timestamp value3, String value4, Byte value5, UInteger value6) {
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
     * Create a detached TblmsUserRecord
     */
    public TblmsUserRecord() {
        super(TblmsUser.TBLMS_USER);
    }

    /**
     * Create a detached, initialised TblmsUserRecord
     */
    public TblmsUserRecord(UInteger userid, String sitename, Timestamp registerdate, String descr, Byte status, UInteger djcount) {
        super(TblmsUser.TBLMS_USER);

        set(0, userid);
        set(1, sitename);
        set(2, registerdate);
        set(3, descr);
        set(4, status);
        set(5, djcount);
    }
}
