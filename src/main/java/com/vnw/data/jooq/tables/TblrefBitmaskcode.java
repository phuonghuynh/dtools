/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefBitmaskcodeRecord;

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
public class TblrefBitmaskcode extends TableImpl<TblrefBitmaskcodeRecord> {

    private static final long serialVersionUID = -1935884481;

    /**
     * The reference instance of <code>vnw_core.tblref_bitmaskcode</code>
     */
    public static final TblrefBitmaskcode TBLREF_BITMASKCODE = new TblrefBitmaskcode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefBitmaskcodeRecord> getRecordType() {
        return TblrefBitmaskcodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_bitmaskcode.bitmask_id</code>.
     */
    public final TableField<TblrefBitmaskcodeRecord, Integer> BITMASK_ID = createField("bitmask_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_bitmaskcode.bitmask_code</code>.
     */
    public final TableField<TblrefBitmaskcodeRecord, String> BITMASK_CODE = createField("bitmask_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_bitmaskcode.bitmask_mask</code>.
     */
    public final TableField<TblrefBitmaskcodeRecord, Long> BITMASK_MASK = createField("bitmask_mask", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_bitmaskcode.group_code</code>.
     */
    public final TableField<TblrefBitmaskcodeRecord, String> GROUP_CODE = createField("group_code", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tblref_bitmaskcode</code> table reference
     */
    public TblrefBitmaskcode() {
        this("tblref_bitmaskcode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_bitmaskcode</code> table reference
     */
    public TblrefBitmaskcode(String alias) {
        this(alias, TBLREF_BITMASKCODE);
    }

    private TblrefBitmaskcode(String alias, Table<TblrefBitmaskcodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefBitmaskcode(String alias, Table<TblrefBitmaskcodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefBitmaskcodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLREF_BITMASKCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefBitmaskcodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_BITMASKCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefBitmaskcodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefBitmaskcodeRecord>>asList(Keys.KEY_TBLREF_BITMASKCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBitmaskcode as(String alias) {
        return new TblrefBitmaskcode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefBitmaskcode rename(String name) {
        return new TblrefBitmaskcode(name, null);
    }
}