/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobAlert;

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
public class TbljobAlertRecord extends UpdatableRecordImpl<TbljobAlertRecord> {

    private static final long serialVersionUID = -910334413;

    /**
     * Setter for <code>vnw_core.tbljob_alert.jobalertid</code>.
     */
    public void setJobalertid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.jobalertid</code>.
     */
    public Integer getJobalertid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.userid</code>.
     */
    public void setUserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.useremail</code>.
     */
    public void setUseremail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.useremail</code>.
     */
    public String getUseremail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.firstname</code>.
     */
    public void setFirstname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.lastname</code>.
     */
    public void setLastname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.lastname</code>.
     */
    public String getLastname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.industryid</code>.
     */
    public void setIndustryid(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.industryid</code>.
     */
    public Short getIndustryid() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.durationdays</code>.
     */
    public void setDurationdays(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.durationdays</code>.
     */
    public Short getDurationdays() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.expireddate</code>.
     */
    public void setExpireddate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.expireddate</code>.
     */
    public Timestamp getExpireddate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.keyword</code>.
     */
    public void setKeyword(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.keyword</code>.
     */
    public String getKeyword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.mustmatchid</code>.
     */
    public void setMustmatchid(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.mustmatchid</code>.
     */
    public Byte getMustmatchid() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.highestdegreeid</code>.
     */
    public void setHighestdegreeid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.highestdegreeid</code>.
     */
    public Integer getHighestdegreeid() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.yearexperience</code>.
     */
    public void setYearexperience(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.yearexperience</code>.
     */
    public Integer getYearexperience() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.joblevelid</code>.
     */
    public void setJoblevelid(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.joblevelid</code>.
     */
    public Integer getJoblevelid() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.typeworkingid</code>.
     */
    public void setTypeworkingid(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.typeworkingid</code>.
     */
    public Integer getTypeworkingid() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.salary_min</code>.
     */
    public void setSalaryMin(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.salary_min</code>.
     */
    public Integer getSalaryMin() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.salary_max</code>.
     */
    public void setSalaryMax(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.salary_max</code>.
     */
    public Integer getSalaryMax() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.sqlstring</code>.
     */
    public void setSqlstring(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.sqlstring</code>.
     */
    public String getSqlstring() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.periodtypeid</code>. -1: Disabled because of bounced Email, 2: daily, 3: weekly, 5: monthly
     */
    public void setPeriodtypeid(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.periodtypeid</code>. -1: Disabled because of bounced Email, 2: daily, 3: weekly, 5: monthly
     */
    public Byte getPeriodtypeid() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.noofdays</code>.
     */
    public void setNoofdays(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.noofdays</code>.
     */
    public Integer getNoofdays() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.sendingdate</code>.
     */
    public void setSendingdate(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.sendingdate</code>.
     */
    public Timestamp getSendingdate() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.noofsent</code>.
     */
    public void setNoofsent(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.noofsent</code>.
     */
    public Integer getNoofsent() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.noofdayjobposted</code>.
     */
    public void setNoofdayjobposted(Short value) {
        set(22, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.noofdayjobposted</code>.
     */
    public Short getNoofdayjobposted() {
        return (Short) get(22);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.languageid</code>. store the language user want to receive jobalert (1: vietnamese, 2: english)
     */
    public void setLanguageid(Byte value) {
        set(23, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.languageid</code>. store the language user want to receive jobalert (1: vietnamese, 2: english)
     */
    public Byte getLanguageid() {
        return (Byte) get(23);
    }

    /**
     * Setter for <code>vnw_core.tbljob_alert.create_from</code>. store where user register job alert (1: inner page, 2: search page)
     */
    public void setCreateFrom(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_alert.create_from</code>. store where user register job alert (1: inner page, 2: search page)
     */
    public Byte getCreateFrom() {
        return (Byte) get(24);
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
     * Create a detached TbljobAlertRecord
     */
    public TbljobAlertRecord() {
        super(TbljobAlert.TBLJOB_ALERT);
    }

    /**
     * Create a detached, initialised TbljobAlertRecord
     */
    public TbljobAlertRecord(Integer jobalertid, Integer userid, String useremail, String firstname, String lastname, Short industryid, Timestamp createddate, Short durationdays, Timestamp expireddate, String keyword, Byte mustmatchid, Integer highestdegreeid, Integer yearexperience, Integer joblevelid, Integer typeworkingid, Integer salaryMin, Integer salaryMax, String sqlstring, Byte periodtypeid, Integer noofdays, Timestamp sendingdate, Integer noofsent, Short noofdayjobposted, Byte languageid, Byte createFrom) {
        super(TbljobAlert.TBLJOB_ALERT);

        set(0, jobalertid);
        set(1, userid);
        set(2, useremail);
        set(3, firstname);
        set(4, lastname);
        set(5, industryid);
        set(6, createddate);
        set(7, durationdays);
        set(8, expireddate);
        set(9, keyword);
        set(10, mustmatchid);
        set(11, highestdegreeid);
        set(12, yearexperience);
        set(13, joblevelid);
        set(14, typeworkingid);
        set(15, salaryMin);
        set(16, salaryMax);
        set(17, sqlstring);
        set(18, periodtypeid);
        set(19, noofdays);
        set(20, sendingdate);
        set(21, noofsent);
        set(22, noofdayjobposted);
        set(23, languageid);
        set(24, createFrom);
    }
}
