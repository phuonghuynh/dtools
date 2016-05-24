/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobFeeRecord;

import java.math.BigDecimal;
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
public class TbljobFee extends TableImpl<TbljobFeeRecord> {

    private static final long serialVersionUID = 1489243709;

    /**
     * The reference instance of <code>vnw_core.tbljob_fee</code>
     */
    public static final TbljobFee TBLJOB_FEE = new TbljobFee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobFeeRecord> getRecordType() {
        return TbljobFeeRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_fee.jobfeeid</code>.
     */
    public final TableField<TbljobFeeRecord, Short> JOBFEEID = createField("jobfeeid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_fee.cityid</code>.
     */
    public final TableField<TbljobFeeRecord, Short> CITYID = createField("cityid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tbljob_fee.joboptionid</code>.
     */
    public final TableField<TbljobFeeRecord, Short> JOBOPTIONID = createField("joboptionid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tbljob_fee.jobfee</code>.
     */
    public final TableField<TbljobFeeRecord, BigDecimal> JOBFEE = createField("jobfee", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 4), this, "");

    /**
     * The column <code>vnw_core.tbljob_fee.currencytype</code>.
     */
    public final TableField<TbljobFeeRecord, String> CURRENCYTYPE = createField("currencytype", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.field("USD", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tbljob_fee.discountid</code>.
     */
    public final TableField<TbljobFeeRecord, Byte> DISCOUNTID = createField("discountid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tbljob_fee.discountpercent</code>.
     */
    public final TableField<TbljobFeeRecord, Double> DISCOUNTPERCENT = createField("discountpercent", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * Create a <code>vnw_core.tbljob_fee</code> table reference
     */
    public TbljobFee() {
        this("tbljob_fee", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_fee</code> table reference
     */
    public TbljobFee(String alias) {
        this(alias, TBLJOB_FEE);
    }

    private TbljobFee(String alias, Table<TbljobFeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobFee(String alias, Table<TbljobFeeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobFeeRecord, Short> getIdentity() {
        return Keys.IDENTITY_TBLJOB_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobFeeRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_FEE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobFeeRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobFeeRecord>>asList(Keys.KEY_TBLJOB_FEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFee as(String alias) {
        return new TbljobFee(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobFee rename(String name) {
        return new TbljobFee(name, null);
    }
}
