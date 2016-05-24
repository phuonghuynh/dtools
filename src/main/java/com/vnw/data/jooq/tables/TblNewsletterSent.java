/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblNewsletterSentRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TblNewsletterSent extends TableImpl<TblNewsletterSentRecord> {

    private static final long serialVersionUID = -1195965497;

    /**
     * The reference instance of <code>vnw_core.tbl_newsletter_sent</code>
     */
    public static final TblNewsletterSent TBL_NEWSLETTER_SENT = new TblNewsletterSent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblNewsletterSentRecord> getRecordType() {
        return TblNewsletterSentRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_newsletter_sent.email</code>.
     */
    public final TableField<TblNewsletterSentRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(233).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>vnw_core.tbl_newsletter_sent</code> table reference
     */
    public TblNewsletterSent() {
        this("tbl_newsletter_sent", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_newsletter_sent</code> table reference
     */
    public TblNewsletterSent(String alias) {
        this(alias, TBL_NEWSLETTER_SENT);
    }

    private TblNewsletterSent(String alias, Table<TblNewsletterSentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblNewsletterSent(String alias, Table<TblNewsletterSentRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblNewsletterSentRecord> getPrimaryKey() {
        return Keys.KEY_TBL_NEWSLETTER_SENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblNewsletterSentRecord>> getKeys() {
        return Arrays.<UniqueKey<TblNewsletterSentRecord>>asList(Keys.KEY_TBL_NEWSLETTER_SENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterSent as(String alias) {
        return new TblNewsletterSent(alias, this);
    }

    /**
     * Rename this table
     */
    public TblNewsletterSent rename(String name) {
        return new TblNewsletterSent(name, null);
    }
}