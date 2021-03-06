/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblAssetRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class TblAsset extends TableImpl<TblAssetRecord> {

    private static final long serialVersionUID = -1064733635;

    /**
     * The reference instance of <code>vnw_core.tbl_asset</code>
     */
    public static final TblAsset TBL_ASSET = new TblAsset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblAssetRecord> getRecordType() {
        return TblAssetRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_asset.ass_id</code>.
     */
    public final TableField<TblAssetRecord, Integer> ASS_ID = createField("ass_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.repos_id</code>. the unique and auto-increment number
     */
    public final TableField<TblAssetRecord, Integer> REPOS_ID = createField("repos_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "the unique and auto-increment number");

    /**
     * The column <code>vnw_core.tbl_asset.ass_data_id</code>.
     */
    public final TableField<TblAssetRecord, Integer> ASS_DATA_ID = createField("ass_data_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_data_type</code>.
     */
    public final TableField<TblAssetRecord, String> ASS_DATA_TYPE = createField("ass_data_type", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_relative_path</code>.
     */
    public final TableField<TblAssetRecord, String> ASS_RELATIVE_PATH = createField("ass_relative_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_ws_path</code>. ass_ws_path = repos_ws_path + ass_relative_path + ass_filename + ass_extension
     */
    public final TableField<TblAssetRecord, String> ASS_WS_PATH = createField("ass_ws_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "ass_ws_path = repos_ws_path + ass_relative_path + ass_filename + ass_extension");

    /**
     * The column <code>vnw_core.tbl_asset.ass_filename</code>.
     */
    public final TableField<TblAssetRecord, String> ASS_FILENAME = createField("ass_filename", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_extension</code>.
     */
    public final TableField<TblAssetRecord, String> ASS_EXTENSION = createField("ass_extension", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_mime</code>.
     */
    public final TableField<TblAssetRecord, String> ASS_MIME = createField("ass_mime", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_tmp_name</code>.
     */
    public final TableField<TblAssetRecord, String> ASS_TMP_NAME = createField("ass_tmp_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_size</code>.
     */
    public final TableField<TblAssetRecord, Integer> ASS_SIZE = createField("ass_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_width</code>.
     */
    public final TableField<TblAssetRecord, Integer> ASS_WIDTH = createField("ass_width", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbl_asset.ass_height</code>.
     */
    public final TableField<TblAssetRecord, Integer> ASS_HEIGHT = createField("ass_height", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.tbl_asset</code> table reference
     */
    public TblAsset() {
        this("tbl_asset", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_asset</code> table reference
     */
    public TblAsset(String alias) {
        this(alias, TBL_ASSET);
    }

    private TblAsset(String alias, Table<TblAssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblAsset(String alias, Table<TblAssetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return VnwCore.VNW_CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TblAssetRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBL_ASSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblAssetRecord> getPrimaryKey() {
        return Keys.KEY_TBL_ASSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblAssetRecord>> getKeys() {
        return Arrays.<UniqueKey<TblAssetRecord>>asList(Keys.KEY_TBL_ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblAsset as(String alias) {
        return new TblAsset(alias, this);
    }

    /**
     * Rename this table
     */
    public TblAsset rename(String name) {
        return new TblAsset(name, null);
    }
}
