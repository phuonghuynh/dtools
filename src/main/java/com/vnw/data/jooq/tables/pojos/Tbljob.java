/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UByte;


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
public class Tbljob implements Serializable {

    private static final long serialVersionUID = 1834141165;

    private Integer   jobid;
    private Integer   userid;
    private Byte      jobpackid;
    private String    jobcode;
    private String    jobtitle;
    private String    unformattedjobtitle;
    private String    alias;
    private Byte      typeworkingid;
    private Byte      salaryrangeid;
    private Byte      educationrequiredid;
    private Byte      yearsExperienceid;
    private String    jobdescription;
    private String    skillexperience;
    private String    desiredSkill;
    private String    companydesc;
    private Byte      companysizeid;
    private String    companyprofile;
    private String    emailaddress;
    private Long      confidentialBitmask;
    private String    contactname;
    private Byte      contactmethodid;
    private String    address;
    private String    district;
    private Short     countryid;
    private Integer   cityid;
    private String    telephone;
    private String    cellphone;
    private String    faxnumber;
    private String    companywebsite;
    private Integer   billingcontactid;
    private Timestamp createddate;
    private Timestamp lastupdateddate;
    private Short     durationdays;
    private Timestamp expireddate;
    private Timestamp approveddate;
    private Timestamp deadlinedate;
    private Byte      isapproved;
    private Byte      isunpaiddisable;
    private Byte      isdeleted;
    private Byte      ispend;
    private Byte      languageid;
    private Integer   companyid;
    private Integer   noofviewed;
    private Byte      postedstep;
    private Byte      iscompleted;
    private Double    joblocationfee;
    private Byte      estimationjob;
    private Double    estimationfee;
    private Byte      issendtocustomer;
    private Byte      languageselectedid;
    private Byte      isactive;
    private Byte      isshowlogo;
    private Byte      isshowlogoinsearch;
    private Integer   employerjobtemplateid;
    private Byte      isapprovedlogo;
    private Long      appReceivingBitmask;
    private Integer   salarymax;
    private Integer   salarymin;
    private Byte      joblevelid;
    private Byte      mincareerlevelid;
    private String    version;
    private Byte      numIndustry;
    private Byte      numAvailableExtravisibility;
    private Byte      numAvailableExtrapriority;
    private UByte     isshowcontact;
    private UByte     requiredcoverletter;
    private UByte     requiredresume;
    private String    unformattedcompanyname;
    private String    redirectto;

    public Tbljob() {}

    public Tbljob(Tbljob value) {
        this.jobid = value.jobid;
        this.userid = value.userid;
        this.jobpackid = value.jobpackid;
        this.jobcode = value.jobcode;
        this.jobtitle = value.jobtitle;
        this.unformattedjobtitle = value.unformattedjobtitle;
        this.alias = value.alias;
        this.typeworkingid = value.typeworkingid;
        this.salaryrangeid = value.salaryrangeid;
        this.educationrequiredid = value.educationrequiredid;
        this.yearsExperienceid = value.yearsExperienceid;
        this.jobdescription = value.jobdescription;
        this.skillexperience = value.skillexperience;
        this.desiredSkill = value.desiredSkill;
        this.companydesc = value.companydesc;
        this.companysizeid = value.companysizeid;
        this.companyprofile = value.companyprofile;
        this.emailaddress = value.emailaddress;
        this.confidentialBitmask = value.confidentialBitmask;
        this.contactname = value.contactname;
        this.contactmethodid = value.contactmethodid;
        this.address = value.address;
        this.district = value.district;
        this.countryid = value.countryid;
        this.cityid = value.cityid;
        this.telephone = value.telephone;
        this.cellphone = value.cellphone;
        this.faxnumber = value.faxnumber;
        this.companywebsite = value.companywebsite;
        this.billingcontactid = value.billingcontactid;
        this.createddate = value.createddate;
        this.lastupdateddate = value.lastupdateddate;
        this.durationdays = value.durationdays;
        this.expireddate = value.expireddate;
        this.approveddate = value.approveddate;
        this.deadlinedate = value.deadlinedate;
        this.isapproved = value.isapproved;
        this.isunpaiddisable = value.isunpaiddisable;
        this.isdeleted = value.isdeleted;
        this.ispend = value.ispend;
        this.languageid = value.languageid;
        this.companyid = value.companyid;
        this.noofviewed = value.noofviewed;
        this.postedstep = value.postedstep;
        this.iscompleted = value.iscompleted;
        this.joblocationfee = value.joblocationfee;
        this.estimationjob = value.estimationjob;
        this.estimationfee = value.estimationfee;
        this.issendtocustomer = value.issendtocustomer;
        this.languageselectedid = value.languageselectedid;
        this.isactive = value.isactive;
        this.isshowlogo = value.isshowlogo;
        this.isshowlogoinsearch = value.isshowlogoinsearch;
        this.employerjobtemplateid = value.employerjobtemplateid;
        this.isapprovedlogo = value.isapprovedlogo;
        this.appReceivingBitmask = value.appReceivingBitmask;
        this.salarymax = value.salarymax;
        this.salarymin = value.salarymin;
        this.joblevelid = value.joblevelid;
        this.mincareerlevelid = value.mincareerlevelid;
        this.version = value.version;
        this.numIndustry = value.numIndustry;
        this.numAvailableExtravisibility = value.numAvailableExtravisibility;
        this.numAvailableExtrapriority = value.numAvailableExtrapriority;
        this.isshowcontact = value.isshowcontact;
        this.requiredcoverletter = value.requiredcoverletter;
        this.requiredresume = value.requiredresume;
        this.unformattedcompanyname = value.unformattedcompanyname;
        this.redirectto = value.redirectto;
    }

    public Tbljob(
        Integer   jobid,
        Integer   userid,
        Byte      jobpackid,
        String    jobcode,
        String    jobtitle,
        String    unformattedjobtitle,
        String    alias,
        Byte      typeworkingid,
        Byte      salaryrangeid,
        Byte      educationrequiredid,
        Byte      yearsExperienceid,
        String    jobdescription,
        String    skillexperience,
        String    desiredSkill,
        String    companydesc,
        Byte      companysizeid,
        String    companyprofile,
        String    emailaddress,
        Long      confidentialBitmask,
        String    contactname,
        Byte      contactmethodid,
        String    address,
        String    district,
        Short     countryid,
        Integer   cityid,
        String    telephone,
        String    cellphone,
        String    faxnumber,
        String    companywebsite,
        Integer   billingcontactid,
        Timestamp createddate,
        Timestamp lastupdateddate,
        Short     durationdays,
        Timestamp expireddate,
        Timestamp approveddate,
        Timestamp deadlinedate,
        Byte      isapproved,
        Byte      isunpaiddisable,
        Byte      isdeleted,
        Byte      ispend,
        Byte      languageid,
        Integer   companyid,
        Integer   noofviewed,
        Byte      postedstep,
        Byte      iscompleted,
        Double    joblocationfee,
        Byte      estimationjob,
        Double    estimationfee,
        Byte      issendtocustomer,
        Byte      languageselectedid,
        Byte      isactive,
        Byte      isshowlogo,
        Byte      isshowlogoinsearch,
        Integer   employerjobtemplateid,
        Byte      isapprovedlogo,
        Long      appReceivingBitmask,
        Integer   salarymax,
        Integer   salarymin,
        Byte      joblevelid,
        Byte      mincareerlevelid,
        String    version,
        Byte      numIndustry,
        Byte      numAvailableExtravisibility,
        Byte      numAvailableExtrapriority,
        UByte     isshowcontact,
        UByte     requiredcoverletter,
        UByte     requiredresume,
        String    unformattedcompanyname,
        String    redirectto
    ) {
        this.jobid = jobid;
        this.userid = userid;
        this.jobpackid = jobpackid;
        this.jobcode = jobcode;
        this.jobtitle = jobtitle;
        this.unformattedjobtitle = unformattedjobtitle;
        this.alias = alias;
        this.typeworkingid = typeworkingid;
        this.salaryrangeid = salaryrangeid;
        this.educationrequiredid = educationrequiredid;
        this.yearsExperienceid = yearsExperienceid;
        this.jobdescription = jobdescription;
        this.skillexperience = skillexperience;
        this.desiredSkill = desiredSkill;
        this.companydesc = companydesc;
        this.companysizeid = companysizeid;
        this.companyprofile = companyprofile;
        this.emailaddress = emailaddress;
        this.confidentialBitmask = confidentialBitmask;
        this.contactname = contactname;
        this.contactmethodid = contactmethodid;
        this.address = address;
        this.district = district;
        this.countryid = countryid;
        this.cityid = cityid;
        this.telephone = telephone;
        this.cellphone = cellphone;
        this.faxnumber = faxnumber;
        this.companywebsite = companywebsite;
        this.billingcontactid = billingcontactid;
        this.createddate = createddate;
        this.lastupdateddate = lastupdateddate;
        this.durationdays = durationdays;
        this.expireddate = expireddate;
        this.approveddate = approveddate;
        this.deadlinedate = deadlinedate;
        this.isapproved = isapproved;
        this.isunpaiddisable = isunpaiddisable;
        this.isdeleted = isdeleted;
        this.ispend = ispend;
        this.languageid = languageid;
        this.companyid = companyid;
        this.noofviewed = noofviewed;
        this.postedstep = postedstep;
        this.iscompleted = iscompleted;
        this.joblocationfee = joblocationfee;
        this.estimationjob = estimationjob;
        this.estimationfee = estimationfee;
        this.issendtocustomer = issendtocustomer;
        this.languageselectedid = languageselectedid;
        this.isactive = isactive;
        this.isshowlogo = isshowlogo;
        this.isshowlogoinsearch = isshowlogoinsearch;
        this.employerjobtemplateid = employerjobtemplateid;
        this.isapprovedlogo = isapprovedlogo;
        this.appReceivingBitmask = appReceivingBitmask;
        this.salarymax = salarymax;
        this.salarymin = salarymin;
        this.joblevelid = joblevelid;
        this.mincareerlevelid = mincareerlevelid;
        this.version = version;
        this.numIndustry = numIndustry;
        this.numAvailableExtravisibility = numAvailableExtravisibility;
        this.numAvailableExtrapriority = numAvailableExtrapriority;
        this.isshowcontact = isshowcontact;
        this.requiredcoverletter = requiredcoverletter;
        this.requiredresume = requiredresume;
        this.unformattedcompanyname = unformattedcompanyname;
        this.redirectto = redirectto;
    }

    public Integer getJobid() {
        return this.jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getJobpackid() {
        return this.jobpackid;
    }

    public void setJobpackid(Byte jobpackid) {
        this.jobpackid = jobpackid;
    }

    public String getJobcode() {
        return this.jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }

    public String getJobtitle() {
        return this.jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getUnformattedjobtitle() {
        return this.unformattedjobtitle;
    }

    public void setUnformattedjobtitle(String unformattedjobtitle) {
        this.unformattedjobtitle = unformattedjobtitle;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Byte getTypeworkingid() {
        return this.typeworkingid;
    }

    public void setTypeworkingid(Byte typeworkingid) {
        this.typeworkingid = typeworkingid;
    }

    public Byte getSalaryrangeid() {
        return this.salaryrangeid;
    }

    public void setSalaryrangeid(Byte salaryrangeid) {
        this.salaryrangeid = salaryrangeid;
    }

    public Byte getEducationrequiredid() {
        return this.educationrequiredid;
    }

    public void setEducationrequiredid(Byte educationrequiredid) {
        this.educationrequiredid = educationrequiredid;
    }

    public Byte getYearsExperienceid() {
        return this.yearsExperienceid;
    }

    public void setYearsExperienceid(Byte yearsExperienceid) {
        this.yearsExperienceid = yearsExperienceid;
    }

    public String getJobdescription() {
        return this.jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getSkillexperience() {
        return this.skillexperience;
    }

    public void setSkillexperience(String skillexperience) {
        this.skillexperience = skillexperience;
    }

    public String getDesiredSkill() {
        return this.desiredSkill;
    }

    public void setDesiredSkill(String desiredSkill) {
        this.desiredSkill = desiredSkill;
    }

    public String getCompanydesc() {
        return this.companydesc;
    }

    public void setCompanydesc(String companydesc) {
        this.companydesc = companydesc;
    }

    public Byte getCompanysizeid() {
        return this.companysizeid;
    }

    public void setCompanysizeid(Byte companysizeid) {
        this.companysizeid = companysizeid;
    }

    public String getCompanyprofile() {
        return this.companyprofile;
    }

    public void setCompanyprofile(String companyprofile) {
        this.companyprofile = companyprofile;
    }

    public String getEmailaddress() {
        return this.emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public Long getConfidentialBitmask() {
        return this.confidentialBitmask;
    }

    public void setConfidentialBitmask(Long confidentialBitmask) {
        this.confidentialBitmask = confidentialBitmask;
    }

    public String getContactname() {
        return this.contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public Byte getContactmethodid() {
        return this.contactmethodid;
    }

    public void setContactmethodid(Byte contactmethodid) {
        this.contactmethodid = contactmethodid;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Short getCountryid() {
        return this.countryid;
    }

    public void setCountryid(Short countryid) {
        this.countryid = countryid;
    }

    public Integer getCityid() {
        return this.cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getFaxnumber() {
        return this.faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    public String getCompanywebsite() {
        return this.companywebsite;
    }

    public void setCompanywebsite(String companywebsite) {
        this.companywebsite = companywebsite;
    }

    public Integer getBillingcontactid() {
        return this.billingcontactid;
    }

    public void setBillingcontactid(Integer billingcontactid) {
        this.billingcontactid = billingcontactid;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public Timestamp getLastupdateddate() {
        return this.lastupdateddate;
    }

    public void setLastupdateddate(Timestamp lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    public Short getDurationdays() {
        return this.durationdays;
    }

    public void setDurationdays(Short durationdays) {
        this.durationdays = durationdays;
    }

    public Timestamp getExpireddate() {
        return this.expireddate;
    }

    public void setExpireddate(Timestamp expireddate) {
        this.expireddate = expireddate;
    }

    public Timestamp getApproveddate() {
        return this.approveddate;
    }

    public void setApproveddate(Timestamp approveddate) {
        this.approveddate = approveddate;
    }

    public Timestamp getDeadlinedate() {
        return this.deadlinedate;
    }

    public void setDeadlinedate(Timestamp deadlinedate) {
        this.deadlinedate = deadlinedate;
    }

    public Byte getIsapproved() {
        return this.isapproved;
    }

    public void setIsapproved(Byte isapproved) {
        this.isapproved = isapproved;
    }

    public Byte getIsunpaiddisable() {
        return this.isunpaiddisable;
    }

    public void setIsunpaiddisable(Byte isunpaiddisable) {
        this.isunpaiddisable = isunpaiddisable;
    }

    public Byte getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Byte getIspend() {
        return this.ispend;
    }

    public void setIspend(Byte ispend) {
        this.ispend = ispend;
    }

    public Byte getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Byte languageid) {
        this.languageid = languageid;
    }

    public Integer getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getNoofviewed() {
        return this.noofviewed;
    }

    public void setNoofviewed(Integer noofviewed) {
        this.noofviewed = noofviewed;
    }

    public Byte getPostedstep() {
        return this.postedstep;
    }

    public void setPostedstep(Byte postedstep) {
        this.postedstep = postedstep;
    }

    public Byte getIscompleted() {
        return this.iscompleted;
    }

    public void setIscompleted(Byte iscompleted) {
        this.iscompleted = iscompleted;
    }

    public Double getJoblocationfee() {
        return this.joblocationfee;
    }

    public void setJoblocationfee(Double joblocationfee) {
        this.joblocationfee = joblocationfee;
    }

    public Byte getEstimationjob() {
        return this.estimationjob;
    }

    public void setEstimationjob(Byte estimationjob) {
        this.estimationjob = estimationjob;
    }

    public Double getEstimationfee() {
        return this.estimationfee;
    }

    public void setEstimationfee(Double estimationfee) {
        this.estimationfee = estimationfee;
    }

    public Byte getIssendtocustomer() {
        return this.issendtocustomer;
    }

    public void setIssendtocustomer(Byte issendtocustomer) {
        this.issendtocustomer = issendtocustomer;
    }

    public Byte getLanguageselectedid() {
        return this.languageselectedid;
    }

    public void setLanguageselectedid(Byte languageselectedid) {
        this.languageselectedid = languageselectedid;
    }

    public Byte getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public Byte getIsshowlogo() {
        return this.isshowlogo;
    }

    public void setIsshowlogo(Byte isshowlogo) {
        this.isshowlogo = isshowlogo;
    }

    public Byte getIsshowlogoinsearch() {
        return this.isshowlogoinsearch;
    }

    public void setIsshowlogoinsearch(Byte isshowlogoinsearch) {
        this.isshowlogoinsearch = isshowlogoinsearch;
    }

    public Integer getEmployerjobtemplateid() {
        return this.employerjobtemplateid;
    }

    public void setEmployerjobtemplateid(Integer employerjobtemplateid) {
        this.employerjobtemplateid = employerjobtemplateid;
    }

    public Byte getIsapprovedlogo() {
        return this.isapprovedlogo;
    }

    public void setIsapprovedlogo(Byte isapprovedlogo) {
        this.isapprovedlogo = isapprovedlogo;
    }

    public Long getAppReceivingBitmask() {
        return this.appReceivingBitmask;
    }

    public void setAppReceivingBitmask(Long appReceivingBitmask) {
        this.appReceivingBitmask = appReceivingBitmask;
    }

    public Integer getSalarymax() {
        return this.salarymax;
    }

    public void setSalarymax(Integer salarymax) {
        this.salarymax = salarymax;
    }

    public Integer getSalarymin() {
        return this.salarymin;
    }

    public void setSalarymin(Integer salarymin) {
        this.salarymin = salarymin;
    }

    public Byte getJoblevelid() {
        return this.joblevelid;
    }

    public void setJoblevelid(Byte joblevelid) {
        this.joblevelid = joblevelid;
    }

    public Byte getMincareerlevelid() {
        return this.mincareerlevelid;
    }

    public void setMincareerlevelid(Byte mincareerlevelid) {
        this.mincareerlevelid = mincareerlevelid;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Byte getNumIndustry() {
        return this.numIndustry;
    }

    public void setNumIndustry(Byte numIndustry) {
        this.numIndustry = numIndustry;
    }

    public Byte getNumAvailableExtravisibility() {
        return this.numAvailableExtravisibility;
    }

    public void setNumAvailableExtravisibility(Byte numAvailableExtravisibility) {
        this.numAvailableExtravisibility = numAvailableExtravisibility;
    }

    public Byte getNumAvailableExtrapriority() {
        return this.numAvailableExtrapriority;
    }

    public void setNumAvailableExtrapriority(Byte numAvailableExtrapriority) {
        this.numAvailableExtrapriority = numAvailableExtrapriority;
    }

    public UByte getIsshowcontact() {
        return this.isshowcontact;
    }

    public void setIsshowcontact(UByte isshowcontact) {
        this.isshowcontact = isshowcontact;
    }

    public UByte getRequiredcoverletter() {
        return this.requiredcoverletter;
    }

    public void setRequiredcoverletter(UByte requiredcoverletter) {
        this.requiredcoverletter = requiredcoverletter;
    }

    public UByte getRequiredresume() {
        return this.requiredresume;
    }

    public void setRequiredresume(UByte requiredresume) {
        this.requiredresume = requiredresume;
    }

    public String getUnformattedcompanyname() {
        return this.unformattedcompanyname;
    }

    public void setUnformattedcompanyname(String unformattedcompanyname) {
        this.unformattedcompanyname = unformattedcompanyname;
    }

    public String getRedirectto() {
        return this.redirectto;
    }

    public void setRedirectto(String redirectto) {
        this.redirectto = redirectto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tbljob (");

        sb.append(jobid);
        sb.append(", ").append(userid);
        sb.append(", ").append(jobpackid);
        sb.append(", ").append(jobcode);
        sb.append(", ").append(jobtitle);
        sb.append(", ").append(unformattedjobtitle);
        sb.append(", ").append(alias);
        sb.append(", ").append(typeworkingid);
        sb.append(", ").append(salaryrangeid);
        sb.append(", ").append(educationrequiredid);
        sb.append(", ").append(yearsExperienceid);
        sb.append(", ").append(jobdescription);
        sb.append(", ").append(skillexperience);
        sb.append(", ").append(desiredSkill);
        sb.append(", ").append(companydesc);
        sb.append(", ").append(companysizeid);
        sb.append(", ").append(companyprofile);
        sb.append(", ").append(emailaddress);
        sb.append(", ").append(confidentialBitmask);
        sb.append(", ").append(contactname);
        sb.append(", ").append(contactmethodid);
        sb.append(", ").append(address);
        sb.append(", ").append(district);
        sb.append(", ").append(countryid);
        sb.append(", ").append(cityid);
        sb.append(", ").append(telephone);
        sb.append(", ").append(cellphone);
        sb.append(", ").append(faxnumber);
        sb.append(", ").append(companywebsite);
        sb.append(", ").append(billingcontactid);
        sb.append(", ").append(createddate);
        sb.append(", ").append(lastupdateddate);
        sb.append(", ").append(durationdays);
        sb.append(", ").append(expireddate);
        sb.append(", ").append(approveddate);
        sb.append(", ").append(deadlinedate);
        sb.append(", ").append(isapproved);
        sb.append(", ").append(isunpaiddisable);
        sb.append(", ").append(isdeleted);
        sb.append(", ").append(ispend);
        sb.append(", ").append(languageid);
        sb.append(", ").append(companyid);
        sb.append(", ").append(noofviewed);
        sb.append(", ").append(postedstep);
        sb.append(", ").append(iscompleted);
        sb.append(", ").append(joblocationfee);
        sb.append(", ").append(estimationjob);
        sb.append(", ").append(estimationfee);
        sb.append(", ").append(issendtocustomer);
        sb.append(", ").append(languageselectedid);
        sb.append(", ").append(isactive);
        sb.append(", ").append(isshowlogo);
        sb.append(", ").append(isshowlogoinsearch);
        sb.append(", ").append(employerjobtemplateid);
        sb.append(", ").append(isapprovedlogo);
        sb.append(", ").append(appReceivingBitmask);
        sb.append(", ").append(salarymax);
        sb.append(", ").append(salarymin);
        sb.append(", ").append(joblevelid);
        sb.append(", ").append(mincareerlevelid);
        sb.append(", ").append(version);
        sb.append(", ").append(numIndustry);
        sb.append(", ").append(numAvailableExtravisibility);
        sb.append(", ").append(numAvailableExtrapriority);
        sb.append(", ").append(isshowcontact);
        sb.append(", ").append(requiredcoverletter);
        sb.append(", ").append(requiredresume);
        sb.append(", ").append(unformattedcompanyname);
        sb.append(", ").append(redirectto);

        sb.append(")");
        return sb.toString();
    }
}
