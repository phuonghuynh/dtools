/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblnewsRecord;

import java.sql.Timestamp;
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
public class Tblnews extends TableImpl<TblnewsRecord> {

    private static final long serialVersionUID = -484130007;

    /**
     * The reference instance of <code>vnw_core.tblnews</code>
     */
    public static final Tblnews TBLNEWS = new Tblnews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblnewsRecord> getRecordType() {
        return TblnewsRecord.class;
    }

    /**
     * The column <code>vnw_core.tblnews.newsid</code>.
     */
    public final TableField<TblnewsRecord, Integer> NEWSID = createField("newsid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblnews.newscode</code>.
     */
    public final TableField<TblnewsRecord, Integer> NEWSCODE = createField("newscode", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblnews.languageid</code>.
     */
    public final TableField<TblnewsRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblnews.channelid</code>.
     */
    public final TableField<TblnewsRecord, Byte> CHANNELID = createField("channelid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblnews.title</code>.
     */
    public final TableField<TblnewsRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tblnews.intro</code>.
     */
    public final TableField<TblnewsRecord, String> INTRO = createField("intro", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblnews.shortdesc</code>.
     */
    public final TableField<TblnewsRecord, String> SHORTDESC = createField("shortdesc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblnews.longdesc</code>.
     */
    public final TableField<TblnewsRecord, String> LONGDESC = createField("longdesc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblnews.imagename</code>.
     */
    public final TableField<TblnewsRecord, String> IMAGENAME = createField("imagename", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblnews.createddate</code>.
     */
    public final TableField<TblnewsRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>vnw_core.tblnews.updateddate</code>.
     */
    public final TableField<TblnewsRecord, Timestamp> UPDATEDDATE = createField("updateddate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>vnw_core.tblnews.isactive</code>.
     */
    public final TableField<TblnewsRecord, Byte> ISACTIVE = createField("isactive", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblnews.weblink</code>.
     */
    public final TableField<TblnewsRecord, String> WEBLINK = createField("weblink", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblnews.subgroupid</code>.
     */
    public final TableField<TblnewsRecord, Byte> SUBGROUPID = createField("subgroupid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblnews.usertype</code>.
     */
    public final TableField<TblnewsRecord, Byte> USERTYPE = createField("usertype", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblnews.orderby</code>.
     */
    public final TableField<TblnewsRecord, Integer> ORDERBY = createField("orderby", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblnews.alias</code>.
     */
    public final TableField<TblnewsRecord, String> ALIAS = createField("alias", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblnews</code> table reference
     */
    public Tblnews() {
        this("tblnews", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblnews</code> table reference
     */
    public Tblnews(String alias) {
        this(alias, TBLNEWS);
    }

    private Tblnews(String alias, Table<TblnewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tblnews(String alias, Table<TblnewsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblnewsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLNEWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblnewsRecord> getPrimaryKey() {
        return Keys.KEY_TBLNEWS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblnewsRecord>> getKeys() {
        return Arrays.<UniqueKey<TblnewsRecord>>asList(Keys.KEY_TBLNEWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tblnews as(String alias) {
        return new Tblnews(alias, this);
    }

    /**
     * Rename this table
     */
    public Tblnews rename(String name) {
        return new Tblnews(name, null);
    }
}