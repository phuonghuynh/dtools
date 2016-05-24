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
public class TblcampaignData implements Serializable {

    private static final long serialVersionUID = 992868631;

    private UInteger  campaignid;
    private Integer   userid;
    private Timestamp accesstime;
    private Integer   datanum;
    private String    datatext;

    public TblcampaignData() {}

    public TblcampaignData(TblcampaignData value) {
        this.campaignid = value.campaignid;
        this.userid = value.userid;
        this.accesstime = value.accesstime;
        this.datanum = value.datanum;
        this.datatext = value.datatext;
    }

    public TblcampaignData(
        UInteger  campaignid,
        Integer   userid,
        Timestamp accesstime,
        Integer   datanum,
        String    datatext
    ) {
        this.campaignid = campaignid;
        this.userid = userid;
        this.accesstime = accesstime;
        this.datanum = datanum;
        this.datatext = datatext;
    }

    public UInteger getCampaignid() {
        return this.campaignid;
    }

    public void setCampaignid(UInteger campaignid) {
        this.campaignid = campaignid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Timestamp getAccesstime() {
        return this.accesstime;
    }

    public void setAccesstime(Timestamp accesstime) {
        this.accesstime = accesstime;
    }

    public Integer getDatanum() {
        return this.datanum;
    }

    public void setDatanum(Integer datanum) {
        this.datanum = datanum;
    }

    public String getDatatext() {
        return this.datatext;
    }

    public void setDatatext(String datatext) {
        this.datatext = datatext;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblcampaignData (");

        sb.append(campaignid);
        sb.append(", ").append(userid);
        sb.append(", ").append(accesstime);
        sb.append(", ").append(datanum);
        sb.append(", ").append(datatext);

        sb.append(")");
        return sb.toString();
    }
}
