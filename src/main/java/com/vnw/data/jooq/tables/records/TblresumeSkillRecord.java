/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumeSkill;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TblresumeSkillRecord extends UpdatableRecordImpl<TblresumeSkillRecord> implements Record7<Integer, Integer, Short, Byte, Byte, Double, Short> {

    private static final long serialVersionUID = -858998651;

    /**
     * Setter for <code>vnw_core.tblresume_skill.entryid</code>.
     */
    public void setEntryid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.entryid</code>.
     */
    public Integer getEntryid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_skill.resumeid</code>.
     */
    public void setResumeid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.resumeid</code>.
     */
    public Integer getResumeid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_skill.skill_id</code>.
     */
    public void setSkillId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.skill_id</code>.
     */
    public Short getSkillId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblresume_skill.proficiency_id</code>.
     */
    public void setProficiencyId(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.proficiency_id</code>.
     */
    public Byte getProficiencyId() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblresume_skill.skill_isrequired</code>.
     */
    public void setSkillIsrequired(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.skill_isrequired</code>.
     */
    public Byte getSkillIsrequired() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblresume_skill.skill_years</code>.
     */
    public void setSkillYears(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.skill_years</code>.
     */
    public Double getSkillYears() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblresume_skill.skill_order</code>.
     */
    public void setSkillOrder(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_skill.skill_order</code>.
     */
    public Short getSkillOrder() {
        return (Short) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Short, Byte, Byte, Double, Short> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Short, Byte, Byte, Double, Short> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblresumeSkill.TBLRESUME_SKILL.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblresumeSkill.TBLRESUME_SKILL.RESUMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TblresumeSkill.TBLRESUME_SKILL.SKILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblresumeSkill.TBLRESUME_SKILL.PROFICIENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblresumeSkill.TBLRESUME_SKILL.SKILL_ISREQUIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return TblresumeSkill.TBLRESUME_SKILL.SKILL_YEARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return TblresumeSkill.TBLRESUME_SKILL.SKILL_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEntryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getResumeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getSkillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getProficiencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getSkillIsrequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getSkillYears();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getSkillOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value1(Integer value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value2(Integer value) {
        setResumeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value3(Short value) {
        setSkillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value4(Byte value) {
        setProficiencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value5(Byte value) {
        setSkillIsrequired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value6(Double value) {
        setSkillYears(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord value7(Short value) {
        setSkillOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkillRecord values(Integer value1, Integer value2, Short value3, Byte value4, Byte value5, Double value6, Short value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblresumeSkillRecord
     */
    public TblresumeSkillRecord() {
        super(TblresumeSkill.TBLRESUME_SKILL);
    }

    /**
     * Create a detached, initialised TblresumeSkillRecord
     */
    public TblresumeSkillRecord(Integer entryid, Integer resumeid, Short skillId, Byte proficiencyId, Byte skillIsrequired, Double skillYears, Short skillOrder) {
        super(TblresumeSkill.TBLRESUME_SKILL);

        set(0, entryid);
        set(1, resumeid);
        set(2, skillId);
        set(3, proficiencyId);
        set(4, skillIsrequired);
        set(5, skillYears);
        set(6, skillOrder);
    }
}
