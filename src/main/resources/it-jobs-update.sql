SELECT j.jobid						AS itemId,
	FALSE 							AS hidden,
	jobtitle 						AS title,
    (SELECT industryname
		FROM tblref_industry ri JOIN tbljob_industry_extra jie ON (jie.industryid = ri.industryid and ri.languageid = 2)
		WHERE jie.jobid = j.jobid ORDER BY entryId LIMIT 0,1 )
									AS category1,
	(SELECT industryname
		FROM tblref_industry ri JOIN tbljob_industry_extra jie ON (jie.industryid = ri.industryid and ri.languageid = 2)
		WHERE jie.jobid = j.jobid ORDER BY entryId LIMIT 1,1 )
									AS category2,
	(SELECT industryname
		FROM tblref_industry ri JOIN tbljob_industry_extra jie ON (jie.industryid = ri.industryid and ri.languageid = 2)
		WHERE jie.jobid = j.jobid ORDER BY entryId LIMIT 2,1 )
									AS category3,
	(SELECT cityname
		FROM tblref_city rc JOIN tbljob_city jc ON (jc.cityid = rc.cityid and rc.languageid = 2)
		WHERE jc.jobid = j.jobid ORDER BY entryId LIMIT 0,1 )
									AS location1,
	(SELECT cityname
		FROM tblref_city rc JOIN tbljob_city jc ON (jc.cityid = rc.cityid and rc.languageid = 2)
		WHERE jc.jobid = j.jobid ORDER BY entryId LIMIT 1,1 )
									AS location2,
	(SELECT cityname
		FROM tblref_city rc JOIN tbljob_city jc ON (jc.cityid = rc.cityid and rc.languageid = 2)
		WHERE jc.jobid = j.jobid ORDER BY entryId LIMIT 2,1 )
									AS location3,
   -- CONCAT('www.vietnamworks.com/', alias, '-',j.jobid, '-jd')
	alias							AS url,
	/* CONCAT('www.vietnamworks.com/', alias, '-',j.jobid, '-jv')
									AS url,*/
	salarymin						AS salaryFrom,
    salarymax						AS salaryTo,
   -- salaryrangeid					AS salaryrangeid,
    rjl.joblevelname				AS jobLevel,
    companysizename 				AS companySize,
    rls.selectedname				AS language,
    LEFT(companyprofile,4090)		AS companyDescription,
    --
    (SELECT benefitName FROM tblref_benefit rb JOIN tbljob_benefit jb ON (jb.benefitId = rb.benefitId)
		WHERE jb.jobid = j.jobid
        ORDER BY entryId LIMIT 0,1)
									AS companyBenefit,
	 (SELECT benefitName FROM tblref_benefit rb JOIN tbljob_benefit jb ON (jb.benefitId = rb.benefitId)
		WHERE jb.jobid = j.jobid
        ORDER BY entryId LIMIT 1,1)
									AS companyBenefit,
	 (SELECT benefitName FROM tblref_benefit rb JOIN tbljob_benefit jb ON (jb.benefitId = rb.benefitId)
		WHERE jb.jobid = j.jobid
        ORDER BY entryId LIMIT 2,1)
									AS companyBenefit,
	(SELECT skillName FROM tblskill_term st JOIN tbljob_skill_term jst ON (st.skillId = jst.skillId)
		WHERE jst.jobid = j.jobid
        ORDER BY entryId LIMIT 0,1)
									AS jobTag1,
	(SELECT skillName FROM tblskill_term st JOIN tbljob_skill_term jst ON (st.skillId = jst.skillId)
		WHERE jst.jobid = j.jobid
        ORDER BY entryId LIMIT 1,1)
									AS jobTag2,
	(SELECT skillName FROM tblskill_term st JOIN tbljob_skill_term jst ON (st.skillId = jst.skillId)
		WHERE jst.jobid = j.jobid
        ORDER BY entryId LIMIT 2,1)
									AS jobTag3,
    LEFT(jobdescription,4090)		AS jobDescription,
    LEFT(skillexperience,4090)		AS jobRequirement,
    UNIX_TIMESTAMP(approveddate)	AS postDate,
    companydesc						AS companyName,
    isshowlogo						AS isShowLogo
FROM tbljob j
	LEFT JOIN tblref_joblevel rjl ON (rjl.joblevelid = j.joblevelid and rjl.languageid = 2)
    LEFT JOIN tblref_companysize rcs ON (rcs.companysizeid= j.companysizeid and rcs.languageid = 2)
    LEFT JOIN tblref_languageselected_applyjob rls ON ( rls.selectedid = j.languageselectedid and rls.languageid =2)
--     JOIN tbljob_industry_extra jie on (jie.jobid = j.jobid AND jie.industryid IN (35,55,66))
WHERE isapproved = 1 AND isactive = 1 AND iscompleted = 1 AND isdeleted = 0
  AND expireddate >= curdate() AND isUnpaidDisable <> 1
  AND ((j.lastupdateddate BETWEEN '%s' AND '%s') OR (j.approveddate BETWEEN '%s' AND '%s'))
GROUP BY j.jobid;
