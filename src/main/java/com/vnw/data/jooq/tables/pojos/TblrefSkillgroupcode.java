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
public class TblrefSkillgroupcode implements Serializable {

    private static final long serialVersionUID = 466242754;

    private Byte   skillgroupId;
    private Byte   skillgroupParentid;
    private String skillgroupCode;

    public TblrefSkillgroupcode() {}

    public TblrefSkillgroupcode(TblrefSkillgroupcode value) {
        this.skillgroupId = value.skillgroupId;
        this.skillgroupParentid = value.skillgroupParentid;
        this.skillgroupCode = value.skillgroupCode;
    }

    public TblrefSkillgroupcode(
        Byte   skillgroupId,
        Byte   skillgroupParentid,
        String skillgroupCode
    ) {
        this.skillgroupId = skillgroupId;
        this.skillgroupParentid = skillgroupParentid;
        this.skillgroupCode = skillgroupCode;
    }

    public Byte getSkillgroupId() {
        return this.skillgroupId;
    }

    public void setSkillgroupId(Byte skillgroupId) {
        this.skillgroupId = skillgroupId;
    }

    public Byte getSkillgroupParentid() {
        return this.skillgroupParentid;
    }

    public void setSkillgroupParentid(Byte skillgroupParentid) {
        this.skillgroupParentid = skillgroupParentid;
    }

    public String getSkillgroupCode() {
        return this.skillgroupCode;
    }

    public void setSkillgroupCode(String skillgroupCode) {
        this.skillgroupCode = skillgroupCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefSkillgroupcode (");

        sb.append(skillgroupId);
        sb.append(", ").append(skillgroupParentid);
        sb.append(", ").append(skillgroupCode);

        sb.append(")");
        return sb.toString();
    }
}
