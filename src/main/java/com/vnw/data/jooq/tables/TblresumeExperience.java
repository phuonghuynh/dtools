/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeExperienceRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DateAsTimestampBinding;
import org.jooq.impl.TableImpl;
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
public class TblresumeExperience extends TableImpl<TblresumeExperienceRecord> {

    private static final long serialVersionUID = 871743640;

    /**
     * The reference instance of <code>vnw_core.tblresume_experience</code>
     */
    public static final TblresumeExperience TBLRESUME_EXPERIENCE = new TblresumeExperience();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeExperienceRecord> getRecordType() {
        return TblresumeExperienceRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_experience.entryid</code>.
     */
    public final TableField<TblresumeExperienceRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.resumeid</code>.
     */
    public final TableField<TblresumeExperienceRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.jobtitle</code>.
     */
    public final TableField<TblresumeExperienceRecord, String> JOBTITLE = createField("jobtitle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.joblevelid</code>.
     */
    public final TableField<TblresumeExperienceRecord, Byte> JOBLEVELID = createField("joblevelid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.companyname</code>.
     */
    public final TableField<TblresumeExperienceRecord, String> COMPANYNAME = createField("companyname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.countryid</code>.
     */
    public final TableField<TblresumeExperienceRecord, Short> COUNTRYID = createField("countryid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.cityid</code>.
     */
    public final TableField<TblresumeExperienceRecord, Short> CITYID = createField("cityid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.industryid</code>.
     */
    public final TableField<TblresumeExperienceRecord, Short> INDUSTRYID = createField("industryid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.startdate</code>.
     */
    public final TableField<TblresumeExperienceRecord, Timestamp> STARTDATE = createField("startdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateAsTimestampBinding());

    /**
     * The column <code>vnw_core.tblresume_experience.enddate</code>.
     */
    public final TableField<TblresumeExperienceRecord, Timestamp> ENDDATE = createField("enddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateAsTimestampBinding());

    /**
     * The column <code>vnw_core.tblresume_experience.description</code>.
     */
    public final TableField<TblresumeExperienceRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.experienceorder</code>.
     */
    public final TableField<TblresumeExperienceRecord, Short> EXPERIENCEORDER = createField("experienceorder", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_experience.iscurrent</code>.
     */
    public final TableField<TblresumeExperienceRecord, UByte> ISCURRENT = createField("iscurrent", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * Create a <code>vnw_core.tblresume_experience</code> table reference
     */
    public TblresumeExperience() {
        this("tblresume_experience", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_experience</code> table reference
     */
    public TblresumeExperience(String alias) {
        this(alias, TBLRESUME_EXPERIENCE);
    }

    private TblresumeExperience(String alias, Table<TblresumeExperienceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeExperience(String alias, Table<TblresumeExperienceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return VnwCore.VNW_CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TblresumeExperienceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLRESUME_EXPERIENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblresumeExperienceRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_EXPERIENCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeExperienceRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeExperienceRecord>>asList(Keys.KEY_TBLRESUME_EXPERIENCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeExperience as(String alias) {
        return new TblresumeExperience(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeExperience rename(String name) {
        return new TblresumeExperience(name, null);
    }
}
