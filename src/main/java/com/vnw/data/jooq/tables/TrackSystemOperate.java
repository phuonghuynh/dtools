/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TrackSystemOperateRecord;

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
public class TrackSystemOperate extends TableImpl<TrackSystemOperateRecord> {

    private static final long serialVersionUID = -675129914;

    /**
     * The reference instance of <code>vnw_core.track_system_operate</code>
     */
    public static final TrackSystemOperate TRACK_SYSTEM_OPERATE = new TrackSystemOperate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackSystemOperateRecord> getRecordType() {
        return TrackSystemOperateRecord.class;
    }

    /**
     * The column <code>vnw_core.track_system_operate.id</code>.
     */
    public final TableField<TrackSystemOperateRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.track_system_operate.source_id</code>.
     */
    public final TableField<TrackSystemOperateRecord, UInteger> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_system_operate.sysuser_id</code>.
     */
    public final TableField<TrackSystemOperateRecord, UInteger> SYSUSER_ID = createField("sysuser_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.track_system_operate.table_name</code>.
     */
    public final TableField<TrackSystemOperateRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.track_system_operate.action_type</code>.
     */
    public final TableField<TrackSystemOperateRecord, String> ACTION_TYPE = createField("action_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.track_system_operate.sqlstring</code>.
     */
    public final TableField<TrackSystemOperateRecord, String> SQLSTRING = createField("sqlstring", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.track_system_operate.create_at</code>.
     */
    public final TableField<TrackSystemOperateRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.track_system_operate</code> table reference
     */
    public TrackSystemOperate() {
        this("track_system_operate", null);
    }

    /**
     * Create an aliased <code>vnw_core.track_system_operate</code> table reference
     */
    public TrackSystemOperate(String alias) {
        this(alias, TRACK_SYSTEM_OPERATE);
    }

    private TrackSystemOperate(String alias, Table<TrackSystemOperateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrackSystemOperate(String alias, Table<TrackSystemOperateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TrackSystemOperateRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TRACK_SYSTEM_OPERATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrackSystemOperateRecord> getPrimaryKey() {
        return Keys.KEY_TRACK_SYSTEM_OPERATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrackSystemOperateRecord>> getKeys() {
        return Arrays.<UniqueKey<TrackSystemOperateRecord>>asList(Keys.KEY_TRACK_SYSTEM_OPERATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackSystemOperate as(String alias) {
        return new TrackSystemOperate(alias, this);
    }

    /**
     * Rename this table
     */
    public TrackSystemOperate rename(String name) {
        return new TrackSystemOperate(name, null);
    }
}
