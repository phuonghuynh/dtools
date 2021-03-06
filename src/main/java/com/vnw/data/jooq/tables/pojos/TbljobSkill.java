/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class TbljobSkill implements Serializable {

    private static final long serialVersionUID = -169833094;

    private Integer entryid;
    private Integer skillId;
    private Integer jobid;
    private Integer proficiencyId;
    private Short   skillIsrequired;
    private Short   skillYears;
    private Short   skillOrder;

    public TbljobSkill() {}

    public TbljobSkill(TbljobSkill value) {
        this.entryid = value.entryid;
        this.skillId = value.skillId;
        this.jobid = value.jobid;
        this.proficiencyId = value.proficiencyId;
        this.skillIsrequired = value.skillIsrequired;
        this.skillYears = value.skillYears;
        this.skillOrder = value.skillOrder;
    }

    public TbljobSkill(
        Integer entryid,
        Integer skillId,
        Integer jobid,
        Integer proficiencyId,
        Short   skillIsrequired,
        Short   skillYears,
        Short   skillOrder
    ) {
        this.entryid = entryid;
        this.skillId = skillId;
        this.jobid = jobid;
        this.proficiencyId = proficiencyId;
        this.skillIsrequired = skillIsrequired;
        this.skillYears = skillYears;
        this.skillOrder = skillOrder;
    }

    public Integer getEntryid() {
        return this.entryid;
    }

    public void setEntryid(Integer entryid) {
        this.entryid = entryid;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getJobid() {
        return this.jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getProficiencyId() {
        return this.proficiencyId;
    }

    public void setProficiencyId(Integer proficiencyId) {
        this.proficiencyId = proficiencyId;
    }

    public Short getSkillIsrequired() {
        return this.skillIsrequired;
    }

    public void setSkillIsrequired(Short skillIsrequired) {
        this.skillIsrequired = skillIsrequired;
    }

    public Short getSkillYears() {
        return this.skillYears;
    }

    public void setSkillYears(Short skillYears) {
        this.skillYears = skillYears;
    }

    public Short getSkillOrder() {
        return this.skillOrder;
    }

    public void setSkillOrder(Short skillOrder) {
        this.skillOrder = skillOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobSkill (");

        sb.append(entryid);
        sb.append(", ").append(skillId);
        sb.append(", ").append(jobid);
        sb.append(", ").append(proficiencyId);
        sb.append(", ").append(skillIsrequired);
        sb.append(", ").append(skillYears);
        sb.append(", ").append(skillOrder);

        sb.append(")");
        return sb.toString();
    }
}
