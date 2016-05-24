/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblNewsletterSent;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TblNewsletterSentRecord extends UpdatableRecordImpl<TblNewsletterSentRecord> implements Record1<String> {

    private static final long serialVersionUID = -984657784;

    /**
     * Setter for <code>vnw_core.tbl_newsletter_sent.email</code>.
     */
    public void setEmail(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_newsletter_sent.email</code>.
     */
    public String getEmail() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TblNewsletterSent.TBL_NEWSLETTER_SENT.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterSentRecord value1(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterSentRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblNewsletterSentRecord
     */
    public TblNewsletterSentRecord() {
        super(TblNewsletterSent.TBL_NEWSLETTER_SENT);
    }

    /**
     * Create a detached, initialised TblNewsletterSentRecord
     */
    public TblNewsletterSentRecord(String email) {
        super(TblNewsletterSent.TBL_NEWSLETTER_SENT);

        set(0, email);
    }
}