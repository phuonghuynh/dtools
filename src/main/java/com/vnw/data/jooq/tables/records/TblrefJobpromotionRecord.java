/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefJobpromotion;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


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
public class TblrefJobpromotionRecord extends UpdatableRecordImpl<TblrefJobpromotionRecord> implements Record6<UByte, UByte, String, String, String, UByte> {

    private static final long serialVersionUID = 577283043;

    /**
     * Setter for <code>vnw_core.tblref_jobpromotion.jobpromotionid</code>.
     */
    public void setJobpromotionid(UByte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobpromotion.jobpromotionid</code>.
     */
    public UByte getJobpromotionid() {
        return (UByte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobpromotion.languageid</code>.
     */
    public void setLanguageid(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobpromotion.languageid</code>.
     */
    public UByte getLanguageid() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobpromotion.jobpromotionname</code>.
     */
    public void setJobpromotionname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobpromotion.jobpromotionname</code>.
     */
    public String getJobpromotionname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobpromotion.jobpromotiontagline</code>.
     */
    public void setJobpromotiontagline(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobpromotion.jobpromotiontagline</code>.
     */
    public String getJobpromotiontagline() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobpromotion.jobpromotioninsidepage</code>.
     */
    public void setJobpromotioninsidepage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobpromotion.jobpromotioninsidepage</code>.
     */
    public String getJobpromotioninsidepage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobpromotion.jobpromotionorder</code>.
     */
    public void setJobpromotionorder(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobpromotion.jobpromotionorder</code>.
     */
    public UByte getJobpromotionorder() {
        return (UByte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UByte, UByte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UByte, UByte, String, String, String, UByte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UByte, UByte, String, String, String, UByte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field1() {
        return TblrefJobpromotion.TBLREF_JOBPROMOTION.JOBPROMOTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return TblrefJobpromotion.TBLREF_JOBPROMOTION.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefJobpromotion.TBLREF_JOBPROMOTION.JOBPROMOTIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefJobpromotion.TBLREF_JOBPROMOTION.JOBPROMOTIONTAGLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblrefJobpromotion.TBLREF_JOBPROMOTION.JOBPROMOTIONINSIDEPAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return TblrefJobpromotion.TBLREF_JOBPROMOTION.JOBPROMOTIONORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value1() {
        return getJobpromotionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value2() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getJobpromotionname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getJobpromotiontagline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getJobpromotioninsidepage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getJobpromotionorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord value1(UByte value) {
        setJobpromotionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord value2(UByte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord value3(String value) {
        setJobpromotionname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord value4(String value) {
        setJobpromotiontagline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord value5(String value) {
        setJobpromotioninsidepage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord value6(UByte value) {
        setJobpromotionorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotionRecord values(UByte value1, UByte value2, String value3, String value4, String value5, UByte value6) {
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
     * Create a detached TblrefJobpromotionRecord
     */
    public TblrefJobpromotionRecord() {
        super(TblrefJobpromotion.TBLREF_JOBPROMOTION);
    }

    /**
     * Create a detached, initialised TblrefJobpromotionRecord
     */
    public TblrefJobpromotionRecord(UByte jobpromotionid, UByte languageid, String jobpromotionname, String jobpromotiontagline, String jobpromotioninsidepage, UByte jobpromotionorder) {
        super(TblrefJobpromotion.TBLREF_JOBPROMOTION);

        set(0, jobpromotionid);
        set(1, languageid);
        set(2, jobpromotionname);
        set(3, jobpromotiontagline);
        set(4, jobpromotioninsidepage);
        set(5, jobpromotionorder);
    }
}
