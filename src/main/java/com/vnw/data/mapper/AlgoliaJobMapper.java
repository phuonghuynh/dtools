package com.vnw.data.mapper;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.pojos.Tbljob;
import com.vnw.data.jooq.tables.pojos.TbljobExtraInfo;
import com.vnw.data.model.AlgoliaJob;
import com.vnw.data.model.JobBenefit;
import org.jooq.impl.DefaultDSLContext;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by phuonghqh on 5/19/16.
 */
@Repository
public interface AlgoliaJobMapper {

  AlgoliaJob from(Env env, Tbljob tbljob);

  void map(AlgoliaJob algoliaJob, Collection<JobBenefit> jobBenefits);
}
