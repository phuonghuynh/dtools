/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblclientFeedbackRecord;

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
import org.jooq.types.UByte;
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
public class TblclientFeedback extends TableImpl<TblclientFeedbackRecord> {

    private static final long serialVersionUID = 1421261213;

    /**
     * The reference instance of <code>vnw_core.tblclient_feedback</code>
     */
    public static final TblclientFeedback TBLCLIENT_FEEDBACK = new TblclientFeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblclientFeedbackRecord> getRecordType() {
        return TblclientFeedbackRecord.class;
    }

    /**
     * The column <code>vnw_core.tblclient_feedback.feedbackid</code>.
     */
    public final TableField<TblclientFeedbackRecord, UInteger> FEEDBACKID = createField("feedbackid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblclient_feedback.clientid</code>.
     */
    public final TableField<TblclientFeedbackRecord, UInteger> CLIENTID = createField("clientid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>vnw_core.tblclient_feedback.suggestion</code>.
     */
    public final TableField<TblclientFeedbackRecord, String> SUGGESTION = createField("suggestion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblclient_feedback.useserviceagain</code>.
     */
    public final TableField<TblclientFeedbackRecord, UByte> USESERVICEAGAIN = createField("useserviceagain", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>vnw_core.tblclient_feedback.feedbackdate</code>.
     */
    public final TableField<TblclientFeedbackRecord, Timestamp> FEEDBACKDATE = createField("feedbackdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblclient_feedback</code> table reference
     */
    public TblclientFeedback() {
        this("tblclient_feedback", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblclient_feedback</code> table reference
     */
    public TblclientFeedback(String alias) {
        this(alias, TBLCLIENT_FEEDBACK);
    }

    private TblclientFeedback(String alias, Table<TblclientFeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblclientFeedback(String alias, Table<TblclientFeedbackRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblclientFeedbackRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLCLIENT_FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblclientFeedbackRecord> getPrimaryKey() {
        return Keys.KEY_TBLCLIENT_FEEDBACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblclientFeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<TblclientFeedbackRecord>>asList(Keys.KEY_TBLCLIENT_FEEDBACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientFeedback as(String alias) {
        return new TblclientFeedback(alias, this);
    }

    /**
     * Rename this table
     */
    public TblclientFeedback rename(String name) {
        return new TblclientFeedback(name, null);
    }
}
