/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeUpgradingRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class TblresumeUpgrading extends TableImpl<TblresumeUpgradingRecord> {

    private static final long serialVersionUID = -2036458300;

    /**
     * The reference instance of <code>vnw_core.tblresume_upgrading</code>
     */
    public static final TblresumeUpgrading TBLRESUME_UPGRADING = new TblresumeUpgrading();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeUpgradingRecord> getRecordType() {
        return TblresumeUpgradingRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_upgrading.resumeid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.resumetitle</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> RESUMETITLE = createField("resumetitle", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.fullname</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> FULLNAME = createField("fullname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.birthday</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Timestamp> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.genderid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> GENDERID = createField("genderid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.maritalstatusid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> MARITALSTATUSID = createField("maritalstatusid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.address</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.countryid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> COUNTRYID = createField("countryid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.cityid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> CITYID = createField("cityid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.homephone</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> HOMEPHONE = createField("homephone", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.cellphone</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> CELLPHONE = createField("cellphone", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.emailaddress</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> EMAILADDRESS = createField("emailaddress", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.desiredjobtitle</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> DESIREDJOBTITLE = createField("desiredjobtitle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.jobdescription</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> JOBDESCRIPTION = createField("jobdescription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.joblevelid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> JOBLEVELID = createField("joblevelid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.desiredjoblevelid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> DESIREDJOBLEVELID = createField("desiredjoblevelid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.companysizeid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> COMPANYSIZEID = createField("companysizeid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.yearsexperienceid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> YEARSEXPERIENCEID = createField("yearsexperienceid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.highestdegreeid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> HIGHESTDEGREEID = createField("highestdegreeid", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.relocateid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> RELOCATEID = createField("relocateid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.willingtravelid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> WILLINGTRAVELID = createField("willingtravelid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.mostrecentposition</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> MOSTRECENTPOSITION = createField("mostrecentposition", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.currentsalary</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> CURRENTSALARY = createField("currentsalary", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.suggestedsalary</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> SUGGESTEDSALARY = createField("suggestedsalary", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.nationalityid</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> NATIONALITYID = createField("nationalityid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.language1</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> LANGUAGE1 = createField("language1", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.languagelevel1</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> LANGUAGELEVEL1 = createField("languagelevel1", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.language2</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> LANGUAGE2 = createField("language2", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.languagelevel2</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> LANGUAGELEVEL2 = createField("languagelevel2", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.language3</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> LANGUAGE3 = createField("language3", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.languagelevel3</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> LANGUAGELEVEL3 = createField("languagelevel3", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.language4</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Short> LANGUAGE4 = createField("language4", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.languagelevel4</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> LANGUAGELEVEL4 = createField("languagelevel4", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.resumecontent</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> RESUMECONTENT = createField("resumecontent", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.userpathpicturefile</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> USERPATHPICTUREFILE = createField("userpathpicturefile", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.ischeckconfidential</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> ISCHECKCONFIDENTIAL = createField("ischeckconfidential", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.confidentialfields</code>.
     */
    public final TableField<TblresumeUpgradingRecord, String> CONFIDENTIALFIELDS = createField("confidentialfields", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.issearchable</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> ISSEARCHABLE = createField("issearchable", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.postedstep</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> POSTEDSTEP = createField("postedstep", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.iscompleted</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> ISCOMPLETED = createField("iscompleted", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.isdenied</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Byte> ISDENIED = createField("isdenied", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.createddate</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_upgrading.lastupdate</code>.
     */
    public final TableField<TblresumeUpgradingRecord, Timestamp> LASTUPDATE = createField("lastupdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblresume_upgrading</code> table reference
     */
    public TblresumeUpgrading() {
        this("tblresume_upgrading", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_upgrading</code> table reference
     */
    public TblresumeUpgrading(String alias) {
        this(alias, TBLRESUME_UPGRADING);
    }

    private TblresumeUpgrading(String alias, Table<TblresumeUpgradingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeUpgrading(String alias, Table<TblresumeUpgradingRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblresumeUpgradingRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_UPGRADING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeUpgradingRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeUpgradingRecord>>asList(Keys.KEY_TBLRESUME_UPGRADING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeUpgrading as(String alias) {
        return new TblresumeUpgrading(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeUpgrading rename(String name) {
        return new TblresumeUpgrading(name, null);
    }
}