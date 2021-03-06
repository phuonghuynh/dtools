/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumeAttachment;

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
public class TblresumeAttachmentRecord extends UpdatableRecordImpl<TblresumeAttachmentRecord> implements Record11<UInteger, String, String, String, String, String, UInteger, String, Byte, String, String> {

    private static final long serialVersionUID = -1412128358;

    /**
     * Setter for <code>vnw_core.tblresume_attachment.resumeId</code>.
     */
    public void setResumeid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.resumeId</code>.
     */
    public UInteger getResumeid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.fileName</code>. Original file name ; ex : NguyenVanA_Cv.doc
     */
    public void setFilename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.fileName</code>. Original file name ; ex : NguyenVanA_Cv.doc
     */
    public String getFilename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.extension</code>. file extension ex : doc ,docx, pdf
     */
    public void setExtension(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.extension</code>. file extension ex : doc ,docx, pdf
     */
    public String getExtension() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.physicalFileApp</code>. uploaded file name after generating by system ; ex : 46753
     */
    public void setPhysicalfileapp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.physicalFileApp</code>. uploaded file name after generating by system ; ex : 46753
     */
    public String getPhysicalfileapp() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.fileMime</code>.
     */
    public void setFilemime(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.fileMime</code>.
     */
    public String getFilemime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.content</code>. upload cv content
     */
    public void setContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.content</code>. upload cv content
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.size</code>.  file size 
     */
    public void setSize(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.size</code>.  file size 
     */
    public UInteger getSize() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.folderName</code>. /foldername/...
     */
    public void setFoldername(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.folderName</code>. /foldername/...
     */
    public String getFoldername() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.status</code>.  0: it has not converted yet. 1 : it has been converted . 2 it is in process 
     */
    public void setStatus(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.status</code>.  0: it has not converted yet. 1 : it has been converted . 2 it is in process 
     */
    public Byte getStatus() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.physicalFileSearch</code>. upload file name after hash for search ex: b44d783
     */
    public void setPhysicalfilesearch(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.physicalFileSearch</code>. upload file name after hash for search ex: b44d783
     */
    public String getPhysicalfilesearch() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblresume_attachment.physicalFileBuy</code>. upload file name after hash for buy ex: b44d783
     */
    public void setPhysicalfilebuy(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_attachment.physicalFileBuy</code>. upload file name after hash for buy ex: b44d783
     */
    public String getPhysicalfilebuy() {
        return (String) get(10);
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
    public Row11<UInteger, String, String, String, String, String, UInteger, String, Byte, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, String, String, String, String, String, UInteger, String, Byte, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.RESUMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.EXTENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.PHYSICALFILEAPP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.FILEMIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.FOLDERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.PHYSICALFILESEARCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TblresumeAttachment.TBLRESUME_ATTACHMENT.PHYSICALFILEBUY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getResumeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExtension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhysicalfileapp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFilemime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
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
    public String value8() {
        return getFoldername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPhysicalfilesearch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPhysicalfilebuy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value1(UInteger value) {
        setResumeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value2(String value) {
        setFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value3(String value) {
        setExtension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value4(String value) {
        setPhysicalfileapp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value5(String value) {
        setFilemime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value7(UInteger value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value8(String value) {
        setFoldername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value9(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value10(String value) {
        setPhysicalfilesearch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord value11(String value) {
        setPhysicalfilebuy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeAttachmentRecord values(UInteger value1, String value2, String value3, String value4, String value5, String value6, UInteger value7, String value8, Byte value9, String value10, String value11) {
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
     * Create a detached TblresumeAttachmentRecord
     */
    public TblresumeAttachmentRecord() {
        super(TblresumeAttachment.TBLRESUME_ATTACHMENT);
    }

    /**
     * Create a detached, initialised TblresumeAttachmentRecord
     */
    public TblresumeAttachmentRecord(UInteger resumeid, String filename, String extension, String physicalfileapp, String filemime, String content, UInteger size, String foldername, Byte status, String physicalfilesearch, String physicalfilebuy) {
        super(TblresumeAttachment.TBLRESUME_ATTACHMENT);

        set(0, resumeid);
        set(1, filename);
        set(2, extension);
        set(3, physicalfileapp);
        set(4, filemime);
        set(5, content);
        set(6, size);
        set(7, foldername);
        set(8, status);
        set(9, physicalfilesearch);
        set(10, physicalfilebuy);
    }
}
