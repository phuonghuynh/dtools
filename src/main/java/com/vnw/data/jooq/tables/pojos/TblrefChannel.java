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
public class TblrefChannel implements Serializable {

    private static final long serialVersionUID = -563748243;

    private Byte   channelid;
    private String channelname;
    private String channeldesc;
    private String channelcode;

    public TblrefChannel() {}

    public TblrefChannel(TblrefChannel value) {
        this.channelid = value.channelid;
        this.channelname = value.channelname;
        this.channeldesc = value.channeldesc;
        this.channelcode = value.channelcode;
    }

    public TblrefChannel(
        Byte   channelid,
        String channelname,
        String channeldesc,
        String channelcode
    ) {
        this.channelid = channelid;
        this.channelname = channelname;
        this.channeldesc = channeldesc;
        this.channelcode = channelcode;
    }

    public Byte getChannelid() {
        return this.channelid;
    }

    public void setChannelid(Byte channelid) {
        this.channelid = channelid;
    }

    public String getChannelname() {
        return this.channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public String getChanneldesc() {
        return this.channeldesc;
    }

    public void setChanneldesc(String channeldesc) {
        this.channeldesc = channeldesc;
    }

    public String getChannelcode() {
        return this.channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefChannel (");

        sb.append(channelid);
        sb.append(", ").append(channelname);
        sb.append(", ").append(channeldesc);
        sb.append(", ").append(channelcode);

        sb.append(")");
        return sb.toString();
    }
}