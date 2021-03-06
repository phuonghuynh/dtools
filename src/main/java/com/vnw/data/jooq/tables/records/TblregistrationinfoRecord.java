/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.Tblregistrationinfo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TblregistrationinfoRecord extends UpdatableRecordImpl<TblregistrationinfoRecord> {

    private static final long serialVersionUID = 1095806810;

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.userid</code>.
     */
    public void setUserid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.companyid</code>.
     */
    public void setCompanyid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.companyid</code>.
     */
    public Integer getCompanyid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.userpass</code>.
     */
    public void setUserpass(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.userpass</code>.
     */
    public String getUserpass() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.firstname</code>.
     */
    public void setFirstname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.lastname</code>.
     */
    public void setLastname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.lastname</code>.
     */
    public String getLastname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.genderid</code>.
     */
    public void setGenderid(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.genderid</code>.
     */
    public Byte getGenderid() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.birthday</code>.
     */
    public void setBirthday(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.birthday</code>.
     */
    public Timestamp getBirthday() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.address</code>.
     */
    public void setAddress(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.address</code>.
     */
    public String getAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.countryid</code>.
     */
    public void setCountryid(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.countryid</code>.
     */
    public Short getCountryid() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.cityname</code>.
     */
    public void setCityname(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.cityname</code>.
     */
    public String getCityname() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.cityid</code>.
     */
    public void setCityid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.cityid</code>.
     */
    public Integer getCityid() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.district</code>.
     */
    public void setDistrict(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.district</code>.
     */
    public String getDistrict() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.email1</code>.
     */
    public void setEmail1(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.email1</code>.
     */
    public String getEmail1() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.email2</code>.
     */
    public void setEmail2(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.email2</code>.
     */
    public String getEmail2() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.homephone</code>.
     */
    public void setHomephone(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.homephone</code>.
     */
    public String getHomephone() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.cellphone</code>.
     */
    public void setCellphone(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.cellphone</code>.
     */
    public String getCellphone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.youareid</code>.
     */
    public void setYouareid(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.youareid</code>.
     */
    public Byte getYouareid() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.howyouknowusid</code>.
     */
    public void setHowyouknowusid(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.howyouknowusid</code>.
     */
    public Byte getHowyouknowusid() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.isactive</code>.
     */
    public void setIsactive(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.isactive</code>.
     */
    public Byte getIsactive() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.upgradeddate</code>.
     */
    public void setUpgradeddate(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.upgradeddate</code>.
     */
    public Timestamp getUpgradeddate() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.lastdateupdated</code>.
     */
    public void setLastdateupdated(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.lastdateupdated</code>.
     */
    public Timestamp getLastdateupdated() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.lastdatelogin</code>.
     */
    public void setLastdatelogin(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.lastdatelogin</code>.
     */
    public Timestamp getLastdatelogin() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.isupgraded</code>.
     */
    public void setIsupgraded(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.isupgraded</code>.
     */
    public Byte getIsupgraded() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.isaddnewletter</code>.
     */
    public void setIsaddnewletter(Byte value) {
        set(25, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.isaddnewletter</code>.
     */
    public Byte getIsaddnewletter() {
        return (Byte) get(25);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.isaddedmonthlynewsletter</code>.
     */
    public void setIsaddedmonthlynewsletter(Byte value) {
        set(26, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.isaddedmonthlynewsletter</code>.
     */
    public Byte getIsaddedmonthlynewsletter() {
        return (Byte) get(26);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.billingcontactid</code>.
     */
    public void setBillingcontactid(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.billingcontactid</code>.
     */
    public Integer getBillingcontactid() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.yearsexperienceid</code>.
     */
    public void setYearsexperienceid(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.yearsexperienceid</code>.
     */
    public Byte getYearsexperienceid() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.joblevelid</code>.
     */
    public void setJoblevelid(Byte value) {
        set(29, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.joblevelid</code>.
     */
    public Byte getJoblevelid() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.highestdegreeid</code>.
     */
    public void setHighestdegreeid(Byte value) {
        set(30, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.highestdegreeid</code>.
     */
    public Byte getHighestdegreeid() {
        return (Byte) get(30);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.jobtitle</code>.
     */
    public void setJobtitle(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.jobtitle</code>.
     */
    public String getJobtitle() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.workingCompanyName</code>. The latest company which JS is working for
     */
    public void setWorkingcompanyname(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.workingCompanyName</code>. The latest company which JS is working for
     */
    public String getWorkingcompanyname() {
        return (String) get(32);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.oldusername</code>.
     */
    public void setOldusername(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.oldusername</code>.
     */
    public String getOldusername() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.isconfirm</code>.
     */
    public void setIsconfirm(Byte value) {
        set(34, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.isconfirm</code>.
     */
    public Byte getIsconfirm() {
        return (Byte) get(34);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.is_suspend</code>.
     */
    public void setIsSuspend(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.is_suspend</code>.
     */
    public Byte getIsSuspend() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.is_banned</code>.
     */
    public void setIsBanned(Byte value) {
        set(36, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.is_banned</code>.
     */
    public Byte getIsBanned() {
        return (Byte) get(36);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.suspended_to</code>.
     */
    public void setSuspendedTo(Timestamp value) {
        set(37, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.suspended_to</code>.
     */
    public Timestamp getSuspendedTo() {
        return (Timestamp) get(37);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.codeconfirm</code>.
     */
    public void setCodeconfirm(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.codeconfirm</code>.
     */
    public String getCodeconfirm() {
        return (String) get(38);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.layout_status</code>.
     */
    public void setLayoutStatus(UShort value) {
        set(39, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.layout_status</code>.
     */
    public UShort getLayoutStatus() {
        return (UShort) get(39);
    }

    /**
     * Setter for <code>vnw_core.tblregistrationinfo.languageid</code>. store the language user want to receive jobalert (1: vietnamese, 2: english)
     */
    public void setLanguageid(Byte value) {
        set(40, value);
    }

    /**
     * Getter for <code>vnw_core.tblregistrationinfo.languageid</code>. store the language user want to receive jobalert (1: vietnamese, 2: english)
     */
    public Byte getLanguageid() {
        return (Byte) get(40);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblregistrationinfoRecord
     */
    public TblregistrationinfoRecord() {
        super(Tblregistrationinfo.TBLREGISTRATIONINFO);
    }

    /**
     * Create a detached, initialised TblregistrationinfoRecord
     */
    public TblregistrationinfoRecord(Integer userid, Integer companyid, String username, String userpass, String firstname, String lastname, Byte genderid, Timestamp birthday, String address, Short countryid, String cityname, Integer cityid, String district, String email1, String email2, String homephone, String cellphone, Byte youareid, Byte howyouknowusid, Byte isactive, Timestamp createddate, Timestamp upgradeddate, Timestamp lastdateupdated, Timestamp lastdatelogin, Byte isupgraded, Byte isaddnewletter, Byte isaddedmonthlynewsletter, Integer billingcontactid, Byte yearsexperienceid, Byte joblevelid, Byte highestdegreeid, String jobtitle, String workingcompanyname, String oldusername, Byte isconfirm, Byte isSuspend, Byte isBanned, Timestamp suspendedTo, String codeconfirm, UShort layoutStatus, Byte languageid) {
        super(Tblregistrationinfo.TBLREGISTRATIONINFO);

        set(0, userid);
        set(1, companyid);
        set(2, username);
        set(3, userpass);
        set(4, firstname);
        set(5, lastname);
        set(6, genderid);
        set(7, birthday);
        set(8, address);
        set(9, countryid);
        set(10, cityname);
        set(11, cityid);
        set(12, district);
        set(13, email1);
        set(14, email2);
        set(15, homephone);
        set(16, cellphone);
        set(17, youareid);
        set(18, howyouknowusid);
        set(19, isactive);
        set(20, createddate);
        set(21, upgradeddate);
        set(22, lastdateupdated);
        set(23, lastdatelogin);
        set(24, isupgraded);
        set(25, isaddnewletter);
        set(26, isaddedmonthlynewsletter);
        set(27, billingcontactid);
        set(28, yearsexperienceid);
        set(29, joblevelid);
        set(30, highestdegreeid);
        set(31, jobtitle);
        set(32, workingcompanyname);
        set(33, oldusername);
        set(34, isconfirm);
        set(35, isSuspend);
        set(36, isBanned);
        set(37, suspendedTo);
        set(38, codeconfirm);
        set(39, layoutStatus);
        set(40, languageid);
    }
}
