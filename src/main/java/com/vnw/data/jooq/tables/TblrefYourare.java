/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefYourareRecord;

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
public class TblrefYourare extends TableImpl<TblrefYourareRecord> {

    private static final long serialVersionUID = 962120323;

    /**
     * The reference instance of <code>vnw_core.tblref_yourare</code>
     */
    public static final TblrefYourare TBLREF_YOURARE = new TblrefYourare();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefYourareRecord> getRecordType() {
        return TblrefYourareRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_yourare.youareid</code>.
     */
    public final TableField<TblrefYourareRecord, Byte> YOUAREID = createField("youareid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_yourare.languageid</code>.
     */
    public final TableField<TblrefYourareRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_yourare.youarename</code>.
     */
    public final TableField<TblrefYourareRecord, String> YOUARENAME = createField("youarename", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblref_yourare.youareorder</code>.
     */
    public final TableField<TblrefYourareRecord, Byte> YOUAREORDER = createField("youareorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_yourare</code> table reference
     */
    public TblrefYourare() {
        this("tblref_yourare", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_yourare</code> table reference
     */
    public TblrefYourare(String alias) {
        this(alias, TBLREF_YOURARE);
    }

    private TblrefYourare(String alias, Table<TblrefYourareRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefYourare(String alias, Table<TblrefYourareRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefYourareRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_YOURARE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefYourareRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefYourareRecord>>asList(Keys.KEY_TBLREF_YOURARE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYourare as(String alias) {
        return new TblrefYourare(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefYourare rename(String name) {
        return new TblrefYourare(name, null);
    }
}
