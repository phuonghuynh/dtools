/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblemployerCompanyimage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TblemployerCompanyimageRecord extends UpdatableRecordImpl<TblemployerCompanyimageRecord> implements Record11<UInteger, Integer, Byte, String, String, String, UInteger, UInteger, UInteger, Timestamp, Byte> {

    private static final long serialVersionUID = -624708163;

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.companyid</code>.  id of company
     */
    public void setCompanyid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.companyid</code>.  id of company
     */
    public Integer getCompanyid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.type</code>.  0: cover photo  1: gallery photo 2: Job photo
     */
    public void setType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.type</code>.  0: cover photo  1: gallery photo 2: Job photo
     */
    public Byte getType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.fileExtension</code>.  extension of image ex : jpg 
     */
    public void setFileextension(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.fileExtension</code>.  extension of image ex : jpg 
     */
    public String getFileextension() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.mineName</code>.  short path of image ex : image/jpeg 
     */
    public void setMinename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.mineName</code>.  short path of image ex : image/jpeg 
     */
    public String getMinename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.path</code>. path of image ex : http://images.vietnamworks.com/pictureofresume/c4/1.jpg
     */
    public void setPath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.path</code>. path of image ex : http://images.vietnamworks.com/pictureofresume/c4/1.jpg
     */
    public String getPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.size</code>. size of image
     */
    public void setSize(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.size</code>. size of image
     */
    public UInteger getSize() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.height</code>. height of image
     */
    public void setHeight(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.height</code>. height of image
     */
    public UInteger getHeight() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.width</code>. width of image
     */
    public void setWidth(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.width</code>. width of image
     */
    public UInteger getWidth() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.createdDate</code>.  First day upload image
     */
    public void setCreateddate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.createdDate</code>.  First day upload image
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblemployer_companyimage.isApprove</code>.
     */
    public void setIsapprove(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblemployer_companyimage.isApprove</code>.
     */
    public Byte getIsapprove() {
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
    public Row11<UInteger, Integer, Byte, String, String, String, UInteger, UInteger, UInteger, Timestamp, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, Integer, Byte, String, String, String, UInteger, UInteger, UInteger, Timestamp, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.COMPANYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.FILEEXTENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.MINENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field8() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field9() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE.ISAPPROVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCompanyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFileextension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMinename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value7() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value8() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value9() {
        return getWidth();
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
    public Byte value11() {
        return getIsapprove();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value2(Integer value) {
        setCompanyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value3(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value4(String value) {
        setFileextension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value5(String value) {
        setMinename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value6(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value7(UInteger value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value8(UInteger value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value9(UInteger value) {
        setWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value10(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord value11(Byte value) {
        setIsapprove(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemployerCompanyimageRecord values(UInteger value1, Integer value2, Byte value3, String value4, String value5, String value6, UInteger value7, UInteger value8, UInteger value9, Timestamp value10, Byte value11) {
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
     * Create a detached TblemployerCompanyimageRecord
     */
    public TblemployerCompanyimageRecord() {
        super(TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE);
    }

    /**
     * Create a detached, initialised TblemployerCompanyimageRecord
     */
    public TblemployerCompanyimageRecord(UInteger id, Integer companyid, Byte type, String fileextension, String minename, String path, UInteger size, UInteger height, UInteger width, Timestamp createddate, Byte isapprove) {
        super(TblemployerCompanyimage.TBLEMPLOYER_COMPANYIMAGE);

        set(0, id);
        set(1, companyid);
        set(2, type);
        set(3, fileextension);
        set(4, minename);
        set(5, path);
        set(6, size);
        set(7, height);
        set(8, width);
        set(9, createddate);
        set(10, isapprove);
    }
}
