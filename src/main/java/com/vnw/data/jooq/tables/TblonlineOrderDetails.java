/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblonlineOrderDetailsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TblonlineOrderDetails extends TableImpl<TblonlineOrderDetailsRecord> {

    private static final long serialVersionUID = -476922187;

    /**
     * The reference instance of <code>vnw_core.tblonline_order_details</code>
     */
    public static final TblonlineOrderDetails TBLONLINE_ORDER_DETAILS = new TblonlineOrderDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblonlineOrderDetailsRecord> getRecordType() {
        return TblonlineOrderDetailsRecord.class;
    }

    /**
     * The column <code>vnw_core.tblonline_order_details.orderId</code>. Payment Offline Id
     */
    public final TableField<TblonlineOrderDetailsRecord, UInteger> ORDERID = createField("orderId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Payment Offline Id");

    /**
     * The column <code>vnw_core.tblonline_order_details.productId</code>. Map to id of table tblonline_product
     */
    public final TableField<TblonlineOrderDetailsRecord, UInteger> PRODUCTID = createField("productId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Map to id of table tblonline_product");

    /**
     * The column <code>vnw_core.tblonline_order_details.quantity</code>. quantity of productId for paymentId
     */
    public final TableField<TblonlineOrderDetailsRecord, UInteger> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "quantity of productId for paymentId");

    /**
     * Create a <code>vnw_core.tblonline_order_details</code> table reference
     */
    public TblonlineOrderDetails() {
        this("tblonline_order_details", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblonline_order_details</code> table reference
     */
    public TblonlineOrderDetails(String alias) {
        this(alias, TBLONLINE_ORDER_DETAILS);
    }

    private TblonlineOrderDetails(String alias, Table<TblonlineOrderDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblonlineOrderDetails(String alias, Table<TblonlineOrderDetailsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblonlineOrderDetailsRecord> getPrimaryKey() {
        return Keys.KEY_TBLONLINE_ORDER_DETAILS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblonlineOrderDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<TblonlineOrderDetailsRecord>>asList(Keys.KEY_TBLONLINE_ORDER_DETAILS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblonlineOrderDetails as(String alias) {
        return new TblonlineOrderDetails(alias, this);
    }

    /**
     * Rename this table
     */
    public TblonlineOrderDetails rename(String name) {
        return new TblonlineOrderDetails(name, null);
    }
}
