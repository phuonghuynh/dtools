/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblscreenTestOption;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TblscreenTestOptionRecord extends UpdatableRecordImpl<TblscreenTestOptionRecord> implements Record5<UInteger, UInteger, UByte, Byte, String> {

    private static final long serialVersionUID = -1146475378;

    /**
     * Setter for <code>vnw_core.tblscreen_test_option.testId</code>.
     */
    public void setTestid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test_option.testId</code>.
     */
    public UInteger getTestid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test_option.questionId</code>. id of question, uniqe in a test
     */
    public void setQuestionid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test_option.questionId</code>. id of question, uniqe in a test
     */
    public UInteger getQuestionid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test_option.optionId</code>. Id of option, unique in a question, > 0
     */
    public void setOptionid(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test_option.optionId</code>. Id of option, unique in a question, > 0
     */
    public UByte getOptionid() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test_option.optionOrder</code>. order of option in a question
     */
    public void setOptionorder(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test_option.optionOrder</code>. order of option in a question
     */
    public Byte getOptionorder() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test_option.content</code>. content of option
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test_option.content</code>. content of option
     */
    public String getContent() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<UInteger, UInteger, UByte> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, UInteger, UByte, Byte, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, UInteger, UByte, Byte, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblscreenTestOption.TBLSCREEN_TEST_OPTION.TESTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TblscreenTestOption.TBLSCREEN_TEST_OPTION.QUESTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TblscreenTestOption.TBLSCREEN_TEST_OPTION.OPTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblscreenTestOption.TBLSCREEN_TEST_OPTION.OPTIONORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblscreenTestOption.TBLSCREEN_TEST_OPTION.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getTestid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getQuestionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getOptionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getOptionorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestOptionRecord value1(UInteger value) {
        setTestid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestOptionRecord value2(UInteger value) {
        setQuestionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestOptionRecord value3(UByte value) {
        setOptionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestOptionRecord value4(Byte value) {
        setOptionorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestOptionRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestOptionRecord values(UInteger value1, UInteger value2, UByte value3, Byte value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblscreenTestOptionRecord
     */
    public TblscreenTestOptionRecord() {
        super(TblscreenTestOption.TBLSCREEN_TEST_OPTION);
    }

    /**
     * Create a detached, initialised TblscreenTestOptionRecord
     */
    public TblscreenTestOptionRecord(UInteger testid, UInteger questionid, UByte optionid, Byte optionorder, String content) {
        super(TblscreenTestOption.TBLSCREEN_TEST_OPTION);

        set(0, testid);
        set(1, questionid);
        set(2, optionid);
        set(3, optionorder);
        set(4, content);
    }
}