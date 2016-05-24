/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeUpgradingLocationRecord;

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
public class TblresumeUpgradingLocation extends TableImpl<TblresumeUpgradingLocationRecord> {

    private static final long serialVersionUID = -1638354836;

    /**
     * The reference instance of <code>vnw_core.tblresume_upgrading_location</code>
     */
    public static final TblresumeUpgradingLocation TBLRESUME_UPGRADING_LOCATION = new TblresumeUpgradingLocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeUpgradingLocationRecord> getRecordType() {
        return TblresumeUpgradingLocationRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_upgrading_location.entryid</code>.
     */
    public final TableField<TblresumeUpgradingLocationRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading_location.resumeid</code>.
     */
    public final TableField<TblresumeUpgradingLocationRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading_location.cityid</code>.
     */
    public final TableField<TblresumeUpgradingLocationRecord, Integer> CITYID = createField("cityid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.tblresume_upgrading_location</code> table reference
     */
    public TblresumeUpgradingLocation() {
        this("tblresume_upgrading_location", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_upgrading_location</code> table reference
     */
    public TblresumeUpgradingLocation(String alias) {
        this(alias, TBLRESUME_UPGRADING_LOCATION);
    }

    private TblresumeUpgradingLocation(String alias, Table<TblresumeUpgradingLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeUpgradingLocation(String alias, Table<TblresumeUpgradingLocationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblresumeUpgradingLocationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_UPGRADING_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeUpgradingLocationRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_UPGRADING_LOCATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeUpgradingLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeUpgradingLocationRecord>>asList(Keys.KEY_TBLRESUME_UPGRADING_LOCATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgradingLocation as(String alias) {
        return new TblresumeUpgradingLocation(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeUpgradingLocation rename(String name) {
        return new TblresumeUpgradingLocation(name, null);
    }
}
