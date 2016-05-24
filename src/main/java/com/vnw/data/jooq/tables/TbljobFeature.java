/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobFeatureRecord;

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
import org.jooq.types.UInteger;


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
public class TbljobFeature extends TableImpl<TbljobFeatureRecord> {

    private static final long serialVersionUID = 71997989;

    /**
     * The reference instance of <code>vnw_core.tbljob_feature</code>
     */
    public static final TbljobFeature TBLJOB_FEATURE = new TbljobFeature();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobFeatureRecord> getRecordType() {
        return TbljobFeatureRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_feature.entryId</code>. One job can use FJ more than one times
     */
    public final TableField<TbljobFeatureRecord, UInteger> ENTRYID = createField("entryId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "One job can use FJ more than one times");

    /**
     * The column <code>vnw_core.tbljob_feature.jobId</code>.
     */
    public final TableField<TbljobFeatureRecord, UInteger> JOBID = createField("jobId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_feature.onlineDate</code>.
     */
    public final TableField<TbljobFeatureRecord, Timestamp> ONLINEDATE = createField("onlineDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_feature.expiredDate</code>.
     */
    public final TableField<TbljobFeatureRecord, Timestamp> EXPIREDDATE = createField("expiredDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tbljob_feature</code> table reference
     */
    public TbljobFeature() {
        this("tbljob_feature", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_feature</code> table reference
     */
    public TbljobFeature(String alias) {
        this(alias, TBLJOB_FEATURE);
    }

    private TbljobFeature(String alias, Table<TbljobFeatureRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobFeature(String alias, Table<TbljobFeatureRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobFeatureRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOB_FEATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobFeatureRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_FEATURE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobFeatureRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobFeatureRecord>>asList(Keys.KEY_TBLJOB_FEATURE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobFeature as(String alias) {
        return new TbljobFeature(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobFeature rename(String name) {
        return new TbljobFeature(name, null);
    }
}