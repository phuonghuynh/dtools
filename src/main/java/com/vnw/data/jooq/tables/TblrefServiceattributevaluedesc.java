/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefServiceattributevaluedescRecord;

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
public class TblrefServiceattributevaluedesc extends TableImpl<TblrefServiceattributevaluedescRecord> {

    private static final long serialVersionUID = 420846607;

    /**
     * The reference instance of <code>vnw_core.tblref_serviceattributevaluedesc</code>
     */
    public static final TblrefServiceattributevaluedesc TBLREF_SERVICEATTRIBUTEVALUEDESC = new TblrefServiceattributevaluedesc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefServiceattributevaluedescRecord> getRecordType() {
        return TblrefServiceattributevaluedescRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_serviceattributevaluedesc.attrvalue_id</code>.
     */
    public final TableField<TblrefServiceattributevaluedescRecord, Integer> ATTRVALUE_ID = createField("attrvalue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributevaluedesc.languageid</code>.
     */
    public final TableField<TblrefServiceattributevaluedescRecord, Short> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributevaluedesc.attrvaluedesc_name</code>.
     */
    public final TableField<TblrefServiceattributevaluedescRecord, String> ATTRVALUEDESC_NAME = createField("attrvaluedesc_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributevaluedesc.attrvaluedesc_desc</code>.
     */
    public final TableField<TblrefServiceattributevaluedescRecord, String> ATTRVALUEDESC_DESC = createField("attrvaluedesc_desc", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributevaluedesc.attrvaluedesc_order</code>.
     */
    public final TableField<TblrefServiceattributevaluedescRecord, Integer> ATTRVALUEDESC_ORDER = createField("attrvaluedesc_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tblref_serviceattributevaluedesc</code> table reference
     */
    public TblrefServiceattributevaluedesc() {
        this("tblref_serviceattributevaluedesc", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_serviceattributevaluedesc</code> table reference
     */
    public TblrefServiceattributevaluedesc(String alias) {
        this(alias, TBLREF_SERVICEATTRIBUTEVALUEDESC);
    }

    private TblrefServiceattributevaluedesc(String alias, Table<TblrefServiceattributevaluedescRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefServiceattributevaluedesc(String alias, Table<TblrefServiceattributevaluedescRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefServiceattributevaluedescRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SERVICEATTRIBUTEVALUEDESC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefServiceattributevaluedescRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefServiceattributevaluedescRecord>>asList(Keys.KEY_TBLREF_SERVICEATTRIBUTEVALUEDESC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributevaluedesc as(String alias) {
        return new TblrefServiceattributevaluedesc(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefServiceattributevaluedesc rename(String name) {
        return new TblrefServiceattributevaluedesc(name, null);
    }
}
