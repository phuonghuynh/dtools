/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeTrackerRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TblresumeTracker extends TableImpl<TblresumeTrackerRecord> {

    private static final long serialVersionUID = 1161761226;

    /**
     * The reference instance of <code>vnw_core.tblresume_tracker</code>
     */
    public static final TblresumeTracker TBLRESUME_TRACKER = new TblresumeTracker();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeTrackerRecord> getRecordType() {
        return TblresumeTrackerRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_tracker.userid</code>.
     */
    public final TableField<TblresumeTrackerRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.resumeid</code>.
     */
    public final TableField<TblresumeTrackerRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.isbought</code>.
     */
    public final TableField<TblresumeTrackerRecord, Byte> ISBOUGHT = createField("isbought", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.folder_id</code>.
     */
    public final TableField<TblresumeTrackerRecord, UInteger> FOLDER_ID = createField("folder_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.resumestatus_id</code>.
     */
    public final TableField<TblresumeTrackerRecord, Byte> RESUMESTATUS_ID = createField("resumestatus_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("2", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.createddate</code>.
     */
    public final TableField<TblresumeTrackerRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.durationdays</code>.
     */
    public final TableField<TblresumeTrackerRecord, Short> DURATIONDAYS = createField("durationdays", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("30", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.expireddate</code>.
     */
    public final TableField<TblresumeTrackerRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_tracker.isdeleted</code>.
     */
    public final TableField<TblresumeTrackerRecord, UByte> ISDELETED = createField("isdeleted", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * Create a <code>vnw_core.tblresume_tracker</code> table reference
     */
    public TblresumeTracker() {
        this("tblresume_tracker", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_tracker</code> table reference
     */
    public TblresumeTracker(String alias) {
        this(alias, TBLRESUME_TRACKER);
    }

    private TblresumeTracker(String alias, Table<TblresumeTrackerRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeTracker(String alias, Table<TblresumeTrackerRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblresumeTrackerRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_TRACKER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeTrackerRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeTrackerRecord>>asList(Keys.KEY_TBLRESUME_TRACKER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeTracker as(String alias) {
        return new TblresumeTracker(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeTracker rename(String name) {
        return new TblresumeTracker(name, null);
    }
}