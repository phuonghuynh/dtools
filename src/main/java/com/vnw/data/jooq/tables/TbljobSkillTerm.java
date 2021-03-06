/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobSkillTermRecord;

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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


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
public class TbljobSkillTerm extends TableImpl<TbljobSkillTermRecord> {

    private static final long serialVersionUID = -1123943465;

    /**
     * The reference instance of <code>vnw_core.tbljob_skill_term</code>
     */
    public static final TbljobSkillTerm TBLJOB_SKILL_TERM = new TbljobSkillTerm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobSkillTermRecord> getRecordType() {
        return TbljobSkillTermRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_skill_term.entryId</code>.
     */
    public final TableField<TbljobSkillTermRecord, UInteger> ENTRYID = createField("entryId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_skill_term.jobId</code>. Foreign key from tbljob
     */
    public final TableField<TbljobSkillTermRecord, UInteger> JOBID = createField("jobId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Foreign key from tbljob");

    /**
     * The column <code>vnw_core.tbljob_skill_term.skillId</code>. Foreign key from tblskill_term
     */
    public final TableField<TbljobSkillTermRecord, UInteger> SKILLID = createField("skillId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Foreign key from tblskill_term");

    /**
     * The column <code>vnw_core.tbljob_skill_term.skillWeight</code>. The percentage for the importance of skill in job
     */
    public final TableField<TbljobSkillTermRecord, UByte> SKILLWEIGHT = createField("skillWeight", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "The percentage for the importance of skill in job");

    /**
     * Create a <code>vnw_core.tbljob_skill_term</code> table reference
     */
    public TbljobSkillTerm() {
        this("tbljob_skill_term", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_skill_term</code> table reference
     */
    public TbljobSkillTerm(String alias) {
        this(alias, TBLJOB_SKILL_TERM);
    }

    private TbljobSkillTerm(String alias, Table<TbljobSkillTermRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobSkillTerm(String alias, Table<TbljobSkillTermRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobSkillTermRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOB_SKILL_TERM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobSkillTermRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_SKILL_TERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobSkillTermRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobSkillTermRecord>>asList(Keys.KEY_TBLJOB_SKILL_TERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobSkillTerm as(String alias) {
        return new TbljobSkillTerm(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobSkillTerm rename(String name) {
        return new TbljobSkillTerm(name, null);
    }
}
