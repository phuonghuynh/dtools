/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblemployerTemplateDefault;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TblemployerTemplateDefaultRecord extends UpdatableRecordImpl<TblemployerTemplateDefaultRecord> implements Record8<Byte, Byte, String, Byte, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 780326072;

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.defaulttemplateid</code>.
     */
    public void setDefaulttemplateid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.defaulttemplateid</code>.
     */
    public Byte getDefaulttemplateid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.languageid</code>. 1:VN; 2: EN
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.languageid</code>. 1:VN; 2: EN
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.templatetitle</code>.
     */
    public void setTemplatetitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.templatetitle</code>.
     */
    public String getTemplatetitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.templatetypeid</code>. AS templatetypeid in tblemployer_template
     */
    public void setTemplatetypeid(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.templatetypeid</code>. AS templatetypeid in tblemployer_template
     */
    public Byte getTemplatetypeid() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.templatesubject</code>.
     */
    public void setTemplatesubject(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.templatesubject</code>.
     */
    public String getTemplatesubject() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.templatecontent</code>.
     */
    public void setTemplatecontent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.templatecontent</code>.
     */
    public String getTemplatecontent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_template_default.updateddate</code>.
     */
    public void setUpdateddate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_template_default.updateddate</code>.
     */
    public Timestamp getUpdateddate() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Byte, Byte, String, Byte, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Byte, Byte, String, Byte, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.DEFAULTTEMPLATEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.TEMPLATETITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.TEMPLATETYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.TEMPLATESUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.TEMPLATECONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT.UPDATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getDefaulttemplateid();
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
        return getTemplatetitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getTemplatetypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTemplatesubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTemplatecontent();
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
        return getUpdateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value1(Byte value) {
        setDefaulttemplateid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value3(String value) {
        setTemplatetitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value4(Byte value) {
        setTemplatetypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value5(String value) {
        setTemplatesubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value6(String value) {
        setTemplatecontent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value7(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord value8(Timestamp value) {
        setUpdateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerTemplateDefaultRecord values(Byte value1, Byte value2, String value3, Byte value4, String value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblemployerTemplateDefaultRecord
     */
    public TblemployerTemplateDefaultRecord() {
        super(TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT);
    }

    /**
     * Create a detached, initialised TblemployerTemplateDefaultRecord
     */
    public TblemployerTemplateDefaultRecord(Byte defaulttemplateid, Byte languageid, String templatetitle, Byte templatetypeid, String templatesubject, String templatecontent, Timestamp createddate, Timestamp updateddate) {
        super(TblemployerTemplateDefault.TBLEMPLOYER_TEMPLATE_DEFAULT);

        set(0, defaulttemplateid);
        set(1, languageid);
        set(2, templatetitle);
        set(3, templatetypeid);
        set(4, templatesubject);
        set(5, templatecontent);
        set(6, createddate);
        set(7, updateddate);
    }
}
