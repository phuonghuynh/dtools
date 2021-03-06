/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbloauthAccessToken;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TbloauthAccessTokenRecord extends UpdatableRecordImpl<TbloauthAccessTokenRecord> implements Record6<Integer, Integer, Integer, String, Integer, String> {

    private static final long serialVersionUID = 1173178207;

    /**
     * Setter for <code>vnw_core.tbloauth_access_token.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbloauth_access_token.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbloauth_access_token.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbloauth_access_token.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbloauth_access_token.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbloauth_access_token.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbloauth_access_token.token</code>.
     */
    public void setToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbloauth_access_token.token</code>.
     */
    public String getToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbloauth_access_token.expires_at</code>.
     */
    public void setExpiresAt(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbloauth_access_token.expires_at</code>.
     */
    public Integer getExpiresAt() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbloauth_access_token.scope</code>.
     */
    public void setScope(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbloauth_access_token.scope</code>.
     */
    public String getScope() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN.EXPIRES_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getExpiresAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord value4(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord value5(Integer value) {
        setExpiresAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord value6(String value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbloauthAccessTokenRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbloauthAccessTokenRecord
     */
    public TbloauthAccessTokenRecord() {
        super(TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN);
    }

    /**
     * Create a detached, initialised TbloauthAccessTokenRecord
     */
    public TbloauthAccessTokenRecord(Integer id, Integer clientId, Integer userId, String token, Integer expiresAt, String scope) {
        super(TbloauthAccessToken.TBLOAUTH_ACCESS_TOKEN);

        set(0, id);
        set(1, clientId);
        set(2, userId);
        set(3, token);
        set(4, expiresAt);
        set(5, scope);
    }
}
