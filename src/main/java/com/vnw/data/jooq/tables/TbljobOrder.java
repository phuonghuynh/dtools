/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobOrderRecord;

import java.sql.Timestamp;
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
public class TbljobOrder extends TableImpl<TbljobOrderRecord> {

    private static final long serialVersionUID = 1085968794;

    /**
     * The reference instance of <code>vnw_core.tbljob_order</code>
     */
    public static final TbljobOrder TBLJOB_ORDER = new TbljobOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobOrderRecord> getRecordType() {
        return TbljobOrderRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_order.joborderid</code>.
     */
    public final TableField<TbljobOrderRecord, Integer> JOBORDERID = createField("joborderid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.jobid</code>.
     */
    public final TableField<TbljobOrderRecord, Integer> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.jobfeeid</code>.
     */
    public final TableField<TbljobOrderRecord, Integer> JOBFEEID = createField("jobfeeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.paymentfee</code>.
     */
    public final TableField<TbljobOrderRecord, Double> PAYMENTFEE = createField("paymentfee", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.currencytype</code>.
     */
    public final TableField<TbljobOrderRecord, String> CURRENCYTYPE = createField("currencytype", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.field("USD", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.discountid</code>.
     */
    public final TableField<TbljobOrderRecord, Byte> DISCOUNTID = createField("discountid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tbljob_order.discountpercent</code>.
     */
    public final TableField<TbljobOrderRecord, Double> DISCOUNTPERCENT = createField("discountpercent", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.createddate</code>.
     */
    public final TableField<TbljobOrderRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_order.ispaid</code>.
     */
    public final TableField<TbljobOrderRecord, Byte> ISPAID = createField("ispaid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.paiddate</code>.
     */
    public final TableField<TbljobOrderRecord, Timestamp> PAIDDATE = createField("paiddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_order.paidperson</code>.
     */
    public final TableField<TbljobOrderRecord, String> PAIDPERSON = createField("paidperson", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tbljob_order.updateduserid</code>.
     */
    public final TableField<TbljobOrderRecord, Integer> UPDATEDUSERID = createField("updateduserid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.tbljob_order</code> table reference
     */
    public TbljobOrder() {
        this("tbljob_order", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_order</code> table reference
     */
    public TbljobOrder(String alias) {
        this(alias, TBLJOB_ORDER);
    }

    private TbljobOrder(String alias, Table<TbljobOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobOrder(String alias, Table<TbljobOrderRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLJOB_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobOrderRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobOrderRecord>>asList(Keys.KEY_TBLJOB_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOrder as(String alias) {
        return new TbljobOrder(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobOrder rename(String name) {
        return new TbljobOrder(name, null);
    }
}
