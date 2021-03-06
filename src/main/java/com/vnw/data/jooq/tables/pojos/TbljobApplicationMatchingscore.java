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
public class TbljobApplicationMatchingscore implements Serializable {

    private static final long serialVersionUID = 96119147;

    private ULong    id;
    private UByte    applicationtype;
    private UInteger applicationid;
    private Double   matchingscore;

    public TbljobApplicationMatchingscore() {}

    public TbljobApplicationMatchingscore(TbljobApplicationMatchingscore value) {
        this.id = value.id;
        this.applicationtype = value.applicationtype;
        this.applicationid = value.applicationid;
        this.matchingscore = value.matchingscore;
    }

    public TbljobApplicationMatchingscore(
        ULong    id,
        UByte    applicationtype,
        UInteger applicationid,
        Double   matchingscore
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

    public Double getMatchingscore() {
        return this.matchingscore;
    }

    public void setMatchingscore(Double matchingscore) {
        this.matchingscore = matchingscore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobApplicationMatchingscore (");

        sb.append(id);
        sb.append(", ").append(applicationtype);
        sb.append(", ").append(applicationid);
        sb.append(", ").append(matchingscore);

        sb.append(")");
        return sb.toString();
    }
}
