/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbloauthAuthCodeRecord;

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
public class TbloauthAuthCode extends TableImpl<TbloauthAuthCodeRecord> {

    private static final long serialVersionUID = 2061953204;

    /**
     * The reference instance of <code>vnw_core.tbloauth_auth_code</code>
     */
    public static final TbloauthAuthCode TBLOAUTH_AUTH_CODE = new TbloauthAuthCode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbloauthAuthCodeRecord> getRecordType() {
        return TbloauthAuthCodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tbloauth_auth_code.id</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_auth_code.client_id</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_auth_code.user_id</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbloauth_auth_code.token</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_auth_code.redirect_uri</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, String> REDIRECT_URI = createField("redirect_uri", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbloauth_auth_code.expires_at</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, Integer> EXPIRES_AT = createField("expires_at", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbloauth_auth_code.scope</code>.
     */
    public final TableField<TbloauthAuthCodeRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tbloauth_auth_code</code> table reference
     */
    public TbloauthAuthCode() {
        this("tbloauth_auth_code", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbloauth_auth_code</code> table reference
     */
    public TbloauthAuthCode(String alias) {
        this(alias, TBLOAUTH_AUTH_CODE);
    }

    private TbloauthAuthCode(String alias, Table<TbloauthAuthCodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbloauthAuthCode(String alias, Table<TbloauthAuthCodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbloauthAuthCodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLOAUTH_AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbloauthAuthCodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLOAUTH_AUTH_CODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbloauthAuthCodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TbloauthAuthCodeRecord>>asList(Keys.KEY_TBLOAUTH_AUTH_CODE_PRIMARY, Keys.KEY_TBLOAUTH_AUTH_CODE_TOKEN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAuthCode as(String alias) {
        return new TbloauthAuthCode(alias, this);
    }

    /**
     * Rename this table
     */
    public TbloauthAuthCode rename(String name) {
        return new TbloauthAuthCode(name, null);
    }
}