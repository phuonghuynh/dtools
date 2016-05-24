/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbloauthClientRecord;

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
public class TbloauthClient extends TableImpl<TbloauthClientRecord> {

    private static final long serialVersionUID = 391288825;

    /**
     * The reference instance of <code>vnw_core.tbloauth_client</code>
     */
    public static final TbloauthClient TBLOAUTH_CLIENT = new TbloauthClient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbloauthClientRecord> getRecordType() {
        return TbloauthClientRecord.class;
    }

    /**
     * The column <code>vnw_core.tbloauth_client.id</code>.
     */
    public final TableField<TbloauthClientRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_client.random_id</code>.
     */
    public final TableField<TbloauthClientRecord, String> RANDOM_ID = createField("random_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_client.redirect_uris</code>. (DC2Type:array)
     */
    public final TableField<TbloauthClientRecord, String> REDIRECT_URIS = createField("redirect_uris", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "(DC2Type:array)");

    /**
     * The column <code>vnw_core.tbloauth_client.secret</code>.
     */
    public final TableField<TbloauthClientRecord, String> SECRET = createField("secret", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_client.allowed_grant_types</code>. (DC2Type:array)
     */
    public final TableField<TbloauthClientRecord, String> ALLOWED_GRANT_TYPES = createField("allowed_grant_types", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "(DC2Type:array)");

    /**
     * The column <code>vnw_core.tbloauth_client.name</code>. Consumer Name
     */
    public final TableField<TbloauthClientRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "Consumer Name");

    /**
     * The column <code>vnw_core.tbloauth_client.logo</code>. This is the link to consumer Logo
     */
    public final TableField<TbloauthClientRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "This is the link to consumer Logo");

    /**
     * The column <code>vnw_core.tbloauth_client.link</code>. This is the consumer link
     */
    public final TableField<TbloauthClientRecord, String> LINK = createField("link", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "This is the consumer link");

    /**
     * The column <code>vnw_core.tbloauth_client.description</code>.
     */
    public final TableField<TbloauthClientRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(4000).nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbloauth_client</code> table reference
     */
    public TbloauthClient() {
        this("tbloauth_client", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbloauth_client</code> table reference
     */
    public TbloauthClient(String alias) {
        this(alias, TBLOAUTH_CLIENT);
    }

    private TbloauthClient(String alias, Table<TbloauthClientRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbloauthClient(String alias, Table<TbloauthClientRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbloauthClientRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLOAUTH_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbloauthClientRecord> getPrimaryKey() {
        return Keys.KEY_TBLOAUTH_CLIENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbloauthClientRecord>> getKeys() {
        return Arrays.<UniqueKey<TbloauthClientRecord>>asList(Keys.KEY_TBLOAUTH_CLIENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthClient as(String alias) {
        return new TbloauthClient(alias, this);
    }

    /**
     * Rename this table
     */
    public TbloauthClient rename(String name) {
        return new TbloauthClient(name, null);
    }
}
