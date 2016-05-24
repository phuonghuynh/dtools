/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobseekerProjectSkilltermRecord;

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
public class TbljobseekerProjectSkillterm extends TableImpl<TbljobseekerProjectSkilltermRecord> {

    private static final long serialVersionUID = -2011218512;

    /**
     * The reference instance of <code>vnw_core.tbljobseeker_project_skillterm</code>
     */
    public static final TbljobseekerProjectSkillterm TBLJOBSEEKER_PROJECT_SKILLTERM = new TbljobseekerProjectSkillterm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobseekerProjectSkilltermRecord> getRecordType() {
        return TbljobseekerProjectSkilltermRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljobseeker_project_skillterm.id</code>.
     */
    public final TableField<TbljobseekerProjectSkilltermRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project_skillterm.projectId</code>.
     */
    public final TableField<TbljobseekerProjectSkilltermRecord, UInteger> PROJECTID = createField("projectId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project_skillterm.skillId</code>.
     */
    public final TableField<TbljobseekerProjectSkilltermRecord, UInteger> SKILLID = createField("skillId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbljobseeker_project_skillterm</code> table reference
     */
    public TbljobseekerProjectSkillterm() {
        this("tbljobseeker_project_skillterm", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljobseeker_project_skillterm</code> table reference
     */
    public TbljobseekerProjectSkillterm(String alias) {
        this(alias, TBLJOBSEEKER_PROJECT_SKILLTERM);
    }

    private TbljobseekerProjectSkillterm(String alias, Table<TbljobseekerProjectSkilltermRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobseekerProjectSkillterm(String alias, Table<TbljobseekerProjectSkilltermRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobseekerProjectSkilltermRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOBSEEKER_PROJECT_SKILLTERM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobseekerProjectSkilltermRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOBSEEKER_PROJECT_SKILLTERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobseekerProjectSkilltermRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobseekerProjectSkilltermRecord>>asList(Keys.KEY_TBLJOBSEEKER_PROJECT_SKILLTERM_PRIMARY, Keys.KEY_TBLJOBSEEKER_PROJECT_SKILLTERM_PROJECT_SKILLTERM_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobseekerProjectSkillterm as(String alias) {
        return new TbljobseekerProjectSkillterm(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobseekerProjectSkillterm rename(String name) {
        return new TbljobseekerProjectSkillterm(name, null);
    }
}
