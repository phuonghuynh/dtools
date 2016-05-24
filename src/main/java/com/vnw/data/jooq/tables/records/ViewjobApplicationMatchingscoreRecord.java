/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.ViewjobApplicationMatchingscore;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewjobApplicationMatchingscoreRecord extends TableRecordImpl<ViewjobApplicationMatchingscoreRecord> implements Record4<ULong, UByte, UInteger, Long> {

    private static final long serialVersionUID = 1977751826;

    /**
     * Setter for <code>vnw_core.viewjob_application_matchingscore.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.viewjob_application_matchingscore.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>vnw_core.viewjob_application_matchingscore.applicationType</code>. 1 - Apply online; 2 - Sent directly
     */
    public void setApplicationtype(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.viewjob_application_matchingscore.applicationType</code>. 1 - Apply online; 2 - Sent directly
     */
    public UByte getApplicationtype() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>vnw_core.viewjob_application_matchingscore.applicationId</code>. Ref to tbljob_applyonline (applyType = 1) or tblresume_sentdirectly (applyType = 2)
     */
    public void setApplicationid(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.viewjob_application_matchingscore.applicationId</code>. Ref to tbljob_applyonline (applyType = 1) or tblresume_sentdirectly (applyType = 2)
     */
    public UInteger getApplicationid() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>vnw_core.viewjob_application_matchingscore.MatchingScore</code>.
     */
    public void setMatchingscore(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.viewjob_application_matchingscore.MatchingScore</code>.
     */
    public Long getMatchingscore() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, UByte, UInteger, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, UByte, UInteger, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return ViewjobApplicationMatchingscore.VIEWJOB_APPLICATION_MATCHINGSCORE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return ViewjobApplicationMatchingscore.VIEWJOB_APPLICATION_MATCHINGSCORE.APPLICATIONTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return ViewjobApplicationMatchingscore.VIEWJOB_APPLICATION_MATCHINGSCORE.APPLICATIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ViewjobApplicationMatchingscore.VIEWJOB_APPLICATION_MATCHINGSCORE.MATCHINGSCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value2() {
        return getApplicationtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getApplicationid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getMatchingscore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewjobApplicationMatchingscoreRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewjobApplicationMatchingscoreRecord value2(UByte value) {
        setApplicationtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewjobApplicationMatchingscoreRecord value3(UInteger value) {
        setApplicationid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewjobApplicationMatchingscoreRecord value4(Long value) {
        setMatchingscore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewjobApplicationMatchingscoreRecord values(ULong value1, UByte value2, UInteger value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewjobApplicationMatchingscoreRecord
     */
    public ViewjobApplicationMatchingscoreRecord() {
        super(ViewjobApplicationMatchingscore.VIEWJOB_APPLICATION_MATCHINGSCORE);
    }

    /**
     * Create a detached, initialised ViewjobApplicationMatchingscoreRecord
     */
    public ViewjobApplicationMatchingscoreRecord(ULong id, UByte applicationtype, UInteger applicationid, Long matchingscore) {
        super(ViewjobApplicationMatchingscore.VIEWJOB_APPLICATION_MATCHINGSCORE);

        set(0, id);
        set(1, applicationtype);
        set(2, applicationid);
        set(3, matchingscore);
    }
}