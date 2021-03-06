/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

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
public class TblonlineOrderDetails implements Serializable {

    private static final long serialVersionUID = 1456933614;

    private UInteger orderid;
    private UInteger productid;
    private UInteger quantity;

    public TblonlineOrderDetails() {}

    public TblonlineOrderDetails(TblonlineOrderDetails value) {
        this.orderid = value.orderid;
        this.productid = value.productid;
        this.quantity = value.quantity;
    }

    public TblonlineOrderDetails(
        UInteger orderid,
        UInteger productid,
        UInteger quantity
    ) {
        this.orderid = orderid;
        this.productid = productid;
        this.quantity = quantity;
    }

    public UInteger getOrderid() {
        return this.orderid;
    }

    public void setOrderid(UInteger orderid) {
        this.orderid = orderid;
    }

    public UInteger getProductid() {
        return this.productid;
    }

    public void setProductid(UInteger productid) {
        this.productid = productid;
    }

    public UInteger getQuantity() {
        return this.quantity;
    }

    public void setQuantity(UInteger quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblonlineOrderDetails (");

        sb.append(orderid);
        sb.append(", ").append(productid);
        sb.append(", ").append(quantity);

        sb.append(")");
        return sb.toString();
    }
}
