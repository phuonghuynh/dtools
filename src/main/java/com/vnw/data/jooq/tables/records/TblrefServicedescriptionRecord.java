/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefServicedescription;

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
public class TblrefServicedescriptionRecord extends UpdatableRecordImpl<TblrefServicedescriptionRecord> implements Record4<Integer, Short, String, String> {

    private static final long serialVersionUID = 390731560;

    /**
     * Setter for <code>vnw_core.tblref_servicedescription.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicedescription.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicedescription.languageid</code>.
     */
    public void setLanguageid(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicedescription.languageid</code>.
     */
    public Short getLanguageid() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicedescription.servicedesc_name</code>.
     */
    public void setServicedescName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicedescription.servicedesc_name</code>.
     */
    public String getServicedescName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_servicedescription.servicedesc_description</code>.
     */
    public void setServicedescDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_servicedescription.servicedesc_description</code>.
     */
    public String getServicedescDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Short, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Short, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblrefServicedescription.TBLREF_SERVICEDESCRIPTION.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TblrefServicedescription.TBLREF_SERVICEDESCRIPTION.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefServicedescription.TBLREF_SERVICEDESCRIPTION.SERVICEDESC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefServicedescription.TBLREF_SERVICEDESCRIPTION.SERVICEDESC_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getServicedescName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getServicedescDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicedescriptionRecord value1(Integer value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicedescriptionRecord value2(Short value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicedescriptionRecord value3(String value) {
        setServicedescName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicedescriptionRecord value4(String value) {
        setServicedescDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServicedescriptionRecord values(Integer value1, Short value2, String value3, String value4) {
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
     * Create a detached TblrefServicedescriptionRecord
     */
    public TblrefServicedescriptionRecord() {
        super(TblrefServicedescription.TBLREF_SERVICEDESCRIPTION);
    }

    /**
     * Create a detached, initialised TblrefServicedescriptionRecord
     */
    public TblrefServicedescriptionRecord(Integer serviceId, Short languageid, String servicedescName, String servicedescDescription) {
        super(TblrefServicedescription.TBLREF_SERVICEDESCRIPTION);

        set(0, serviceId);
        set(1, languageid);
        set(2, servicedescName);
        set(3, servicedescDescription);
    }
}