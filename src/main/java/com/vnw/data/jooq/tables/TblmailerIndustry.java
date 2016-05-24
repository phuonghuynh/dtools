/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblmailerIndustryRecord;

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
public class TblmailerIndustry extends TableImpl<TblmailerIndustryRecord> {

    private static final long serialVersionUID = -515176648;

    /**
     * The reference instance of <code>vnw_core.tblmailer_industry</code>
     */
    public static final TblmailerIndustry TBLMAILER_INDUSTRY = new TblmailerIndustry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblmailerIndustryRecord> getRecordType() {
        return TblmailerIndustryRecord.class;
    }

    /**
     * The column <code>vnw_core.tblmailer_industry.subscriberid</code>.
     */
    public final TableField<TblmailerIndustryRecord, Integer> SUBSCRIBERID = createField("subscriberid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblmailer_industry.industryid</code>.
     */
    public final TableField<TblmailerIndustryRecord, Short> INDUSTRYID = createField("industryid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>vnw_core.tblmailer_industry</code> table reference
     */
    public TblmailerIndustry() {
        this("tblmailer_industry", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblmailer_industry</code> table reference
     */
    public TblmailerIndustry(String alias) {
        this(alias, TBLMAILER_INDUSTRY);
    }

    private TblmailerIndustry(String alias, Table<TblmailerIndustryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblmailerIndustry(String alias, Table<TblmailerIndustryRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblmailerIndustryRecord> getPrimaryKey() {
        return Keys.KEY_TBLMAILER_INDUSTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblmailerIndustryRecord>> getKeys() {
        return Arrays.<UniqueKey<TblmailerIndustryRecord>>asList(Keys.KEY_TBLMAILER_INDUSTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblmailerIndustry as(String alias) {
        return new TblmailerIndustry(alias, this);
    }

    /**
     * Rename this table
     */
    public TblmailerIndustry rename(String name) {
        return new TblmailerIndustry(name, null);
    }
}