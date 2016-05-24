/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewjobApplicationMatchingscore implements Serializable {

    private static final long serialVersionUID = 668041121;

    private ULong    id;
    private UByte    applicationtype;
    private UInteger applicationid;
    private Long     matchingscore;

    public ViewjobApplicationMatchingscore() {}

    public ViewjobApplicationMatchingscore(ViewjobApplicationMatchingscore value) {
        this.id = value.id;
        this.applicationtype = value.applicationtype;
        this.applicationid = value.applicationid;
        this.matchingscore = value.matchingscore;
    }

    public ViewjobApplicationMatchingscore(
        ULong    id,
        UByte    applicationtype,
        UInteger applicationid,
        Long     matchingscore
    ) {
        this.id = id;
        this.applicationtype = applicationtype;
        this.applicationid = applicationid;
        this.matchingscore = matchingscore;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public UByte getApplicationtype() {
        return this.applicationtype;
    }

    public void setApplicationtype(UByte applicationtype) {
        this.applicationtype = applicationtype;
    }

    public UInteger getApplicationid() {
        return this.applicationid;
    }

    public void setApplicationid(UInteger applicationid) {
        this.applicationid = applicationid;
    }

    public Long getMatchingscore() {
        return this.matchingscore;
    }

    public void setMatchingscore(Long matchingscore) {
        this.matchingscore = matchingscore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewjobApplicationMatchingscore (");

        sb.append(id);
        sb.append(", ").append(applicationtype);
        sb.append(", ").append(applicationid);
        sb.append(", ").append(matchingscore);

        sb.append(")");
        return sb.toString();
    }
}