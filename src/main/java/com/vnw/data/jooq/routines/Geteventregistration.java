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
public class Geteventregistration extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -898354950;

    /**
     * The parameter <code>vnw_core.getEventRegistration.in_eventRegistrationId</code>.
     */
    public static final Parameter<Integer> IN_EVENTREGISTRATIONID = createParameter("in_eventRegistrationId", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Geteventregistration() {
        super("getEventRegistration", VnwCore.VNW_CORE);

        addInParameter(IN_EVENTREGISTRATIONID);
    }

    /**
     * Set the <code>in_eventRegistrationId</code> parameter IN value to the routine
     */
    public void setInEventregistrationid(Integer value) {
        setValue(IN_EVENTREGISTRATIONID, value);
    }
}