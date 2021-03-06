/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblemployerCompanyIndustryRecord;

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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Reference to table tblref_industry & tblemployer_companyinfo
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblemployerCompanyIndustry extends TableImpl<TblemployerCompanyIndustryRecord> {

    private static final long serialVersionUID = -1986717339;

    /**
     * The reference instance of <code>vnw_core.tblemployer_company_industry</code>
     */
    public static final TblemployerCompanyIndustry TBLEMPLOYER_COMPANY_INDUSTRY = new TblemployerCompanyIndustry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblemployerCompanyIndustryRecord> getRecordType() {
        return TblemployerCompanyIndustryRecord.class;
    }

    /**
     * The column <code>vnw_core.tblemployer_company_industry.entryId</code>.
     */
    public final TableField<TblemployerCompanyIndustryRecord, UInteger> ENTRYID = createField("entryId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblemployer_company_industry.companyId</code>. Reference to table tblemployer_companyinfo
     */
    public final TableField<TblemployerCompanyIndustryRecord, UInteger> COMPANYID = createField("companyId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Reference to table tblemployer_companyinfo");

    /**
     * The column <code>vnw_core.tblemployer_company_industry.industryId</code>. Reference to table tblref_industry
     */
    public final TableField<TblemployerCompanyIndustryRecord, UByte> INDUSTRYID = createField("industryId", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "Reference to table tblref_industry");

    /**
     * Create a <code>vnw_core.tblemployer_company_industry</code> table reference
     */
    public TblemployerCompanyIndustry() {
        this("tblemployer_company_industry", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblemployer_company_industry</code> table reference
     */
    public TblemployerCompanyIndustry(String alias) {
        this(alias, TBLEMPLOYER_COMPANY_INDUSTRY);
    }

    private TblemployerCompanyIndustry(String alias, Table<TblemployerCompanyIndustryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblemployerCompanyIndustry(String alias, Table<TblemployerCompanyIndustryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Reference to table tblref_industry & tblemployer_companyinfo");
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
    public Identity<TblemployerCompanyIndustryRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLEMPLOYER_COMPANY_INDUSTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblemployerCompanyIndustryRecord> getPrimaryKey() {
        return Keys.KEY_TBLEMPLOYER_COMPANY_INDUSTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblemployerCompanyIndustryRecord>> getKeys() {
        return Arrays.<UniqueKey<TblemployerCompanyIndustryRecord>>asList(Keys.KEY_TBLEMPLOYER_COMPANY_INDUSTRY_PRIMARY, Keys.KEY_TBLEMPLOYER_COMPANY_INDUSTRY_COMPANYID_INDUSTRYID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyIndustry as(String alias) {
        return new TblemployerCompanyIndustry(alias, this);
    }

    /**
     * Rename this table
     */
    public TblemployerCompanyIndustry rename(String name) {
        return new TblemployerCompanyIndustry(name, null);
    }
}
