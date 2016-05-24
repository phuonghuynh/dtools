/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;


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
public class TbljobSkillTerm implements Serializable {

    private static final long serialVersionUID = 1147255005;

    private UInteger entryid;
    private UInteger jobid;
    private UInteger skillid;
    private UByte    skillweight;

    public TbljobSkillTerm() {}

    public TbljobSkillTerm(TbljobSkillTerm value) {
        this.entryid = value.entryid;
        this.jobid = value.jobid;
        this.skillid = value.skillid;
        this.skillweight = value.skillweight;
    }

    public TbljobSkillTerm(
        UInteger entryid,
        UInteger jobid,
        UInteger skillid,
        UByte    skillweight
    ) {
        this.entryid = entryid;
        this.jobid = jobid;
        this.skillid = skillid;
        this.skillweight = skillweight;
    }

    public UInteger getEntryid() {
        return this.entryid;
    }

    public void setEntryid(UInteger entryid) {
        this.entryid = entryid;
    }

    public UInteger getJobid() {
        return this.jobid;
    }

    public void setJobid(UInteger jobid) {
        this.jobid = jobid;
    }

    public UInteger getSkillid() {
        return this.skillid;
    }

    public void setSkillid(UInteger skillid) {
        this.skillid = skillid;
    }

    public UByte getSkillweight() {
        return this.skillweight;
    }

    public void setSkillweight(UByte skillweight) {
        this.skillweight = skillweight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbljobSkillTerm (");

        sb.append(entryid);
        sb.append(", ").append(jobid);
        sb.append(", ").append(skillid);
        sb.append(", ").append(skillweight);

        sb.append(")");
        return sb.toString();
    }
}
