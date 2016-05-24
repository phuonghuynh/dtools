/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.TblrefBenefit;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


/**
 * Reference table for benefit name of job & employer
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblrefBenefitRecord extends UpdatableRecordImpl<TblrefBenefitRecord> implements Record3<UByte, String, String> {

    private static final long serialVersionUID = -501042140;

    /**
     * Setter for <code>vnw_core.tblref_benefit.benefitId</code>.
     */
    public void setBenefitid(UByte value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_benefit.benefitId</code>.
     */
    public UByte getBenefitid() {
        return (UByte) get(0);
    }

    /**
     * Setter for <code>vnw_core.tblref_benefit.benefitName</code>.
     */
    public void setBenefitname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_benefit.benefitName</code>.
     */
    public String getBenefitname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.tblref_benefit.benefitIconName</code>. Name of Icon showed in site with font awesome
     */
    public void setBenefiticonname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.tblref_benefit.benefitIconName</code>. Name of Icon showed in site with font awesome
     */
    public String getBenefiticonname() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UByte, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UByte, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field1() {
        return TblrefBenefit.TBLREF_BENEFIT.BENEFITID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TblrefBenefit.TBLREF_BENEFIT.BENEFITNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TblrefBenefit.TBLREF_BENEFIT.BENEFITICONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value1() {
        return getBenefitid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBenefitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBenefiticonname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBenefitRecord value1(UByte value) {
        setBenefitid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBenefitRecord value2(String value) {
        setBenefitname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBenefitRecord value3(String value) {
        setBenefiticonname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefBenefitRecord values(UByte value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblrefBenefitRecord
     */
    public TblrefBenefitRecord() {
        super(TblrefBenefit.TBLREF_BENEFIT);
    }

    /**
     * Create a detached, initialised TblrefBenefitRecord
     */
    public TblrefBenefitRecord(UByte benefitid, String benefitname, String benefiticonname) {
        super(TblrefBenefit.TBLREF_BENEFIT);

        set(0, benefitid);
        set(1, benefitname);
        set(2, benefiticonname);
    }
}
