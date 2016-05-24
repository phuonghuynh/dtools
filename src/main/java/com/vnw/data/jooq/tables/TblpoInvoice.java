/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblpoInvoiceRecord;

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
public class TblpoInvoice extends TableImpl<TblpoInvoiceRecord> {

    private static final long serialVersionUID = 111745868;

    /**
     * The reference instance of <code>vnw_core.tblpo_invoice</code>
     */
    public static final TblpoInvoice TBLPO_INVOICE = new TblpoInvoice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblpoInvoiceRecord> getRecordType() {
        return TblpoInvoiceRecord.class;
    }

    /**
     * The column <code>vnw_core.tblpo_invoice.id</code>.
     */
    public final TableField<TblpoInvoiceRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo_invoice.poId</code>.
     */
    public final TableField<TblpoInvoiceRecord, Integer> POID = createField("poId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo_invoice.invoiceNo</code>.
     */
    public final TableField<TblpoInvoiceRecord, String> INVOICENO = createField("invoiceNo", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo_invoice.createdOn</code>. Insert created time by code
     */
    public final TableField<TblpoInvoiceRecord, Timestamp> CREATEDON = createField("createdOn", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "Insert created time by code");

    /**
     * The column <code>vnw_core.tblpo_invoice.updateTS</code>. Auto insert and update current timestamp
     */
    public final TableField<TblpoInvoiceRecord, Timestamp> UPDATETS = createField("updateTS", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "Auto insert and update current timestamp");

    /**
     * Create a <code>vnw_core.tblpo_invoice</code> table reference
     */
    public TblpoInvoice() {
        this("tblpo_invoice", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblpo_invoice</code> table reference
     */
    public TblpoInvoice(String alias) {
        this(alias, TBLPO_INVOICE);
    }

    private TblpoInvoice(String alias, Table<TblpoInvoiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblpoInvoice(String alias, Table<TblpoInvoiceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblpoInvoiceRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLPO_INVOICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblpoInvoiceRecord> getPrimaryKey() {
        return Keys.KEY_TBLPO_INVOICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblpoInvoiceRecord>> getKeys() {
        return Arrays.<UniqueKey<TblpoInvoiceRecord>>asList(Keys.KEY_TBLPO_INVOICE_PRIMARY, Keys.KEY_TBLPO_INVOICE_POINVOICEUNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblpoInvoice as(String alias) {
        return new TblpoInvoice(alias, this);
    }

    /**
     * Rename this table
     */
    public TblpoInvoice rename(String name) {
        return new TblpoInvoice(name, null);
    }
}