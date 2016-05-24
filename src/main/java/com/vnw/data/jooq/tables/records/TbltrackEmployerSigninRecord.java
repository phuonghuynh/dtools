/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbltrackEmployerSignin;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class TbltrackEmployerSigninRecord extends UpdatableRecordImpl<TbltrackEmployerSigninRecord> implements Record4<Integer, String, Integer, Timestamp> {

    private static final long serialVersionUID = 52976386;

    /**
     * Setter for <code>vnw_core.tbltrack_employer_signin.trackid</code>.
     */
    public void setTrackid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_employer_signin.trackid</code>.
     */
    public Integer getTrackid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_employer_signin.ipaddress</code>.
     */
    public void setIpaddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_employer_signin.ipaddress</code>.
     */
    public String getIpaddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_employer_signin.userid</code>.
     */
    public void setUserid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_employer_signin.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_employer_signin.createdate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_employer_signin.createdate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TbltrackEmployerSignin.TBLTRACK_EMPLOYER_SIGNIN.TRACKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbltrackEmployerSignin.TBLTRACK_EMPLOYER_SIGNIN.IPADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TbltrackEmployerSignin.TBLTRACK_EMPLOYER_SIGNIN.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbltrackEmployerSignin.TBLTRACK_EMPLOYER_SIGNIN.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTrackid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIpaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackEmployerSigninRecord value1(Integer value) {
        setTrackid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackEmployerSigninRecord value2(String value) {
        setIpaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackEmployerSigninRecord value3(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackEmployerSigninRecord value4(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackEmployerSigninRecord values(Integer value1, String value2, Integer value3, Timestamp value4) {
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
     * Create a detached TbltrackEmployerSigninRecord
     */
    public TbltrackEmployerSigninRecord() {
        super(TbltrackEmployerSignin.TBLTRACK_EMPLOYER_SIGNIN);
    }

    /**
     * Create a detached, initialised TbltrackEmployerSigninRecord
     */
    public TbltrackEmployerSigninRecord(Integer trackid, String ipaddress, Integer userid, Timestamp createdate) {
        super(TbltrackEmployerSignin.TBLTRACK_EMPLOYER_SIGNIN);

        set(0, trackid);
        set(1, ipaddress);
        set(2, userid);
        set(3, createdate);
    }
}
