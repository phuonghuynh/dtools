/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobOtherserviceAdmindeleteRecord;

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
public class TbljobOtherserviceAdmindelete extends TableImpl<TbljobOtherserviceAdmindeleteRecord> {

    private static final long serialVersionUID = 875068364;

    /**
     * The reference instance of <code>vnw_core.tbljob_otherservice_admindelete</code>
     */
    public static final TbljobOtherserviceAdmindelete TBLJOB_OTHERSERVICE_ADMINDELETE = new TbljobOtherserviceAdmindelete();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobOtherserviceAdmindeleteRecord> getRecordType() {
        return TbljobOtherserviceAdmindeleteRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.entryid</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.jobid</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Integer> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.serviceid</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Integer> SERVICEID = createField("serviceid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.servicefee</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Double> SERVICEFEE = createField("servicefee", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.currencytype</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, String> CURRENCYTYPE = createField("currencytype", org.jooq.impl.SQLDataType.VARCHAR.length(10).defaultValue(org.jooq.impl.DSL.field("USD", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.createddate</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.durationdays</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Integer> DURATIONDAYS = createField("durationdays", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("7", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.expireddate</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.servicetype</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, String> SERVICETYPE = createField("servicetype", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.startdate</code>. start date of service
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Timestamp> STARTDATE = createField("startdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "start date of service");

    /**
     * The column <code>vnw_core.tbljob_otherservice_admindelete.startfrom</code>.
     */
    public final TableField<TbljobOtherserviceAdmindeleteRecord, Byte> STARTFROM = createField("startfrom", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>vnw_core.tbljob_otherservice_admindelete</code> table reference
     */
    public TbljobOtherserviceAdmindelete() {
        this("tbljob_otherservice_admindelete", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_otherservice_admindelete</code> table reference
     */
    public TbljobOtherserviceAdmindelete(String alias) {
        this(alias, TBLJOB_OTHERSERVICE_ADMINDELETE);
    }

    private TbljobOtherserviceAdmindelete(String alias, Table<TbljobOtherserviceAdmindeleteRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobOtherserviceAdmindelete(String alias, Table<TbljobOtherserviceAdmindeleteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobOtherserviceAdmindeleteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLJOB_OTHERSERVICE_ADMINDELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobOtherserviceAdmindeleteRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_OTHERSERVICE_ADMINDELETE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobOtherserviceAdmindeleteRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobOtherserviceAdmindeleteRecord>>asList(Keys.KEY_TBLJOB_OTHERSERVICE_ADMINDELETE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobOtherserviceAdmindelete as(String alias) {
        return new TbljobOtherserviceAdmindelete(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobOtherserviceAdmindelete rename(String name) {
        return new TbljobOtherserviceAdmindelete(name, null);
    }
}
