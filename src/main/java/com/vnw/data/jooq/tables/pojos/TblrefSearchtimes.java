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
public class TblrefSearchtimes implements Serializable {

    private static final long serialVersionUID = 1174431221;

    private UInteger  id;
    private Integer   numberofsearch;
    private Timestamp updatetime;

    public TblrefSearchtimes() {}

    public TblrefSearchtimes(TblrefSearchtimes value) {
        this.id = value.id;
        this.numberofsearch = value.numberofsearch;
        this.updatetime = value.updatetime;
    }

    public TblrefSearchtimes(
        UInteger  id,
        Integer   numberofsearch,
        Timestamp updatetime
    ) {
        this.id = id;
        this.numberofsearch = numberofsearch;
        this.updatetime = updatetime;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public Integer getNumberofsearch() {
        return this.numberofsearch;
    }

    public void setNumberofsearch(Integer numberofsearch) {
        this.numberofsearch = numberofsearch;
    }

    public Timestamp getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefSearchtimes (");

        sb.append(id);
        sb.append(", ").append(numberofsearch);
        sb.append(", ").append(updatetime);

        sb.append(")");
        return sb.toString();
    }
}
