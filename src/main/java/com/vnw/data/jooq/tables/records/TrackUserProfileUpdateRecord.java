/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TrackUserProfileUpdate;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class TrackUserProfileUpdateRecord extends UpdatableRecordImpl<TrackUserProfileUpdateRecord> implements Record9<ULong, UInteger, String, String, String, UByte, UByte, UByte, Timestamp> {

    private static final long serialVersionUID = -622484162;

    /**
     * Setter for <code>vnw_core.track_user_profile_update.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.user_id</code>.
     */
    public void setUserId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.user_id</code>.
     */
    public UInteger getUserId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.telephone</code>.
     */
    public void setTelephone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.telephone</code>.
     */
    public String getTelephone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.mobilephone</code>.
     */
    public void setMobilephone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.mobilephone</code>.
     */
    public String getMobilephone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.city_id</code>.
     */
    public void setCityId(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.city_id</code>.
     */
    public UByte getCityId() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.country_id</code>.
     */
    public void setCountryId(UByte value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.country_id</code>.
     */
    public UByte getCountryId() {
        return (UByte) get(6);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.address</code>.
     */
    public void setAddress(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.address</code>.
     */
    public UByte getAddress() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>vnw_core.track_user_profile_update.create_at</code>.
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.track_user_profile_update.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, UInteger, String, String, String, UByte, UByte, UByte, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, UInteger, String, String, String, UByte, UByte, UByte, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.TELEPHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.MOBILEPHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.CITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field7() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field8() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE.CREATE_AT;
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
    public UInteger value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTelephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMobilephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value7() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value8() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value2(UInteger value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value4(String value) {
        setTelephone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value5(String value) {
        setMobilephone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value6(UByte value) {
        setCityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value7(UByte value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value8(UByte value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackUserProfileUpdateRecord values(ULong value1, UInteger value2, String value3, String value4, String value5, UByte value6, UByte value7, UByte value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TrackUserProfileUpdateRecord
     */
    public TrackUserProfileUpdateRecord() {
        super(TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE);
    }

    /**
     * Create a detached, initialised TrackUserProfileUpdateRecord
     */
    public TrackUserProfileUpdateRecord(ULong id, UInteger userId, String email, String telephone, String mobilephone, UByte cityId, UByte countryId, UByte address, Timestamp createAt) {
        super(TrackUserProfileUpdate.TRACK_USER_PROFILE_UPDATE);

        set(0, id);
        set(1, userId);
        set(2, email);
        set(3, telephone);
        set(4, mobilephone);
        set(5, cityId);
        set(6, countryId);
        set(7, address);
        set(8, createAt);
    }
}
