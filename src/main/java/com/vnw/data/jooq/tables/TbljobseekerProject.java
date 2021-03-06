/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobseekerProjectRecord;

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
public class TbljobseekerProject extends TableImpl<TbljobseekerProjectRecord> {

    private static final long serialVersionUID = 1439946772;

    /**
     * The reference instance of <code>vnw_core.tbljobseeker_project</code>
     */
    public static final TbljobseekerProject TBLJOBSEEKER_PROJECT = new TbljobseekerProject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobseekerProjectRecord> getRecordType() {
        return TbljobseekerProjectRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljobseeker_project.id</code>.
     */
    public final TableField<TbljobseekerProjectRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project.userId</code>.
     */
    public final TableField<TbljobseekerProjectRecord, UInteger> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project.title</code>.
     */
    public final TableField<TbljobseekerProjectRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project.description</code>.
     */
    public final TableField<TbljobseekerProjectRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project.demoUrl</code>.
     */
    public final TableField<TbljobseekerProjectRecord, String> DEMOURL = createField("demoUrl", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_project.order</code>.
     */
    public final TableField<TbljobseekerProjectRecord, Short> ORDER = createField("order", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbljobseeker_project</code> table reference
     */
    public TbljobseekerProject() {
        this("tbljobseeker_project", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljobseeker_project</code> table reference
     */
    public TbljobseekerProject(String alias) {
        this(alias, TBLJOBSEEKER_PROJECT);
    }

    private TbljobseekerProject(String alias, Table<TbljobseekerProjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobseekerProject(String alias, Table<TbljobseekerProjectRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobseekerProjectRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOBSEEKER_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobseekerProjectRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOBSEEKER_PROJECT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobseekerProjectRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobseekerProjectRecord>>asList(Keys.KEY_TBLJOBSEEKER_PROJECT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobseekerProject as(String alias) {
        return new TbljobseekerProject(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobseekerProject rename(String name) {
        return new TbljobseekerProject(name, null);
    }
}
