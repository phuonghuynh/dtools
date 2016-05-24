/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeDeniedTrackingRecord;

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
public class TblresumeDeniedTracking extends TableImpl<TblresumeDeniedTrackingRecord> {

    private static final long serialVersionUID = 1356101613;

    /**
     * The reference instance of <code>vnw_core.tblresume_denied_tracking</code>
     */
    public static final TblresumeDeniedTracking TBLRESUME_DENIED_TRACKING = new TblresumeDeniedTracking();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeDeniedTrackingRecord> getRecordType() {
        return TblresumeDeniedTrackingRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_denied_tracking.denieid</code>.
     */
    public final TableField<TblresumeDeniedTrackingRecord, UInteger> DENIEID = createField("denieid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_denied_tracking.resumeid</code>.
     */
    public final TableField<TblresumeDeniedTrackingRecord, UInteger> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_denied_tracking.denieddate</code>.
     */
    public final TableField<TblresumeDeniedTrackingRecord, Timestamp> DENIEDDATE = createField("denieddate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_denied_tracking.sysuserid</code>.
     */
    public final TableField<TblresumeDeniedTrackingRecord, UInteger> SYSUSERID = createField("sysuserid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tblresume_denied_tracking</code> table reference
     */
    public TblresumeDeniedTracking() {
        this("tblresume_denied_tracking", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_denied_tracking</code> table reference
     */
    public TblresumeDeniedTracking(String alias) {
        this(alias, TBLRESUME_DENIED_TRACKING);
    }

    private TblresumeDeniedTracking(String alias, Table<TblresumeDeniedTrackingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeDeniedTracking(String alias, Table<TblresumeDeniedTrackingRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblresumeDeniedTrackingRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_DENIED_TRACKING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeDeniedTrackingRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_DENIED_TRACKING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeDeniedTrackingRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeDeniedTrackingRecord>>asList(Keys.KEY_TBLRESUME_DENIED_TRACKING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeDeniedTracking as(String alias) {
        return new TblresumeDeniedTracking(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeDeniedTracking rename(String name) {
        return new TblresumeDeniedTracking(name, null);
    }
}
