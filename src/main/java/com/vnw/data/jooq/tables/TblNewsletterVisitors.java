/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblNewsletterVisitorsRecord;

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
public class TblNewsletterVisitors extends TableImpl<TblNewsletterVisitorsRecord> {

    private static final long serialVersionUID = -402921932;

    /**
     * The reference instance of <code>vnw_core.tbl_newsletter_visitors</code>
     */
    public static final TblNewsletterVisitors TBL_NEWSLETTER_VISITORS = new TblNewsletterVisitors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblNewsletterVisitorsRecord> getRecordType() {
        return TblNewsletterVisitorsRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.email</code>. confirmed email
     */
    public final TableField<TblNewsletterVisitorsRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(133).nullable(false), this, "confirmed email");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.name</code>. name
     */
    public final TableField<TblNewsletterVisitorsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "name");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.registereddate</code>. registered datetime
     */
    public final TableField<TblNewsletterVisitorsRecord, Timestamp> REGISTEREDDATE = createField("registereddate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "registered datetime");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.codeconfirm</code>.
     */
    public final TableField<TblNewsletterVisitorsRecord, String> CODECONFIRM = createField("codeconfirm", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.confirmeddate</code>. confirmed datetime
     */
    public final TableField<TblNewsletterVisitorsRecord, Timestamp> CONFIRMEDDATE = createField("confirmeddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "confirmed datetime");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.remindeddate</code>. reminded datetime
     */
    public final TableField<TblNewsletterVisitorsRecord, Timestamp> REMINDEDDATE = createField("remindeddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "reminded datetime");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.isactived</code>. 0: not active , 1 : active
     */
    public final TableField<TblNewsletterVisitorsRecord, Byte> ISACTIVED = createField("isactived", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0: not active , 1 : active");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.isconfirmed</code>. 0: not confirm , 1: confirm
     */
    public final TableField<TblNewsletterVisitorsRecord, Byte> ISCONFIRMED = createField("isconfirmed", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0: not confirm , 1: confirm");

    /**
     * The column <code>vnw_core.tbl_newsletter_visitors.isreminded</code>. 0: not remind , 1: reminded
     */
    public final TableField<TblNewsletterVisitorsRecord, Byte> ISREMINDED = createField("isreminded", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0: not remind , 1: reminded");

    /**
     * Create a <code>vnw_core.tbl_newsletter_visitors</code> table reference
     */
    public TblNewsletterVisitors() {
        this("tbl_newsletter_visitors", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_newsletter_visitors</code> table reference
     */
    public TblNewsletterVisitors(String alias) {
        this(alias, TBL_NEWSLETTER_VISITORS);
    }

    private TblNewsletterVisitors(String alias, Table<TblNewsletterVisitorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblNewsletterVisitors(String alias, Table<TblNewsletterVisitorsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblNewsletterVisitorsRecord> getPrimaryKey() {
        return Keys.KEY_TBL_NEWSLETTER_VISITORS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblNewsletterVisitorsRecord>> getKeys() {
        return Arrays.<UniqueKey<TblNewsletterVisitorsRecord>>asList(Keys.KEY_TBL_NEWSLETTER_VISITORS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblNewsletterVisitors as(String alias) {
        return new TblNewsletterVisitors(alias, this);
    }

    /**
     * Rename this table
     */
    public TblNewsletterVisitors rename(String name) {
        return new TblNewsletterVisitors(name, null);
    }
}