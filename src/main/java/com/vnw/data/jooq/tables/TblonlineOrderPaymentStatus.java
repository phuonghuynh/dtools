/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblonlineOrderPaymentStatusRecord;

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
import org.jooq.types.UInteger;


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
public class TblonlineOrderPaymentStatus extends TableImpl<TblonlineOrderPaymentStatusRecord> {

    private static final long serialVersionUID = -1325897520;

    /**
     * The reference instance of <code>vnw_core.tblonline_order_payment_status</code>
     */
    public static final TblonlineOrderPaymentStatus TBLONLINE_ORDER_PAYMENT_STATUS = new TblonlineOrderPaymentStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblonlineOrderPaymentStatusRecord> getRecordType() {
        return TblonlineOrderPaymentStatusRecord.class;
    }

    /**
     * The column <code>vnw_core.tblonline_order_payment_status.id</code>.
     */
    public final TableField<TblonlineOrderPaymentStatusRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblonline_order_payment_status.orderId</code>. Payment Online Id
     */
    public final TableField<TblonlineOrderPaymentStatusRecord, UInteger> ORDERID = createField("orderId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Payment Online Id");

    /**
     * The column <code>vnw_core.tblonline_order_payment_status.paidType</code>. 1: visa card, 2: ATM card, 0: offline
     */
    public final TableField<TblonlineOrderPaymentStatusRecord, Byte> PAIDTYPE = createField("paidType", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1: visa card, 2: ATM card, 0: offline");

    /**
     * The column <code>vnw_core.tblonline_order_payment_status.paidCode</code>.
     */
    public final TableField<TblonlineOrderPaymentStatusRecord, String> PAIDCODE = createField("paidCode", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>vnw_core.tblonline_order_payment_status.status</code>. 0: created, 1: success, 2: fail, 3: re-open
     */
    public final TableField<TblonlineOrderPaymentStatusRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0: created, 1: success, 2: fail, 3: re-open");

    /**
     * The column <code>vnw_core.tblonline_order_payment_status.createdDate</code>.  created date of test
     */
    public final TableField<TblonlineOrderPaymentStatusRecord, Timestamp> CREATEDDATE = createField("createdDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, " created date of test");

    /**
     * Create a <code>vnw_core.tblonline_order_payment_status</code> table reference
     */
    public TblonlineOrderPaymentStatus() {
        this("tblonline_order_payment_status", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblonline_order_payment_status</code> table reference
     */
    public TblonlineOrderPaymentStatus(String alias) {
        this(alias, TBLONLINE_ORDER_PAYMENT_STATUS);
    }

    private TblonlineOrderPaymentStatus(String alias, Table<TblonlineOrderPaymentStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblonlineOrderPaymentStatus(String alias, Table<TblonlineOrderPaymentStatusRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblonlineOrderPaymentStatusRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLONLINE_ORDER_PAYMENT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblonlineOrderPaymentStatusRecord> getPrimaryKey() {
        return Keys.KEY_TBLONLINE_ORDER_PAYMENT_STATUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblonlineOrderPaymentStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<TblonlineOrderPaymentStatusRecord>>asList(Keys.KEY_TBLONLINE_ORDER_PAYMENT_STATUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderPaymentStatus as(String alias) {
        return new TblonlineOrderPaymentStatus(alias, this);
    }

    /**
     * Rename this table
     */
    public TblonlineOrderPaymentStatus rename(String name) {
        return new TblonlineOrderPaymentStatus(name, null);
    }
}