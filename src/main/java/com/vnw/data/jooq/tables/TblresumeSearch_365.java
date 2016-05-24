/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeSearch_365Record;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DateAsTimestampBinding;
import org.jooq.impl.TableImpl;


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
public class TblresumeSearch_365 extends TableImpl<TblresumeSearch_365Record> {

    private static final long serialVersionUID = -239985699;

    /**
     * The reference instance of <code>vnw_core.tblresume_search_365</code>
     */
    public static final TblresumeSearch_365 TBLRESUME_SEARCH_365 = new TblresumeSearch_365();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeSearch_365Record> getRecordType() {
        return TblresumeSearch_365Record.class;
    }

    /**
     * The column <code>vnw_core.tblresume_search_365.resumeid</code>.
     */
    public final TableField<TblresumeSearch_365Record, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.fullname</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> FULLNAME = createField("fullname", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.city</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.city_max</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> CITY_MAX = createField("city_max", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.city_min</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> CITY_MIN = createField("city_min", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.category</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.highestdegreeid</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> HIGHESTDEGREEID = createField("highestdegreeid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.yearsexperienceid</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> YEARSEXPERIENCEID = createField("yearsexperienceid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.joblevel</code>. joblevel & joblevel experience
     */
    public final TableField<TblresumeSearch_365Record, String> JOBLEVEL = createField("joblevel", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "joblevel & joblevel experience");

    /**
     * The column <code>vnw_core.tblresume_search_365.desiredjoblevelid</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> DESIREDJOBLEVELID = createField("desiredjoblevelid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.nationalityid</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> NATIONALITYID = createField("nationalityid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.school</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> SCHOOL = createField("school", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.confidentialfields</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> CONFIDENTIALFIELDS = createField("confidentialfields", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.mostrecentposition</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> MOSTRECENTPOSITION = createField("mostrecentposition", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.mostrecentemployer</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> MOSTRECENTEMPLOYER = createField("mostrecentemployer", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.jobdescription</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> JOBDESCRIPTION = createField("jobdescription", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.typeworking</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> TYPEWORKING = createField("typeworking", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.language_proficiency</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> LANGUAGE_PROFICIENCY = createField("language_proficiency", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.suggestedsalary</code>.
     */
    public final TableField<TblresumeSearch_365Record, Integer> SUGGESTEDSALARY = createField("suggestedsalary", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.genderid</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> GENDERID = createField("genderid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.birthday</code>.
     */
    public final TableField<TblresumeSearch_365Record, Timestamp> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateAsTimestampBinding());

    /**
     * The column <code>vnw_core.tblresume_search_365.lastdateupdated</code>.
     */
    public final TableField<TblresumeSearch_365Record, Timestamp> LASTDATEUPDATED = createField("lastdateupdated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateAsTimestampBinding());

    /**
     * The column <code>vnw_core.tblresume_search_365.content</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.workexperience</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> WORKEXPERIENCE = createField("workexperience", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.desiredjobtitle</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> DESIREDJOBTITLE = createField("desiredjobtitle", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.education</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> EDUCATION = createField("education", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.skill</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> SKILL = createField("skill", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.resumetitle</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> RESUMETITLE = createField("resumetitle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.exp_jobtitle</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> EXP_JOBTITLE = createField("exp_jobtitle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.exp_description</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> EXP_DESCRIPTION = createField("exp_description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.edu_description</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> EDU_DESCRIPTION = createField("edu_description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.edu_major</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> EDU_MAJOR = createField("edu_major", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.highestdegree_weight</code>.
     */
    public final TableField<TblresumeSearch_365Record, Byte> HIGHESTDEGREE_WEIGHT = createField("highestdegree_weight", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_search_365.alias</code>.
     */
    public final TableField<TblresumeSearch_365Record, String> ALIAS = createField("alias", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tblresume_search_365</code> table reference
     */
    public TblresumeSearch_365() {
        this("tblresume_search_365", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_search_365</code> table reference
     */
    public TblresumeSearch_365(String alias) {
        this(alias, TBLRESUME_SEARCH_365);
    }

    private TblresumeSearch_365(String alias, Table<TblresumeSearch_365Record> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeSearch_365(String alias, Table<TblresumeSearch_365Record> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblresumeSearch_365Record> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_SEARCH_365_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeSearch_365Record>> getKeys() {
        return Arrays.<UniqueKey<TblresumeSearch_365Record>>asList(Keys.KEY_TBLRESUME_SEARCH_365_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeSearch_365 as(String alias) {
        return new TblresumeSearch_365(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeSearch_365 rename(String name) {
        return new TblresumeSearch_365(name, null);
    }
}
