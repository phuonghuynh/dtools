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
public class PolishHowyouknowus implements Serializable {

    private static final long serialVersionUID = 1721608488;

    private Integer itemId;
    private String  howyouknowusName;
    private Integer howyouknowusOrder;

    public PolishHowyouknowus() {}

    public PolishHowyouknowus(PolishHowyouknowus value) {
        this.itemId = value.itemId;
        this.howyouknowusName = value.howyouknowusName;
        this.howyouknowusOrder = value.howyouknowusOrder;
    }

    public PolishHowyouknowus(
        Integer itemId,
        String  howyouknowusName,
        Integer howyouknowusOrder
    ) {
        this.itemId = itemId;
        this.howyouknowusName = howyouknowusName;
        this.howyouknowusOrder = howyouknowusOrder;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getHowyouknowusName() {
        return this.howyouknowusName;
    }

    public void setHowyouknowusName(String howyouknowusName) {
        this.howyouknowusName = howyouknowusName;
    }

    public Integer getHowyouknowusOrder() {
        return this.howyouknowusOrder;
    }

    public void setHowyouknowusOrder(Integer howyouknowusOrder) {
        this.howyouknowusOrder = howyouknowusOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PolishHowyouknowus (");

        sb.append(itemId);
        sb.append(", ").append(howyouknowusName);
        sb.append(", ").append(howyouknowusOrder);

        sb.append(")");
        return sb.toString();
    }
}