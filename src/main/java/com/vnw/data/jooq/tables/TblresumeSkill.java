/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeSkillRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class TblresumeSkill extends TableImpl<TblresumeSkillRecord> {

    private static final long serialVersionUID = 177033052;

    /**
     * The reference instance of <code>vnw_core.tblresume_skill</code>
     */
    public static final TblresumeSkill TBLRESUME_SKILL = new TblresumeSkill();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeSkillRecord> getRecordType() {
        return TblresumeSkillRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_skill.entryid</code>.
     */
    public final TableField<TblresumeSkillRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_skill.resumeid</code>.
     */
    public final TableField<TblresumeSkillRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_skill.skill_id</code>.
     */
    public final TableField<TblresumeSkillRecord, Short> SKILL_ID = createField("skill_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_skill.proficiency_id</code>.
     */
    public final TableField<TblresumeSkillRecord, Byte> PROFICIENCY_ID = createField("proficiency_id", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_skill.skill_isrequired</code>.
     */
    public final TableField<TblresumeSkillRecord, Byte> SKILL_ISREQUIRED = createField("skill_isrequired", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_skill.skill_years</code>.
     */
    public final TableField<TblresumeSkillRecord, Double> SKILL_YEARS = createField("skill_years", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vnw_core.tblresume_skill.skill_order</code>.
     */
    public final TableField<TblresumeSkillRecord, Short> SKILL_ORDER = createField("skill_order", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>vnw_core.tblresume_skill</code> table reference
     */
    public TblresumeSkill() {
        this("tblresume_skill", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_skill</code> table reference
     */
    public TblresumeSkill(String alias) {
        this(alias, TBLRESUME_SKILL);
    }

    private TblresumeSkill(String alias, Table<TblresumeSkillRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeSkill(String alias, Table<TblresumeSkillRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return VnwCore.VNW_CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TblresumeSkillRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_SKILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeSkillRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_SKILL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeSkillRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeSkillRecord>>asList(Keys.KEY_TBLRESUME_SKILL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSkill as(String alias) {
        return new TblresumeSkill(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeSkill rename(String name) {
        return new TblresumeSkill(name, null);
    }
}
