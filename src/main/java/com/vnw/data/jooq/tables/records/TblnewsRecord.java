/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.Tblnews;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class TblnewsRecord extends UpdatableRecordImpl<TblnewsRecord> implements Record17<Integer, Integer, Byte, Byte, String, String, String, String, String, Timestamp, Timestamp, Byte, String, Byte, Byte, Integer, String> {

    private static final long serialVersionUID = 9345059;

    /**
     * Setter for <code>vnw_core.tblnews.newsid</code>.
     */
    public void setNewsid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.newsid</code>.
     */
    public Integer getNewsid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblnews.newscode</code>.
     */
    public void setNewscode(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.newscode</code>.
     */
    public Integer getNewscode() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblnews.languageid</code>.
     */
    public void setLanguageid(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.languageid</code>.
     */
    public Byte getLanguageid() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblnews.channelid</code>.
     */
    public void setChannelid(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.channelid</code>.
     */
    public Byte getChannelid() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblnews.title</code>.
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.title</code>.
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblnews.intro</code>.
     */
    public void setIntro(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.intro</code>.
     */
    public String getIntro() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblnews.shortdesc</code>.
     */
    public void setShortdesc(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.shortdesc</code>.
     */
    public String getShortdesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblnews.longdesc</code>.
     */
    public void setLongdesc(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.longdesc</code>.
     */
    public String getLongdesc() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblnews.imagename</code>.
     */
    public void setImagename(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.imagename</code>.
     */
    public String getImagename() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblnews.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblnews.updateddate</code>.
     */
    public void setUpdateddate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.updateddate</code>.
     */
    public Timestamp getUpdateddate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>vnw_core.tblnews.isactive</code>.
     */
    public void setIsactive(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.isactive</code>.
     */
    public Byte getIsactive() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>vnw_core.tblnews.weblink</code>.
     */
    public void setWeblink(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.weblink</code>.
     */
    public String getWeblink() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vnw_core.tblnews.subgroupid</code>.
     */
    public void setSubgroupid(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.subgroupid</code>.
     */
    public Byte getSubgroupid() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>vnw_core.tblnews.usertype</code>.
     */
    public void setUsertype(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.usertype</code>.
     */
    public Byte getUsertype() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>vnw_core.tblnews.orderby</code>.
     */
    public void setOrderby(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.orderby</code>.
     */
    public Integer getOrderby() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>vnw_core.tblnews.alias</code>.
     */
    public void setAlias(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>vnw_core.tblnews.alias</code>.
     */
    public String getAlias() {
        return (String) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, Integer, Byte, Byte, String, String, String, String, String, Timestamp, Timestamp, Byte, String, Byte, Byte, Integer, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, Integer, Byte, Byte, String, String, String, String, String, Timestamp, Timestamp, Byte, String, Byte, Byte, Integer, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tblnews.TBLNEWS.NEWSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Tblnews.TBLNEWS.NEWSCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return Tblnews.TBLNEWS.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return Tblnews.TBLNEWS.CHANNELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tblnews.TBLNEWS.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Tblnews.TBLNEWS.INTRO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Tblnews.TBLNEWS.SHORTDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Tblnews.TBLNEWS.LONGDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Tblnews.TBLNEWS.IMAGENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Tblnews.TBLNEWS.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Tblnews.TBLNEWS.UPDATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return Tblnews.TBLNEWS.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Tblnews.TBLNEWS.WEBLINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return Tblnews.TBLNEWS.SUBGROUPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return Tblnews.TBLNEWS.USERTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return Tblnews.TBLNEWS.ORDERBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Tblnews.TBLNEWS.ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNewsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getNewscode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getChannelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIntro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getShortdesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLongdesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getImagename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getWeblink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getSubgroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getUsertype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getOrderby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value1(Integer value) {
        setNewsid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value2(Integer value) {
        setNewscode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value3(Byte value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value4(Byte value) {
        setChannelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value5(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value6(String value) {
        setIntro(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value7(String value) {
        setShortdesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value8(String value) {
        setLongdesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value9(String value) {
        setImagename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value10(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value11(Timestamp value) {
        setUpdateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value12(Byte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value13(String value) {
        setWeblink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value14(Byte value) {
        setSubgroupid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value15(Byte value) {
        setUsertype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value16(Integer value) {
        setOrderby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord value17(String value) {
        setAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblnewsRecord values(Integer value1, Integer value2, Byte value3, Byte value4, String value5, String value6, String value7, String value8, String value9, Timestamp value10, Timestamp value11, Byte value12, String value13, Byte value14, Byte value15, Integer value16, String value17) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblnewsRecord
     */
    public TblnewsRecord() {
        super(Tblnews.TBLNEWS);
    }

    /**
     * Create a detached, initialised TblnewsRecord
     */
    public TblnewsRecord(Integer newsid, Integer newscode, Byte languageid, Byte channelid, String title, String intro, String shortdesc, String longdesc, String imagename, Timestamp createddate, Timestamp updateddate, Byte isactive, String weblink, Byte subgroupid, Byte usertype, Integer orderby, String alias) {
        super(Tblnews.TBLNEWS);

        set(0, newsid);
        set(1, newscode);
        set(2, languageid);
        set(3, channelid);
        set(4, title);
        set(5, intro);
        set(6, shortdesc);
        set(7, longdesc);
        set(8, imagename);
        set(9, createddate);
        set(10, updateddate);
        set(11, isactive);
        set(12, weblink);
        set(13, subgroupid);
        set(14, usertype);
        set(15, orderby);
        set(16, alias);
    }
}
