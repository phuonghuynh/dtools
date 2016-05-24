/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblProcessedTrackingRecord;

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
public class TblProcessedTracking extends TableImpl<TblProcessedTrackingRecord> {

    private static final long serialVersionUID = -1784840708;

    /**
     * The reference instance of <code>vnw_core.tbl_processed_tracking</code>
     */
    public static final TblProcessedTracking TBL_PROCESSED_TRACKING = new TblProcessedTracking();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblProcessedTrackingRecord> getRecordType() {
        return TblProcessedTrackingRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_processed_tracking.processed_id</code>.
     */
    public final TableField<TblProcessedTrackingRecord, Integer> PROCESSED_ID = createField("processed_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_processed_tracking.processed_code</code>.
     */
    public final TableField<TblProcessedTrackingRecord, String> PROCESSED_CODE = createField("processed_code", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_processed_tracking.data_type</code>.
     */
    public final TableField<TblProcessedTrackingRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_processed_tracking.data_id</code>.
     */
    public final TableField<TblProcessedTrackingRecord, Integer> DATA_ID = createField("data_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_processed_tracking.begindate</code>.
     */
    public final TableField<TblProcessedTrackingRecord, Timestamp> BEGINDATE = createField("begindate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_processed_tracking.processeddate</code>.
     */
    public final TableField<TblProcessedTrackingRecord, Timestamp> PROCESSEDDATE = createField("processeddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbl_processed_tracking.processedhour</code>.
     */
    public final TableField<TblProcessedTrackingRecord, Integer> PROCESSEDHOUR = createField("processedhour", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>vnw_core.tbl_processed_tracking</code> table reference
     */
    public TblProcessedTracking() {
        this("tbl_processed_tracking", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_processed_tracking</code> table reference
     */
    public TblProcessedTracking(String alias) {
        this(alias, TBL_PROCESSED_TRACKING);
    }

    private TblProcessedTracking(String alias, Table<TblProcessedTrackingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblProcessedTracking(String alias, Table<TblProcessedTrackingRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblProcessedTrackingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBL_PROCESSED_TRACKING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblProcessedTrackingRecord> getPrimaryKey() {
        return Keys.KEY_TBL_PROCESSED_TRACKING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblProcessedTrackingRecord>> getKeys() {
        return Arrays.<UniqueKey<TblProcessedTrackingRecord>>asList(Keys.KEY_TBL_PROCESSED_TRACKING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblProcessedTracking as(String alias) {
        return new TblProcessedTracking(alias, this);
    }

    /**
     * Rename this table
     */
    public TblProcessedTracking rename(String name) {
        return new TblProcessedTracking(name, null);
    }
}
