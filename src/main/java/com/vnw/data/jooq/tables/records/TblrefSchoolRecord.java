/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefSchool;

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
public class TblrefSchoolRecord extends UpdatableRecordImpl<TblrefSchoolRecord> implements Record4<Short, Byte, String, Short> {

    private static final long serialVersionUID = 2053895869;

    /**
     * Setter for <code>vnw_core.tblref_school.schoolid</code>.
     */
    public void setSchoolid(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_school.schoolid</code>.
     */
    public Short getSchoolid() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_school.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_school.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_school.schoolname</code>.
     */
    public void setSchoolname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_school.schoolname</code>.
     */
    public String getSchoolname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_school.schoolorder</code>.
     */
    public void setSchoolorder(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_school.schoolorder</code>.
     */
    public Short getSchoolorder() {
        return (Short) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Short, Byte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Byte, String, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Byte, String, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return TblrefSchool.TBLREF_SCHOOL.SCHOOLID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefSchool.TBLREF_SCHOOL.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefSchool.TBLREF_SCHOOL.SCHOOLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TblrefSchool.TBLREF_SCHOOL.SCHOOLORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getSchoolid();
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
        return getSchoolname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getSchoolorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSchoolRecord value1(Short value) {
        setSchoolid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSchoolRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSchoolRecord value3(String value) {
        setSchoolname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSchoolRecord value4(Short value) {
        setSchoolorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSchoolRecord values(Short value1, Byte value2, String value3, Short value4) {
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
     * Create a detached TblrefSchoolRecord
     */
    public TblrefSchoolRecord() {
        super(TblrefSchool.TBLREF_SCHOOL);
    }

    /**
     * Create a detached, initialised TblrefSchoolRecord
     */
    public TblrefSchoolRecord(Short schoolid, Byte languageid, String schoolname, Short schoolorder) {
        super(TblrefSchool.TBLREF_SCHOOL);

        set(0, schoolid);
        set(1, languageid);
        set(2, schoolname);
        set(3, schoolorder);
    }
}
