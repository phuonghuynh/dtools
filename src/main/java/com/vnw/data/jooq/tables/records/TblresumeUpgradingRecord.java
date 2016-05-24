/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumeUpgrading;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TblresumeUpgradingRecord extends UpdatableRecordImpl<TblresumeUpgradingRecord> {

    private static final long serialVersionUID = -1161891559;

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.resumeid</code>.
     */
    public void setResumeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.resumeid</code>.
     */
    public Integer getResumeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.resumetitle</code>.
     */
    public void setResumetitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.resumetitle</code>.
     */
    public String getResumetitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.fullname</code>.
     */
    public void setFullname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.fullname</code>.
     */
    public String getFullname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.birthday</code>.
     */
    public void setBirthday(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.birthday</code>.
     */
    public Timestamp getBirthday() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.genderid</code>.
     */
    public void setGenderid(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.genderid</code>.
     */
    public Byte getGenderid() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.maritalstatusid</code>.
     */
    public void setMaritalstatusid(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.maritalstatusid</code>.
     */
    public Byte getMaritalstatusid() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.address</code>.
     */
    public void setAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.address</code>.
     */
    public String getAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.countryid</code>.
     */
    public void setCountryid(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.countryid</code>.
     */
    public Short getCountryid() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.cityid</code>.
     */
    public void setCityid(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.cityid</code>.
     */
    public Short getCityid() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.homephone</code>.
     */
    public void setHomephone(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.homephone</code>.
     */
    public String getHomephone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.cellphone</code>.
     */
    public void setCellphone(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.cellphone</code>.
     */
    public String getCellphone() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.emailaddress</code>.
     */
    public void setEmailaddress(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.emailaddress</code>.
     */
    public String getEmailaddress() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.desiredjobtitle</code>.
     */
    public void setDesiredjobtitle(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.desiredjobtitle</code>.
     */
    public String getDesiredjobtitle() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.jobdescription</code>.
     */
    public void setJobdescription(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.jobdescription</code>.
     */
    public String getJobdescription() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.joblevelid</code>.
     */
    public void setJoblevelid(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.joblevelid</code>.
     */
    public Byte getJoblevelid() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.desiredjoblevelid</code>.
     */
    public void setDesiredjoblevelid(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.desiredjoblevelid</code>.
     */
    public Byte getDesiredjoblevelid() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.companysizeid</code>.
     */
    public void setCompanysizeid(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.companysizeid</code>.
     */
    public Byte getCompanysizeid() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.yearsexperienceid</code>.
     */
    public void setYearsexperienceid(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.yearsexperienceid</code>.
     */
    public Byte getYearsexperienceid() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.highestdegreeid</code>.
     */
    public void setHighestdegreeid(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.highestdegreeid</code>.
     */
    public Byte getHighestdegreeid() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.relocateid</code>.
     */
    public void setRelocateid(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.relocateid</code>.
     */
    public Byte getRelocateid() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.willingtravelid</code>.
     */
    public void setWillingtravelid(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.willingtravelid</code>.
     */
    public Byte getWillingtravelid() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.mostrecentposition</code>.
     */
    public void setMostrecentposition(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.mostrecentposition</code>.
     */
    public String getMostrecentposition() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.currentsalary</code>.
     */
    public void setCurrentsalary(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.currentsalary</code>.
     */
    public String getCurrentsalary() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.suggestedsalary</code>.
     */
    public void setSuggestedsalary(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.suggestedsalary</code>.
     */
    public String getSuggestedsalary() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.nationalityid</code>.
     */
    public void setNationalityid(Short value) {
        set(24, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.nationalityid</code>.
     */
    public Short getNationalityid() {
        return (Short) get(24);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.language1</code>.
     */
    public void setLanguage1(Short value) {
        set(25, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.language1</code>.
     */
    public Short getLanguage1() {
        return (Short) get(25);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.languagelevel1</code>.
     */
    public void setLanguagelevel1(Byte value) {
        set(26, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.languagelevel1</code>.
     */
    public Byte getLanguagelevel1() {
        return (Byte) get(26);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.language2</code>.
     */
    public void setLanguage2(Short value) {
        set(27, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.language2</code>.
     */
    public Short getLanguage2() {
        return (Short) get(27);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.languagelevel2</code>.
     */
    public void setLanguagelevel2(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.languagelevel2</code>.
     */
    public Byte getLanguagelevel2() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.language3</code>.
     */
    public void setLanguage3(Short value) {
        set(29, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.language3</code>.
     */
    public Short getLanguage3() {
        return (Short) get(29);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.languagelevel3</code>.
     */
    public void setLanguagelevel3(Byte value) {
        set(30, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.languagelevel3</code>.
     */
    public Byte getLanguagelevel3() {
        return (Byte) get(30);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.language4</code>.
     */
    public void setLanguage4(Short value) {
        set(31, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.language4</code>.
     */
    public Short getLanguage4() {
        return (Short) get(31);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.languagelevel4</code>.
     */
    public void setLanguagelevel4(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.languagelevel4</code>.
     */
    public Byte getLanguagelevel4() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.resumecontent</code>.
     */
    public void setResumecontent(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.resumecontent</code>.
     */
    public String getResumecontent() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.userpathpicturefile</code>.
     */
    public void setUserpathpicturefile(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.userpathpicturefile</code>.
     */
    public String getUserpathpicturefile() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.ischeckconfidential</code>.
     */
    public void setIscheckconfidential(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.ischeckconfidential</code>.
     */
    public Byte getIscheckconfidential() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.confidentialfields</code>.
     */
    public void setConfidentialfields(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.confidentialfields</code>.
     */
    public String getConfidentialfields() {
        return (String) get(36);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.issearchable</code>.
     */
    public void setIssearchable(Byte value) {
        set(37, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.issearchable</code>.
     */
    public Byte getIssearchable() {
        return (Byte) get(37);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.postedstep</code>.
     */
    public void setPostedstep(Byte value) {
        set(38, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.postedstep</code>.
     */
    public Byte getPostedstep() {
        return (Byte) get(38);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.iscompleted</code>.
     */
    public void setIscompleted(Byte value) {
        set(39, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.iscompleted</code>.
     */
    public Byte getIscompleted() {
        return (Byte) get(39);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.isdenied</code>.
     */
    public void setIsdenied(Byte value) {
        set(40, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.isdenied</code>.
     */
    public Byte getIsdenied() {
        return (Byte) get(40);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(41, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(41);
    }

    /**
     * Setter for <code>vnw_core.tblresume_upgrading.lastupdate</code>.
     */
    public void setLastupdate(Timestamp value) {
        set(42, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_upgrading.lastupdate</code>.
     */
    public Timestamp getLastupdate() {
        return (Timestamp) get(42);
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
     * Create a detached TblresumeUpgradingRecord
     */
    public TblresumeUpgradingRecord() {
        super(TblresumeUpgrading.TBLRESUME_UPGRADING);
    }

    /**
     * Create a detached, initialised TblresumeUpgradingRecord
     */
    public TblresumeUpgradingRecord(Integer resumeid, String resumetitle, String fullname, Timestamp birthday, Byte genderid, Byte maritalstatusid, String address, Short countryid, Short cityid, String homephone, String cellphone, String emailaddress, String desiredjobtitle, String jobdescription, Byte joblevelid, Byte desiredjoblevelid, Byte companysizeid, Byte yearsexperienceid, Byte highestdegreeid, Byte relocateid, Byte willingtravelid, String mostrecentposition, String currentsalary, String suggestedsalary, Short nationalityid, Short language1, Byte languagelevel1, Short language2, Byte languagelevel2, Short language3, Byte languagelevel3, Short language4, Byte languagelevel4, String resumecontent, String userpathpicturefile, Byte ischeckconfidential, String confidentialfields, Byte issearchable, Byte postedstep, Byte iscompleted, Byte isdenied, Timestamp createddate, Timestamp lastupdate) {
        super(TblresumeUpgrading.TBLRESUME_UPGRADING);

        set(0, resumeid);
        set(1, resumetitle);
        set(2, fullname);
        set(3, birthday);
        set(4, genderid);
        set(5, maritalstatusid);
        set(6, address);
        set(7, countryid);
        set(8, cityid);
        set(9, homephone);
        set(10, cellphone);
        set(11, emailaddress);
        set(12, desiredjobtitle);
        set(13, jobdescription);
        set(14, joblevelid);
        set(15, desiredjoblevelid);
        set(16, companysizeid);
        set(17, yearsexperienceid);
        set(18, highestdegreeid);
        set(19, relocateid);
        set(20, willingtravelid);
        set(21, mostrecentposition);
        set(22, currentsalary);
        set(23, suggestedsalary);
        set(24, nationalityid);
        set(25, language1);
        set(26, languagelevel1);
        set(27, language2);
        set(28, languagelevel2);
        set(29, language3);
        set(30, languagelevel3);
        set(31, language4);
        set(32, languagelevel4);
        set(33, resumecontent);
        set(34, userpathpicturefile);
        set(35, ischeckconfidential);
        set(36, confidentialfields);
        set(37, issearchable);
        set(38, postedstep);
        set(39, iscompleted);
        set(40, isdenied);
        set(41, createddate);
        set(42, lastupdate);
    }
}
