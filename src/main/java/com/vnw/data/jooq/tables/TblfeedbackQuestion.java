/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblfeedbackQuestionRecord;

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
public class TblfeedbackQuestion extends TableImpl<TblfeedbackQuestionRecord> {

    private static final long serialVersionUID = 515795366;

    /**
     * The reference instance of <code>vnw_core.tblfeedback_question</code>
     */
    public static final TblfeedbackQuestion TBLFEEDBACK_QUESTION = new TblfeedbackQuestion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblfeedbackQuestionRecord> getRecordType() {
        return TblfeedbackQuestionRecord.class;
    }

    /**
     * The column <code>vnw_core.tblfeedback_question.fbid</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, Integer> FBID = createField("fbid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.youareid</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, Byte> YOUAREID = createField("youareid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.fullname</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, String> FULLNAME = createField("fullname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.email</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.companyname</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, String> COMPANYNAME = createField("companyname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.typeid</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, Byte> TYPEID = createField("typeid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.topicid</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, Byte> TOPICID = createField("topicid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.fbsubject</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, String> FBSUBJECT = createField("fbsubject", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.fbcontent</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, String> FBCONTENT = createField("fbcontent", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.isanswer</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, Byte> ISANSWER = createField("isanswer", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblfeedback_question.createddate</code>.
     */
    public final TableField<TblfeedbackQuestionRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblfeedback_question</code> table reference
     */
    public TblfeedbackQuestion() {
        this("tblfeedback_question", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblfeedback_question</code> table reference
     */
    public TblfeedbackQuestion(String alias) {
        this(alias, TBLFEEDBACK_QUESTION);
    }

    private TblfeedbackQuestion(String alias, Table<TblfeedbackQuestionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblfeedbackQuestion(String alias, Table<TblfeedbackQuestionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblfeedbackQuestionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLFEEDBACK_QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblfeedbackQuestionRecord> getPrimaryKey() {
        return Keys.KEY_TBLFEEDBACK_QUESTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblfeedbackQuestionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblfeedbackQuestionRecord>>asList(Keys.KEY_TBLFEEDBACK_QUESTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestion as(String alias) {
        return new TblfeedbackQuestion(alias, this);
    }

    /**
     * Rename this table
     */
    public TblfeedbackQuestion rename(String name) {
        return new TblfeedbackQuestion(name, null);
    }
}
