/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblsysConsumerkey;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TblsysConsumerkeyRecord extends UpdatableRecordImpl<TblsysConsumerkeyRecord> implements Record6<String, UByte, String, String, String, UByte> {

    private static final long serialVersionUID = 1165515067;

    /**
     * Setter for <code>vnw_core.tblsys_consumerKey.apiKey</code>. API key of comsumers
     */
    public void setApikey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_consumerKey.apiKey</code>. API key of comsumers
     */
    public String getApikey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblsys_consumerKey.clientId</code>. Consumer ID
     */
    public void setClientid(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_consumerKey.clientId</code>. Consumer ID
     */
    public UByte getClientid() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblsys_consumerKey.clientName</code>.
     */
    public void setClientname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_consumerKey.clientName</code>.
     */
    public String getClientname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblsys_consumerKey.clientLogo</code>. This is the link to consumer Logo
     */
    public void setClientlogo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_consumerKey.clientLogo</code>. This is the link to consumer Logo
     */
    public String getClientlogo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblsys_consumerKey.clientLink</code>. This is the consumer link
     */
    public void setClientlink(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_consumerKey.clientLink</code>. This is the consumer link
     */
    public String getClientlink() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.tblsys_consumerKey.isActive</code>.
     */
    public void setIsactive(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.tblsys_consumerKey.isActive</code>.
     */
    public UByte getIsactive() {
        return (UByte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UByte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, UByte, String, String, String, UByte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, UByte, String, String, String, UByte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TblsysConsumerkey.TBLSYS_CONSUMERKEY.APIKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return TblsysConsumerkey.TBLSYS_CONSUMERKEY.CLIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblsysConsumerkey.TBLSYS_CONSUMERKEY.CLIENTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TblsysConsumerkey.TBLSYS_CONSUMERKEY.CLIENTLOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblsysConsumerkey.TBLSYS_CONSUMERKEY.CLIENTLINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return TblsysConsumerkey.TBLSYS_CONSUMERKEY.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getApikey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value2() {
        return getClientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClientname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClientlogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getClientlink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord value1(String value) {
        setApikey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord value2(UByte value) {
        setClientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord value3(String value) {
        setClientname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord value4(String value) {
        setClientlogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord value5(String value) {
        setClientlink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord value6(UByte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysConsumerkeyRecord values(String value1, UByte value2, String value3, String value4, String value5, UByte value6) {
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
     * Create a detached TblsysConsumerkeyRecord
     */
    public TblsysConsumerkeyRecord() {
        super(TblsysConsumerkey.TBLSYS_CONSUMERKEY);
    }

    /**
     * Create a detached, initialised TblsysConsumerkeyRecord
     */
    public TblsysConsumerkeyRecord(String apikey, UByte clientid, String clientname, String clientlogo, String clientlink, UByte isactive) {
        super(TblsysConsumerkey.TBLSYS_CONSUMERKEY);

        set(0, apikey);
        set(1, clientid);
        set(2, clientname);
        set(3, clientlogo);
        set(4, clientlink);
        set(5, isactive);
    }
}
