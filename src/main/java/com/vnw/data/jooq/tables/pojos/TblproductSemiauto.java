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
public class TblproductSemiauto implements Serializable {

    private static final long serialVersionUID = 1979233882;

    private Integer   id;
    private Integer   vnwEmployerId;
    private String    poproductId;
    private Timestamp expireddate;
    private Integer   objectid;
    private String    objectname;
    private Integer   activeconfirmStatus;
    private Byte      status;
    private Byte      available;
    private String    servicecode;

    public TblproductSemiauto() {}

    public TblproductSemiauto(TblproductSemiauto value) {
        this.id = value.id;
        this.vnwEmployerId = value.vnwEmployerId;
        this.poproductId = value.poproductId;
        this.expireddate = value.expireddate;
        this.objectid = value.objectid;
        this.objectname = value.objectname;
        this.activeconfirmStatus = value.activeconfirmStatus;
        this.status = value.status;
        this.available = value.available;
        this.servicecode = value.servicecode;
    }

    public TblproductSemiauto(
        Integer   id,
        Integer   vnwEmployerId,
        String    poproductId,
        Timestamp expireddate,
        Integer   objectid,
        String    objectname,
        Integer   activeconfirmStatus,
        Byte      status,
        Byte      available,
        String    servicecode
    ) {
        this.id = id;
        this.vnwEmployerId = vnwEmployerId;
        this.poproductId = poproductId;
        this.expireddate = expireddate;
        this.objectid = objectid;
        this.objectname = objectname;
        this.activeconfirmStatus = activeconfirmStatus;
        this.status = status;
        this.available = available;
        this.servicecode = servicecode;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVnwEmployerId() {
        return this.vnwEmployerId;
    }

    public void setVnwEmployerId(Integer vnwEmployerId) {
        this.vnwEmployerId = vnwEmployerId;
    }

    public String getPoproductId() {
        return this.poproductId;
    }

    public void setPoproductId(String poproductId) {
        this.poproductId = poproductId;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public Integer getObjectid() {
        return this.objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getObjectname() {
        return this.objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public Integer getActiveconfirmStatus() {
        return this.activeconfirmStatus;
    }

    public void setActiveconfirmStatus(Integer activeconfirmStatus) {
        this.activeconfirmStatus = activeconfirmStatus;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getAvailable() {
        return this.available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    public String getServicecode() {
        return this.servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblproductSemiauto (");

        sb.append(id);
        sb.append(", ").append(vnwEmployerId);
        sb.append(", ").append(poproductId);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(objectid);
        sb.append(", ").append(objectname);
        sb.append(", ").append(activeconfirmStatus);
        sb.append(", ").append(status);
        sb.append(", ").append(available);
        sb.append(", ").append(servicecode);

        sb.append(")");
        return sb.toString();
    }
}
