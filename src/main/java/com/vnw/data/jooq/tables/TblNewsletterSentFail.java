/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblNewsletterSentFailRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class TblNewsletterSentFail extends TableImpl<TblNewsletterSentFailRecord> {

    private static final long serialVersionUID = -626899090;

    /**
     * The reference instance of <code>vnw_core.tbl_newsletter_sent_fail</code>
     */
    public static final TblNewsletterSentFail TBL_NEWSLETTER_SENT_FAIL = new TblNewsletterSentFail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblNewsletterSentFailRecord> getRecordType() {
        return TblNewsletterSentFailRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_newsletter_sent_fail.emails</code>.
     */
    public final TableField<TblNewsletterSentFailRecord, String> EMAILS = createField("emails", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_newsletter_sent_fail.datefail</code>.
     */
    public final TableField<TblNewsletterSentFailRecord, Timestamp> DATEFAIL = createField("datefail", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbl_newsletter_sent_fail</code> table reference
     */
    public TblNewsletterSentFail() {
        this("tbl_newsletter_sent_fail", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_newsletter_sent_fail</code> table reference
     */
    public TblNewsletterSentFail(String alias) {
        this(alias, TBL_NEWSLETTER_SENT_FAIL);
    }

    private TblNewsletterSentFail(String alias, Table<TblNewsletterSentFailRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblNewsletterSentFail(String alias, Table<TblNewsletterSentFailRecord> aliased, Field<?>[] parameters) {
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
    public TblNewsletterSentFail as(String alias) {
        return new TblNewsletterSentFail(alias, this);
    }

    /**
     * Rename this table
     */
    public TblNewsletterSentFail rename(String name) {
        return new TblNewsletterSentFail(name, null);
    }
}