/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.PolishFriend;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class PolishFriendRecord extends UpdatableRecordImpl<PolishFriendRecord> implements Record7<Integer, Integer, String, Integer, String, Timestamp, Integer> {

    private static final long serialVersionUID = 1779445792;

    /**
     * Setter for <code>vnw_core.polish_friend.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.polish_friend.userid</code>.
     */
    public void setUserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.polish_friend.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.polish_friend.confirmed</code>.
     */
    public void setConfirmed(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.confirmed</code>.
     */
    public Integer getConfirmed() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.polish_friend.confirmcode</code>.
     */
    public void setConfirmcode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.confirmcode</code>.
     */
    public String getConfirmcode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.polish_friend.createdate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.createdate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>vnw_core.polish_friend.version</code>.
     */
    public void setVersion(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.polish_friend.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, String, Timestamp, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, String, Timestamp, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PolishFriend.POLISH_FRIEND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PolishFriend.POLISH_FRIEND.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PolishFriend.POLISH_FRIEND.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PolishFriend.POLISH_FRIEND.CONFIRMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PolishFriend.POLISH_FRIEND.CONFIRMCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return PolishFriend.POLISH_FRIEND.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return PolishFriend.POLISH_FRIEND.VERSION;
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
    public Integer value2() {
        return getUserid();
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
    public Integer value4() {
        return getConfirmed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getConfirmcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value2(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value4(Integer value) {
        setConfirmed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value5(String value) {
        setConfirmcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value6(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord value7(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishFriendRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, Timestamp value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PolishFriendRecord
     */
    public PolishFriendRecord() {
        super(PolishFriend.POLISH_FRIEND);
    }

    /**
     * Create a detached, initialised PolishFriendRecord
     */
    public PolishFriendRecord(Integer id, Integer userid, String email, Integer confirmed, String confirmcode, Timestamp createdate, Integer version) {
        super(PolishFriend.POLISH_FRIEND);

        set(0, id);
        set(1, userid);
        set(2, email);
        set(3, confirmed);
        set(4, confirmcode);
        set(5, createdate);
        set(6, version);
    }
}
