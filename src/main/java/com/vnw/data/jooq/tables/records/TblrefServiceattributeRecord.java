/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefServiceattribute;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class TblrefServiceattributeRecord extends UpdatableRecordImpl<TblrefServiceattributeRecord> implements Record8<Integer, String, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = 2135533996;

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_id</code>.
     */
    public void setAttrId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_id</code>.
     */
    public Integer getAttrId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_codetable</code>.
     */
    public void setAttrCodetable(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_codetable</code>.
     */
    public String getAttrCodetable() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_desctable</code>.
     */
    public void setAttrDesctable(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_desctable</code>.
     */
    public String getAttrDesctable() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_namefield</code>.
     */
    public void setAttrNamefield(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_namefield</code>.
     */
    public String getAttrNamefield() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_idfield</code>.
     */
    public void setAttrIdfield(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_idfield</code>.
     */
    public String getAttrIdfield() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_langfield</code>.
     */
    public void setAttrLangfield(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_langfield</code>.
     */
    public String getAttrLangfield() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_orderfield</code>.
     */
    public void setAttrOrderfield(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_orderfield</code>.
     */
    public String getAttrOrderfield() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblref_serviceattribute.attr_issync</code>.
     */
    public void setAttrIssync(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_serviceattribute.attr_issync</code>.
     */
    public Integer getAttrIssync() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_CODETABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_DESCTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_NAMEFIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_IDFIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_LANGFIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_ORDERFIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE.ATTR_ISSYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAttrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAttrCodetable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAttrDesctable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAttrNamefield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAttrIdfield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAttrLangfield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAttrOrderfield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAttrIssync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value1(Integer value) {
        setAttrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value2(String value) {
        setAttrCodetable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value3(String value) {
        setAttrDesctable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value4(String value) {
        setAttrNamefield(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value5(String value) {
        setAttrIdfield(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value6(String value) {
        setAttrLangfield(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value7(String value) {
        setAttrOrderfield(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord value8(Integer value) {
        setAttrIssync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributeRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8) {
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
     * Create a detached TblrefServiceattributeRecord
     */
    public TblrefServiceattributeRecord() {
        super(TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE);
    }

    /**
     * Create a detached, initialised TblrefServiceattributeRecord
     */
    public TblrefServiceattributeRecord(Integer attrId, String attrCodetable, String attrDesctable, String attrNamefield, String attrIdfield, String attrLangfield, String attrOrderfield, Integer attrIssync) {
        super(TblrefServiceattribute.TBLREF_SERVICEATTRIBUTE);

        set(0, attrId);
        set(1, attrCodetable);
        set(2, attrDesctable);
        set(3, attrNamefield);
        set(4, attrIdfield);
        set(5, attrLangfield);
        set(6, attrOrderfield);
        set(7, attrIssync);
    }
}
