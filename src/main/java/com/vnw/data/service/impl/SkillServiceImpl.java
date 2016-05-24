package com.vnw.data.service.impl;

import com.vnw.data.enu.Env;
import com.vnw.data.jooq.tables.TbljobSkillTerm;
import com.vnw.data.jooq.tables.TblskillTerm;
import com.vnw.data.service.SkillService;
import org.jooq.types.UInteger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by phuonghqh on 5/20/16.
 */
@Service
public class SkillServiceImpl implements SkillService {

  @Resource
  private SkillService skillService;

  public List<com.vnw.data.jooq.tables.pojos.TblskillTerm> findSkillTermByJobId(Env env, Integer jobId) {
    List<com.vnw.data.jooq.tables.pojos.TbljobSkillTerm> skillTerms = env.getDsl()
      .select(TbljobSkillTerm.TBLJOB_SKILL_TERM.SKILLID)
      .from(TbljobSkillTerm.TBLJOB_SKILL_TERM)
      .where(TbljobSkillTerm.TBLJOB_SKILL_TERM.JOBID.cast(Integer.class).eq(jobId))
      .fetchInto(com.vnw.data.jooq.tables.pojos.TbljobSkillTerm.class);

    return skillTerms.stream()
      .map(s -> skillService.findSkillTermById(env, s.getSkillid()))
      .collect(Collectors.toList());
  }

  public com.vnw.data.jooq.tables.pojos.TblskillTerm findSkillTermById(Env env, UInteger id) {
    return env.getDsl()
      .select(TblskillTerm.TBLSKILL_TERM.SKILLID, TblskillTerm.TBLSKILL_TERM.SKILLNAME)
      .from(TblskillTerm.TBLSKILL_TERM)
      .where(TblskillTerm.TBLSKILL_TERM.SKILLID.eq(id))
      .fetchOneInto(com.vnw.data.jooq.tables.pojos.TblskillTerm.class);
  }
}
