/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefRegionalRecord;

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
public class TblrefRegional extends TableImpl<TblrefRegionalRecord> {

    private static final long serialVersionUID = -1210862850;

    /**
     * The reference instance of <code>vnw_core.tblref_regional</code>
     */
    public static final TblrefRegional TBLREF_REGIONAL = new TblrefRegional();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefRegionalRecord> getRecordType() {
        return TblrefRegionalRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_regional.regionalid</code>.
     */
    public final TableField<TblrefRegionalRecord, Byte> REGIONALID = createField("regionalid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_regional.regionalemail</code>.
     */
    public final TableField<TblrefRegionalRecord, String> REGIONALEMAIL = createField("regionalemail", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_regional</code> table reference
     */
    public TblrefRegional() {
        this("tblref_regional", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_regional</code> table reference
     */
    public TblrefRegional(String alias) {
        this(alias, TBLREF_REGIONAL);
    }

    private TblrefRegional(String alias, Table<TblrefRegionalRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefRegional(String alias, Table<TblrefRegionalRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefRegionalRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_REGIONAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefRegionalRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_REGIONAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefRegionalRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefRegionalRecord>>asList(Keys.KEY_TBLREF_REGIONAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefRegional as(String alias) {
        return new TblrefRegional(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefRegional rename(String name) {
        return new TblrefRegional(name, null);
    }
}
