/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.routines;


import com.vnw.data.jooq.VnwCore;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class Adduserskill extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1004089803;

    /**
     * The parameter <code>vnw_core.addUserSkill.in_userId</code>.
     */
    public static final Parameter<Integer> IN_USERID = createParameter("in_userId", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>vnw_core.addUserSkill.in_userEmail</code>.
     */
    public static final Parameter<String> IN_USEREMAIL = createParameter("in_userEmail", org.jooq.impl.SQLDataType.VARCHAR.length(255), false, false);

    /**
     * The parameter <code>vnw_core.addUserSkill.in_skillName</code>.
     */
    public static final Parameter<String> IN_SKILLNAME = createParameter("in_skillName", org.jooq.impl.SQLDataType.VARCHAR.length(255), false, false);

    /**
     * The parameter <code>vnw_core.addUserSkill.in_yearsExperience</code>.
     */
    public static final Parameter<Short> IN_YEARSEXPERIENCE = createParameter("in_yearsExperience", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * Create a new routine call instance
     */
    public Adduserskill() {
        super("addUserSkill", VnwCore.VNW_CORE);

        addInParameter(IN_USERID);
        addInParameter(IN_USEREMAIL);
        addInParameter(IN_SKILLNAME);
        addInParameter(IN_YEARSEXPERIENCE);
    }

    /**
     * Set the <code>in_userId</code> parameter IN value to the routine
     */
    public void setInUserid(Integer value) {
        setValue(IN_USERID, value);
    }

    /**
     * Set the <code>in_userEmail</code> parameter IN value to the routine
     */
    public void setInUseremail(String value) {
        setValue(IN_USEREMAIL, value);
    }

    /**
     * Set the <code>in_skillName</code> parameter IN value to the routine
     */
    public void setInSkillname(String value) {
        setValue(IN_SKILLNAME, value);
    }

    /**
     * Set the <code>in_yearsExperience</code> parameter IN value to the routine
     */
    public void setInYearsexperience(Short value) {
        setValue(IN_YEARSEXPERIENCE, value);
    }
}
