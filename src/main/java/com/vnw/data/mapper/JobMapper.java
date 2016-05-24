package com.vnw.data.mapper;

import com.vnw.data.jooq.tables.pojos.Tbljob;
import com.vnw.data.jooq.tables.pojos.TbljobExtraInfo;
import com.vnw.data.mapper.impl.TypesMapper;
import com.vnw.data.model.AlgoliaBenefitJob;
import com.vnw.data.model.AlgoliaJob;
import com.vnw.data.model.JobBenefit;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Repository;

/**
 * Created by phuonghqh on 5/19/16.
 */
@Mapper(uses = {TypesMapper.class})
@Repository
public interface JobMapper {

  @Mappings({
    @Mapping(target = "objectID", source = "tbljob.jobid"),
    @Mapping(target = "company", source = "tbljob.companydesc"),
    @Mapping(target = "jobTitle", source = "tbljob.jobtitle"),
    @Mapping(target = "jobDescription", source = "tbljob.jobdescription"),
    @Mapping(target = "jobRequirement", source = "tbljob.skillexperience"),
    @Mapping(target = "salaryMin", source = "tbljob.salarymin"),
    @Mapping(target = "salaryMax", source = "tbljob.salarymax"),
    @Mapping(target = "expiredDate", source = "tbljob.expireddate")
  })
  AlgoliaJob toAlgoliaJob(Tbljob tbljob);

  @Mappings({
    @Mapping(target = "isSalaryVisible", source = "tbljobExtraInfo.issalaryvisible")
  })
  void map(@MappingTarget AlgoliaJob algoliaJob, TbljobExtraInfo tbljobExtraInfo);

  @Mappings({
    @Mapping(target = "benefitId", source = "jobBenefit.tbljobBenefit.benefitid"),
    @Mapping(target = "benefitValue", source = "jobBenefit.tbljobBenefit.benefitvalue"),
    @Mapping(target = "benefitName", source = "jobBenefit.tblrefBenefit.benefitname"),
    @Mapping(target = "benefitIconName", source = "jobBenefit.tblrefBenefit.benefiticonname")
  })
  AlgoliaBenefitJob toAlgoliaBenefitJob(JobBenefit jobBenefit);
}
