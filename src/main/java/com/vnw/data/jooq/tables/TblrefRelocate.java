/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefRelocateRecord;

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
public class TblrefRelocate extends TableImpl<TblrefRelocateRecord> {

    private static final long serialVersionUID = 1046623178;

    /**
     * The reference instance of <code>vnw_core.tblref_relocate</code>
     */
    public static final TblrefRelocate TBLREF_RELOCATE = new TblrefRelocate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefRelocateRecord> getRecordType() {
        return TblrefRelocateRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_relocate.relocateid</code>.
     */
    public final TableField<TblrefRelocateRecord, Byte> RELOCATEID = createField("relocateid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_relocate.languageid</code>.
     */
    public final TableField<TblrefRelocateRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_relocate.relocatename</code>.
     */
    public final TableField<TblrefRelocateRecord, String> RELOCATENAME = createField("relocatename", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_relocate.relocateorder</code>.
     */
    public final TableField<TblrefRelocateRecord, Byte> RELOCATEORDER = createField("relocateorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_relocate</code> table reference
     */
    public TblrefRelocate() {
        this("tblref_relocate", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_relocate</code> table reference
     */
    public TblrefRelocate(String alias) {
        this(alias, TBLREF_RELOCATE);
    }

    private TblrefRelocate(String alias, Table<TblrefRelocateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefRelocate(String alias, Table<TblrefRelocateRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefRelocateRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_RELOCATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefRelocateRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefRelocateRecord>>asList(Keys.KEY_TBLREF_RELOCATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefRelocate as(String alias) {
        return new TblrefRelocate(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefRelocate rename(String name) {
        return new TblrefRelocate(name, null);
    }
}