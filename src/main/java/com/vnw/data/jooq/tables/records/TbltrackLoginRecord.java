/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbltrackLogin;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class TbltrackLoginRecord extends UpdatableRecordImpl<TbltrackLoginRecord> implements Record15<Integer, String, Integer, Timestamp, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1087912703;

    /**
     * Setter for <code>vnw_core.tbltrack_login.trackingid</code>.
     */
    public void setTrackingid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.trackingid</code>.
     */
    public Integer getTrackingid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.sessionid</code>.
     */
    public void setSessionid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.sessionid</code>.
     */
    public String getSessionid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.userid</code>.
     */
    public void setUserid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.visit_start</code>.
     */
    public void setVisitStart(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.visit_start</code>.
     */
    public Timestamp getVisitStart() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.visit_end</code>.
     */
    public void setVisitEnd(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.visit_end</code>.
     */
    public Timestamp getVisitEnd() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.logintime</code>.
     */
    public void setLogintime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.logintime</code>.
     */
    public Timestamp getLogintime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.page_start</code>.
     */
    public void setPageStart(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.page_start</code>.
     */
    public String getPageStart() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.page_end</code>.
     */
    public void setPageEnd(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.page_end</code>.
     */
    public String getPageEnd() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.os</code>.
     */
    public void setOs(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.os</code>.
     */
    public String getOs() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.browser</code>.
     */
    public void setBrowser(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.browser</code>.
     */
    public String getBrowser() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.browserversion</code>.
     */
    public void setBrowserversion(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.browserversion</code>.
     */
    public String getBrowserversion() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.screenversion</code>.
     */
    public void setScreenversion(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.screenversion</code>.
     */
    public String getScreenversion() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.jsversion</code>.
     */
    public void setJsversion(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.jsversion</code>.
     */
    public String getJsversion() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.ipaddress</code>.
     */
    public void setIpaddress(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.ipaddress</code>.
     */
    public String getIpaddress() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_login.referrer_site</code>.
     */
    public void setReferrerSite(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_login.referrer_site</code>.
     */
    public String getReferrerSite() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Timestamp, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Timestamp, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TbltrackLogin.TBLTRACK_LOGIN.TRACKINGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbltrackLogin.TBLTRACK_LOGIN.SESSIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TbltrackLogin.TBLTRACK_LOGIN.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbltrackLogin.TBLTRACK_LOGIN.VISIT_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TbltrackLogin.TBLTRACK_LOGIN.VISIT_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TbltrackLogin.TBLTRACK_LOGIN.LOGINTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TbltrackLogin.TBLTRACK_LOGIN.PAGE_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TbltrackLogin.TBLTRACK_LOGIN.PAGE_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TbltrackLogin.TBLTRACK_LOGIN.OS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TbltrackLogin.TBLTRACK_LOGIN.BROWSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TbltrackLogin.TBLTRACK_LOGIN.BROWSERVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TbltrackLogin.TBLTRACK_LOGIN.SCREENVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TbltrackLogin.TBLTRACK_LOGIN.JSVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TbltrackLogin.TBLTRACK_LOGIN.IPADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TbltrackLogin.TBLTRACK_LOGIN.REFERRER_SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTrackingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSessionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getVisitStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getVisitEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLogintime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPageStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPageEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBrowser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBrowserversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getScreenversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getJsversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getIpaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getReferrerSite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value1(Integer value) {
        setTrackingid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value2(String value) {
        setSessionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value3(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value4(Timestamp value) {
        setVisitStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value5(Timestamp value) {
        setVisitEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value6(Timestamp value) {
        setLogintime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value7(String value) {
        setPageStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value8(String value) {
        setPageEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value9(String value) {
        setOs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value10(String value) {
        setBrowser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value11(String value) {
        setBrowserversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value12(String value) {
        setScreenversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value13(String value) {
        setJsversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value14(String value) {
        setIpaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord value15(String value) {
        setReferrerSite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackLoginRecord values(Integer value1, String value2, Integer value3, Timestamp value4, Timestamp value5, Timestamp value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbltrackLoginRecord
     */
    public TbltrackLoginRecord() {
        super(TbltrackLogin.TBLTRACK_LOGIN);
    }

    /**
     * Create a detached, initialised TbltrackLoginRecord
     */
    public TbltrackLoginRecord(Integer trackingid, String sessionid, Integer userid, Timestamp visitStart, Timestamp visitEnd, Timestamp logintime, String pageStart, String pageEnd, String os, String browser, String browserversion, String screenversion, String jsversion, String ipaddress, String referrerSite) {
        super(TbltrackLogin.TBLTRACK_LOGIN);

        set(0, trackingid);
        set(1, sessionid);
        set(2, userid);
        set(3, visitStart);
        set(4, visitEnd);
        set(5, logintime);
        set(6, pageStart);
        set(7, pageEnd);
        set(8, os);
        set(9, browser);
        set(10, browserversion);
        set(11, screenversion);
        set(12, jsversion);
        set(13, ipaddress);
        set(14, referrerSite);
    }
}