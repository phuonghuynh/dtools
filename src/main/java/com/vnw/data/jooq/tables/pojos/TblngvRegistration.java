/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


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
public class TblngvRegistration implements Serializable {

    private static final long serialVersionUID = 82942300;

    private UInteger  id;
    private String    email;
    private String    password;
    private String    firstName;
    private String    lastName;
    private Timestamp birthday;
    private UByte     genderId;
    private UByte     countryId;
    private UShort    cityId;
    private UByte     howyouknowusId;
    private String    emailTemp;
    private UByte     isReceivedNewsletter;
    private UByte     isConfirmed;
    private String    codeConfirm;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp visitedAt;
    private UInteger  vnwUserId;

    public TblngvRegistration() {}

    public TblngvRegistration(TblngvRegistration value) {
        this.id = value.id;
        this.email = value.email;
        this.password = value.password;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.birthday = value.birthday;
        this.genderId = value.genderId;
        this.countryId = value.countryId;
        this.cityId = value.cityId;
        this.howyouknowusId = value.howyouknowusId;
        this.emailTemp = value.emailTemp;
        this.isReceivedNewsletter = value.isReceivedNewsletter;
        this.isConfirmed = value.isConfirmed;
        this.codeConfirm = value.codeConfirm;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.visitedAt = value.visitedAt;
        this.vnwUserId = value.vnwUserId;
    }

    public TblngvRegistration(
        UInteger  id,
        String    email,
        String    password,
        String    firstName,
        String    lastName,
        Timestamp birthday,
        UByte     genderId,
        UByte     countryId,
        UShort    cityId,
        UByte     howyouknowusId,
        String    emailTemp,
        UByte     isReceivedNewsletter,
        UByte     isConfirmed,
        String    codeConfirm,
        Timestamp createdAt,
        Timestamp updatedAt,
        Timestamp visitedAt,
        UInteger  vnwUserId
    ) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.genderId = genderId;
        this.countryId = countryId;
        this.cityId = cityId;
        this.howyouknowusId = howyouknowusId;
        this.emailTemp = emailTemp;
        this.isReceivedNewsletter = isReceivedNewsletter;
        this.isConfirmed = isConfirmed;
        this.codeConfirm = codeConfirm;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.visitedAt = visitedAt;
        this.vnwUserId = vnwUserId;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public UByte getGenderId() {
        return this.genderId;
    }

    public void setGenderId(UByte genderId) {
        this.genderId = genderId;
    }

    public UByte getCountryId() {
        return this.countryId;
    }

    public void setCountryId(UByte countryId) {
        this.countryId = countryId;
    }

    public UShort getCityId() {
        return this.cityId;
    }

    public void setCityId(UShort cityId) {
        this.cityId = cityId;
    }

    public UByte getHowyouknowusId() {
        return this.howyouknowusId;
    }

    public void setHowyouknowusId(UByte howyouknowusId) {
        this.howyouknowusId = howyouknowusId;
    }

    public String getEmailTemp() {
        return this.emailTemp;
    }

    public void setEmailTemp(String emailTemp) {
        this.emailTemp = emailTemp;
    }

    public UByte getIsReceivedNewsletter() {
        return this.isReceivedNewsletter;
    }

    public void setIsReceivedNewsletter(UByte isReceivedNewsletter) {
        this.isReceivedNewsletter = isReceivedNewsletter;
    }

    public UByte getIsConfirmed() {
        return this.isConfirmed;
    }

    public void setIsConfirmed(UByte isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getCodeConfirm() {
        return this.codeConfirm;
    }

    public void setCodeConfirm(String codeConfirm) {
        this.codeConfirm = codeConfirm;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getVisitedAt() {
        return this.visitedAt;
    }

    public void setVisitedAt(Timestamp visitedAt) {
        this.visitedAt = visitedAt;
    }

    public UInteger getVnwUserId() {
        return this.vnwUserId;
    }

    public void setVnwUserId(UInteger vnwUserId) {
        this.vnwUserId = vnwUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblngvRegistration (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(password);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(birthday);
        sb.append(", ").append(genderId);
        sb.append(", ").append(countryId);
        sb.append(", ").append(cityId);
        sb.append(", ").append(howyouknowusId);
        sb.append(", ").append(emailTemp);
        sb.append(", ").append(isReceivedNewsletter);
        sb.append(", ").append(isConfirmed);
        sb.append(", ").append(codeConfirm);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(visitedAt);
        sb.append(", ").append(vnwUserId);

        sb.append(")");
        return sb.toString();
    }
}
