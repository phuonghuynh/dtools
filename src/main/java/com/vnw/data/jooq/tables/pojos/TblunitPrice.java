/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class TblunitPrice implements Serializable {

    private static final long serialVersionUID = 1656612398;

    private Integer   id;
    private Integer   productId;
    private Double    price;
    private Timestamp effectiveDate;

    public TblunitPrice() {}

    public TblunitPrice(TblunitPrice value) {
        this.id = value.id;
        this.productId = value.productId;
        this.price = value.price;
        this.effectiveDate = value.effectiveDate;
    }

    public TblunitPrice(
        Integer   id,
        Integer   productId,
        Double    price,
        Timestamp effectiveDate
    ) {
        this.id = id;
        this.productId = productId;
        this.price = price;
        this.effectiveDate = effectiveDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblunitPrice (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(price);
        sb.append(", ").append(effectiveDate);

        sb.append(")");
        return sb.toString();
    }
}
