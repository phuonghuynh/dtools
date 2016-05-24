/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefJobalertPeriodtype;

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
public class TblrefJobalertPeriodtypeRecord extends UpdatableRecordImpl<TblrefJobalertPeriodtypeRecord> implements Record5<Byte, Byte, String, Integer, Byte> {

    private static final long serialVersionUID = -1874412532;

    /**
     * Setter for <code>vnw_core.tblref_jobalert_periodtype.periodtypeid</code>.
     */
    public void setPeriodtypeid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobalert_periodtype.periodtypeid</code>.
     */
    public Byte getPeriodtypeid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobalert_periodtype.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobalert_periodtype.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobalert_periodtype.periodtypename</code>.
     */
    public void setPeriodtypename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobalert_periodtype.periodtypename</code>.
     */
    public String getPeriodtypename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobalert_periodtype.noofdays</code>.
     */
    public void setNoofdays(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobalert_periodtype.noofdays</code>.
     */
    public Integer getNoofdays() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_jobalert_periodtype.periodtypeorder</code>.
     */
    public void setPeriodtypeorder(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_jobalert_periodtype.periodtypeorder</code>.
     */
    public Byte getPeriodtypeorder() {
        return (Byte) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Byte, Byte, String, Integer, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Byte, Byte, String, Integer, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE.PERIODTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE.PERIODTYPENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE.NOOFDAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE.PERIODTYPEORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getPeriodtypeid();
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
        return getPeriodtypename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getNoofdays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getPeriodtypeorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtypeRecord value1(Byte value) {
        setPeriodtypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtypeRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtypeRecord value3(String value) {
        setPeriodtypename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtypeRecord value4(Integer value) {
        setNoofdays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtypeRecord value5(Byte value) {
        setPeriodtypeorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtypeRecord values(Byte value1, Byte value2, String value3, Integer value4, Byte value5) {
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
     * Create a detached TblrefJobalertPeriodtypeRecord
     */
    public TblrefJobalertPeriodtypeRecord() {
        super(TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE);
    }

    /**
     * Create a detached, initialised TblrefJobalertPeriodtypeRecord
     */
    public TblrefJobalertPeriodtypeRecord(Byte periodtypeid, Byte languageid, String periodtypename, Integer noofdays, Byte periodtypeorder) {
        super(TblrefJobalertPeriodtype.TBLREF_JOBALERT_PERIODTYPE);

        set(0, periodtypeid);
        set(1, languageid);
        set(2, periodtypename);
        set(3, noofdays);
        set(4, periodtypeorder);
    }
}
