/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJoboptionRecord;

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
public class TblrefJoboption extends TableImpl<TblrefJoboptionRecord> {

    private static final long serialVersionUID = 1682343381;

    /**
     * The reference instance of <code>vnw_core.tblref_joboption</code>
     */
    public static final TblrefJoboption TBLREF_JOBOPTION = new TblrefJoboption();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJoboptionRecord> getRecordType() {
        return TblrefJoboptionRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_joboption.joboptionid</code>.
     */
    public final TableField<TblrefJoboptionRecord, Byte> JOBOPTIONID = createField("joboptionid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_joboption.languageid</code>.
     */
    public final TableField<TblrefJoboptionRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_joboption.joboptionname</code>.
     */
    public final TableField<TblrefJoboptionRecord, String> JOBOPTIONNAME = createField("joboptionname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_joboption.joboptionorder</code>.
     */
    public final TableField<TblrefJoboptionRecord, Byte> JOBOPTIONORDER = createField("joboptionorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_joboption</code> table reference
     */
    public TblrefJoboption() {
        this("tblref_joboption", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_joboption</code> table reference
     */
    public TblrefJoboption(String alias) {
        this(alias, TBLREF_JOBOPTION);
    }

    private TblrefJoboption(String alias, Table<TblrefJoboptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJoboption(String alias, Table<TblrefJoboptionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefJoboptionRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBOPTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJoboptionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJoboptionRecord>>asList(Keys.KEY_TBLREF_JOBOPTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJoboption as(String alias) {
        return new TblrefJoboption(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJoboption rename(String name) {
        return new TblrefJoboption(name, null);
    }
}