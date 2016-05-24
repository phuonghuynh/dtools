/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblcampaignData;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
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
public class TblcampaignDataRecord extends TableRecordImpl<TblcampaignDataRecord> implements Record5<UInteger, Integer, Timestamp, Integer, String> {

    private static final long serialVersionUID = 1090307248;

    /**
     * Setter for <code>vnw_core.tblcampaign_data.campaignId</code>.
     */
    public void setCampaignid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblcampaign_data.campaignId</code>.
     */
    public UInteger getCampaignid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblcampaign_data.userid</code>.
     */
    public void setUserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblcampaign_data.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblcampaign_data.accessTime</code>.
     */
    public void setAccesstime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblcampaign_data.accessTime</code>.
     */
    public Timestamp getAccesstime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>vnw_core.tblcampaign_data.dataNum</code>.
     */
    public void setDatanum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.tblcampaign_data.dataNum</code>.
     */
    public Integer getDatanum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vnw_core.tblcampaign_data.dataText</code>.
     */
    public void setDatatext(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.tblcampaign_data.dataText</code>.
     */
    public String getDatatext() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, Integer, Timestamp, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, Integer, Timestamp, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TblcampaignData.TBLCAMPAIGN_DATA.CAMPAIGNID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TblcampaignData.TBLCAMPAIGN_DATA.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TblcampaignData.TBLCAMPAIGN_DATA.ACCESSTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblcampaignData.TBLCAMPAIGN_DATA.DATANUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TblcampaignData.TBLCAMPAIGN_DATA.DATATEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getCampaignid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getAccesstime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDatanum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatatext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcampaignDataRecord value1(UInteger value) {
        setCampaignid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcampaignDataRecord value2(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcampaignDataRecord value3(Timestamp value) {
        setAccesstime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcampaignDataRecord value4(Integer value) {
        setDatanum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcampaignDataRecord value5(String value) {
        setDatatext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcampaignDataRecord values(UInteger value1, Integer value2, Timestamp value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblcampaignDataRecord
     */
    public TblcampaignDataRecord() {
        super(TblcampaignData.TBLCAMPAIGN_DATA);
    }

    /**
     * Create a detached, initialised TblcampaignDataRecord
     */
    public TblcampaignDataRecord(UInteger campaignid, Integer userid, Timestamp accesstime, Integer datanum, String datatext) {
        super(TblcampaignData.TBLCAMPAIGN_DATA);

        set(0, campaignid);
        set(1, userid);
        set(2, accesstime);
        set(3, datanum);
        set(4, datatext);
    }
}
