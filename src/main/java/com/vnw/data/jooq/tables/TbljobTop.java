/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobTopRecord;

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
public class TbljobTop extends TableImpl<TbljobTopRecord> {

    private static final long serialVersionUID = 477871465;

    /**
     * The reference instance of <code>vnw_core.tbljob_top</code>
     */
    public static final TbljobTop TBLJOB_TOP = new TbljobTop();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobTopRecord> getRecordType() {
        return TbljobTopRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_top.entryid</code>.
     */
    public final TableField<TbljobTopRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_top.jobid</code>.
     */
    public final TableField<TbljobTopRecord, Integer> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.createddate</code>.
     */
    public final TableField<TbljobTopRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.durationdays</code>.
     */
    public final TableField<TbljobTopRecord, Short> DURATIONDAYS = createField("durationdays", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.expireddate</code>.
     */
    public final TableField<TbljobTopRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.toporder</code>.
     */
    public final TableField<TbljobTopRecord, Byte> TOPORDER = createField("toporder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.homepagetitle</code>.
     */
    public final TableField<TbljobTopRecord, String> HOMEPAGETITLE = createField("homepagetitle", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tbljob_top.homepagecompany</code>.
     */
    public final TableField<TbljobTopRecord, String> HOMEPAGECOMPANY = createField("homepagecompany", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tbljob_top.isapproved</code>.
     */
    public final TableField<TbljobTopRecord, Integer> ISAPPROVED = createField("isapproved", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.approveddate</code>.
     */
    public final TableField<TbljobTopRecord, Timestamp> APPROVEDDATE = createField("approveddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.onlinedate</code>.
     */
    public final TableField<TbljobTopRecord, Timestamp> ONLINEDATE = createField("onlinedate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_top.typetopjob</code>.
     */
    public final TableField<TbljobTopRecord, Integer> TYPETOPJOB = createField("typetopjob", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>vnw_core.tbljob_top</code> table reference
     */
    public TbljobTop() {
        this("tbljob_top", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_top</code> table reference
     */
    public TbljobTop(String alias) {
        this(alias, TBLJOB_TOP);
    }

    private TbljobTop(String alias, Table<TbljobTopRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobTop(String alias, Table<TbljobTopRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobTopRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLJOB_TOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobTopRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_TOP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobTopRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobTopRecord>>asList(Keys.KEY_TBLJOB_TOP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobTop as(String alias) {
        return new TbljobTop(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobTop rename(String name) {
        return new TbljobTop(name, null);
    }
}
