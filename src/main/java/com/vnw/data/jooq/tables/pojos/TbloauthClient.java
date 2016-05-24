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
public class TbloauthClient implements Serializable {

    private static final long serialVersionUID = 1532719248;

    private Integer id;
    private String  randomId;
    private String  redirectUris;
    private String  secret;
    private String  allowedGrantTypes;
    private String  name;
    private String  logo;
    private String  link;
    private String  description;

    public TbloauthClient() {}

    public TbloauthClient(TbloauthClient value) {
        this.id = value.id;
        this.randomId = value.randomId;
        this.redirectUris = value.redirectUris;
        this.secret = value.secret;
        this.allowedGrantTypes = value.allowedGrantTypes;
        this.name = value.name;
        this.logo = value.logo;
        this.link = value.link;
        this.description = value.description;
    }

    public TbloauthClient(
        Integer id,
        String  randomId,
        String  redirectUris,
        String  secret,
        String  allowedGrantTypes,
        String  name,
        String  logo,
        String  link,
        String  description
    ) {
        this.id = id;
        this.randomId = randomId;
        this.redirectUris = redirectUris;
        this.secret = secret;
        this.allowedGrantTypes = allowedGrantTypes;
        this.name = name;
        this.logo = logo;
        this.link = link;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRandomId() {
        return this.randomId;
    }

    public void setRandomId(String randomId) {
        this.randomId = randomId;
    }

    public String getRedirectUris() {
        return this.redirectUris;
    }

    public void setRedirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAllowedGrantTypes() {
        return this.allowedGrantTypes;
    }

    public void setAllowedGrantTypes(String allowedGrantTypes) {
        this.allowedGrantTypes = allowedGrantTypes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbloauthClient (");

        sb.append(id);
        sb.append(", ").append(randomId);
        sb.append(", ").append(redirectUris);
        sb.append(", ").append(secret);
        sb.append(", ").append(allowedGrantTypes);
        sb.append(", ").append(name);
        sb.append(", ").append(logo);
        sb.append(", ").append(link);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
