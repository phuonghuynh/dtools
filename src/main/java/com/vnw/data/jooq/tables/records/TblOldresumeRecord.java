/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblOldresume;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TblOldresumeRecord extends UpdatableRecordImpl<TblOldresumeRecord> implements Record7<Integer, Integer, Timestamp, Integer, Timestamp, Integer, String> {

    private static final long serialVersionUID = 768717433;

    /**
     * Setter for <code>vnw_core.tbl_oldresume.userid</code>.
     */
    public void setUserid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbl_oldresume.resumeid</code>.
     */
    public void setResumeid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.resumeid</code>.
     */
    public Integer getResumeid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbl_oldresume.lastdateupdated</code>.
     */
    public void setLastdateupdated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.lastdateupdated</code>.
     */
    public Timestamp getLastdateupdated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbl_oldresume.confirm</code>.
     */
    public void setConfirm(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.confirm</code>.
     */
    public Integer getConfirm() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbl_oldresume.sentdate</code>.
     */
    public void setSentdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.sentdate</code>.
     */
    public Timestamp getSentdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbl_oldresume.valid</code>.
     */
    public void setValid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.valid</code>.
     */
    public Integer getValid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbl_oldresume.senttype</code>.
     */
    public void setSenttype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_oldresume.senttype</code>.
     */
    public String getSenttype() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Timestamp> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Timestamp, Integer, Timestamp, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Timestamp, Integer, Timestamp, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblOldresume.TBL_OLDRESUME.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblOldresume.TBL_OLDRESUME.RESUMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TblOldresume.TBL_OLDRESUME.LASTDATEUPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblOldresume.TBL_OLDRESUME.CONFIRM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblOldresume.TBL_OLDRESUME.SENTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TblOldresume.TBL_OLDRESUME.VALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblOldresume.TBL_OLDRESUME.SENTTYPE;
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
    public Integer value2() {
        return getResumeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastdateupdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getConfirm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getSentdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSenttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value1(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value2(Integer value) {
        setResumeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value3(Timestamp value) {
        setLastdateupdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value4(Integer value) {
        setConfirm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value5(Timestamp value) {
        setSentdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value6(Integer value) {
        setValid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord value7(String value) {
        setSenttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblOldresumeRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4, Timestamp value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblOldresumeRecord
     */
    public TblOldresumeRecord() {
        super(TblOldresume.TBL_OLDRESUME);
    }

    /**
     * Create a detached, initialised TblOldresumeRecord
     */
    public TblOldresumeRecord(Integer userid, Integer resumeid, Timestamp lastdateupdated, Integer confirm, Timestamp sentdate, Integer valid, String senttype) {
        super(TblOldresume.TBL_OLDRESUME);

        set(0, userid);
        set(1, resumeid);
        set(2, lastdateupdated);
        set(3, confirm);
        set(4, sentdate);
        set(5, valid);
        set(6, senttype);
    }
}