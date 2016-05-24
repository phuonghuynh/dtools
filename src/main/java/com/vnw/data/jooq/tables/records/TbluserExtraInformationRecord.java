/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbluserExtraInformation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TbluserExtraInformationRecord extends UpdatableRecordImpl<TbluserExtraInformationRecord> implements Record3<UInteger, Byte, String> {

    private static final long serialVersionUID = -1299290691;

    /**
     * Setter for <code>vnw_core.tbluser_extra_information.userId</code>.
     */
    public void setUserid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_extra_information.userId</code>.
     */
    public UInteger getUserid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbluser_extra_information.expectedJobLevelId</code>.
     */
    public void setExpectedjoblevelid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_extra_information.expectedJobLevelId</code>.
     */
    public Byte getExpectedjoblevelid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbluser_extra_information.expectedJobTitle</code>.
     */
    public void setExpectedjobtitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbluser_extra_information.expectedJobTitle</code>.
     */
    public String getExpectedjobtitle() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, Byte, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, Byte, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbluserExtraInformation.TBLUSER_EXTRA_INFORMATION.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TbluserExtraInformation.TBLUSER_EXTRA_INFORMATION.EXPECTEDJOBLEVELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbluserExtraInformation.TBLUSER_EXTRA_INFORMATION.EXPECTEDJOBTITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getExpectedjoblevelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExpectedjobtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserExtraInformationRecord value1(UInteger value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserExtraInformationRecord value2(Byte value) {
        setExpectedjoblevelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserExtraInformationRecord value3(String value) {
        setExpectedjobtitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserExtraInformationRecord values(UInteger value1, Byte value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbluserExtraInformationRecord
     */
    public TbluserExtraInformationRecord() {
        super(TbluserExtraInformation.TBLUSER_EXTRA_INFORMATION);
    }

    /**
     * Create a detached, initialised TbluserExtraInformationRecord
     */
    public TbluserExtraInformationRecord(UInteger userid, Byte expectedjoblevelid, String expectedjobtitle) {
        super(TbluserExtraInformation.TBLUSER_EXTRA_INFORMATION);

        set(0, userid);
        set(1, expectedjoblevelid);
        set(2, expectedjobtitle);
    }
}
