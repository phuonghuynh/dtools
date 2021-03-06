/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblemphomepageRandomresumecategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class TblemphomepageRandomresumecategoryRecord extends UpdatableRecordImpl<TblemphomepageRandomresumecategoryRecord> implements Record6<UByte, String, UByte, UByte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1957369736;

    /**
     * Setter for <code>vnw_core.tblemphomepage_randomresumecategory.entryid</code>.
     */
    public void setEntryid(UByte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblemphomepage_randomresumecategory.entryid</code>.
     */
    public UByte getEntryid() {
        return (UByte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblemphomepage_randomresumecategory.categoryname</code>.
     */
    public void setCategoryname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblemphomepage_randomresumecategory.categoryname</code>.
     */
    public String getCategoryname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblemphomepage_randomresumecategory.categoryorder</code>.
     */
    public void setCategoryorder(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblemphomepage_randomresumecategory.categoryorder</code>.
     */
    public UByte getCategoryorder() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblemphomepage_randomresumecategory.isactive</code>.
     */
    public void setIsactive(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblemphomepage_randomresumecategory.isactive</code>.
     */
    public UByte getIsactive() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblemphomepage_randomresumecategory.createdate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblemphomepage_randomresumecategory.createdate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblemphomepage_randomresumecategory.lastupdate</code>.
     */
    public void setLastupdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblemphomepage_randomresumecategory.lastupdate</code>.
     */
    public Timestamp getLastupdate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UByte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UByte, String, UByte, UByte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UByte, String, UByte, UByte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field1() {
        return TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY.CATEGORYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY.CATEGORYORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field4() {
        return TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY.LASTUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value1() {
        return getEntryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCategoryname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getCategoryorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value4() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord value1(UByte value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord value2(String value) {
        setCategoryname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord value3(UByte value) {
        setCategoryorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord value4(UByte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord value5(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord value6(Timestamp value) {
        setLastupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresumecategoryRecord values(UByte value1, String value2, UByte value3, UByte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TblemphomepageRandomresumecategoryRecord
     */
    public TblemphomepageRandomresumecategoryRecord() {
        super(TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY);
    }

    /**
     * Create a detached, initialised TblemphomepageRandomresumecategoryRecord
     */
    public TblemphomepageRandomresumecategoryRecord(UByte entryid, String categoryname, UByte categoryorder, UByte isactive, Timestamp createdate, Timestamp lastupdate) {
        super(TblemphomepageRandomresumecategory.TBLEMPHOMEPAGE_RANDOMRESUMECATEGORY);

        set(0, entryid);
        set(1, categoryname);
        set(2, categoryorder);
        set(3, isactive);
        set(4, createdate);
        set(5, lastupdate);
    }
}
