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
public class TblrefSkillcode implements Serializable {

    private static final long serialVersionUID = 1145116922;

    private Integer skillId;
    private Byte    skillgroupId;
    private String  skillCode;

    public TblrefSkillcode() {}

    public TblrefSkillcode(TblrefSkillcode value) {
        this.skillId = value.skillId;
        this.skillgroupId = value.skillgroupId;
        this.skillCode = value.skillCode;
    }

    public TblrefSkillcode(
        Integer skillId,
        Byte    skillgroupId,
        String  skillCode
    ) {
        this.skillId = skillId;
        this.skillgroupId = skillgroupId;
        this.skillCode = skillCode;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Byte getSkillgroupId() {
        return this.skillgroupId;
    }

    public void setSkillgroupId(Byte skillgroupId) {
        this.skillgroupId = skillgroupId;
    }

    public String getSkillCode() {
        return this.skillCode;
    }

    public void setSkillCode(String skillCode) {
        this.skillCode = skillCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefSkillcode (");

        sb.append(skillId);
        sb.append(", ").append(skillgroupId);
        sb.append(", ").append(skillCode);

        sb.append(")");
        return sb.toString();
    }
}
