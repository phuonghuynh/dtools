/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblsysSuperUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class TblsysSuperUserRecord extends UpdatableRecordImpl<TblsysSuperUserRecord> implements Record14<Integer, String, String, String, String, String, Timestamp, Byte, Byte, Byte, Timestamp, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = 274889578;

    /**
     * Setter for <code>vnw_core.tblsys_super_user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.userName</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.userName</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.fullName</code>.
     */
    public void setFullname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.fullName</code>.
     */
    public String getFullname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.password</code>.
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.password</code>.
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.salt</code>.
     */
    public void setSalt(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.salt</code>.
     */
    public String getSalt() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.lastLogin</code>.
     */
    public void setLastlogin(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.lastLogin</code>.
     */
    public Timestamp getLastlogin() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.isEnabled</code>.
     */
    public void setIsenabled(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.isEnabled</code>.
     */
    public Byte getIsenabled() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.isLooked</code>.
     */
    public void setIslooked(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.isLooked</code>.
     */
    public Byte getIslooked() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.isExpired</code>.
     */
    public void setIsexpired(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.isExpired</code>.
     */
    public Byte getIsexpired() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.expiredOn</code>.
     */
    public void setExpiredon(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.expiredOn</code>.
     */
    public Timestamp getExpiredon() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.createdOn</code>.
     */
    public void setCreatedon(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.createdOn</code>.
     */
    public Timestamp getCreatedon() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.updatedOn</code>.
     */
    public void setUpdatedon(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.updatedOn</code>.
     */
    public Timestamp getUpdatedon() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>vnw_core.tblsys_super_user.updateTS</code>. Auto insert and update current timestamp
     */
    public void setUpdatets(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_super_user.updateTS</code>. Auto insert and update current timestamp
     */
    public Timestamp getUpdatets() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, Timestamp, Byte, Byte, Byte, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, Timestamp, Byte, Byte, Byte, Timestamp, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.FULLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.LASTLOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.ISENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.ISLOOKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.ISEXPIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.EXPIREDON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.CREATEDON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.UPDATEDON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return TblsysSuperUser.TBLSYS_SUPER_USER.UPDATETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastlogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsenabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIslooked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsexpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getExpiredon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreatedon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdatedon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdatets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value4(String value) {
        setFullname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value5(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value6(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value7(Timestamp value) {
        setLastlogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value8(Byte value) {
        setIsenabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value9(Byte value) {
        setIslooked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value10(Byte value) {
        setIsexpired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value11(Timestamp value) {
        setExpiredon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value12(Timestamp value) {
        setCreatedon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value13(Timestamp value) {
        setUpdatedon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord value14(Timestamp value) {
        setUpdatets(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysSuperUserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Timestamp value7, Byte value8, Byte value9, Byte value10, Timestamp value11, Timestamp value12, Timestamp value13, Timestamp value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblsysSuperUserRecord
     */
    public TblsysSuperUserRecord() {
        super(TblsysSuperUser.TBLSYS_SUPER_USER);
    }

    /**
     * Create a detached, initialised TblsysSuperUserRecord
     */
    public TblsysSuperUserRecord(Integer id, String username, String email, String fullname, String password, String salt, Timestamp lastlogin, Byte isenabled, Byte islooked, Byte isexpired, Timestamp expiredon, Timestamp createdon, Timestamp updatedon, Timestamp updatets) {
        super(TblsysSuperUser.TBLSYS_SUPER_USER);

        set(0, id);
        set(1, username);
        set(2, email);
        set(3, fullname);
        set(4, password);
        set(5, salt);
        set(6, lastlogin);
        set(7, isenabled);
        set(8, islooked);
        set(9, isexpired);
        set(10, expiredon);
        set(11, createdon);
        set(12, updatedon);
        set(13, updatets);
    }
}
