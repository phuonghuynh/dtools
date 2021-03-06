/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class TblemployerCompanyimage implements Serializable {

    private static final long serialVersionUID = -2051710930;

    private UInteger  id;
    private Integer   companyid;
    private Byte      type;
    private String    fileextension;
    private String    minename;
    private String    path;
    private UInteger  size;
    private UInteger  height;
    private UInteger  width;
    private Timestamp createddate;
    private Byte      isapprove;

    public TblemployerCompanyimage() {}

    public TblemployerCompanyimage(TblemployerCompanyimage value) {
        this.id = value.id;
        this.companyid = value.companyid;
        this.type = value.type;
        this.fileextension = value.fileextension;
        this.minename = value.minename;
        this.path = value.path;
        this.size = value.size;
        this.height = value.height;
        this.width = value.width;
        this.createddate = value.createddate;
        this.isapprove = value.isapprove;
    }

    public TblemployerCompanyimage(
        UInteger  id,
        Integer   companyid,
        Byte      type,
        String    fileextension,
        String    minename,
        String    path,
        UInteger  size,
        UInteger  height,
        UInteger  width,
        Timestamp createddate,
        Byte      isapprove
    ) {
        this.id = id;
        this.companyid = companyid;
        this.type = type;
        this.fileextension = fileextension;
        this.minename = minename;
        this.path = path;
        this.size = size;
        this.height = height;
        this.width = width;
        this.createddate = createddate;
        this.isapprove = isapprove;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public Integer getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getFileextension() {
        return this.fileextension;
    }

    public void setFileextension(String fileextension) {
        this.fileextension = fileextension;
    }

    public String getMinename() {
        return this.minename;
    }

    public void setMinename(String minename) {
        this.minename = minename;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UInteger getSize() {
        return this.size;
    }

    public void setSize(UInteger size) {
        this.size = size;
    }

    public UInteger getHeight() {
        return this.height;
    }

    public void setHeight(UInteger height) {
        this.height = height;
    }

    public UInteger getWidth() {
        return this.width;
    }

    public void setWidth(UInteger width) {
        this.width = width;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public Byte getIsapprove() {
        return this.isapprove;
    }

    public void setIsapprove(Byte isapprove) {
        this.isapprove = isapprove;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblemployerCompanyimage (");

        sb.append(id);
        sb.append(", ").append(companyid);
        sb.append(", ").append(type);
        sb.append(", ").append(fileextension);
        sb.append(", ").append(minename);
        sb.append(", ").append(path);
        sb.append(", ").append(size);
        sb.append(", ").append(height);
        sb.append(", ").append(width);
        sb.append(", ").append(createddate);
        sb.append(", ").append(isapprove);

        sb.append(")");
        return sb.toString();
    }
}
