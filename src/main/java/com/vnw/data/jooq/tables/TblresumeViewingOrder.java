/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeViewingOrderRecord;

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
public class TblresumeViewingOrder extends TableImpl<TblresumeViewingOrderRecord> {

    private static final long serialVersionUID = -694491865;

    /**
     * The reference instance of <code>vnw_core.tblresume_viewing_order</code>
     */
    public static final TblresumeViewingOrder TBLRESUME_VIEWING_ORDER = new TblresumeViewingOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeViewingOrderRecord> getRecordType() {
        return TblresumeViewingOrderRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_viewing_order.orderid</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> ORDERID = createField("orderid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.userid</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.languageid</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.resumeviewingoptionid</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Byte> RESUMEVIEWINGOPTIONID = createField("resumeviewingoptionid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.billingcontactid</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> BILLINGCONTACTID = createField("billingcontactid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.paymentfee</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Double> PAYMENTFEE = createField("paymentfee", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.cv_bought</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> CV_BOUGHT = createField("cv_bought", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.cv_promotion</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> CV_PROMOTION = createField("cv_promotion", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.cv_remaining</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> CV_REMAINING = createField("cv_remaining", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.registereddate</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Timestamp> REGISTEREDDATE = createField("registereddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.activedate</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Timestamp> ACTIVEDATE = createField("activedate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.durationdays</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Short> DURATIONDAYS = createField("durationdays", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("30", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.expireddate</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.ispaid</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Byte> ISPAID = createField("ispaid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.islocked</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Byte> ISLOCKED = createField("islocked", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.islockedby</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Byte> ISLOCKEDBY = createField("islockedby", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewing_order.product_id</code>.
     */
    public final TableField<TblresumeViewingOrderRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.tblresume_viewing_order</code> table reference
     */
    public TblresumeViewingOrder() {
        this("tblresume_viewing_order", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_viewing_order</code> table reference
     */
    public TblresumeViewingOrder(String alias) {
        this(alias, TBLRESUME_VIEWING_ORDER);
    }

    private TblresumeViewingOrder(String alias, Table<TblresumeViewingOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeViewingOrder(String alias, Table<TblresumeViewingOrderRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblresumeViewingOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_VIEWING_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeViewingOrderRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_VIEWING_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeViewingOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeViewingOrderRecord>>asList(Keys.KEY_TBLRESUME_VIEWING_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeViewingOrder as(String alias) {
        return new TblresumeViewingOrder(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeViewingOrder rename(String name) {
        return new TblresumeViewingOrder(name, null);
    }
}
