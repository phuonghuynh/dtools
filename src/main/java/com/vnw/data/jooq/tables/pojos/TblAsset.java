/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class TblAsset implements Serializable {

    private static final long serialVersionUID = 1104968431;

    private Integer assId;
    private Integer reposId;
    private Integer assDataId;
    private String  assDataType;
    private String  assRelativePath;
    private String  assWsPath;
    private String  assFilename;
    private String  assExtension;
    private String  assMime;
    private String  assTmpName;
    private Integer assSize;
    private Integer assWidth;
    private Integer assHeight;

    public TblAsset() {}

    public TblAsset(TblAsset value) {
        this.assId = value.assId;
        this.reposId = value.reposId;
        this.assDataId = value.assDataId;
        this.assDataType = value.assDataType;
        this.assRelativePath = value.assRelativePath;
        this.assWsPath = value.assWsPath;
        this.assFilename = value.assFilename;
        this.assExtension = value.assExtension;
        this.assMime = value.assMime;
        this.assTmpName = value.assTmpName;
        this.assSize = value.assSize;
        this.assWidth = value.assWidth;
        this.assHeight = value.assHeight;
    }

    public TblAsset(
        Integer assId,
        Integer reposId,
        Integer assDataId,
        String  assDataType,
        String  assRelativePath,
        String  assWsPath,
        String  assFilename,
        String  assExtension,
        String  assMime,
        String  assTmpName,
        Integer assSize,
        Integer assWidth,
        Integer assHeight
    ) {
        this.assId = assId;
        this.reposId = reposId;
        this.assDataId = assDataId;
        this.assDataType = assDataType;
        this.assRelativePath = assRelativePath;
        this.assWsPath = assWsPath;
        this.assFilename = assFilename;
        this.assExtension = assExtension;
        this.assMime = assMime;
        this.assTmpName = assTmpName;
        this.assSize = assSize;
        this.assWidth = assWidth;
        this.assHeight = assHeight;
    }

    public Integer getAssId() {
        return this.assId;
    }

    public void setAssId(Integer assId) {
        this.assId = assId;
    }

    public Integer getReposId() {
        return this.reposId;
    }

    public void setReposId(Integer reposId) {
        this.reposId = reposId;
    }

    public Integer getAssDataId() {
        return this.assDataId;
    }

    public void setAssDataId(Integer assDataId) {
        this.assDataId = assDataId;
    }

    public String getAssDataType() {
        return this.assDataType;
    }

    public void setAssDataType(String assDataType) {
        this.assDataType = assDataType;
    }

    public String getAssRelativePath() {
        return this.assRelativePath;
    }

    public void setAssRelativePath(String assRelativePath) {
        this.assRelativePath = assRelativePath;
    }

    public String getAssWsPath() {
        return this.assWsPath;
    }

    public void setAssWsPath(String assWsPath) {
        this.assWsPath = assWsPath;
    }

    public String getAssFilename() {
        return this.assFilename;
    }

    public void setAssFilename(String assFilename) {
        this.assFilename = assFilename;
    }

    public String getAssExtension() {
        return this.assExtension;
    }

    public void setAssExtension(String assExtension) {
        this.assExtension = assExtension;
    }

    public String getAssMime() {
        return this.assMime;
    }

    public void setAssMime(String assMime) {
        this.assMime = assMime;
    }

    public String getAssTmpName() {
        return this.assTmpName;
    }

    public void setAssTmpName(String assTmpName) {
        this.assTmpName = assTmpName;
    }

    public Integer getAssSize() {
        return this.assSize;
    }

    public void setAssSize(Integer assSize) {
        this.assSize = assSize;
    }

    public Integer getAssWidth() {
        return this.assWidth;
    }

    public void setAssWidth(Integer assWidth) {
        this.assWidth = assWidth;
    }

    public Integer getAssHeight() {
        return this.assHeight;
    }

    public void setAssHeight(Integer assHeight) {
        this.assHeight = assHeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblAsset (");

        sb.append(assId);
        sb.append(", ").append(reposId);
        sb.append(", ").append(assDataId);
        sb.append(", ").append(assDataType);
        sb.append(", ").append(assRelativePath);
        sb.append(", ").append(assWsPath);
        sb.append(", ").append(assFilename);
        sb.append(", ").append(assExtension);
        sb.append(", ").append(assMime);
        sb.append(", ").append(assTmpName);
        sb.append(", ").append(assSize);
        sb.append(", ").append(assWidth);
        sb.append(", ").append(assHeight);

        sb.append(")");
        return sb.toString();
    }
}