/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class TrackUserLoggedIn implements Serializable {

    private static final long serialVersionUID = 26707988;

    private ULong     id;
    private UInteger  userId;
    private UByte     usertypeId;
    private Timestamp createAt;

    public TrackUserLoggedIn() {}

    public TrackUserLoggedIn(TrackUserLoggedIn value) {
        this.id = value.id;
        this.userId = value.userId;
        this.usertypeId = value.usertypeId;
        this.createAt = value.createAt;
    }

    public TrackUserLoggedIn(
        ULong     id,
        UInteger  userId,
        UByte     usertypeId,
        Timestamp createAt
    ) {
        this.id = id;
        this.userId = userId;
        this.usertypeId = usertypeId;
        this.createAt = createAt;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public UInteger getUserId() {
        return this.userId;
    }

    public void setUserId(UInteger userId) {
        this.userId = userId;
    }

    public UByte getUsertypeId() {
        return this.usertypeId;
    }

    public void setUsertypeId(UByte usertypeId) {
        this.usertypeId = usertypeId;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TrackUserLoggedIn (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(usertypeId);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
