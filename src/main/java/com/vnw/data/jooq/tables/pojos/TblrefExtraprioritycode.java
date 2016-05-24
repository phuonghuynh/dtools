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
public class TblrefExtraprioritycode implements Serializable {

    private static final long serialVersionUID = 1209626006;

    private Byte   extrapriorityid;
    private String extraprioritycode;
    private Short  durationdays;
    private Byte   toplevelpriority;
    private Double extrapriorityfee;
    private String currencytype;

    public TblrefExtraprioritycode() {}

    public TblrefExtraprioritycode(TblrefExtraprioritycode value) {
        this.extrapriorityid = value.extrapriorityid;
        this.extraprioritycode = value.extraprioritycode;
        this.durationdays = value.durationdays;
        this.toplevelpriority = value.toplevelpriority;
        this.extrapriorityfee = value.extrapriorityfee;
        this.currencytype = value.currencytype;
    }

    public TblrefExtraprioritycode(
        Byte   extrapriorityid,
        String extraprioritycode,
        Short  durationdays,
        Byte   toplevelpriority,
        Double extrapriorityfee,
        String currencytype
    ) {
        this.extrapriorityid = extrapriorityid;
        this.extraprioritycode = extraprioritycode;
        this.durationdays = durationdays;
        this.toplevelpriority = toplevelpriority;
        this.extrapriorityfee = extrapriorityfee;
        this.currencytype = currencytype;
    }

    public Byte getExtrapriorityid() {
        return this.extrapriorityid;
    }

    public void setExtrapriorityid(Byte extrapriorityid) {
        this.extrapriorityid = extrapriorityid;
    }

    public String getExtraprioritycode() {
        return this.extraprioritycode;
    }

    public void setExtraprioritycode(String extraprioritycode) {
        this.extraprioritycode = extraprioritycode;
    }

    public Short getDurationdays() {
        return this.durationdays;
    }

    public void setDurationdays(Short durationdays) {
        this.durationdays = durationdays;
    }

    public Byte getToplevelpriority() {
        return this.toplevelpriority;
    }

    public void setToplevelpriority(Byte toplevelpriority) {
        this.toplevelpriority = toplevelpriority;
    }

    public Double getExtrapriorityfee() {
        return this.extrapriorityfee;
    }

    public void setExtrapriorityfee(Double extrapriorityfee) {
        this.extrapriorityfee = extrapriorityfee;
    }

    public String getCurrencytype() {
        return this.currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefExtraprioritycode (");

        sb.append(extrapriorityid);
        sb.append(", ").append(extraprioritycode);
        sb.append(", ").append(durationdays);
        sb.append(", ").append(toplevelpriority);
        sb.append(", ").append(extrapriorityfee);
        sb.append(", ").append(currencytype);

        sb.append(")");
        return sb.toString();
    }
}
