/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TbltrackApiconsumer;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;


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
public class TbltrackApiconsumerRecord extends TableRecordImpl<TbltrackApiconsumerRecord> implements Record4<Timestamp, UByte, UByte, String> {

    private static final long serialVersionUID = 528502460;

    /**
     * Setter for <code>vnw_core.tbltrack_apiConsumer.createdDate</code>. Logging time
     */
    public void setCreateddate(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_apiConsumer.createdDate</code>. Logging time
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_apiConsumer.consumerId</code>. Id of consumer, referred to tblsys_consumerKey
     */
    public void setConsumerid(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_apiConsumer.consumerId</code>. Id of consumer, referred to tblsys_consumerKey
     */
    public UByte getConsumerid() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_apiConsumer.functionId</code>. 1 - Create User; 2 - Create JobAlert
     */
    public void setFunctionid(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_apiConsumer.functionId</code>. 1 - Create User; 2 - Create JobAlert
     */
    public UByte getFunctionid() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>vnw_core.tbltrack_apiConsumer.parameter</code>. Requested parameter that passed to the API
     */
    public void setParameter(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tbltrack_apiConsumer.parameter</code>. Requested parameter that passed to the API
     */
    public String getParameter() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Timestamp, UByte, UByte, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Timestamp, UByte, UByte, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return TbltrackApiconsumer.TBLTRACK_APICONSUMER.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return TbltrackApiconsumer.TBLTRACK_APICONSUMER.CONSUMERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return TbltrackApiconsumer.TBLTRACK_APICONSUMER.FUNCTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbltrackApiconsumer.TBLTRACK_APICONSUMER.PARAMETER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value2() {
        return getConsumerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getFunctionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getParameter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackApiconsumerRecord value1(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackApiconsumerRecord value2(UByte value) {
        setConsumerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackApiconsumerRecord value3(UByte value) {
        setFunctionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackApiconsumerRecord value4(String value) {
        setParameter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackApiconsumerRecord values(Timestamp value1, UByte value2, UByte value3, String value4) {
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
     * Create a detached TbltrackApiconsumerRecord
     */
    public TbltrackApiconsumerRecord() {
        super(TbltrackApiconsumer.TBLTRACK_APICONSUMER);
    }

    /**
     * Create a detached, initialised TbltrackApiconsumerRecord
     */
    public TbltrackApiconsumerRecord(Timestamp createddate, UByte consumerid, UByte functionid, String parameter) {
        super(TbltrackApiconsumer.TBLTRACK_APICONSUMER);

        set(0, createddate);
        set(1, consumerid);
        set(2, functionid);
        set(3, parameter);
    }
}
