/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.EtlJobViewsRecord;

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
public class EtlJobViews extends TableImpl<EtlJobViewsRecord> {

    private static final long serialVersionUID = -465073837;

    /**
     * The reference instance of <code>vnw_core.etl_job_views</code>
     */
    public static final EtlJobViews ETL_JOB_VIEWS = new EtlJobViews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EtlJobViewsRecord> getRecordType() {
        return EtlJobViewsRecord.class;
    }

    /**
     * The column <code>vnw_core.etl_job_views.jobId</code>.
     */
    public final TableField<EtlJobViewsRecord, Integer> JOBID = createField("jobId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.etl_job_views.noOfViews</code>.
     */
    public final TableField<EtlJobViewsRecord, Integer> NOOFVIEWS = createField("noOfViews", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>vnw_core.etl_job_views</code> table reference
     */
    public EtlJobViews() {
        this("etl_job_views", null);
    }

    /**
     * Create an aliased <code>vnw_core.etl_job_views</code> table reference
     */
    public EtlJobViews(String alias) {
        this(alias, ETL_JOB_VIEWS);
    }

    private EtlJobViews(String alias, Table<EtlJobViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private EtlJobViews(String alias, Table<EtlJobViewsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EtlJobViewsRecord> getPrimaryKey() {
        return Keys.KEY_ETL_JOB_VIEWS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EtlJobViewsRecord>> getKeys() {
        return Arrays.<UniqueKey<EtlJobViewsRecord>>asList(Keys.KEY_ETL_JOB_VIEWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EtlJobViews as(String alias) {
        return new EtlJobViews(alias, this);
    }

    /**
     * Rename this table
     */
    public EtlJobViews rename(String name) {
        return new EtlJobViews(name, null);
    }
}