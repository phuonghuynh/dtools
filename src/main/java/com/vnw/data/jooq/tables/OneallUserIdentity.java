/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.OneallUserIdentityRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class OneallUserIdentity extends TableImpl<OneallUserIdentityRecord> {

    private static final long serialVersionUID = -1125034712;

    /**
     * The reference instance of <code>vnw_core.oneall_user_identity</code>
     */
    public static final OneallUserIdentity ONEALL_USER_IDENTITY = new OneallUserIdentity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OneallUserIdentityRecord> getRecordType() {
        return OneallUserIdentityRecord.class;
    }

    /**
     * The column <code>vnw_core.oneall_user_identity.userId</code>.
     */
    public final TableField<OneallUserIdentityRecord, UInteger> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.oneall_user_identity.identityToken</code>.
     */
    public final TableField<OneallUserIdentityRecord, String> IDENTITYTOKEN = createField("identityToken", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.oneall_user_identity.identityData</code>.
     */
    public final TableField<OneallUserIdentityRecord, String> IDENTITYDATA = createField("identityData", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.oneall_user_identity.provider</code>.
     */
    public final TableField<OneallUserIdentityRecord, String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>vnw_core.oneall_user_identity</code> table reference
     */
    public OneallUserIdentity() {
        this("oneall_user_identity", null);
    }

    /**
     * Create an aliased <code>vnw_core.oneall_user_identity</code> table reference
     */
    public OneallUserIdentity(String alias) {
        this(alias, ONEALL_USER_IDENTITY);
    }

    private OneallUserIdentity(String alias, Table<OneallUserIdentityRecord> aliased) {
        this(alias, aliased, null);
    }

    private OneallUserIdentity(String alias, Table<OneallUserIdentityRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<OneallUserIdentityRecord> getPrimaryKey() {
        return Keys.KEY_ONEALL_USER_IDENTITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OneallUserIdentityRecord>> getKeys() {
        return Arrays.<UniqueKey<OneallUserIdentityRecord>>asList(Keys.KEY_ONEALL_USER_IDENTITY_USERIDTNDENTITYTOKEN, Keys.KEY_ONEALL_USER_IDENTITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OneallUserIdentityRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OneallUserIdentityRecord, ?>>asList(Keys.FK_ONEALL_USER_IDENTITY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OneallUserIdentity as(String alias) {
        return new OneallUserIdentity(alias, this);
    }

    /**
     * Rename this table
     */
    public OneallUserIdentity rename(String name) {
        return new OneallUserIdentity(name, null);
    }
}
