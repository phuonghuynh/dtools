/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbleduRegistrationRecord;

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
import org.jooq.types.UByte;
import org.jooq.types.UShort;


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
public class TbleduRegistration extends TableImpl<TbleduRegistrationRecord> {

    private static final long serialVersionUID = 910590839;

    /**
     * The reference instance of <code>vnw_core.tbledu_registration</code>
     */
    public static final TbleduRegistration TBLEDU_REGISTRATION = new TbleduRegistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbleduRegistrationRecord> getRecordType() {
        return TbleduRegistrationRecord.class;
    }

    /**
     * The column <code>vnw_core.tbledu_registration.userid</code>.
     */
    public final TableField<TbleduRegistrationRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.industryid</code>.
     */
    public final TableField<TbleduRegistrationRecord, UByte> INDUSTRYID = createField("industryid", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.joblevelid</code>.
     */
    public final TableField<TbleduRegistrationRecord, UByte> JOBLEVELID = createField("joblevelid", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.majorid</code>.
     */
    public final TableField<TbleduRegistrationRecord, UShort> MAJORID = createField("majorid", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.schoolid</code>.
     */
    public final TableField<TbleduRegistrationRecord, UShort> SCHOOLID = createField("schoolid", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.highestdegreeid</code>.
     */
    public final TableField<TbleduRegistrationRecord, UByte> HIGHESTDEGREEID = createField("highestdegreeid", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.cityid</code>.
     */
    public final TableField<TbleduRegistrationRecord, UByte> CITYID = createField("cityid", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.telephone</code>.
     */
    public final TableField<TbleduRegistrationRecord, String> TELEPHONE = createField("telephone", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.mobilephone</code>.
     */
    public final TableField<TbleduRegistrationRecord, String> MOBILEPHONE = createField("mobilephone", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.isedu</code>.
     */
    public final TableField<TbleduRegistrationRecord, Integer> ISEDU = createField("isedu", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbledu_registration.createdate</code>.
     */
    public final TableField<TbleduRegistrationRecord, Timestamp> CREATEDATE = createField("createdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbledu_registration</code> table reference
     */
    public TbleduRegistration() {
        this("tbledu_registration", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbledu_registration</code> table reference
     */
    public TbleduRegistration(String alias) {
        this(alias, TBLEDU_REGISTRATION);
    }

    private TbleduRegistration(String alias, Table<TbleduRegistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbleduRegistration(String alias, Table<TbleduRegistrationRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TbleduRegistrationRecord> getPrimaryKey() {
        return Keys.KEY_TBLEDU_REGISTRATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbleduRegistrationRecord>> getKeys() {
        return Arrays.<UniqueKey<TbleduRegistrationRecord>>asList(Keys.KEY_TBLEDU_REGISTRATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbleduRegistration as(String alias) {
        return new TbleduRegistration(alias, this);
    }

    /**
     * Rename this table
     */
    public TbleduRegistration rename(String name) {
        return new TbleduRegistration(name, null);
    }
}
