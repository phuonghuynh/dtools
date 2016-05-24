/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbljobGuaranteeProgram;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TbljobGuaranteeProgramRecord extends UpdatableRecordImpl<TbljobGuaranteeProgramRecord> implements Record6<UInteger, UInteger, UByte, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -1021663466;

    /**
     * Setter for <code>vnw_core.tbljob_guarantee_program.entryId</code>.
     */
    public void setEntryid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_guarantee_program.entryId</code>.
     */
    public UInteger getEntryid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbljob_guarantee_program.jobId</code>.
     */
    public void setJobid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_guarantee_program.jobId</code>.
     */
    public UInteger getJobid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbljob_guarantee_program.industryId</code>.
     */
    public void setIndustryid(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_guarantee_program.industryId</code>.
     */
    public UByte getIndustryid() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbljob_guarantee_program.onlineDate</code>.
     */
    public void setOnlinedate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_guarantee_program.onlineDate</code>.
     */
    public Timestamp getOnlinedate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.tbljob_guarantee_program.expiredDate</code>.
     */
    public void setExpireddate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_guarantee_program.expiredDate</code>.
     */
    public Timestamp getExpireddate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>vnw_core.tbljob_guarantee_program.serviceCode</code>. BR:boldred, TL:toplevel, TJ:Top Job, FJ: Feature Job, RJ: Refresh Job, ...
     */
    public void setServicecode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tbljob_guarantee_program.serviceCode</code>. BR:boldred, TL:toplevel, TJ:Top Job, FJ: Feature Job, RJ: Refresh Job, ...
     */
    public String getServicecode() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, UByte, Timestamp, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, UByte, Timestamp, Timestamp, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM.ENTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM.JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM.INDUSTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM.ONLINEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM.EXPIREDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM.SERVICECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getEntryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getIndustryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getOnlinedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getExpireddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getServicecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord value1(UInteger value) {
        setEntryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord value2(UInteger value) {
        setJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord value3(UByte value) {
        setIndustryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord value4(Timestamp value) {
        setOnlinedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord value5(Timestamp value) {
        setExpireddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord value6(String value) {
        setServicecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobGuaranteeProgramRecord values(UInteger value1, UInteger value2, UByte value3, Timestamp value4, Timestamp value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbljobGuaranteeProgramRecord
     */
    public TbljobGuaranteeProgramRecord() {
        super(TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM);
    }

    /**
     * Create a detached, initialised TbljobGuaranteeProgramRecord
     */
    public TbljobGuaranteeProgramRecord(UInteger entryid, UInteger jobid, UByte industryid, Timestamp onlinedate, Timestamp expireddate, String servicecode) {
        super(TbljobGuaranteeProgram.TBLJOB_GUARANTEE_PROGRAM);

        set(0, entryid);
        set(1, jobid);
        set(2, industryid);
        set(3, onlinedate);
        set(4, expireddate);
        set(5, servicecode);
    }
}