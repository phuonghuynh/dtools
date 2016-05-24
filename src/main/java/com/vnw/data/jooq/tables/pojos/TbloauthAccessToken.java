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
public class TbloauthAccessToken implements Serializable {

    private static final long serialVersionUID = 116111908;

    private Integer id;
    private Integer clientId;
    private Integer userId;
    private String  token;
    private Integer expiresAt;
    private String  scope;

    public TbloauthAccessToken() {}

    public TbloauthAccessToken(TbloauthAccessToken value) {
        this.id = value.id;
        this.clientId = value.clientId;
        this.userId = value.userId;
        this.token = value.token;
        this.expiresAt = value.expiresAt;
        this.scope = value.scope;
    }

    public TbloauthAccessToken(
        Integer id,
        Integer clientId,
        Integer userId,
        String  token,
        Integer expiresAt,
        String  scope
    ) {
        this.id = id;
        this.clientId = clientId;
        this.userId = userId;
        this.token = token;
        this.expiresAt = expiresAt;
        this.scope = scope;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbloauthAccessToken (");

        sb.append(id);
        sb.append(", ").append(clientId);
        sb.append(", ").append(userId);
        sb.append(", ").append(token);
        sb.append(", ").append(expiresAt);
        sb.append(", ").append(scope);

        sb.append(")");
        return sb.toString();
    }
}
