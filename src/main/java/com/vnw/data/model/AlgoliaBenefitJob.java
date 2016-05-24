package com.vnw.data.model;

/**
 * Created by phuonghqh on 5/23/16.
 */
public class AlgoliaBenefitJob {

  private Integer benefitId;

  private String benefitName;

  private String benefitIconName;

  private String benefitValue;

  public Integer getBenefitId() {
    return benefitId;
  }

  public AlgoliaBenefitJob setBenefitId(Integer benefitId) {
    this.benefitId = benefitId;
    return this;
  }

  public String getBenefitName() {
    return benefitName;
  }

  public AlgoliaBenefitJob setBenefitName(String benefitName) {
    this.benefitName = benefitName;
    return this;
  }

  public String getBenefitIconName() {
    return benefitIconName;
  }

  public AlgoliaBenefitJob setBenefitIconName(String benefitIconName) {
    this.benefitIconName = benefitIconName;
    return this;
  }

  public String getBenefitValue() {
    return benefitValue;
  }

  public AlgoliaBenefitJob setBenefitValue(String benefitValue) {
    this.benefitValue = benefitValue;
    return this;
  }
}
