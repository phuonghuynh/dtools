/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJobalertPeriodtypeRecord;

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
public class TblrefJobalertPeriodtype extends TableImpl<TblrefJobalertPeriodtypeRecord> {

    private static final long serialVersionUID = 2103499392;

    /**
     * The reference instance of <code>vnw_core.tblref_jobalert_periodtype</code>
     */
    public static final TblrefJobalertPeriodtype TBLREF_JOBALERT_PERIODTYPE = new TblrefJobalertPeriodtype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJobalertPeriodtypeRecord> getRecordType() {
        return TblrefJobalertPeriodtypeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_jobalert_periodtype.periodtypeid</code>.
     */
    public final TableField<TblrefJobalertPeriodtypeRecord, Byte> PERIODTYPEID = createField("periodtypeid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_jobalert_periodtype.languageid</code>.
     */
    public final TableField<TblrefJobalertPeriodtypeRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_jobalert_periodtype.periodtypename</code>.
     */
    public final TableField<TblrefJobalertPeriodtypeRecord, String> PERIODTYPENAME = createField("periodtypename", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_jobalert_periodtype.noofdays</code>.
     */
    public final TableField<TblrefJobalertPeriodtypeRecord, Integer> NOOFDAYS = createField("noofdays", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblref_jobalert_periodtype.periodtypeorder</code>.
     */
    public final TableField<TblrefJobalertPeriodtypeRecord, Byte> PERIODTYPEORDER = createField("periodtypeorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_jobalert_periodtype</code> table reference
     */
    public TblrefJobalertPeriodtype() {
        this("tblref_jobalert_periodtype", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_jobalert_periodtype</code> table reference
     */
    public TblrefJobalertPeriodtype(String alias) {
        this(alias, TBLREF_JOBALERT_PERIODTYPE);
    }

    private TblrefJobalertPeriodtype(String alias, Table<TblrefJobalertPeriodtypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJobalertPeriodtype(String alias, Table<TblrefJobalertPeriodtypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefJobalertPeriodtypeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBALERT_PERIODTYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJobalertPeriodtypeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJobalertPeriodtypeRecord>>asList(Keys.KEY_TBLREF_JOBALERT_PERIODTYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobalertPeriodtype as(String alias) {
        return new TblrefJobalertPeriodtype(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJobalertPeriodtype rename(String name) {
        return new TblrefJobalertPeriodtype(name, null);
    }
}
