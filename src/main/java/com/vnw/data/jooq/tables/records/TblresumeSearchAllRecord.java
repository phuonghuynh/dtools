/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblresumeSearchAll;

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
public class TblresumeSearchAllRecord extends UpdatableRecordImpl<TblresumeSearchAllRecord> {

    private static final long serialVersionUID = 2047580022;

    /**
     * Setter for <code>vnw_core.tblresume_search_all.resumeid</code>.
     */
    public void setResumeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.resumeid</code>.
     */
    public Integer getResumeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.city</code>.
     */
    public void setCity(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.city</code>.
     */
    public String getCity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.fullname</code>.
     */
    public void setFullname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.fullname</code>.
     */
    public String getFullname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.city_max</code>.
     */
    public void setCityMax(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.city_max</code>.
     */
    public Byte getCityMax() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.city_min</code>.
     */
    public void setCityMin(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.city_min</code>.
     */
    public Byte getCityMin() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.category</code>.
     */
    public void setCategory(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.category</code>.
     */
    public String getCategory() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.highestdegreeid</code>.
     */
    public void setHighestdegreeid(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.highestdegreeid</code>.
     */
    public Byte getHighestdegreeid() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.yearsexperienceid</code>.
     */
    public void setYearsexperienceid(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.yearsexperienceid</code>.
     */
    public Byte getYearsexperienceid() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.joblevel</code>. joblevel & joblevel experience
     */
    public void setJoblevel(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.joblevel</code>. joblevel & joblevel experience
     */
    public String getJoblevel() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.desiredjoblevelid</code>.
     */
    public void setDesiredjoblevelid(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.desiredjoblevelid</code>.
     */
    public Byte getDesiredjoblevelid() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.nationalityid</code>.
     */
    public void setNationalityid(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.nationalityid</code>.
     */
    public Byte getNationalityid() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.school</code>.
     */
    public void setSchool(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.school</code>.
     */
    public String getSchool() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.confidentialfields</code>.
     */
    public void setConfidentialfields(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.confidentialfields</code>.
     */
    public String getConfidentialfields() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.mostrecentposition</code>.
     */
    public void setMostrecentposition(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.mostrecentposition</code>.
     */
    public String getMostrecentposition() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.mostrecentemployer</code>.
     */
    public void setMostrecentemployer(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.mostrecentemployer</code>.
     */
    public String getMostrecentemployer() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.jobdescription</code>.
     */
    public void setJobdescription(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.jobdescription</code>.
     */
    public String getJobdescription() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.typeworking</code>.
     */
    public void setTypeworking(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.typeworking</code>.
     */
    public String getTypeworking() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.language_proficiency</code>.
     */
    public void setLanguageProficiency(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.language_proficiency</code>.
     */
    public String getLanguageProficiency() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.suggestedsalary</code>.
     */
    public void setSuggestedsalary(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.suggestedsalary</code>.
     */
    public Integer getSuggestedsalary() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.genderid</code>.
     */
    public void setGenderid(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.genderid</code>.
     */
    public Byte getGenderid() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.birthday</code>.
     */
    public void setBirthday(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.birthday</code>.
     */
    public Timestamp getBirthday() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.lastdateupdated</code>.
     */
    public void setLastdateupdated(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.lastdateupdated</code>.
     */
    public Timestamp getLastdateupdated() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.content</code>.
     */
    public void setContent(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.content</code>.
     */
    public String getContent() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.workexperience</code>.
     */
    public void setWorkexperience(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.workexperience</code>.
     */
    public String getWorkexperience() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.desiredjobtitle</code>.
     */
    public void setDesiredjobtitle(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.desiredjobtitle</code>.
     */
    public String getDesiredjobtitle() {
        return (String) get(24);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.education</code>.
     */
    public void setEducation(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.education</code>.
     */
    public String getEducation() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.skill</code>.
     */
    public void setSkill(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.skill</code>.
     */
    public String getSkill() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.resumetitle</code>.
     */
    public void setResumetitle(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.resumetitle</code>.
     */
    public String getResumetitle() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.exp_jobtitle</code>.
     */
    public void setExpJobtitle(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.exp_jobtitle</code>.
     */
    public String getExpJobtitle() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.exp_description</code>.
     */
    public void setExpDescription(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.exp_description</code>.
     */
    public String getExpDescription() {
        return (String) get(29);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.edu_major</code>.
     */
    public void setEduMajor(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.edu_major</code>.
     */
    public String getEduMajor() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.edu_description</code>.
     */
    public void setEduDescription(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.edu_description</code>.
     */
    public String getEduDescription() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.highestdegree_weight</code>.
     */
    public void setHighestdegreeWeight(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.highestdegree_weight</code>.
     */
    public Byte getHighestdegreeWeight() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>vnw_core.tblresume_search_all.alias</code>.
     */
    public void setAlias(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>vnw_core.tblresume_search_all.alias</code>.
     */
    public String getAlias() {
        return (String) get(33);
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
     * Create a detached TblresumeSearchAllRecord
     */
    public TblresumeSearchAllRecord() {
        super(TblresumeSearchAll.TBLRESUME_SEARCH_ALL);
    }

    /**
     * Create a detached, initialised TblresumeSearchAllRecord
     */
    public TblresumeSearchAllRecord(Integer resumeid, String city, String fullname, Byte cityMax, Byte cityMin, String category, Byte highestdegreeid, Byte yearsexperienceid, String joblevel, Byte desiredjoblevelid, Byte nationalityid, String school, String confidentialfields, String mostrecentposition, String mostrecentemployer, String jobdescription, String typeworking, String languageProficiency, Integer suggestedsalary, Byte genderid, Timestamp birthday, Timestamp lastdateupdated, String content, String workexperience, String desiredjobtitle, String education, String skill, String resumetitle, String expJobtitle, String expDescription, String eduMajor, String eduDescription, Byte highestdegreeWeight, String alias) {
        super(TblresumeSearchAll.TBLRESUME_SEARCH_ALL);

        set(0, resumeid);
        set(1, city);
        set(2, fullname);
        set(3, cityMax);
        set(4, cityMin);
        set(5, category);
        set(6, highestdegreeid);
        set(7, yearsexperienceid);
        set(8, joblevel);
        set(9, desiredjoblevelid);
        set(10, nationalityid);
        set(11, school);
        set(12, confidentialfields);
        set(13, mostrecentposition);
        set(14, mostrecentemployer);
        set(15, jobdescription);
        set(16, typeworking);
        set(17, languageProficiency);
        set(18, suggestedsalary);
        set(19, genderid);
        set(20, birthday);
        set(21, lastdateupdated);
        set(22, content);
        set(23, workexperience);
        set(24, desiredjobtitle);
        set(25, education);
        set(26, skill);
        set(27, resumetitle);
        set(28, expJobtitle);
        set(29, expDescription);
        set(30, eduMajor);
        set(31, eduDescription);
        set(32, highestdegreeWeight);
        set(33, alias);
    }
}
