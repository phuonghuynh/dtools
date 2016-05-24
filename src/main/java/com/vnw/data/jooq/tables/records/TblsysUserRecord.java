/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblsysUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class TblsysUserRecord extends UpdatableRecordImpl<TblsysUserRecord> implements Record12<Integer, Short, String, String, String, String, String, String, String, String, Byte, Byte> {

    private static final long serialVersionUID = 1745429677;

    /**
     * Setter for <code>vnw_core.tblsys_user.userid</code>.
     */
    public void setUserid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.groupid</code>.
     */
    public void setGroupid(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.groupid</code>.
     */
    public Short getGroupid() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.userpass</code>.
     */
    public void setUserpass(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.userpass</code>.
     */
    public String getUserpass() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.fullname</code>.
     */
    public void setFullname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.fullname</code>.
     */
    public String getFullname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.address</code>.
     */
    public void setAddress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.address</code>.
     */
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.phonenumber</code>.
     */
    public void setPhonenumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.phonenumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.cellnumber</code>.
     */
    public void setCellnumber(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.cellnumber</code>.
     */
    public String getCellnumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.email</code>.
     */
    public void setEmail(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.email</code>.
     */
    public String getEmail() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.isactive</code>.
     */
    public void setIsactive(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.isactive</code>.
     */
    public Byte getIsactive() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>vnw_core.tblsys_user.partnerid</code>.
     */
    public void setPartnerid(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_user.partnerid</code>.
     */
    public Byte getPartnerid() {
        return (Byte) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Short, String, String, String, String, String, String, String, String, Byte, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Short, String, String, String, String, String, String, String, String, Byte, Byte> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblsysUser.TBLSYS_USER.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TblsysUser.TBLSYS_USER.GROUPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblsysUser.TBLSYS_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblsysUser.TBLSYS_USER.USERPASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblsysUser.TBLSYS_USER.FULLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblsysUser.TBLSYS_USER.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblsysUser.TBLSYS_USER.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TblsysUser.TBLSYS_USER.CELLNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TblsysUser.TBLSYS_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TblsysUser.TBLSYS_USER.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TblsysUser.TBLSYS_USER.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return TblsysUser.TBLSYS_USER.PARTNERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getGroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserpass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCellnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDescription();
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
    public Byte value12() {
        return getPartnerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value1(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value2(Short value) {
        setGroupid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value4(String value) {
        setUserpass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value5(String value) {
        setFullname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value6(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value7(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value8(String value) {
        setCellnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value9(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value10(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value11(Byte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord value12(Byte value) {
        setPartnerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysUserRecord values(Integer value1, Short value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Byte value11, Byte value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblsysUserRecord
     */
    public TblsysUserRecord() {
        super(TblsysUser.TBLSYS_USER);
    }

    /**
     * Create a detached, initialised TblsysUserRecord
     */
    public TblsysUserRecord(Integer userid, Short groupid, String username, String userpass, String fullname, String address, String phonenumber, String cellnumber, String email, String description, Byte isactive, Byte partnerid) {
        super(TblsysUser.TBLSYS_USER);

        set(0, userid);
        set(1, groupid);
        set(2, username);
        set(3, userpass);
        set(4, fullname);
        set(5, address);
        set(6, phonenumber);
        set(7, cellnumber);
        set(8, email);
        set(9, description);
        set(10, isactive);
        set(11, partnerid);
    }
}
