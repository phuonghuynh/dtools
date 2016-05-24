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
public class TbluserReminder implements Serializable {

    private static final long serialVersionUID = 942912517;

    private Integer   reminderId;
    private String    activity;
    private String    description;
    private Integer   dataId;
    private String    dataType;
    private Integer   noofdays;
    private Timestamp sendingdate;
    private Integer   noofsent;

    public TbluserReminder() {}

    public TbluserReminder(TbluserReminder value) {
        this.reminderId = value.reminderId;
        this.activity = value.activity;
        this.description = value.description;
        this.dataId = value.dataId;
        this.dataType = value.dataType;
        this.noofdays = value.noofdays;
        this.sendingdate = value.sendingdate;
        this.noofsent = value.noofsent;
    }

    public TbluserReminder(
        Integer   reminderId,
        String    activity,
        String    description,
        Integer   dataId,
        String    dataType,
        Integer   noofdays,
        Timestamp sendingdate,
        Integer   noofsent
    ) {
        this.reminderId = reminderId;
        this.activity = activity;
        this.description = description;
        this.dataId = dataId;
        this.dataType = dataType;
        this.noofdays = noofdays;
        this.sendingdate = sendingdate;
        this.noofsent = noofsent;
    }

    public Integer getReminderId() {
        return this.reminderId;
    }

    public void setReminderId(Integer reminderId) {
        this.reminderId = reminderId;
    }

    public String getActivity() {
        return this.activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDataId() {
        return this.dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getNoofdays() {
        return this.noofdays;
    }

    public void setNoofdays(Integer noofdays) {
        this.noofdays = noofdays;
    }

    public Timestamp getSendingdate() {
        return this.sendingdate;
    }

    public void setSendingdate(Timestamp sendingdate) {
        this.sendingdate = sendingdate;
    }

    public Integer getNoofsent() {
        return this.noofsent;
    }

    public void setNoofsent(Integer noofsent) {
        this.noofsent = noofsent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbluserReminder (");

        sb.append(reminderId);
        sb.append(", ").append(activity);
        sb.append(", ").append(description);
        sb.append(", ").append(dataId);
        sb.append(", ").append(dataType);
        sb.append(", ").append(noofdays);
        sb.append(", ").append(sendingdate);
        sb.append(", ").append(noofsent);

        sb.append(")");
        return sb.toString();
    }
}