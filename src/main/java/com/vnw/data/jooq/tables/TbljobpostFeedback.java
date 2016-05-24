/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobpostFeedbackRecord;

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
public class TbljobpostFeedback extends TableImpl<TbljobpostFeedbackRecord> {

    private static final long serialVersionUID = 762209388;

    /**
     * The reference instance of <code>vnw_core.tbljobpost_feedback</code>
     */
    public static final TbljobpostFeedback TBLJOBPOST_FEEDBACK = new TbljobpostFeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobpostFeedbackRecord> getRecordType() {
        return TbljobpostFeedbackRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljobpost_feedback.entryId</code>.
     */
    public final TableField<TbljobpostFeedbackRecord, UInteger> ENTRYID = createField("entryId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobpost_feedback.jobId</code>.
     */
    public final TableField<TbljobpostFeedbackRecord, Integer> JOBID = createField("jobId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobpost_feedback.sentDate</code>.
     */
    public final TableField<TbljobpostFeedbackRecord, Timestamp> SENTDATE = createField("sentDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljobpost_feedback.feedbackDate</code>.
     */
    public final TableField<TbljobpostFeedbackRecord, Timestamp> FEEDBACKDATE = createField("feedbackDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljobpost_feedback.feedback</code>.
     */
    public final TableField<TbljobpostFeedbackRecord, Byte> FEEDBACK = createField("feedback", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tbljobpost_feedback.feedbackDescription</code>.
     */
    public final TableField<TbljobpostFeedbackRecord, String> FEEDBACKDESCRIPTION = createField("feedbackDescription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>vnw_core.tbljobpost_feedback</code> table reference
     */
    public TbljobpostFeedback() {
        this("tbljobpost_feedback", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljobpost_feedback</code> table reference
     */
    public TbljobpostFeedback(String alias) {
        this(alias, TBLJOBPOST_FEEDBACK);
    }

    private TbljobpostFeedback(String alias, Table<TbljobpostFeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobpostFeedback(String alias, Table<TbljobpostFeedbackRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobpostFeedbackRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOBPOST_FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobpostFeedbackRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOBPOST_FEEDBACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobpostFeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobpostFeedbackRecord>>asList(Keys.KEY_TBLJOBPOST_FEEDBACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobpostFeedback as(String alias) {
        return new TbljobpostFeedback(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobpostFeedback rename(String name) {
        return new TbljobpostFeedback(name, null);
    }
}
