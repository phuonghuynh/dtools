/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefTopjobRecord;

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
public class TblrefTopjob extends TableImpl<TblrefTopjobRecord> {

    private static final long serialVersionUID = 1266924513;

    /**
     * The reference instance of <code>vnw_core.tblref_topjob</code>
     */
    public static final TblrefTopjob TBLREF_TOPJOB = new TblrefTopjob();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefTopjobRecord> getRecordType() {
        return TblrefTopjobRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_topjob.topjobtypeid</code>.
     */
    public final TableField<TblrefTopjobRecord, Byte> TOPJOBTYPEID = createField("topjobtypeid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_topjob.languageid</code>.
     */
    public final TableField<TblrefTopjobRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_topjob.topjobtypename</code>.
     */
    public final TableField<TblrefTopjobRecord, String> TOPJOBTYPENAME = createField("topjobtypename", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_topjob.topjobtypeorder</code>.
     */
    public final TableField<TblrefTopjobRecord, Byte> TOPJOBTYPEORDER = createField("topjobtypeorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_topjob</code> table reference
     */
    public TblrefTopjob() {
        this("tblref_topjob", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_topjob</code> table reference
     */
    public TblrefTopjob(String alias) {
        this(alias, TBLREF_TOPJOB);
    }

    private TblrefTopjob(String alias, Table<TblrefTopjobRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefTopjob(String alias, Table<TblrefTopjobRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefTopjobRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_TOPJOB_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefTopjobRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefTopjobRecord>>asList(Keys.KEY_TBLREF_TOPJOB_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefTopjob as(String alias) {
        return new TblrefTopjob(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefTopjob rename(String name) {
        return new TblrefTopjob(name, null);
    }
}
