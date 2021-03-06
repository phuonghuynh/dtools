/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


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
public class TblemployerFolder implements Serializable {

    private static final long serialVersionUID = 843187933;

    private UInteger  folderId;
    private Integer   userid;
    private String    folderName;
    private UByte     folderType;
    private UShort    folderTotalunreadresume;
    private UShort    folderTotalresume;
    private Timestamp folderCreatedate;

    public TblemployerFolder() {}

    public TblemployerFolder(TblemployerFolder value) {
        this.folderId = value.folderId;
        this.userid = value.userid;
        this.folderName = value.folderName;
        this.folderType = value.folderType;
        this.folderTotalunreadresume = value.folderTotalunreadresume;
        this.folderTotalresume = value.folderTotalresume;
        this.folderCreatedate = value.folderCreatedate;
    }

    public TblemployerFolder(
        UInteger  folderId,
        Integer   userid,
        String    folderName,
        UByte     folderType,
        UShort    folderTotalunreadresume,
        UShort    folderTotalresume,
        Timestamp folderCreatedate
    ) {
        this.folderId = folderId;
        this.userid = userid;
        this.folderName = folderName;
        this.folderType = folderType;
        this.folderTotalunreadresume = folderTotalunreadresume;
        this.folderTotalresume = folderTotalresume;
        this.folderCreatedate = folderCreatedate;
    }

    public UInteger getFolderId() {
        return this.folderId;
    }

    public void setFolderId(UInteger folderId) {
        this.folderId = folderId;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFolderName() {
        return this.folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public UByte getFolderType() {
        return this.folderType;
    }

    public void setFolderType(UByte folderType) {
        this.folderType = folderType;
    }

    public UShort getFolderTotalunreadresume() {
        return this.folderTotalunreadresume;
    }

    public void setFolderTotalunreadresume(UShort folderTotalunreadresume) {
        this.folderTotalunreadresume = folderTotalunreadresume;
    }

    public UShort getFolderTotalresume() {
        return this.folderTotalresume;
    }

    public void setFolderTotalresume(UShort folderTotalresume) {
        this.folderTotalresume = folderTotalresume;
    }

    public Timestamp getFolderCreatedate() {
        return this.folderCreatedate;
    }

    public void setFolderCreatedate(Timestamp folderCreatedate) {
        this.folderCreatedate = folderCreatedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblemployerFolder (");

        sb.append(folderId);
        sb.append(", ").append(userid);
        sb.append(", ").append(folderName);
        sb.append(", ").append(folderType);
        sb.append(", ").append(folderTotalunreadresume);
        sb.append(", ").append(folderTotalresume);
        sb.append(", ").append(folderCreatedate);

        sb.append(")");
        return sb.toString();
    }
}
