/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefServiceoptionRecord;

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
public class TblrefServiceoption extends TableImpl<TblrefServiceoptionRecord> {

    private static final long serialVersionUID = 1100644439;

    /**
     * The reference instance of <code>vnw_core.tblref_serviceoption</code>
     */
    public static final TblrefServiceoption TBLREF_SERVICEOPTION = new TblrefServiceoption();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefServiceoptionRecord> getRecordType() {
        return TblrefServiceoptionRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_serviceoption.service_id</code>.
     */
    public final TableField<TblrefServiceoptionRecord, Integer> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceoption.attr_id</code>.
     */
    public final TableField<TblrefServiceoptionRecord, Integer> ATTR_ID = createField("attr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceoption.attrvalue_id</code>.
     */
    public final TableField<TblrefServiceoptionRecord, Integer> ATTRVALUE_ID = createField("attrvalue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceoption.option_price</code>.
     */
    public final TableField<TblrefServiceoptionRecord, Double> OPTION_PRICE = createField("option_price", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>vnw_core.tblref_serviceoption.option_duration</code>.
     */
    public final TableField<TblrefServiceoptionRecord, Integer> OPTION_DURATION = createField("option_duration", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblref_serviceoption.option_order</code>.
     */
    public final TableField<TblrefServiceoptionRecord, Short> OPTION_ORDER = createField("option_order", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblref_serviceoption.option_data</code>.
     */
    public final TableField<TblrefServiceoptionRecord, String> OPTION_DATA = createField("option_data", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_serviceoption</code> table reference
     */
    public TblrefServiceoption() {
        this("tblref_serviceoption", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_serviceoption</code> table reference
     */
    public TblrefServiceoption(String alias) {
        this(alias, TBLREF_SERVICEOPTION);
    }

    private TblrefServiceoption(String alias, Table<TblrefServiceoptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefServiceoption(String alias, Table<TblrefServiceoptionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefServiceoptionRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SERVICEOPTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefServiceoptionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefServiceoptionRecord>>asList(Keys.KEY_TBLREF_SERVICEOPTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceoption as(String alias) {
        return new TblrefServiceoption(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefServiceoption rename(String name) {
        return new TblrefServiceoption(name, null);
    }
}
