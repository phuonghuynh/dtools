/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblapiTokenRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TblapiToken extends TableImpl<TblapiTokenRecord> {

    private static final long serialVersionUID = 114528299;

    /**
     * The reference instance of <code>vnw_core.tblapi_token</code>
     */
    public static final TblapiToken TBLAPI_TOKEN = new TblapiToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblapiTokenRecord> getRecordType() {
        return TblapiTokenRecord.class;
    }

    /**
     * The column <code>vnw_core.tblapi_token.login_token</code>.
     */
    public final TableField<TblapiTokenRecord, String> LOGIN_TOKEN = createField("login_token", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblapi_token.userid</code>.
     */
    public final TableField<TblapiTokenRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblapi_token.starttime</code>.
     */
    public final TableField<TblapiTokenRecord, Timestamp> STARTTIME = createField("starttime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tblapi_token</code> table reference
     */
    public TblapiToken() {
        this("tblapi_token", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblapi_token</code> table reference
     */
    public TblapiToken(String alias) {
        this(alias, TBLAPI_TOKEN);
    }

    private TblapiToken(String alias, Table<TblapiTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblapiToken(String alias, Table<TblapiTokenRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblapiTokenRecord> getPrimaryKey() {
        return Keys.KEY_TBLAPI_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblapiTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<TblapiTokenRecord>>asList(Keys.KEY_TBLAPI_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblapiToken as(String alias) {
        return new TblapiToken(alias, this);
    }

    /**
     * Rename this table
     */
    public TblapiToken rename(String name) {
        return new TblapiToken(name, null);
    }
}