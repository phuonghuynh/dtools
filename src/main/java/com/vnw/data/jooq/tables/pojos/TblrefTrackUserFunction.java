/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;


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
public class TblrefTrackUserFunction implements Serializable {

    private static final long serialVersionUID = -915061965;

    private UByte  id;
    private String name;
    private UByte  type;
    private String descr;

    public TblrefTrackUserFunction() {}

    public TblrefTrackUserFunction(TblrefTrackUserFunction value) {
        this.id = value.id;
        this.name = value.name;
        this.type = value.type;
        this.descr = value.descr;
    }

    public TblrefTrackUserFunction(
        UByte  id,
        String name,
        UByte  type,
        String descr
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.descr = descr;
    }

    public UByte getId() {
        return this.id;
    }

    public void setId(UByte id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UByte getType() {
        return this.type;
    }

    public void setType(UByte type) {
        this.type = type;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefTrackUserFunction (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(descr);

        sb.append(")");
        return sb.toString();
    }
}
