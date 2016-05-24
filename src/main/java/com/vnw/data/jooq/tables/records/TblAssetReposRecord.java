/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblAssetRepos;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class TblAssetReposRecord extends UpdatableRecordImpl<TblAssetReposRecord> implements Record13<Integer, String, String, String, Long, String, String, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1389536697;

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_id</code>. the unique and auto-increment number
     */
    public void setReposId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_id</code>. the unique and auto-increment number
     */
    public Integer getReposId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_code</code>. the code make easier in remembering and accessing the repository
     */
    public void setReposCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_code</code>. the code make easier in remembering and accessing the repository
     */
    public String getReposCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_protocol</code>.
     */
    public void setReposProtocol(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_protocol</code>.
     */
    public String getReposProtocol() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_server</code>.
     */
    public void setReposServer(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_server</code>.
     */
    public String getReposServer() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_port</code>.
     */
    public void setReposPort(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_port</code>.
     */
    public Long getReposPort() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_username</code>.
     */
    public void setReposUsername(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_username</code>.
     */
    public String getReposUsername() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_password</code>. - the password should be encrypted before going to database
     */
    public void setReposPassword(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_password</code>. - the password should be encrypted before going to database
     */
    public String getReposPassword() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_keypass</code>.
     */
    public void setReposKeypass(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_keypass</code>.
     */
    public Integer getReposKeypass() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_keyfile</code>. the absolute path to the file that store authentication key.
     */
    public void setReposKeyfile(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_keyfile</code>. the absolute path to the file that store authentication key.
     */
    public String getReposKeyfile() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_fs_path</code>. file system path
     */
    public void setReposFsPath(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_fs_path</code>. file system path
     */
    public String getReposFsPath() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_relative_path</code>.
     */
    public void setReposRelativePath(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_relative_path</code>.
     */
    public String getReposRelativePath() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_ws_path</code>. web system path
     */
    public void setReposWsPath(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_ws_path</code>. web system path
     */
    public String getReposWsPath() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vnw_core.tbl_asset_repos.repos_type</code>.
     */
    public void setReposType(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tbl_asset_repos.repos_type</code>.
     */
    public String getReposType() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, Long, String, String, Integer, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, Long, String, String, Integer, String, String, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_PROTOCOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_SERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_PORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_KEYPASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_KEYFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_FS_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_RELATIVE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_WS_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TblAssetRepos.TBL_ASSET_REPOS.REPOS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getReposId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReposCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReposProtocol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getReposServer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getReposPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReposUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getReposPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getReposKeypass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getReposKeyfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getReposFsPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getReposRelativePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getReposWsPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getReposType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value1(Integer value) {
        setReposId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value2(String value) {
        setReposCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value3(String value) {
        setReposProtocol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value4(String value) {
        setReposServer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value5(Long value) {
        setReposPort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value6(String value) {
        setReposUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value7(String value) {
        setReposPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value8(Integer value) {
        setReposKeypass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value9(String value) {
        setReposKeyfile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value10(String value) {
        setReposFsPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value11(String value) {
        setReposRelativePath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value12(String value) {
        setReposWsPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord value13(String value) {
        setReposType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAssetReposRecord values(Integer value1, String value2, String value3, String value4, Long value5, String value6, String value7, Integer value8, String value9, String value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblAssetReposRecord
     */
    public TblAssetReposRecord() {
        super(TblAssetRepos.TBL_ASSET_REPOS);
    }

    /**
     * Create a detached, initialised TblAssetReposRecord
     */
    public TblAssetReposRecord(Integer reposId, String reposCode, String reposProtocol, String reposServer, Long reposPort, String reposUsername, String reposPassword, Integer reposKeypass, String reposKeyfile, String reposFsPath, String reposRelativePath, String reposWsPath, String reposType) {
        super(TblAssetRepos.TBL_ASSET_REPOS);

        set(0, reposId);
        set(1, reposCode);
        set(2, reposProtocol);
        set(3, reposServer);
        set(4, reposPort);
        set(5, reposUsername);
        set(6, reposPassword);
        set(7, reposKeypass);
        set(8, reposKeyfile);
        set(9, reposFsPath);
        set(10, reposRelativePath);
        set(11, reposWsPath);
        set(12, reposType);
    }
}