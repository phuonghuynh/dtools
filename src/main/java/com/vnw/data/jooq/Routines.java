/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq;


import com.vnw.data.jooq.routines.Addevent;
import com.vnw.data.jooq.routines.Addeventregistration;
import com.vnw.data.jooq.routines.Addeventregistrationseminar;
import com.vnw.data.jooq.routines.Addresumeindustry;
import com.vnw.data.jooq.routines.Adduserskill;
import com.vnw.data.jooq.routines.AdminCheckUserActions;
import com.vnw.data.jooq.routines.AdminExtend4holiday2016;
import com.vnw.data.jooq.routines.Calculateresumecompletionrate;
import com.vnw.data.jooq.routines.Checkeventregistered;
import com.vnw.data.jooq.routines.Fixjsname;
import com.vnw.data.jooq.routines.GetattachedresumeidFromuserid;
import com.vnw.data.jooq.routines.Getevent;
import com.vnw.data.jooq.routines.Geteventregistration;
import com.vnw.data.jooq.routines.Geteventregistrations;
import com.vnw.data.jooq.routines.Geteventregistrationseminars;
import com.vnw.data.jooq.routines.Getjobseekercontactinfo;
import com.vnw.data.jooq.routines.Getjobseekerdetails;
import com.vnw.data.jooq.routines.Getlanguagelevels;
import com.vnw.data.jooq.routines.Getlanguages;
import com.vnw.data.jooq.routines.Getqualifications;
import com.vnw.data.jooq.routines.Getrepresentresumeid;
import com.vnw.data.jooq.routines.GetrepresentresumeidFromuserid;
import com.vnw.data.jooq.routines.Getresumeapplications;
import com.vnw.data.jooq.routines.Getresumeindustries;
import com.vnw.data.jooq.routines.Getresumelanguages;
import com.vnw.data.jooq.routines.Getsearchjob;
import com.vnw.data.jooq.routines.Getuserskills;
import com.vnw.data.jooq.routines.Getworkingpreferences;
import com.vnw.data.jooq.routines.RemoveEmailPhone;
import com.vnw.data.jooq.routines.Removeallresumeindustries;
import com.vnw.data.jooq.routines.Setjobseekercontactinfo;
import com.vnw.data.jooq.routines.Setjobseekerdetails;
import com.vnw.data.jooq.routines.Setresumelanguages;
import com.vnw.data.jooq.routines.Setworkingpreferences;
import com.vnw.data.jooq.routines.Startimportdatetime;
import com.vnw.data.jooq.routines.TblsUsersProc;
import com.vnw.data.jooq.routines.Updateresumecompletionrate;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in vnw_core
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>vnw_core.addEvent</code>
     */
    public static void addevent(Configuration configuration, String inEventname) {
        Addevent p = new Addevent();
        p.setInEventname(inEventname);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.addEventRegistration</code>
     */
    public static void addeventregistration(Configuration configuration, String inUseremail, Integer inEventid, Byte inIsstudying, Integer inCityid, Byte inUserstatus, Byte inIssociallogin, String inUtmsource, String inUtmmedium, String inUtmcampaign, String inUtmcontent, String inUtmterm, Timestamp inCreatedon) {
        Addeventregistration p = new Addeventregistration();
        p.setInUseremail(inUseremail);
        p.setInEventid(inEventid);
        p.setInIsstudying(inIsstudying);
        p.setInCityid(inCityid);
        p.setInUserstatus(inUserstatus);
        p.setInIssociallogin(inIssociallogin);
        p.setInUtmsource(inUtmsource);
        p.setInUtmmedium(inUtmmedium);
        p.setInUtmcampaign(inUtmcampaign);
        p.setInUtmcontent(inUtmcontent);
        p.setInUtmterm(inUtmterm);
        p.setInCreatedon(inCreatedon);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.addEventRegistrationSeminar</code>
     */
    public static void addeventregistrationseminar(Configuration configuration, Integer inEventregistrationid, Byte inSeminarid) {
        Addeventregistrationseminar p = new Addeventregistrationseminar();
        p.setInEventregistrationid(inEventregistrationid);
        p.setInSeminarid(inSeminarid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.addResumeIndustry</code>
     */
    public static void addresumeindustry(Configuration configuration, Integer inResumeid, Integer inIndustryid) {
        Addresumeindustry p = new Addresumeindustry();
        p.setInResumeid(inResumeid);
        p.setInIndustryid(inIndustryid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.addUserSkill</code>
     */
    public static void adduserskill(Configuration configuration, Integer inUserid, String inUseremail, String inSkillname, Short inYearsexperience) {
        Adduserskill p = new Adduserskill();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);
        p.setInSkillname(inSkillname);
        p.setInYearsexperience(inYearsexperience);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.admin_check_user_actions</code>
     */
    public static void adminCheckUserActions(Configuration configuration) {
        AdminCheckUserActions p = new AdminCheckUserActions();

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.admin_extend4holiday2016</code>
     */
    public static void adminExtend4holiday2016(Configuration configuration, Timestamp startdate, Timestamp enddate, Timestamp start15date, Timestamp end15date, Integer duration) {
        AdminExtend4holiday2016 p = new AdminExtend4holiday2016();
        p.setStartdate(startdate);
        p.setEnddate(enddate);
        p.setStart15date(start15date);
        p.setEnd15date(end15date);
        p.setDuration(duration);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.calculateResumeCompletionRate</code>
     */
    public static Integer calculateresumecompletionrate(Configuration configuration, Integer inresumeid, Integer inresumetype) {
        Calculateresumecompletionrate f = new Calculateresumecompletionrate();
        f.setInresumeid(inresumeid);
        f.setInresumetype(inresumetype);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.calculateResumeCompletionRate</code> as a field.
     */
    public static Field<Integer> calculateresumecompletionrate(Integer inresumeid, Integer inresumetype) {
        Calculateresumecompletionrate f = new Calculateresumecompletionrate();
        f.setInresumeid(inresumeid);
        f.setInresumetype(inresumetype);

        return f.asField();
    }

    /**
     * Get <code>vnw_core.calculateResumeCompletionRate</code> as a field.
     */
    public static Field<Integer> calculateresumecompletionrate(Field<Integer> inresumeid, Field<Integer> inresumetype) {
        Calculateresumecompletionrate f = new Calculateresumecompletionrate();
        f.setInresumeid(inresumeid);
        f.setInresumetype(inresumetype);

        return f.asField();
    }

    /**
     * Call <code>vnw_core.checkEventRegistered</code>
     */
    public static void checkeventregistered(Configuration configuration, String inUseremail, Integer inEventid) {
        Checkeventregistered p = new Checkeventregistered();
        p.setInUseremail(inUseremail);
        p.setInEventid(inEventid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.fixJSName</code>
     */
    public static String fixjsname(Configuration configuration, String original) {
        Fixjsname f = new Fixjsname();
        f.setOriginal(original);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.fixJSName</code> as a field.
     */
    public static Field<String> fixjsname(String original) {
        Fixjsname f = new Fixjsname();
        f.setOriginal(original);

        return f.asField();
    }

    /**
     * Get <code>vnw_core.fixJSName</code> as a field.
     */
    public static Field<String> fixjsname(Field<String> original) {
        Fixjsname f = new Fixjsname();
        f.setOriginal(original);

        return f.asField();
    }

    /**
     * Call <code>vnw_core.getAttachedResumeId_FromUserId</code>
     */
    public static Integer getattachedresumeidFromuserid(Configuration configuration, Integer inUserid) {
        GetattachedresumeidFromuserid f = new GetattachedresumeidFromuserid();
        f.setInUserid(inUserid);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.getAttachedResumeId_FromUserId</code> as a field.
     */
    public static Field<Integer> getattachedresumeidFromuserid(Integer inUserid) {
        GetattachedresumeidFromuserid f = new GetattachedresumeidFromuserid();
        f.setInUserid(inUserid);

        return f.asField();
    }

    /**
     * Get <code>vnw_core.getAttachedResumeId_FromUserId</code> as a field.
     */
    public static Field<Integer> getattachedresumeidFromuserid(Field<Integer> inUserid) {
        GetattachedresumeidFromuserid f = new GetattachedresumeidFromuserid();
        f.setInUserid(inUserid);

        return f.asField();
    }

    /**
     * Call <code>vnw_core.getEvent</code>
     */
    public static void getevent(Configuration configuration, Integer inEventid, String inEventname) {
        Getevent p = new Getevent();
        p.setInEventid(inEventid);
        p.setInEventname(inEventname);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getEventRegistration</code>
     */
    public static void geteventregistration(Configuration configuration, Integer inEventregistrationid) {
        Geteventregistration p = new Geteventregistration();
        p.setInEventregistrationid(inEventregistrationid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getEventRegistrations</code>
     */
    public static void geteventregistrations(Configuration configuration, Integer inEventid) {
        Geteventregistrations p = new Geteventregistrations();
        p.setInEventid(inEventid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getEventRegistrationSeminars</code>
     */
    public static void geteventregistrationseminars(Configuration configuration, Integer inEventregistrationid) {
        Geteventregistrationseminars p = new Geteventregistrationseminars();
        p.setInEventregistrationid(inEventregistrationid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getJobSeekerContactInfo</code>
     */
    public static void getjobseekercontactinfo(Configuration configuration, Integer inUserid, String inUseremail) {
        Getjobseekercontactinfo p = new Getjobseekercontactinfo();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getJobSeekerDetails</code>
     */
    public static void getjobseekerdetails(Configuration configuration, Integer inUserid, String inUseremail) {
        Getjobseekerdetails p = new Getjobseekerdetails();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getLanguageLevels</code>
     */
    public static void getlanguagelevels(Configuration configuration, Byte inLanguageid) {
        Getlanguagelevels p = new Getlanguagelevels();
        p.setInLanguageid(inLanguageid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getLanguages</code>
     */
    public static void getlanguages(Configuration configuration) {
        Getlanguages p = new Getlanguages();

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getQualifications</code>
     */
    public static void getqualifications(Configuration configuration, Short inLanguageId) {
        Getqualifications p = new Getqualifications();
        p.setInLanguageId(inLanguageId);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getRepresentResumeId</code>
     */
    public static Integer getrepresentresumeid(Configuration configuration, String inUseremail) {
        Getrepresentresumeid f = new Getrepresentresumeid();
        f.setInUseremail(inUseremail);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.getRepresentResumeId</code> as a field.
     */
    public static Field<Integer> getrepresentresumeid(String inUseremail) {
        Getrepresentresumeid f = new Getrepresentresumeid();
        f.setInUseremail(inUseremail);

        return f.asField();
    }

    /**
     * Get <code>vnw_core.getRepresentResumeId</code> as a field.
     */
    public static Field<Integer> getrepresentresumeid(Field<String> inUseremail) {
        Getrepresentresumeid f = new Getrepresentresumeid();
        f.setInUseremail(inUseremail);

        return f.asField();
    }

    /**
     * Call <code>vnw_core.getRepresentResumeId_FromUserId</code>
     */
    public static Integer getrepresentresumeidFromuserid(Configuration configuration, Integer inUserid) {
        GetrepresentresumeidFromuserid f = new GetrepresentresumeidFromuserid();
        f.setInUserid(inUserid);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.getRepresentResumeId_FromUserId</code> as a field.
     */
    public static Field<Integer> getrepresentresumeidFromuserid(Integer inUserid) {
        GetrepresentresumeidFromuserid f = new GetrepresentresumeidFromuserid();
        f.setInUserid(inUserid);

        return f.asField();
    }

    /**
     * Get <code>vnw_core.getRepresentResumeId_FromUserId</code> as a field.
     */
    public static Field<Integer> getrepresentresumeidFromuserid(Field<Integer> inUserid) {
        GetrepresentresumeidFromuserid f = new GetrepresentresumeidFromuserid();
        f.setInUserid(inUserid);

        return f.asField();
    }

    /**
     * Call <code>vnw_core.getResumeApplications</code>
     */
    public static void getresumeapplications(Configuration configuration) {
        Getresumeapplications p = new Getresumeapplications();

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getResumeIndustries</code>
     */
    public static void getresumeindustries(Configuration configuration, Integer inUserid, String inUseremail) {
        Getresumeindustries p = new Getresumeindustries();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getResumeLanguages</code>
     */
    public static void getresumelanguages(Configuration configuration, Integer inUserid, String inUseremail) {
        Getresumelanguages p = new Getresumelanguages();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getSearchJob</code>
     */
    public static void getsearchjob(Configuration configuration) {
        Getsearchjob p = new Getsearchjob();

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getUserSkills</code>
     */
    public static void getuserskills(Configuration configuration, Integer inUserid, String inUseremail) {
        Getuserskills p = new Getuserskills();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.getWorkingPreferences</code>
     */
    public static void getworkingpreferences(Configuration configuration, Integer inUserid, String inUseremail) {
        Getworkingpreferences p = new Getworkingpreferences();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.removeAllResumeIndustries</code>
     */
    public static void removeallresumeindustries(Configuration configuration, Integer inResumeid) {
        Removeallresumeindustries p = new Removeallresumeindustries();
        p.setInResumeid(inResumeid);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.remove_email_phone</code>
     */
    public static String removeEmailPhone(Configuration configuration, String original) {
        RemoveEmailPhone f = new RemoveEmailPhone();
        f.setOriginal(original);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.remove_email_phone</code> as a field.
     */
    public static Field<String> removeEmailPhone(String original) {
        RemoveEmailPhone f = new RemoveEmailPhone();
        f.setOriginal(original);

        return f.asField();
    }

    /**
     * Get <code>vnw_core.remove_email_phone</code> as a field.
     */
    public static Field<String> removeEmailPhone(Field<String> original) {
        RemoveEmailPhone f = new RemoveEmailPhone();
        f.setOriginal(original);

        return f.asField();
    }

    /**
     * Call <code>vnw_core.setJobSeekerContactInfo</code>
     */
    public static void setjobseekercontactinfo(Configuration configuration, Integer inUserid, String inUseremail, String inFirstname, String inLastname, String inSlug, Timestamp inDateofbirth, String inCellphone, Integer inCityid, Integer inDistrictid, String inAddress, Integer inNationalityid, Integer inCountryid, Byte inGenderid, Byte inMaritalstatusid, Byte inDeleteifnull) {
        Setjobseekercontactinfo p = new Setjobseekercontactinfo();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);
        p.setInFirstname(inFirstname);
        p.setInLastname(inLastname);
        p.setInSlug(inSlug);
        p.setInDateofbirth(inDateofbirth);
        p.setInCellphone(inCellphone);
        p.setInCityid(inCityid);
        p.setInDistrictid(inDistrictid);
        p.setInAddress(inAddress);
        p.setInNationalityid(inNationalityid);
        p.setInCountryid(inCountryid);
        p.setInGenderid(inGenderid);
        p.setInMaritalstatusid(inMaritalstatusid);
        p.setInDeleteifnull(inDeleteifnull);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.setJobSeekerDetails</code>
     */
    public static void setjobseekerdetails(Configuration configuration, Integer inUserid, String inUseremail, String inRecentjobtitle, String inRecentemployer, Integer inYearsofexperience, Byte inDeleteifnull) {
        Setjobseekerdetails p = new Setjobseekerdetails();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);
        p.setInRecentjobtitle(inRecentjobtitle);
        p.setInRecentemployer(inRecentemployer);
        p.setInYearsofexperience(inYearsofexperience);
        p.setInDeleteifnull(inDeleteifnull);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.setResumeLanguages</code>
     */
    public static void setresumelanguages(Configuration configuration, Integer inUserid, String inUseremail, Integer inLang_1, Integer inLang_1Level, Integer inLang_2, Integer inLang_2Level, Integer inLang_3, Integer inLang_3Level) {
        Setresumelanguages p = new Setresumelanguages();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);
        p.setInLang_1(inLang_1);
        p.setInLang_1Level(inLang_1Level);
        p.setInLang_2(inLang_2);
        p.setInLang_2Level(inLang_2Level);
        p.setInLang_3(inLang_3);
        p.setInLang_3Level(inLang_3Level);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.setWorkingPreferences</code>
     */
    public static void setworkingpreferences(Configuration configuration, Integer inUserid, String inUseremail, Integer inExpectedjoblevelid, Integer inExpectedsalary, Byte inDeleteifnull) {
        Setworkingpreferences p = new Setworkingpreferences();
        p.setInUserid(inUserid);
        p.setInUseremail(inUseremail);
        p.setInExpectedjoblevelid(inExpectedjoblevelid);
        p.setInExpectedsalary(inExpectedsalary);
        p.setInDeleteifnull(inDeleteifnull);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.StartImportDateTime</code>
     */
    public static Timestamp startimportdatetime(Configuration configuration) {
        Startimportdatetime f = new Startimportdatetime();

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>vnw_core.StartImportDateTime</code> as a field.
     */
    public static Field<Timestamp> startimportdatetime() {
        Startimportdatetime f = new Startimportdatetime();

        return f.asField();
    }

    /**
     * Call <code>vnw_core.tbls_users_proc</code>
     */
    public static void tblsUsersProc(Configuration configuration, Integer _60Userid_60, String _60Keyword_60, Integer _60Cityid_60, Short _60Industryid_60, Byte _60Joblevelid_60, Integer _60Salarymin_60, Timestamp _60Searchtime_60, String _60Clientip_60) {
        TblsUsersProc p = new TblsUsersProc();
        p.set_60Userid_60(_60Userid_60);
        p.set_60Keyword_60(_60Keyword_60);
        p.set_60Cityid_60(_60Cityid_60);
        p.set_60Industryid_60(_60Industryid_60);
        p.set_60Joblevelid_60(_60Joblevelid_60);
        p.set_60Salarymin_60(_60Salarymin_60);
        p.set_60Searchtime_60(_60Searchtime_60);
        p.set_60Clientip_60(_60Clientip_60);

        p.execute(configuration);
    }

    /**
     * Call <code>vnw_core.updateResumeCompletionRate</code>
     */
    public static void updateresumecompletionrate(Configuration configuration, Integer updatetype, Timestamp fromdate, Integer inresumeid) {
        Updateresumecompletionrate p = new Updateresumecompletionrate();
        p.setUpdatetype(updatetype);
        p.setFromdate(fromdate);
        p.setInresumeid(inresumeid);

        p.execute(configuration);
    }
}