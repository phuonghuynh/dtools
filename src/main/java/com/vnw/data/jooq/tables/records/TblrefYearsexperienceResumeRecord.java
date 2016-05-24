/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefYearsexperienceResume;

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
public class TblrefYearsexperienceResumeRecord extends UpdatableRecordImpl<TblrefYearsexperienceResumeRecord> implements Record4<Byte, Byte, String, Byte> {

    private static final long serialVersionUID = -1687868569;

    /**
     * Setter for <code>vnw_core.tblref_yearsexperience_resume.yearsexperienceid</code>.
     */
    public void setYearsexperienceid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_yearsexperience_resume.yearsexperienceid</code>.
     */
    public Byte getYearsexperienceid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_yearsexperience_resume.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_yearsexperience_resume.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_yearsexperience_resume.yearsexperiencename</code>.
     */
    public void setYearsexperiencename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_yearsexperience_resume.yearsexperiencename</code>.
     */
    public String getYearsexperiencename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_yearsexperience_resume.yearsexperienceorder</code>.
     */
    public void setYearsexperienceorder(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_yearsexperience_resume.yearsexperienceorder</code>.
     */
    public Byte getYearsexperienceorder() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Byte, Byte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Byte, Byte, String, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Byte, Byte, String, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefYearsexperienceResume.TBLREF_YEARSEXPERIENCE_RESUME.YEARSEXPERIENCEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefYearsexperienceResume.TBLREF_YEARSEXPERIENCE_RESUME.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefYearsexperienceResume.TBLREF_YEARSEXPERIENCE_RESUME.YEARSEXPERIENCENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblrefYearsexperienceResume.TBLREF_YEARSEXPERIENCE_RESUME.YEARSEXPERIENCEORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getYearsexperienceid();
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
        return getYearsexperiencename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getYearsexperienceorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperienceResumeRecord value1(Byte value) {
        setYearsexperienceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperienceResumeRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperienceResumeRecord value3(String value) {
        setYearsexperiencename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperienceResumeRecord value4(Byte value) {
        setYearsexperienceorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperienceResumeRecord values(Byte value1, Byte value2, String value3, Byte value4) {
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
     * Create a detached TblrefYearsexperienceResumeRecord
     */
    public TblrefYearsexperienceResumeRecord() {
        super(TblrefYearsexperienceResume.TBLREF_YEARSEXPERIENCE_RESUME);
    }

    /**
     * Create a detached, initialised TblrefYearsexperienceResumeRecord
     */
    public TblrefYearsexperienceResumeRecord(Byte yearsexperienceid, Byte languageid, String yearsexperiencename, Byte yearsexperienceorder) {
        super(TblrefYearsexperienceResume.TBLREF_YEARSEXPERIENCE_RESUME);

        set(0, yearsexperienceid);
        set(1, languageid);
        set(2, yearsexperiencename);
        set(3, yearsexperienceorder);
    }
}