/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblfeedbackQuestion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TblfeedbackQuestionRecord extends UpdatableRecordImpl<TblfeedbackQuestionRecord> implements Record11<Integer, Byte, String, String, String, Byte, Byte, String, String, Byte, Timestamp> {

    private static final long serialVersionUID = -140303144;

    /**
     * Setter for <code>vnw_core.tblfeedback_question.fbid</code>.
     */
    public void setFbid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.fbid</code>.
     */
    public Integer getFbid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.youareid</code>.
     */
    public void setYouareid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.youareid</code>.
     */
    public Byte getYouareid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.fullname</code>.
     */
    public void setFullname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.fullname</code>.
     */
    public String getFullname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.companyname</code>.
     */
    public void setCompanyname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.companyname</code>.
     */
    public String getCompanyname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.typeid</code>.
     */
    public void setTypeid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.typeid</code>.
     */
    public Byte getTypeid() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.topicid</code>.
     */
    public void setTopicid(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.topicid</code>.
     */
    public Byte getTopicid() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.fbsubject</code>.
     */
    public void setFbsubject(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.fbsubject</code>.
     */
    public String getFbsubject() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.fbcontent</code>.
     */
    public void setFbcontent(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.fbcontent</code>.
     */
    public String getFbcontent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.isanswer</code>.
     */
    public void setIsanswer(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.isanswer</code>.
     */
    public Byte getIsanswer() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblfeedback_question.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblfeedback_question.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Byte, String, String, String, Byte, Byte, String, String, Byte, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Byte, String, String, String, Byte, Byte, String, String, Byte, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.FBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.YOUAREID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.FULLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.COMPANYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.TYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.TOPICID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.FBSUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.FBCONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.ISANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TblfeedbackQuestion.TBLFEEDBACK_QUESTION.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFbid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getYouareid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCompanyname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getTypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getTopicid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFbsubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFbcontent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsanswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value1(Integer value) {
        setFbid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value2(Byte value) {
        setYouareid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value3(String value) {
        setFullname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value5(String value) {
        setCompanyname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value6(Byte value) {
        setTypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value7(Byte value) {
        setTopicid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value8(String value) {
        setFbsubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value9(String value) {
        setFbcontent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value10(Byte value) {
        setIsanswer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord value11(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblfeedbackQuestionRecord values(Integer value1, Byte value2, String value3, String value4, String value5, Byte value6, Byte value7, String value8, String value9, Byte value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblfeedbackQuestionRecord
     */
    public TblfeedbackQuestionRecord() {
        super(TblfeedbackQuestion.TBLFEEDBACK_QUESTION);
    }

    /**
     * Create a detached, initialised TblfeedbackQuestionRecord
     */
    public TblfeedbackQuestionRecord(Integer fbid, Byte youareid, String fullname, String email, String companyname, Byte typeid, Byte topicid, String fbsubject, String fbcontent, Byte isanswer, Timestamp createddate) {
        super(TblfeedbackQuestion.TBLFEEDBACK_QUESTION);

        set(0, fbid);
        set(1, youareid);
        set(2, fullname);
        set(3, email);
        set(4, companyname);
        set(5, typeid);
        set(6, topicid);
        set(7, fbsubject);
        set(8, fbcontent);
        set(9, isanswer);
        set(10, createddate);
    }
}
