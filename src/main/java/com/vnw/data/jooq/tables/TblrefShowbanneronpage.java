/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefShowbanneronpageRecord;

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
public class TblrefShowbanneronpage extends TableImpl<TblrefShowbanneronpageRecord> {

    private static final long serialVersionUID = 322903993;

    /**
     * The reference instance of <code>vnw_core.tblref_showbanneronpage</code>
     */
    public static final TblrefShowbanneronpage TBLREF_SHOWBANNERONPAGE = new TblrefShowbanneronpage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefShowbanneronpageRecord> getRecordType() {
        return TblrefShowbanneronpageRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_showbanneronpage.pageid</code>.
     */
    public final TableField<TblrefShowbanneronpageRecord, Byte> PAGEID = createField("pageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_showbanneronpage.pagename</code>.
     */
    public final TableField<TblrefShowbanneronpageRecord, String> PAGENAME = createField("pagename", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_showbanneronpage.pageorder</code>.
     */
    public final TableField<TblrefShowbanneronpageRecord, Byte> PAGEORDER = createField("pageorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_showbanneronpage</code> table reference
     */
    public TblrefShowbanneronpage() {
        this("tblref_showbanneronpage", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_showbanneronpage</code> table reference
     */
    public TblrefShowbanneronpage(String alias) {
        this(alias, TBLREF_SHOWBANNERONPAGE);
    }

    private TblrefShowbanneronpage(String alias, Table<TblrefShowbanneronpageRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefShowbanneronpage(String alias, Table<TblrefShowbanneronpageRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefShowbanneronpageRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SHOWBANNERONPAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefShowbanneronpageRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefShowbanneronpageRecord>>asList(Keys.KEY_TBLREF_SHOWBANNERONPAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefShowbanneronpage as(String alias) {
        return new TblrefShowbanneronpage(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefShowbanneronpage rename(String name) {
        return new TblrefShowbanneronpage(name, null);
    }
}
