/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.enums.TblpoLocation;
import com.vnw.data.jooq.tables.records.TblpoRecord;

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
public class Tblpo extends TableImpl<TblpoRecord> {

    private static final long serialVersionUID = -1344856331;

    /**
     * The reference instance of <code>vnw_core.tblpo</code>
     */
    public static final Tblpo TBLPO = new Tblpo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblpoRecord> getRecordType() {
        return TblpoRecord.class;
    }

    /**
     * The column <code>vnw_core.tblpo.id</code>.
     */
    public final TableField<TblpoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.po_no</code>.
     */
    public final TableField<TblpoRecord, String> PO_NO = createField("po_no", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.vnw_employer_id</code>.
     */
    public final TableField<TblpoRecord, Integer> VNW_EMPLOYER_ID = createField("vnw_employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.company_no</code>.
     */
    public final TableField<TblpoRecord, String> COMPANY_NO = createField("company_no", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.company_name</code>.
     */
    public final TableField<TblpoRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>vnw_core.tblpo.sale_assigned</code>. email address
     */
    public final TableField<TblpoRecord, String> SALE_ASSIGNED = createField("sale_assigned", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "email address");

    /**
     * The column <code>vnw_core.tblpo.created_date</code>.
     */
    public final TableField<TblpoRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.sugar_created_date</code>.
     */
    public final TableField<TblpoRecord, Timestamp> SUGAR_CREATED_DATE = createField("sugar_created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.approved_date</code>.
     */
    public final TableField<TblpoRecord, Timestamp> APPROVED_DATE = createField("approved_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.is_approved</code>.
     */
    public final TableField<TblpoRecord, Byte> IS_APPROVED = createField("is_approved", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblpo.expired_date</code>.
     */
    public final TableField<TblpoRecord, Timestamp> EXPIRED_DATE = createField("expired_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblpo.is_deleted</code>.
     */
    public final TableField<TblpoRecord, Byte> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblpo.isDisable</code>. 1: disable 0 : enable 
     */
    public final TableField<TblpoRecord, Byte> ISDISABLE = createField("isDisable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1: disable 0 : enable ");

    /**
     * The column <code>vnw_core.tblpo.location</code>.
     */
    public final TableField<TblpoRecord, TblpoLocation> LOCATION = createField("location", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.vnw.data.jooq.enums.TblpoLocation.class), this, "");

    /**
     * Create a <code>vnw_core.tblpo</code> table reference
     */
    public Tblpo() {
        this("tblpo", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblpo</code> table reference
     */
    public Tblpo(String alias) {
        this(alias, TBLPO);
    }

    private Tblpo(String alias, Table<TblpoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tblpo(String alias, Table<TblpoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblpoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLPO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblpoRecord> getPrimaryKey() {
        return Keys.KEY_TBLPO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblpoRecord>> getKeys() {
        return Arrays.<UniqueKey<TblpoRecord>>asList(Keys.KEY_TBLPO_PRIMARY, Keys.KEY_TBLPO_PO_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tblpo as(String alias) {
        return new Tblpo(alias, this);
    }

    /**
     * Rename this table
     */
    public Tblpo rename(String name) {
        return new Tblpo(name, null);
    }
}
