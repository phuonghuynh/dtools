/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class VoteImage implements Serializable {

    private static final long serialVersionUID = 1427565571;

    private UInteger  id;
    private UInteger  playerId;
    private String    votername;
    private String    voteremail;
    private String    voterphone;
    private String    voteridentitycard;
    private Timestamp createAt;

    public VoteImage() {}

    public VoteImage(VoteImage value) {
        this.id = value.id;
        this.playerId = value.playerId;
        this.votername = value.votername;
        this.voteremail = value.voteremail;
        this.voterphone = value.voterphone;
        this.voteridentitycard = value.voteridentitycard;
        this.createAt = value.createAt;
    }

    public VoteImage(
        UInteger  id,
        UInteger  playerId,
        String    votername,
        String    voteremail,
        String    voterphone,
        String    voteridentitycard,
        Timestamp createAt
    ) {
        this.id = id;
        this.playerId = playerId;
        this.votername = votername;
        this.voteremail = voteremail;
        this.voterphone = voterphone;
        this.voteridentitycard = voteridentitycard;
        this.createAt = createAt;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(UInteger playerId) {
        this.playerId = playerId;
    }

    public String getVotername() {
        return this.votername;
    }

    public void setVotername(String votername) {
        this.votername = votername;
    }

    public String getVoteremail() {
        return this.voteremail;
    }

    public void setVoteremail(String voteremail) {
        this.voteremail = voteremail;
    }

    public String getVoterphone() {
        return this.voterphone;
    }

    public void setVoterphone(String voterphone) {
        this.voterphone = voterphone;
    }

    public String getVoteridentitycard() {
        return this.voteridentitycard;
    }

    public void setVoteridentitycard(String voteridentitycard) {
        this.voteridentitycard = voteridentitycard;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VoteImage (");

        sb.append(id);
        sb.append(", ").append(playerId);
        sb.append(", ").append(votername);
        sb.append(", ").append(voteremail);
        sb.append(", ").append(voterphone);
        sb.append(", ").append(voteridentitycard);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
