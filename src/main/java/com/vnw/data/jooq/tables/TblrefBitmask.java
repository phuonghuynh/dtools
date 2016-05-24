/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefBitmaskRecord;

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
public class TblrefBitmask extends TableImpl<TblrefBitmaskRecord> {

    private static final long serialVersionUID = -1585915823;

    /**
     * The reference instance of <code>vnw_core.tblref_bitmask</code>
     */
    public static final TblrefBitmask TBLREF_BITMASK = new TblrefBitmask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefBitmaskRecord> getRecordType() {
        return TblrefBitmaskRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_bitmask.bitmask_id</code>.
     */
    public final TableField<TblrefBitmaskRecord, Integer> BITMASK_ID = createField("bitmask_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_bitmask.languageid</code>.
     */
    public final TableField<TblrefBitmaskRecord, Short> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_bitmask.bitmask_name</code>.
     */
    public final TableField<TblrefBitmaskRecord, String> BITMASK_NAME = createField("bitmask_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_bitmask</code> table reference
     */
    public TblrefBitmask() {
        this("tblref_bitmask", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_bitmask</code> table reference
     */
    public TblrefBitmask(String alias) {
        this(alias, TBLREF_BITMASK);
    }

    private TblrefBitmask(String alias, Table<TblrefBitmaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefBitmask(String alias, Table<TblrefBitmaskRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefBitmaskRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_BITMASK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefBitmaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefBitmaskRecord>>asList(Keys.KEY_TBLREF_BITMASK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmask as(String alias) {
        return new TblrefBitmask(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefBitmask rename(String name) {
        return new TblrefBitmask(name, null);
    }
}
