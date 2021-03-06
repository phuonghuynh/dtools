/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobApplyonlineRecord;

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
public class TbljobApplyonline extends TableImpl<TbljobApplyonlineRecord> {

    private static final long serialVersionUID = 302057466;

    /**
     * The reference instance of <code>vnw_core.tbljob_applyonline</code>
     */
    public static final TbljobApplyonline TBLJOB_APPLYONLINE = new TbljobApplyonline();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobApplyonlineRecord> getRecordType() {
        return TbljobApplyonlineRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_applyonline.entryid</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.jobid</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Integer> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.userid</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.resumeid</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.statusid</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Byte> STATUSID = createField("statusid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.folder_id</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Integer> FOLDER_ID = createField("folder_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.resumestatus_id</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Byte> RESUMESTATUS_ID = createField("resumestatus_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("2", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.coverletter</code>.
     */
    public final TableField<TbljobApplyonlineRecord, String> COVERLETTER = createField("coverletter", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.createddate</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.savedate</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Timestamp> SAVEDATE = createField("savedate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.deleted_by_employer</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Byte> DELETED_BY_EMPLOYER = createField("deleted_by_employer", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.deleted_by_jobseeker</code>.
     */
    public final TableField<TbljobApplyonlineRecord, Byte> DELETED_BY_JOBSEEKER = createField("deleted_by_jobseeker", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tbljob_applyonline.appSubject</code>.
     */
    public final TableField<TbljobApplyonlineRecord, String> APPSUBJECT = createField("appSubject", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>vnw_core.tbljob_applyonline</code> table reference
     */
    public TbljobApplyonline() {
        this("tbljob_applyonline", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_applyonline</code> table reference
     */
    public TbljobApplyonline(String alias) {
        this(alias, TBLJOB_APPLYONLINE);
    }

    private TbljobApplyonline(String alias, Table<TbljobApplyonlineRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobApplyonline(String alias, Table<TbljobApplyonlineRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobApplyonlineRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLJOB_APPLYONLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobApplyonlineRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_APPLYONLINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobApplyonlineRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobApplyonlineRecord>>asList(Keys.KEY_TBLJOB_APPLYONLINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobApplyonline as(String alias) {
        return new TbljobApplyonline(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobApplyonline rename(String name) {
        return new TbljobApplyonline(name, null);
    }
}
