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
public class TblrefExtraadvercode implements Serializable {

    private static final long serialVersionUID = -1136936532;

    private Byte   extraadverid;
    private String extraadvercode;
    private Double extraadverfee;
    private String currencytype;
    private Byte   isactive;

    public TblrefExtraadvercode() {}

    public TblrefExtraadvercode(TblrefExtraadvercode value) {
        this.extraadverid = value.extraadverid;
        this.extraadvercode = value.extraadvercode;
        this.extraadverfee = value.extraadverfee;
        this.currencytype = value.currencytype;
        this.isactive = value.isactive;
    }

    public TblrefExtraadvercode(
        Byte   extraadverid,
        String extraadvercode,
        Double extraadverfee,
        String currencytype,
        Byte   isactive
    ) {
        this.extraadverid = extraadverid;
        this.extraadvercode = extraadvercode;
        this.extraadverfee = extraadverfee;
        this.currencytype = currencytype;
        this.isactive = isactive;
    }

    public Byte getExtraadverid() {
        return this.extraadverid;
    }

    public void setExtraadverid(Byte extraadverid) {
        this.extraadverid = extraadverid;
    }

    public String getExtraadvercode() {
        return this.extraadvercode;
    }

    public void setExtraadvercode(String extraadvercode) {
        this.extraadvercode = extraadvercode;
    }

    public Double getExtraadverfee() {
        return this.extraadverfee;
    }

    public void setExtraadverfee(Double extraadverfee) {
        this.extraadverfee = extraadverfee;
    }

    public String getCurrencytype() {
        return this.currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    public Byte getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefExtraadvercode (");

        sb.append(extraadverid);
        sb.append(", ").append(extraadvercode);
        sb.append(", ").append(extraadverfee);
        sb.append(", ").append(currencytype);
        sb.append(", ").append(isactive);

        sb.append(")");
        return sb.toString();
    }
}
