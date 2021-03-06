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
public class Tblso implements Serializable {

    private static final long serialVersionUID = -328258921;

    private Integer   id;
    private String    poNo;
    private Integer   poId;
    private Integer   productId;
    private String    soNo;
    private Timestamp activeDate;
    private Integer   poProductId;
    private Short     quantity;
    private Byte      isFree;
    private Byte      isSentToCrm;
    private Timestamp crmSentDate;
    private Byte      isMovingToCrm;
    private Timestamp crmStartSendingDate;
    private Integer   objectId;
    private String    objectCode;
    private Double    unitPrice;
    private String    clientIp;
    private String    soCrmId;

    public Tblso() {}

    public Tblso(Tblso value) {
        this.id = value.id;
        this.poNo = value.poNo;
        this.poId = value.poId;
        this.productId = value.productId;
        this.soNo = value.soNo;
        this.activeDate = value.activeDate;
        this.poProductId = value.poProductId;
        this.quantity = value.quantity;
        this.isFree = value.isFree;
        this.isSentToCrm = value.isSentToCrm;
        this.crmSentDate = value.crmSentDate;
        this.isMovingToCrm = value.isMovingToCrm;
        this.crmStartSendingDate = value.crmStartSendingDate;
        this.objectId = value.objectId;
        this.objectCode = value.objectCode;
        this.unitPrice = value.unitPrice;
        this.clientIp = value.clientIp;
        this.soCrmId = value.soCrmId;
    }

    public Tblso(
        Integer   id,
        String    poNo,
        Integer   poId,
        Integer   productId,
        String    soNo,
        Timestamp activeDate,
        Integer   poProductId,
        Short     quantity,
        Byte      isFree,
        Byte      isSentToCrm,
        Timestamp crmSentDate,
        Byte      isMovingToCrm,
        Timestamp crmStartSendingDate,
        Integer   objectId,
        String    objectCode,
        Double    unitPrice,
        String    clientIp,
        String    soCrmId
    ) {
        this.id = id;
        this.poNo = poNo;
        this.poId = poId;
        this.productId = productId;
        this.soNo = soNo;
        this.activeDate = activeDate;
        this.poProductId = poProductId;
        this.quantity = quantity;
        this.isFree = isFree;
        this.isSentToCrm = isSentToCrm;
        this.crmSentDate = crmSentDate;
        this.isMovingToCrm = isMovingToCrm;
        this.crmStartSendingDate = crmStartSendingDate;
        this.objectId = objectId;
        this.objectCode = objectCode;
        this.unitPrice = unitPrice;
        this.clientIp = clientIp;
        this.soCrmId = soCrmId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoNo() {
        return this.poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public Integer getPoId() {
        return this.poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSoNo() {
        return this.soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public Timestamp getActiveDate() {
        return this.activeDate;
    }

    public void setActiveDate(Timestamp activeDate) {
        this.activeDate = activeDate;
    }

    public Integer getPoProductId() {
        return this.poProductId;
    }

    public void setPoProductId(Integer poProductId) {
        this.poProductId = poProductId;
    }

    public Short getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public Byte getIsFree() {
        return this.isFree;
    }

    public void setIsFree(Byte isFree) {
        this.isFree = isFree;
    }

    public Byte getIsSentToCrm() {
        return this.isSentToCrm;
    }

    public void setIsSentToCrm(Byte isSentToCrm) {
        this.isSentToCrm = isSentToCrm;
    }

    public Timestamp getCrmSentDate() {
        return this.crmSentDate;
    }

    public void setCrmSentDate(Timestamp crmSentDate) {
        this.crmSentDate = crmSentDate;
    }

    public Byte getIsMovingToCrm() {
        return this.isMovingToCrm;
    }

    public void setIsMovingToCrm(Byte isMovingToCrm) {
        this.isMovingToCrm = isMovingToCrm;
    }

    public Timestamp getCrmStartSendingDate() {
        return this.crmStartSendingDate;
    }

    public void setCrmStartSendingDate(Timestamp crmStartSendingDate) {
        this.crmStartSendingDate = crmStartSendingDate;
    }

    public Integer getObjectId() {
        return this.objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getObjectCode() {
        return this.objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getSoCrmId() {
        return this.soCrmId;
    }

    public void setSoCrmId(String soCrmId) {
        this.soCrmId = soCrmId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tblso (");

        sb.append(id);
        sb.append(", ").append(poNo);
        sb.append(", ").append(poId);
        sb.append(", ").append(productId);
        sb.append(", ").append(soNo);
        sb.append(", ").append(activeDate);
        sb.append(", ").append(poProductId);
        sb.append(", ").append(quantity);
        sb.append(", ").append(isFree);
        sb.append(", ").append(isSentToCrm);
        sb.append(", ").append(crmSentDate);
        sb.append(", ").append(isMovingToCrm);
        sb.append(", ").append(crmStartSendingDate);
        sb.append(", ").append(objectId);
        sb.append(", ").append(objectCode);
        sb.append(", ").append(unitPrice);
        sb.append(", ").append(clientIp);
        sb.append(", ").append(soCrmId);

        sb.append(")");
        return sb.toString();
    }
}
