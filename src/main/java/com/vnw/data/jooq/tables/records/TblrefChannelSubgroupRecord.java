/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefChannelSubgroup;

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
public class TblrefChannelSubgroupRecord extends UpdatableRecordImpl<TblrefChannelSubgroupRecord> implements Record7<Byte, Byte, String, String, Byte, Byte, String> {

    private static final long serialVersionUID = -1593434399;

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.subgroupid</code>.
     */
    public void setSubgroupid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.subgroupid</code>.
     */
    public Byte getSubgroupid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.subgroupcode</code>.
     */
    public void setSubgroupcode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.subgroupcode</code>.
     */
    public String getSubgroupcode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.subgroupname</code>.
     */
    public void setSubgroupname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.subgroupname</code>.
     */
    public String getSubgroupname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.subgrouporder</code>.
     */
    public void setSubgrouporder(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.subgrouporder</code>.
     */
    public Byte getSubgrouporder() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.channelid</code>.
     */
    public void setChannelid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.channelid</code>.
     */
    public Byte getChannelid() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblref_channel_subgroup.alias</code>.
     */
    public void setAlias(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_channel_subgroup.alias</code>.
     */
    public String getAlias() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Byte, Byte, String, String, Byte, Byte, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Byte, Byte, String, String, Byte, Byte, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.SUBGROUPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.SUBGROUPCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.SUBGROUPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.SUBGROUPORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.CHANNELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP.ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getSubgroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSubgroupcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSubgroupname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getSubgrouporder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getChannelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value1(Byte value) {
        setSubgroupid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value2(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value3(String value) {
        setSubgroupcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value4(String value) {
        setSubgroupname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value5(Byte value) {
        setSubgrouporder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value6(Byte value) {
        setChannelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord value7(String value) {
        setAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefChannelSubgroupRecord values(Byte value1, Byte value2, String value3, String value4, Byte value5, Byte value6, String value7) {
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
     * Create a detached TblrefChannelSubgroupRecord
     */
    public TblrefChannelSubgroupRecord() {
        super(TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP);
    }

    /**
     * Create a detached, initialised TblrefChannelSubgroupRecord
     */
    public TblrefChannelSubgroupRecord(Byte subgroupid, Byte languageid, String subgroupcode, String subgroupname, Byte subgrouporder, Byte channelid, String alias) {
        super(TblrefChannelSubgroup.TBLREF_CHANNEL_SUBGROUP);

        set(0, subgroupid);
        set(1, languageid);
        set(2, subgroupcode);
        set(3, subgroupname);
        set(4, subgrouporder);
        set(5, channelid);
        set(6, alias);
    }
}
