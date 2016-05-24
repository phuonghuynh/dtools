/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefHighestdegree;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TblrefHighestdegreeRecord extends UpdatableRecordImpl<TblrefHighestdegreeRecord> implements Record6<Byte, Byte, String, Byte, Byte, Byte> {

    private static final long serialVersionUID = -853872079;

    /**
     * Setter for <code>vnw_core.tblref_highestdegree.highestdegreeid</code>.
     */
    public void setHighestdegreeid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegree.highestdegreeid</code>.
     */
    public Byte getHighestdegreeid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegree.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegree.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegree.highestdegreename</code>.
     */
    public void setHighestdegreename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegree.highestdegreename</code>.
     */
    public String getHighestdegreename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegree.highestdegreeorder</code>.
     */
    public void setHighestdegreeorder(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegree.highestdegreeorder</code>.
     */
    public Byte getHighestdegreeorder() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegree.weight</code>.
     */
    public void setWeight(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegree.weight</code>.
     */
    public Byte getWeight() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblref_highestdegree.isexact</code>.
     */
    public void setIsexact(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_highestdegree.isexact</code>.
     */
    public Byte getIsexact() {
        return (Byte) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Byte, Byte, String, Byte, Byte, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Byte, Byte, String, Byte, Byte, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefHighestdegree.TBLREF_HIGHESTDEGREE.HIGHESTDEGREEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefHighestdegree.TBLREF_HIGHESTDEGREE.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefHighestdegree.TBLREF_HIGHESTDEGREE.HIGHESTDEGREENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblrefHighestdegree.TBLREF_HIGHESTDEGREE.HIGHESTDEGREEORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblrefHighestdegree.TBLREF_HIGHESTDEGREE.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TblrefHighestdegree.TBLREF_HIGHESTDEGREE.ISEXACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getHighestdegreeid();
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
        return getHighestdegreename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getHighestdegreeorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsexact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord value1(Byte value) {
        setHighestdegreeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord value3(String value) {
        setHighestdegreename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord value4(Byte value) {
        setHighestdegreeorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord value5(Byte value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord value6(Byte value) {
        setIsexact(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHighestdegreeRecord values(Byte value1, Byte value2, String value3, Byte value4, Byte value5, Byte value6) {
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
     * Create a detached TblrefHighestdegreeRecord
     */
    public TblrefHighestdegreeRecord() {
        super(TblrefHighestdegree.TBLREF_HIGHESTDEGREE);
    }

    /**
     * Create a detached, initialised TblrefHighestdegreeRecord
     */
    public TblrefHighestdegreeRecord(Byte highestdegreeid, Byte languageid, String highestdegreename, Byte highestdegreeorder, Byte weight, Byte isexact) {
        super(TblrefHighestdegree.TBLREF_HIGHESTDEGREE);

        set(0, highestdegreeid);
        set(1, languageid);
        set(2, highestdegreename);
        set(3, highestdegreeorder);
        set(4, weight);
        set(5, isexact);
    }
}
