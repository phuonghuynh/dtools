/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeUpgradingIndustryRecord;

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
public class TblresumeUpgradingIndustry extends TableImpl<TblresumeUpgradingIndustryRecord> {

    private static final long serialVersionUID = 1560653905;

    /**
     * The reference instance of <code>vnw_core.tblresume_upgrading_industry</code>
     */
    public static final TblresumeUpgradingIndustry TBLRESUME_UPGRADING_INDUSTRY = new TblresumeUpgradingIndustry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeUpgradingIndustryRecord> getRecordType() {
        return TblresumeUpgradingIndustryRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_upgrading_industry.entryid</code>.
     */
    public final TableField<TblresumeUpgradingIndustryRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading_industry.resumeid</code>.
     */
    public final TableField<TblresumeUpgradingIndustryRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading_industry.industryid</code>.
     */
    public final TableField<TblresumeUpgradingIndustryRecord, Short> INDUSTRYID = createField("industryid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>vnw_core.tblresume_upgrading_industry</code> table reference
     */
    public TblresumeUpgradingIndustry() {
        this("tblresume_upgrading_industry", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_upgrading_industry</code> table reference
     */
    public TblresumeUpgradingIndustry(String alias) {
        this(alias, TBLRESUME_UPGRADING_INDUSTRY);
    }

    private TblresumeUpgradingIndustry(String alias, Table<TblresumeUpgradingIndustryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeUpgradingIndustry(String alias, Table<TblresumeUpgradingIndustryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblresumeUpgradingIndustryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_UPGRADING_INDUSTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeUpgradingIndustryRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_UPGRADING_INDUSTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeUpgradingIndustryRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeUpgradingIndustryRecord>>asList(Keys.KEY_TBLRESUME_UPGRADING_INDUSTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgradingIndustry as(String alias) {
        return new TblresumeUpgradingIndustry(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeUpgradingIndustry rename(String name) {
        return new TblresumeUpgradingIndustry(name, null);
    }
}
