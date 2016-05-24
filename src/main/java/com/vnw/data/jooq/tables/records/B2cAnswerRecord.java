/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.B2cAnswer;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class B2cAnswerRecord extends UpdatableRecordImpl<B2cAnswerRecord> implements Record8<Integer, Integer, Integer, String, Timestamp, Integer, Integer, Integer> {

    private static final long serialVersionUID = 309856351;

    /**
     * Setter for <code>vnw_core.b2c_answer.answerid</code>.
     */
    public void setAnswerid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.answerid</code>.
     */
    public Integer getAnswerid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.questionid</code>.
     */
    public void setQuestionid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.questionid</code>.
     */
    public Integer getQuestionid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.userid</code>.
     */
    public void setUserid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.answer</code>.
     */
    public void setAnswer(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.answer</code>.
     */
    public String getAnswer() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.answer_date</code>.
     */
    public void setAnswerDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.answer_date</code>.
     */
    public Timestamp getAnswerDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.ispublished</code>.
     */
    public void setIspublished(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.ispublished</code>.
     */
    public Integer getIspublished() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.isapproved</code>.
     */
    public void setIsapproved(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.isapproved</code>.
     */
    public Integer getIsapproved() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>vnw_core.b2c_answer.views</code>.
     */
    public void setViews(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.b2c_answer.views</code>.
     */
    public Integer getViews() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, String, Timestamp, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, String, Timestamp, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return B2cAnswer.B2C_ANSWER.ANSWERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return B2cAnswer.B2C_ANSWER.QUESTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return B2cAnswer.B2C_ANSWER.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return B2cAnswer.B2C_ANSWER.ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return B2cAnswer.B2C_ANSWER.ANSWER_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return B2cAnswer.B2C_ANSWER.ISPUBLISHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return B2cAnswer.B2C_ANSWER.ISAPPROVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return B2cAnswer.B2C_ANSWER.VIEWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAnswerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getQuestionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getAnswerDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIspublished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getIsapproved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getViews();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value1(Integer value) {
        setAnswerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value2(Integer value) {
        setQuestionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value3(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value4(String value) {
        setAnswer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value5(Timestamp value) {
        setAnswerDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value6(Integer value) {
        setIspublished(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value7(Integer value) {
        setIsapproved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord value8(Integer value) {
        setViews(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cAnswerRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, Integer value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached B2cAnswerRecord
     */
    public B2cAnswerRecord() {
        super(B2cAnswer.B2C_ANSWER);
    }

    /**
     * Create a detached, initialised B2cAnswerRecord
     */
    public B2cAnswerRecord(Integer answerid, Integer questionid, Integer userid, String answer, Timestamp answerDate, Integer ispublished, Integer isapproved, Integer views) {
        super(B2cAnswer.B2C_ANSWER);

        set(0, answerid);
        set(1, questionid);
        set(2, userid);
        set(3, answer);
        set(4, answerDate);
        set(5, ispublished);
        set(6, isapproved);
        set(7, views);
    }
}