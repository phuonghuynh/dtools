package com.vnw.data.model;

import java.util.Set;

/**
 * Created by phuonghqh on 5/19/16.
 */
public class AlgoliaJob {

  private String objectID;

  private String company;

  private String companyLogo;

  private String jobTitle;

  private Set<String> locations;

  private Set<Integer> locationIds;

  private Set<String> locationVIs;

  private String jobDescription;

  private String jobRequirement;

  private String jobLevel;

  private Integer jobLevelId;

  private String jobLevelVI;

  private Set<String> skills;

  private Set<String> categories;

  private Set<Integer> categoryIds;

  private Set<String> categoryVIs;

  private Long salaryMin;

  private Long salaryMax;

  private Long expiredDate;

  private Integer isSalaryVisible;

  private Set<AlgoliaBenefitJob> benefits;

  public Set<AlgoliaBenefitJob> getBenefits() {
    return benefits;
  }

  public AlgoliaJob setBenefits(Set<AlgoliaBenefitJob> benefits) {
    this.benefits = benefits;
    return this;
  }

  public Integer getIsSalaryVisible() {
    return isSalaryVisible;
  }

  public AlgoliaJob setIsSalaryVisible(Integer isSalaryVisible) {
    this.isSalaryVisible = isSalaryVisible;
    return this;
  }

  public Long getExpiredDate() {
    return expiredDate;
  }

  public AlgoliaJob setExpiredDate(Long expiredDate) {
    this.expiredDate = expiredDate;
    return this;
  }

  public Long getSalaryMin() {
    return salaryMin;
  }

  public AlgoliaJob setSalaryMin(Long salaryMin) {
    this.salaryMin = salaryMin;
    return this;
  }

  public Long getSalaryMax() {
    return salaryMax;
  }

  public AlgoliaJob setSalaryMax(Long salaryMax) {
    this.salaryMax = salaryMax;
    return this;
  }

  public Set<String> getCategories() {
    return categories;
  }

  public AlgoliaJob setCategories(Set<String> categories) {
    this.categories = categories;
    return this;
  }

  public Set<Integer> getCategoryIds() {
    return categoryIds;
  }

  public AlgoliaJob setCategoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public Set<String> getCategoryVIs() {
    return categoryVIs;
  }

  public AlgoliaJob setCategoryVIs(Set<String> categoryVIs) {
    this.categoryVIs = categoryVIs;
    return this;
  }

  public Set<String> getSkills() {
    return skills;
  }

  public AlgoliaJob setSkills(Set<String> skills) {
    this.skills = skills;
    return this;
  }

  public String getJobLevel() {
    return jobLevel;
  }

  public AlgoliaJob setJobLevel(String jobLevel) {
    this.jobLevel = jobLevel;
    return this;
  }

  public Integer getJobLevelId() {
    return jobLevelId;
  }

  public AlgoliaJob setJobLevelId(Integer jobLevelId) {
    this.jobLevelId = jobLevelId;
    return this;
  }

  public String getJobLevelVI() {
    return jobLevelVI;
  }

  public AlgoliaJob setJobLevelVI(String jobLevelVI) {
    this.jobLevelVI = jobLevelVI;
    return this;
  }

  public String getJobRequirement() {
    return jobRequirement;
  }

  public AlgoliaJob setJobRequirement(String jobRequirement) {
    this.jobRequirement = jobRequirement;
    return this;
  }

  public String getJobDescription() {
    return jobDescription;
  }

  public AlgoliaJob setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
    return this;
  }

  public Set<String> getLocationVIs() {
    return locationVIs;
  }

  public AlgoliaJob setLocationVIs(Set<String> locationVIs) {
    this.locationVIs = locationVIs;
    return this;
  }

  public Set<Integer> getLocationIds() {
    return locationIds;
  }

  public AlgoliaJob setLocationIds(Set<Integer> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public Set<String> getLocations() {
    return locations;
  }

  public AlgoliaJob setLocations(Set<String> locations) {
    this.locations = locations;
    return this;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getCompany() {
    return company;
  }

  public AlgoliaJob setCompany(String company) {
    this.company = company;
    return this;
  }

  public String getObjectID() {
    return objectID;
  }

  public AlgoliaJob setObjectID(String objectID) {
    this.objectID = objectID;
    return this;
  }

  public String getCompanyLogo() {
    return companyLogo;
  }

  public AlgoliaJob setCompanyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
    return this;
  }
}
