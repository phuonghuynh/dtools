/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.routines;


import com.vnw.data.jooq.VnwCore;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class GetattachedresumeidFromuserid extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1721753709;

    /**
     * The parameter <code>vnw_core.getAttachedResumeId_FromUserId.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>vnw_core.getAttachedResumeId_FromUserId.in_userId</code>.
     */
    public static final Parameter<Integer> IN_USERID = createParameter("in_userId", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public GetattachedresumeidFromuserid() {
        super("getAttachedResumeId_FromUserId", VnwCore.VNW_CORE, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_USERID);
    }

    /**
     * Set the <code>in_userId</code> parameter IN value to the routine
     */
    public void setInUserid(Integer value) {
        setValue(IN_USERID, value);
    }

    /**
     * Set the <code>in_userId</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInUserid(Field<Integer> field) {
        setField(IN_USERID, field);
    }
}
