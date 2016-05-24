/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeViewedTrackingRecord;

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
import org.jooq.impl.DateAsTimestampBinding;
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
public class TblresumeViewedTracking extends TableImpl<TblresumeViewedTrackingRecord> {

    private static final long serialVersionUID = -1097789769;

    /**
     * The reference instance of <code>vnw_core.tblresume_viewed_tracking</code>
     */
    public static final TblresumeViewedTracking TBLRESUME_VIEWED_TRACKING = new TblresumeViewedTracking();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeViewedTrackingRecord> getRecordType() {
        return TblresumeViewedTrackingRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_viewed_tracking.entryid</code>.
     */
    public final TableField<TblresumeViewedTrackingRecord, UInteger> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed_tracking.userid</code>.
     */
    public final TableField<TblresumeViewedTrackingRecord, UInteger> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed_tracking.username</code>.
     */
    public final TableField<TblresumeViewedTrackingRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed_tracking.totalviewed</code>.
     */
    public final TableField<TblresumeViewedTrackingRecord, UInteger> TOTALVIEWED = createField("totalviewed", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed_tracking.createdate</code>.
     */
    public final TableField<TblresumeViewedTrackingRecord, Timestamp> CREATEDATE = createField("createdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateAsTimestampBinding());

    /**
     * Create a <code>vnw_core.tblresume_viewed_tracking</code> table reference
     */
    public TblresumeViewedTracking() {
        this("tblresume_viewed_tracking", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_viewed_tracking</code> table reference
     */
    public TblresumeViewedTracking(String alias) {
        this(alias, TBLRESUME_VIEWED_TRACKING);
    }

    private TblresumeViewedTracking(String alias, Table<TblresumeViewedTrackingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeViewedTracking(String alias, Table<TblresumeViewedTrackingRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblresumeViewedTrackingRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_VIEWED_TRACKING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeViewedTrackingRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_VIEWED_TRACKING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeViewedTrackingRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeViewedTrackingRecord>>asList(Keys.KEY_TBLRESUME_VIEWED_TRACKING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeViewedTracking as(String alias) {
        return new TblresumeViewedTracking(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeViewedTracking rename(String name) {
        return new TblresumeViewedTracking(name, null);
    }
}
