/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblsysIndustryMetatagRecord;

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
public class TblsysIndustryMetatag extends TableImpl<TblsysIndustryMetatagRecord> {

    private static final long serialVersionUID = 1702357251;

    /**
     * The reference instance of <code>vnw_core.tblsys_industry_metatag</code>
     */
    public static final TblsysIndustryMetatag TBLSYS_INDUSTRY_METATAG = new TblsysIndustryMetatag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblsysIndustryMetatagRecord> getRecordType() {
        return TblsysIndustryMetatagRecord.class;
    }

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.entryid</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, Short> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.industryid</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, Integer> INDUSTRYID = createField("industryid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.languageid</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.robots</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, String> ROBOTS = createField("robots", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.pagetitle</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, String> PAGETITLE = createField("pagetitle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.pagefooter</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, String> PAGEFOOTER = createField("pagefooter", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.pagedesc</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, String> PAGEDESC = createField("pagedesc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblsys_industry_metatag.keyword</code>.
     */
    public final TableField<TblsysIndustryMetatagRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>vnw_core.tblsys_industry_metatag</code> table reference
     */
    public TblsysIndustryMetatag() {
        this("tblsys_industry_metatag", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblsys_industry_metatag</code> table reference
     */
    public TblsysIndustryMetatag(String alias) {
        this(alias, TBLSYS_INDUSTRY_METATAG);
    }

    private TblsysIndustryMetatag(String alias, Table<TblsysIndustryMetatagRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblsysIndustryMetatag(String alias, Table<TblsysIndustryMetatagRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblsysIndustryMetatagRecord, Short> getIdentity() {
        return Keys.IDENTITY_TBLSYS_INDUSTRY_METATAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblsysIndustryMetatagRecord> getPrimaryKey() {
        return Keys.KEY_TBLSYS_INDUSTRY_METATAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblsysIndustryMetatagRecord>> getKeys() {
        return Arrays.<UniqueKey<TblsysIndustryMetatagRecord>>asList(Keys.KEY_TBLSYS_INDUSTRY_METATAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysIndustryMetatag as(String alias) {
        return new TblsysIndustryMetatag(alias, this);
    }

    /**
     * Rename this table
     */
    public TblsysIndustryMetatag rename(String name) {
        return new TblsysIndustryMetatag(name, null);
    }
}
