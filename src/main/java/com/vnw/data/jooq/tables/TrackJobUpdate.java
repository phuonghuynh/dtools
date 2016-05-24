/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TrackJobUpdateRecord;

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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class TrackJobUpdate extends TableImpl<TrackJobUpdateRecord> {

    private static final long serialVersionUID = -368001774;

    /**
     * The reference instance of <code>vnw_core.track_job_update</code>
     */
    public static final TrackJobUpdate TRACK_JOB_UPDATE = new TrackJobUpdate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackJobUpdateRecord> getRecordType() {
        return TrackJobUpdateRecord.class;
    }

    /**
     * The column <code>vnw_core.track_job_update.id</code>.
     */
    public final TableField<TrackJobUpdateRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.track_job_update.job_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UInteger> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.user_id</code>. 0: Sysuser
     */
    public final TableField<TrackJobUpdateRecord, UInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "0: Sysuser");

    /**
     * The column <code>vnw_core.track_job_update.title</code>.
     */
    public final TableField<TrackJobUpdateRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.track_job_update.description</code>.
     */
    public final TableField<TrackJobUpdateRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.track_job_update.email_contact</code>.
     */
    public final TableField<TrackJobUpdateRecord, String> EMAIL_CONTACT = createField("email_contact", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.track_job_update.salaryrange_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, Integer> SALARYRANGE_ID = createField("salaryrange_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.track_job_update.salary_min</code>.
     */
    public final TableField<TrackJobUpdateRecord, Integer> SALARY_MIN = createField("salary_min", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.track_job_update.saraly_max</code>.
     */
    public final TableField<TrackJobUpdateRecord, Integer> SARALY_MAX = createField("saraly_max", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry1_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY1_ID = createField("industry1_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry1_visibility_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY1_VISIBILITY_ID = createField("industry1_visibility_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry1_priority_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY1_PRIORITY_ID = createField("industry1_priority_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry2_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY2_ID = createField("industry2_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry2_visibility_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY2_VISIBILITY_ID = createField("industry2_visibility_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry2_priority_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY2_PRIORITY_ID = createField("industry2_priority_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry3_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY3_ID = createField("industry3_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry3_visibility_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY3_VISIBILITY_ID = createField("industry3_visibility_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.industry3_priority_id</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> INDUSTRY3_PRIORITY_ID = createField("industry3_priority_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.is_on_homepage</code>.
     */
    public final TableField<TrackJobUpdateRecord, UByte> IS_ON_HOMEPAGE = createField("is_on_homepage", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_job_update.create_at</code>.
     */
    public final TableField<TrackJobUpdateRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.track_job_update</code> table reference
     */
    public TrackJobUpdate() {
        this("track_job_update", null);
    }

    /**
     * Create an aliased <code>vnw_core.track_job_update</code> table reference
     */
    public TrackJobUpdate(String alias) {
        this(alias, TRACK_JOB_UPDATE);
    }

    private TrackJobUpdate(String alias, Table<TrackJobUpdateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrackJobUpdate(String alias, Table<TrackJobUpdateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TrackJobUpdateRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TRACK_JOB_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrackJobUpdateRecord> getPrimaryKey() {
        return Keys.KEY_TRACK_JOB_UPDATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrackJobUpdateRecord>> getKeys() {
        return Arrays.<UniqueKey<TrackJobUpdateRecord>>asList(Keys.KEY_TRACK_JOB_UPDATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackJobUpdate as(String alias) {
        return new TrackJobUpdate(alias, this);
    }

    /**
     * Rename this table
     */
    public TrackJobUpdate rename(String name) {
        return new TrackJobUpdate(name, null);
    }
}
