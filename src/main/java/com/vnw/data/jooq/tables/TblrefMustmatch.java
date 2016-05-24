/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefMustmatchRecord;

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
public class TblrefMustmatch extends TableImpl<TblrefMustmatchRecord> {

    private static final long serialVersionUID = 1187084155;

    /**
     * The reference instance of <code>vnw_core.tblref_mustmatch</code>
     */
    public static final TblrefMustmatch TBLREF_MUSTMATCH = new TblrefMustmatch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefMustmatchRecord> getRecordType() {
        return TblrefMustmatchRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_mustmatch.mustmatchid</code>.
     */
    public final TableField<TblrefMustmatchRecord, Byte> MUSTMATCHID = createField("mustmatchid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_mustmatch.languageid</code>.
     */
    public final TableField<TblrefMustmatchRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_mustmatch.mustmatchname</code>.
     */
    public final TableField<TblrefMustmatchRecord, String> MUSTMATCHNAME = createField("mustmatchname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_mustmatch.mustmatchorder</code>.
     */
    public final TableField<TblrefMustmatchRecord, Byte> MUSTMATCHORDER = createField("mustmatchorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_mustmatch</code> table reference
     */
    public TblrefMustmatch() {
        this("tblref_mustmatch", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_mustmatch</code> table reference
     */
    public TblrefMustmatch(String alias) {
        this(alias, TBLREF_MUSTMATCH);
    }

    private TblrefMustmatch(String alias, Table<TblrefMustmatchRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefMustmatch(String alias, Table<TblrefMustmatchRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefMustmatchRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_MUSTMATCH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefMustmatchRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefMustmatchRecord>>asList(Keys.KEY_TBLREF_MUSTMATCH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefMustmatch as(String alias) {
        return new TblrefMustmatch(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefMustmatch rename(String name) {
        return new TblrefMustmatch(name, null);
    }
}
