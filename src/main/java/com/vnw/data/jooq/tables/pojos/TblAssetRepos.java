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
public class TblAssetRepos implements Serializable {

    private static final long serialVersionUID = 1751690298;

    private Integer reposId;
    private String  reposCode;
    private String  reposProtocol;
    private String  reposServer;
    private Long    reposPort;
    private String  reposUsername;
    private String  reposPassword;
    private Integer reposKeypass;
    private String  reposKeyfile;
    private String  reposFsPath;
    private String  reposRelativePath;
    private String  reposWsPath;
    private String  reposType;

    public TblAssetRepos() {}

    public TblAssetRepos(TblAssetRepos value) {
        this.reposId = value.reposId;
        this.reposCode = value.reposCode;
        this.reposProtocol = value.reposProtocol;
        this.reposServer = value.reposServer;
        this.reposPort = value.reposPort;
        this.reposUsername = value.reposUsername;
        this.reposPassword = value.reposPassword;
        this.reposKeypass = value.reposKeypass;
        this.reposKeyfile = value.reposKeyfile;
        this.reposFsPath = value.reposFsPath;
        this.reposRelativePath = value.reposRelativePath;
        this.reposWsPath = value.reposWsPath;
        this.reposType = value.reposType;
    }

    public TblAssetRepos(
        Integer reposId,
        String  reposCode,
        String  reposProtocol,
        String  reposServer,
        Long    reposPort,
        String  reposUsername,
        String  reposPassword,
        Integer reposKeypass,
        String  reposKeyfile,
        String  reposFsPath,
        String  reposRelativePath,
        String  reposWsPath,
        String  reposType
    ) {
        this.reposId = reposId;
        this.reposCode = reposCode;
        this.reposProtocol = reposProtocol;
        this.reposServer = reposServer;
        this.reposPort = reposPort;
        this.reposUsername = reposUsername;
        this.reposPassword = reposPassword;
        this.reposKeypass = reposKeypass;
        this.reposKeyfile = reposKeyfile;
        this.reposFsPath = reposFsPath;
        this.reposRelativePath = reposRelativePath;
        this.reposWsPath = reposWsPath;
        this.reposType = reposType;
    }

    public Integer getReposId() {
        return this.reposId;
    }

    public void setReposId(Integer reposId) {
        this.reposId = reposId;
    }

    public String getReposCode() {
        return this.reposCode;
    }

    public void setReposCode(String reposCode) {
        this.reposCode = reposCode;
    }

    public String getReposProtocol() {
        return this.reposProtocol;
    }

    public void setReposProtocol(String reposProtocol) {
        this.reposProtocol = reposProtocol;
    }

    public String getReposServer() {
        return this.reposServer;
    }

    public void setReposServer(String reposServer) {
        this.reposServer = reposServer;
    }

    public Long getReposPort() {
        return this.reposPort;
    }

    public void setReposPort(Long reposPort) {
        this.reposPort = reposPort;
    }

    public String getReposUsername() {
        return this.reposUsername;
    }

    public void setReposUsername(String reposUsername) {
        this.reposUsername = reposUsername;
    }

    public String getReposPassword() {
        return this.reposPassword;
    }

    public void setReposPassword(String reposPassword) {
        this.reposPassword = reposPassword;
    }

    public Integer getReposKeypass() {
        return this.reposKeypass;
    }

    public void setReposKeypass(Integer reposKeypass) {
        this.reposKeypass = reposKeypass;
    }

    public String getReposKeyfile() {
        return this.reposKeyfile;
    }

    public void setReposKeyfile(String reposKeyfile) {
        this.reposKeyfile = reposKeyfile;
    }

    public String getReposFsPath() {
        return this.reposFsPath;
    }

    public void setReposFsPath(String reposFsPath) {
        this.reposFsPath = reposFsPath;
    }

    public String getReposRelativePath() {
        return this.reposRelativePath;
    }

    public void setReposRelativePath(String reposRelativePath) {
        this.reposRelativePath = reposRelativePath;
    }

    public String getReposWsPath() {
        return this.reposWsPath;
    }

    public void setReposWsPath(String reposWsPath) {
        this.reposWsPath = reposWsPath;
    }

    public String getReposType() {
        return this.reposType;
    }

    public void setReposType(String reposType) {
        this.reposType = reposType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblAssetRepos (");

        sb.append(reposId);
        sb.append(", ").append(reposCode);
        sb.append(", ").append(reposProtocol);
        sb.append(", ").append(reposServer);
        sb.append(", ").append(reposPort);
        sb.append(", ").append(reposUsername);
        sb.append(", ").append(reposPassword);
        sb.append(", ").append(reposKeypass);
        sb.append(", ").append(reposKeyfile);
        sb.append(", ").append(reposFsPath);
        sb.append(", ").append(reposRelativePath);
        sb.append(", ").append(reposWsPath);
        sb.append(", ").append(reposType);

        sb.append(")");
        return sb.toString();
    }
}
