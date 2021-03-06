/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblHistoryScheduleRecord;

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
public class TblHistorySchedule extends TableImpl<TblHistoryScheduleRecord> {

    private static final long serialVersionUID = 1698290772;

    /**
     * The reference instance of <code>vnw_core.tbl_history_schedule</code>
     */
    public static final TblHistorySchedule TBL_HISTORY_SCHEDULE = new TblHistorySchedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblHistoryScheduleRecord> getRecordType() {
        return TblHistoryScheduleRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_history_schedule.history_code</code>.
     */
    public final TableField<TblHistoryScheduleRecord, String> HISTORY_CODE = createField("history_code", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_history_schedule.history_desc</code>.
     */
    public final TableField<TblHistoryScheduleRecord, String> HISTORY_DESC = createField("history_desc", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_history_schedule.crontab_format</code>.
     */
    public final TableField<TblHistoryScheduleRecord, String> CRONTAB_FORMAT = createField("crontab_format", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_history_schedule.sql</code>.
     */
    public final TableField<TblHistoryScheduleRecord, String> SQL = createField("sql", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_history_schedule.next_due</code>.
     */
    public final TableField<TblHistoryScheduleRecord, Timestamp> NEXT_DUE = createField("next_due", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tbl_history_schedule</code> table reference
     */
    public TblHistorySchedule() {
        this("tbl_history_schedule", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_history_schedule</code> table reference
     */
    public TblHistorySchedule(String alias) {
        this(alias, TBL_HISTORY_SCHEDULE);
    }

    private TblHistorySchedule(String alias, Table<TblHistoryScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblHistorySchedule(String alias, Table<TblHistoryScheduleRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblHistoryScheduleRecord> getPrimaryKey() {
        return Keys.KEY_TBL_HISTORY_SCHEDULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblHistoryScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<TblHistoryScheduleRecord>>asList(Keys.KEY_TBL_HISTORY_SCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblHistorySchedule as(String alias) {
        return new TblHistorySchedule(alias, this);
    }

    /**
     * Rename this table
     */
    public TblHistorySchedule rename(String name) {
        return new TblHistorySchedule(name, null);
    }
}
