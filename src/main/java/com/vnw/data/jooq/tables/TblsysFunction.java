/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblsysFunctionRecord;

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
public class TblsysFunction extends TableImpl<TblsysFunctionRecord> {

    private static final long serialVersionUID = -753087384;

    /**
     * The reference instance of <code>vnw_core.tblsys_function</code>
     */
    public static final TblsysFunction TBLSYS_FUNCTION = new TblsysFunction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblsysFunctionRecord> getRecordType() {
        return TblsysFunctionRecord.class;
    }

    /**
     * The column <code>vnw_core.tblsys_function.functionid</code>.
     */
    public final TableField<TblsysFunctionRecord, Short> FUNCTIONID = createField("functionid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblsys_function.moduleid</code>.
     */
    public final TableField<TblsysFunctionRecord, Short> MODULEID = createField("moduleid", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblsys_function.functionname</code>.
     */
    public final TableField<TblsysFunctionRecord, String> FUNCTIONNAME = createField("functionname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_function.parentid</code>.
     */
    public final TableField<TblsysFunctionRecord, Short> PARENTID = createField("parentid", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblsys_function.pageinfo</code>.
     */
    public final TableField<TblsysFunctionRecord, String> PAGEINFO = createField("pageinfo", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_function.checkscriptname</code>.
     */
    public final TableField<TblsysFunctionRecord, String> CHECKSCRIPTNAME = createField("checkscriptname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_function.functionorder</code>.
     */
    public final TableField<TblsysFunctionRecord, Short> FUNCTIONORDER = createField("functionorder", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblsys_function.isshowmenu</code>.
     */
    public final TableField<TblsysFunctionRecord, Byte> ISSHOWMENU = createField("isshowmenu", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>vnw_core.tblsys_function</code> table reference
     */
    public TblsysFunction() {
        this("tblsys_function", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblsys_function</code> table reference
     */
    public TblsysFunction(String alias) {
        this(alias, TBLSYS_FUNCTION);
    }

    private TblsysFunction(String alias, Table<TblsysFunctionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblsysFunction(String alias, Table<TblsysFunctionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblsysFunctionRecord, Short> getIdentity() {
        return Keys.IDENTITY_TBLSYS_FUNCTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblsysFunctionRecord> getPrimaryKey() {
        return Keys.KEY_TBLSYS_FUNCTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblsysFunctionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblsysFunctionRecord>>asList(Keys.KEY_TBLSYS_FUNCTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysFunction as(String alias) {
        return new TblsysFunction(alias, this);
    }

    /**
     * Rename this table
     */
    public TblsysFunction rename(String name) {
        return new TblsysFunction(name, null);
    }
}
