/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

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
public class TblskillTerm implements Serializable {

    private static final long serialVersionUID = 1352070792;

    private UInteger skillid;
    private String   skillname;

    public TblskillTerm() {}

    public TblskillTerm(TblskillTerm value) {
        this.skillid = value.skillid;
        this.skillname = value.skillname;
    }

    public TblskillTerm(
        UInteger skillid,
        String   skillname
    ) {
        this.skillid = skillid;
        this.skillname = skillname;
    }

    public UInteger getSkillid() {
        return this.skillid;
    }

    public void setSkillid(UInteger skillid) {
        this.skillid = skillid;
    }

    public String getSkillname() {
        return this.skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblskillTerm (");

        sb.append(skillid);
        sb.append(", ").append(skillname);

        sb.append(")");
        return sb.toString();
    }
}
