/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.PolishSelectedResumeRecord;

import java.sql.Timestamp;
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
public class PolishSelectedResume extends TableImpl<PolishSelectedResumeRecord> {

    private static final long serialVersionUID = 768657988;

    /**
     * The reference instance of <code>vnw_core.polish_selected_resume</code>
     */
    public static final PolishSelectedResume POLISH_SELECTED_RESUME = new PolishSelectedResume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PolishSelectedResumeRecord> getRecordType() {
        return PolishSelectedResumeRecord.class;
    }

    /**
     * The column <code>vnw_core.polish_selected_resume.item</code>.
     */
    public final TableField<PolishSelectedResumeRecord, Integer> ITEM = createField("item", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.polish_selected_resume.resumeid</code>.
     */
    public final TableField<PolishSelectedResumeRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.polish_selected_resume.userid</code>.
     */
    public final TableField<PolishSelectedResumeRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.polish_selected_resume.createdate</code>.
     */
    public final TableField<PolishSelectedResumeRecord, Timestamp> CREATEDATE = createField("createdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.polish_selected_resume.version</code>.
     */
    public final TableField<PolishSelectedResumeRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.polish_selected_resume</code> table reference
     */
    public PolishSelectedResume() {
        this("polish_selected_resume", null);
    }

    /**
     * Create an aliased <code>vnw_core.polish_selected_resume</code> table reference
     */
    public PolishSelectedResume(String alias) {
        this(alias, POLISH_SELECTED_RESUME);
    }

    private PolishSelectedResume(String alias, Table<PolishSelectedResumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PolishSelectedResume(String alias, Table<PolishSelectedResumeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PolishSelectedResumeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_POLISH_SELECTED_RESUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PolishSelectedResumeRecord> getPrimaryKey() {
        return Keys.KEY_POLISH_SELECTED_RESUME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PolishSelectedResumeRecord>> getKeys() {
        return Arrays.<UniqueKey<PolishSelectedResumeRecord>>asList(Keys.KEY_POLISH_SELECTED_RESUME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishSelectedResume as(String alias) {
        return new PolishSelectedResume(alias, this);
    }

    /**
     * Rename this table
     */
    public PolishSelectedResume rename(String name) {
        return new PolishSelectedResume(name, null);
    }
}