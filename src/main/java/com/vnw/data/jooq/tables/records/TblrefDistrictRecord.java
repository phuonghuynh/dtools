/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefDistrict;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TblrefDistrictRecord extends UpdatableRecordImpl<TblrefDistrictRecord> implements Record5<Integer, Short, Short, String, Short> {

    private static final long serialVersionUID = -1164059007;

    /**
     * Setter for <code>vnw_core.tblref_district.districtid</code>.
     */
    public void setDistrictid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_district.districtid</code>.
     */
    public Integer getDistrictid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_district.languageid</code>.
     */
    public void setLanguageid(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_district.languageid</code>.
     */
    public Short getLanguageid() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_district.cityid</code>.
     */
    public void setCityid(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_district.cityid</code>.
     */
    public Short getCityid() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_district.districtname</code>.
     */
    public void setDistrictname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_district.districtname</code>.
     */
    public String getDistrictname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_district.districtorder</code>.
     */
    public void setDistrictorder(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_district.districtorder</code>.
     */
    public Short getDistrictorder() {
        return (Short) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Short, Short, String, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Short, Short, String, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblrefDistrict.TBLREF_DISTRICT.DISTRICTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TblrefDistrict.TBLREF_DISTRICT.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TblrefDistrict.TBLREF_DISTRICT.CITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefDistrict.TBLREF_DISTRICT.DISTRICTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TblrefDistrict.TBLREF_DISTRICT.DISTRICTORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDistrictid();
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
    public Short value3() {
        return getCityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDistrictname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getDistrictorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDistrictRecord value1(Integer value) {
        setDistrictid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDistrictRecord value2(Short value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDistrictRecord value3(Short value) {
        setCityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDistrictRecord value4(String value) {
        setDistrictname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDistrictRecord value5(Short value) {
        setDistrictorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefDistrictRecord values(Integer value1, Short value2, Short value3, String value4, Short value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefDistrictRecord
     */
    public TblrefDistrictRecord() {
        super(TblrefDistrict.TBLREF_DISTRICT);
    }

    /**
     * Create a detached, initialised TblrefDistrictRecord
     */
    public TblrefDistrictRecord(Integer districtid, Short languageid, Short cityid, String districtname, Short districtorder) {
        super(TblrefDistrict.TBLREF_DISTRICT);

        set(0, districtid);
        set(1, languageid);
        set(2, cityid);
        set(3, districtname);
        set(4, districtorder);
    }
}
