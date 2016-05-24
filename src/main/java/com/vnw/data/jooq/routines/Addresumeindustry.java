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
public class Addresumeindustry extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1479133260;

    /**
     * The parameter <code>vnw_core.addResumeIndustry.in_resumeId</code>.
     */
    public static final Parameter<Integer> IN_RESUMEID = createParameter("in_resumeId", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>vnw_core.addResumeIndustry.in_industryId</code>.
     */
    public static final Parameter<Integer> IN_INDUSTRYID = createParameter("in_industryId", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Addresumeindustry() {
        super("addResumeIndustry", VnwCore.VNW_CORE);

        addInParameter(IN_RESUMEID);
        addInParameter(IN_INDUSTRYID);
    }

    /**
     * Set the <code>in_resumeId</code> parameter IN value to the routine
     */
    public void setInResumeid(Integer value) {
        setValue(IN_RESUMEID, value);
    }

    /**
     * Set the <code>in_industryId</code> parameter IN value to the routine
     */
    public void setInIndustryid(Integer value) {
        setValue(IN_INDUSTRYID, value);
    }
}