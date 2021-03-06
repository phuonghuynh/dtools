/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblscreenTest;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TblscreenTestRecord extends UpdatableRecordImpl<TblscreenTestRecord> implements Record11<UInteger, UInteger, UInteger, Byte, String, UByte, Timestamp, Timestamp, Byte, Byte, Byte> {

    private static final long serialVersionUID = 642482125;

    /**
     * Setter for <code>vnw_core.tblscreen_test.testId</code>.
     */
    public void setTestid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.testId</code>.
     */
    public UInteger getTestid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.oriTestId</code>. original test of this: 0: this is original test; >0: id of original test
     */
    public void setOritestid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.oriTestId</code>. original test of this: 0: this is original test; >0: id of original test
     */
    public UInteger getOritestid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.userId</code>. user created test
     */
    public void setUserid(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.userId</code>. user created test
     */
    public UInteger getUserid() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.testType</code>. 0: default, 1: emp defines
     */
    public void setTesttype(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.testType</code>. 0: default, 1: emp defines
     */
    public Byte getTesttype() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.name</code>.  test name 
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.name</code>.  test name 
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.noOfQuestion</code>.  total questions for this test
     */
    public void setNoofquestion(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.noOfQuestion</code>.  total questions for this test
     */
    public UByte getNoofquestion() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.createdDate</code>.  created date of test
     */
    public void setCreateddate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.createdDate</code>.  created date of test
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.lastUpdatedDate</code>.  last update date of test
     */
    public void setLastupdateddate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.lastUpdatedDate</code>.  last update date of test
     */
    public Timestamp getLastupdateddate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.isDeleted</code>.  1 : deleted  0: not delete 
     */
    public void setIsdeleted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.isDeleted</code>.  1 : deleted  0: not delete 
     */
    public Byte getIsdeleted() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.isCompleted</code>.  1 : Completed  0: not Complete 
     */
    public void setIscompleted(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.isCompleted</code>.  1 : Completed  0: not Complete 
     */
    public Byte getIscompleted() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblscreen_test.isActive</code>. Active to be assigned to job: 1 : Active  0: not Active 
     */
    public void setIsactive(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblscreen_test.isActive</code>. Active to be assigned to job: 1 : Active  0: not Active 
     */
    public Byte getIsactive() {
        return (Byte) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, UInteger, UInteger, Byte, String, UByte, Timestamp, Timestamp, Byte, Byte, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, UInteger, UInteger, Byte, String, UByte, Timestamp, Timestamp, Byte, Byte, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblscreenTest.TBLSCREEN_TEST.TESTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TblscreenTest.TBLSCREEN_TEST.ORITESTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return TblscreenTest.TBLSCREEN_TEST.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TblscreenTest.TBLSCREEN_TEST.TESTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblscreenTest.TBLSCREEN_TEST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return TblscreenTest.TBLSCREEN_TEST.NOOFQUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TblscreenTest.TBLSCREEN_TEST.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TblscreenTest.TBLSCREEN_TEST.LASTUPDATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TblscreenTest.TBLSCREEN_TEST.ISDELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return TblscreenTest.TBLSCREEN_TEST.ISCOMPLETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TblscreenTest.TBLSCREEN_TEST.ISACTIVE;
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
        return getOritestid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getTesttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getNoofquestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastupdateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIsdeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIscompleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value1(UInteger value) {
        setTestid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value2(UInteger value) {
        setOritestid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value3(UInteger value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value4(Byte value) {
        setTesttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value5(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value6(UByte value) {
        setNoofquestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value7(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value8(Timestamp value) {
        setLastupdateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value9(Byte value) {
        setIsdeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value10(Byte value) {
        setIscompleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord value11(Byte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblscreenTestRecord values(UInteger value1, UInteger value2, UInteger value3, Byte value4, String value5, UByte value6, Timestamp value7, Timestamp value8, Byte value9, Byte value10, Byte value11) {
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
     * Create a detached TblscreenTestRecord
     */
    public TblscreenTestRecord() {
        super(TblscreenTest.TBLSCREEN_TEST);
    }

    /**
     * Create a detached, initialised TblscreenTestRecord
     */
    public TblscreenTestRecord(UInteger testid, UInteger oritestid, UInteger userid, Byte testtype, String name, UByte noofquestion, Timestamp createddate, Timestamp lastupdateddate, Byte isdeleted, Byte iscompleted, Byte isactive) {
        super(TblscreenTest.TBLSCREEN_TEST);

        set(0, testid);
        set(1, oritestid);
        set(2, userid);
        set(3, testtype);
        set(4, name);
        set(5, noofquestion);
        set(6, createddate);
        set(7, lastupdateddate);
        set(8, isdeleted);
        set(9, iscompleted);
        set(10, isactive);
    }
}
