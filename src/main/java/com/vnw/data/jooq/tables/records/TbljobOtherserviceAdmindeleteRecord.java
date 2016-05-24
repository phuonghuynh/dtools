/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobOtherserviceAdmindelete;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TbljobOtherserviceAdmindeleteRecord extends UpdatableRecordImpl<TbljobOtherserviceAdmindeleteRecord> implements Record11<Integer, Integer, Integer, Double, String, Timestamp, Integer, Timestamp, String, Timestamp, Byte> {

    private static final long serialVersionUID = 328265807;

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.entryid</code>.
     */
    public void setEntryid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.entryid</code>.
     */
    public Integer getEntryid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.jobid</code>.
     */
    public void setJobid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.jobid</code>.
     */
    public Integer getJobid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.serviceid</code>.
     */
    public void setServiceid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.serviceid</code>.
     */
    public Integer getServiceid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.servicefee</code>.
     */
    public void setServicefee(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.servicefee</code>.
     */
    public Double getServicefee() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.currencytype</code>.
     */
    public void setCurrencytype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.currencytype</code>.
     */
    public String getCurrencytype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.durationdays</code>.
     */
    public void setDurationdays(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.durationdays</code>.
     */
    public Integer getDurationdays() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.expireddate</code>.
     */
    public void setExpireddate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.expireddate</code>.
     */
    public Timestamp getExpireddate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.servicetype</code>.
     */
    public void setServicetype(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.servicetype</code>.
     */
    public String getServicetype() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.startdate</code>. start date of service
     */
    public void setStartdate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.startdate</code>. start date of service
     */
    public Timestamp getStartdate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>vnw_core.tbljob_otherservice_admindelete.startfrom</code>.
     */
    public void setStartfrom(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_otherservice_admindelete.startfrom</code>.
     */
    public Byte getStartfrom() {
        return (Byte) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Double, String, Timestamp, Integer, Timestamp, String, Timestamp, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Double, String, Timestamp, Integer, Timestamp, String, Timestamp, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.SERVICEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.SERVICEFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.CURRENCYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.DURATIONDAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.EXPIREDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.SERVICETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.STARTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE.STARTFROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEntryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getServiceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getServicefee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrencytype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDurationdays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getExpireddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getServicetype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getStartdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getStartfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value1(Integer value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value2(Integer value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value3(Integer value) {
        setServiceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value4(Double value) {
        setServicefee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value5(String value) {
        setCurrencytype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value6(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value7(Integer value) {
        setDurationdays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value8(Timestamp value) {
        setExpireddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value9(String value) {
        setServicetype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value10(Timestamp value) {
        setStartdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord value11(Byte value) {
        setStartfrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindeleteRecord values(Integer value1, Integer value2, Integer value3, Double value4, String value5, Timestamp value6, Integer value7, Timestamp value8, String value9, Timestamp value10, Byte value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbljobOtherserviceAdmindeleteRecord
     */
    public TbljobOtherserviceAdmindeleteRecord() {
        super(TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE);
    }

    /**
     * Create a detached, initialised TbljobOtherserviceAdmindeleteRecord
     */
    public TbljobOtherserviceAdmindeleteRecord(Integer entryid, Integer jobid, Integer serviceid, Double servicefee, String currencytype, Timestamp createddate, Integer durationdays, Timestamp expireddate, String servicetype, Timestamp startdate, Byte startfrom) {
        super(TbljobOtherserviceAdmindelete.TBLJOB_OTHERSERVICE_ADMINDELETE);

        set(0, entryid);
        set(1, jobid);
        set(2, serviceid);
        set(3, servicefee);
        set(4, currencytype);
        set(5, createddate);
        set(6, durationdays);
        set(7, expireddate);
        set(8, servicetype);
        set(9, startdate);
        set(10, startfrom);
    }
}
