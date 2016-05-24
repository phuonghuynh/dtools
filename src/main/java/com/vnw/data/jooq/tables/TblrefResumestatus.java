/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefResumestatusRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;


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
public class TblrefResumestatus extends TableImpl<TblrefResumestatusRecord> {

    private static final long serialVersionUID = 239719734;

    /**
     * The reference instance of <code>vnw_core.tblref_resumestatus</code>
     */
    public static final TblrefResumestatus TBLREF_RESUMESTATUS = new TblrefResumestatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefResumestatusRecord> getRecordType() {
        return TblrefResumestatusRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_resumestatus.resumestatus_id</code>.
     */
    public final TableField<TblrefResumestatusRecord, UByte> RESUMESTATUS_ID = createField("resumestatus_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tblref_resumestatus.languageid</code>.
     */
    public final TableField<TblrefResumestatusRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_resumestatus.resumestatus_name</code>.
     */
    public final TableField<TblrefResumestatusRecord, String> RESUMESTATUS_NAME = createField("resumestatus_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblref_resumestatus.resumestatus_order</code>.
     */
    public final TableField<TblrefResumestatusRecord, UByte> RESUMESTATUS_ORDER = createField("resumestatus_order", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * Create a <code>vnw_core.tblref_resumestatus</code> table reference
     */
    public TblrefResumestatus() {
        this("tblref_resumestatus", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_resumestatus</code> table reference
     */
    public TblrefResumestatus(String alias) {
        this(alias, TBLREF_RESUMESTATUS);
    }

    private TblrefResumestatus(String alias, Table<TblrefResumestatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefResumestatus(String alias, Table<TblrefResumestatusRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefResumestatusRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_RESUMESTATUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefResumestatusRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefResumestatusRecord>>asList(Keys.KEY_TBLREF_RESUMESTATUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefResumestatus as(String alias) {
        return new TblrefResumestatus(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefResumestatus rename(String name) {
        return new TblrefResumestatus(name, null);
    }
}