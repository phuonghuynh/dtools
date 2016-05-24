/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefBenefitRecord;

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


/**
 * Reference table for benefit name of job & employer
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblrefBenefit extends TableImpl<TblrefBenefitRecord> {

    private static final long serialVersionUID = 1118893104;

    /**
     * The reference instance of <code>vnw_core.tblref_benefit</code>
     */
    public static final TblrefBenefit TBLREF_BENEFIT = new TblrefBenefit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefBenefitRecord> getRecordType() {
        return TblrefBenefitRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_benefit.benefitId</code>.
     */
    public final TableField<TblrefBenefitRecord, UByte> BENEFITID = createField("benefitId", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_benefit.benefitName</code>.
     */
    public final TableField<TblrefBenefitRecord, String> BENEFITNAME = createField("benefitName", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_benefit.benefitIconName</code>. Name of Icon showed in site with font awesome
     */
    public final TableField<TblrefBenefitRecord, String> BENEFITICONNAME = createField("benefitIconName", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "Name of Icon showed in site with font awesome");

    /**
     * Create a <code>vnw_core.tblref_benefit</code> table reference
     */
    public TblrefBenefit() {
        this("tblref_benefit", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_benefit</code> table reference
     */
    public TblrefBenefit(String alias) {
        this(alias, TBLREF_BENEFIT);
    }

    private TblrefBenefit(String alias, Table<TblrefBenefitRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefBenefit(String alias, Table<TblrefBenefitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Reference table for benefit name of job & employer");
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
    public Identity<TblrefBenefitRecord, UByte> getIdentity() {
        return Keys.IDENTITY_TBLREF_BENEFIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefBenefitRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_BENEFIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefBenefitRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefBenefitRecord>>asList(Keys.KEY_TBLREF_BENEFIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBenefit as(String alias) {
        return new TblrefBenefit(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefBenefit rename(String name) {
        return new TblrefBenefit(name, null);
    }
}
