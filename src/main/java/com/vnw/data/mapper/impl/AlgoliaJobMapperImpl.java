package com.vnw.data.mapper.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.Tbljob;
import com.vnw.data.jooq.tables.pojos.TbljobExtraInfo;
import com.vnw.data.jooq.tables.pojos.TblrefCity;
import com.vnw.data.jooq.tables.pojos.TblrefIndustry;
import com.vnw.data.jooq.tables.pojos.TblrefJoblevel;
import com.vnw.data.jooq.tables.pojos.TblskillTerm;
import com.vnw.data.mapper.AlgoliaJobMapper;
import com.vnw.data.mapper.JobMapper;
import com.vnw.data.model.AlgoliaJob;
import com.vnw.data.model.JobBenefit;
import com.vnw.data.service.BenefitService;
import com.vnw.data.service.CompanyService;
import com.vnw.data.service.JobCategoryService;
import com.vnw.data.service.JobExtraInfoService;
import com.vnw.data.service.JobLevelService;
import com.vnw.data.service.LocationService;
import com.vnw.data.service.SkillService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
* objectID: Number (job ID)
company: String //
companyLogo: String //
jobTitle: String //
locations: Array(String, EN) //
locationIds: Array(Number) # List of location id //
locationVIs: Array(String, VI) //
jobDescription: String //
jobRequirement: String //
publishedDate: Timestamp
expiredDate: Timestamp //
isSalaryVisible: 1: show salary numbers, 0: "Negotiable" //
salaryMin: Number //
salaryMax: Number //
jobLevel: String, EN //
jobLevelId: Number # job level id //
jobLevelVI: String, VI //
skills: Array(String): rename "tags" to "skills" //
categories: Array(String, EN) //
categoryIds: Array(Number) List of category ids //
categoryVIs: Array(String, VI) //
benefits: [{benefitId: 1, benefitName: Laptop, benefitIconName: fa-laptop, benefitValue: macbook}, {benefitId: 2, benefitName: Bonus, benefitIconName: fa-dollar, benefitValue: 13th salary}]

/**
 * Created by phuonghqh on 5/19/16.
 */
@Component
public class AlgoliaJobMapperImpl implements AlgoliaJobMapper {

  @Resource
  private JobMapper jobMapper;

  @Resource
  private CompanyService companyService;

  @Resource
  private LocationService locationService;

  @Resource
  private JobLevelService jobLevelService;

  @Resource
  private SkillService skillService;

  @Resource
  private JobCategoryService jobCategoryService;

  @Resource
  private JobExtraInfoService jobExtraInfoService;

  @Resource
  private BenefitService benefitService;

  public AlgoliaJob from(Env env, Tbljob tbljob) {
    String logoPath = companyService.findImageByJobId(env, tbljob.getJobid()).getAssWsPath();
    List<TblrefCity> locations = locationService.findLocationByJobId(env, tbljob.getJobid());
    List<TblrefJoblevel> jobLevels = jobLevelService.findJobLevelById(env, tbljob.getJoblevelid());
    List<TblskillTerm> skills = skillService.findSkillTermByJobId(env, tbljob.getJobid());
    List<TblrefIndustry> categories = jobCategoryService.findCategoriesByJobId(env, tbljob.getJobid());
    TbljobExtraInfo jobExtraInfo = jobExtraInfoService.findExtraInfoByJobId(env, tbljob.getJobid());
    List<JobBenefit> benefits = benefitService.findBenefitsByJobId(env, tbljob.getJobid());

    AlgoliaJob algoliaJob = jobMapper.toAlgoliaJob(tbljob)
      .setCompanyLogo(logoPath)
      .setLocations(locations.stream()
        .filter(l -> l.getLanguageid() == 2)
        .map(l -> l.getCityname())
        .collect(Collectors.toSet())
      )
      .setLocationIds(locations.stream()
        .map(l -> l.getCityid())
        .collect(Collectors.toSet())
      )
      .setLocationVIs(locations.stream()
        .filter(l -> l.getLanguageid() == 1)
        .map(l -> l.getCityname())
        .collect(Collectors.toSet())
      )
      .setJobLevel(jobLevels.stream()
        .filter(j -> j.getLanguageid() == 2)
        .map(j -> j.getJoblevelname())
        .findFirst()
        .orElse(null)
      )
      .setJobLevelId(jobLevels.size() > 0 ? Integer.valueOf(jobLevels.get(0).getJoblevelid()) : null)
      .setJobLevelVI(jobLevels.stream()
        .filter(j -> j.getLanguageid() == 1)
        .map(j -> j.getJoblevelname())
        .findFirst()
        .orElse(null)
      )
      .setSkills(skills.stream().map(s -> s.getSkillname()).collect(Collectors.toSet()))
      .setCategories(categories.stream()
        .filter(c -> c.getLanguageid() == 2)
        .map(c -> c.getIndustryname())
        .collect(Collectors.toSet()))
      .setCategoryIds(categories.stream()
        .map(c -> Integer.valueOf(c.getIndustryid()))
        .collect(Collectors.toSet()))
      .setCategoryVIs(categories.stream()
        .filter(c -> c.getLanguageid() == 1)
        .map(c -> c.getIndustryname())
        .collect(Collectors.toSet()));

    this.map(algoliaJob, benefits);
    jobMapper.map(algoliaJob, jobExtraInfo);
    return algoliaJob;
  }

  public void map(AlgoliaJob algoliaJob, Collection<JobBenefit> jobBenefits) {
    if (jobBenefits == null || jobBenefits.size() == 0) {
      return;
    }

    if (algoliaJob == null) {
      algoliaJob = new AlgoliaJob();
    }

    algoliaJob.setBenefits(
      jobBenefits.stream()
        .map(j -> jobMapper.toAlgoliaBenefitJob(j))
        .collect(Collectors.toSet())
    );
  }
}
