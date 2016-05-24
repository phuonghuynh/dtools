/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblemphomepageRandomresumeRecord;

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
public class TblemphomepageRandomresume extends TableImpl<TblemphomepageRandomresumeRecord> {

    private static final long serialVersionUID = -1607575452;

    /**
     * The reference instance of <code>vnw_core.tblemphomepage_randomresume</code>
     */
    public static final TblemphomepageRandomresume TBLEMPHOMEPAGE_RANDOMRESUME = new TblemphomepageRandomresume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblemphomepageRandomresumeRecord> getRecordType() {
        return TblemphomepageRandomresumeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.entryid</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, UInteger> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.resumeid</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, UInteger> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.randomresumecategoryid</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, UInteger> RANDOMRESUMECATEGORYID = createField("randomresumecategoryid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.title</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.description</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.createdate</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, Timestamp> CREATEDATE = createField("createdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblemphomepage_randomresume.lastupdate</code>.
     */
    public final TableField<TblemphomepageRandomresumeRecord, Timestamp> LASTUPDATE = createField("lastupdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblemphomepage_randomresume</code> table reference
     */
    public TblemphomepageRandomresume() {
        this("tblemphomepage_randomresume", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblemphomepage_randomresume</code> table reference
     */
    public TblemphomepageRandomresume(String alias) {
        this(alias, TBLEMPHOMEPAGE_RANDOMRESUME);
    }

    private TblemphomepageRandomresume(String alias, Table<TblemphomepageRandomresumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblemphomepageRandomresume(String alias, Table<TblemphomepageRandomresumeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblemphomepageRandomresumeRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLEMPHOMEPAGE_RANDOMRESUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblemphomepageRandomresumeRecord> getPrimaryKey() {
        return Keys.KEY_TBLEMPHOMEPAGE_RANDOMRESUME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblemphomepageRandomresumeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblemphomepageRandomresumeRecord>>asList(Keys.KEY_TBLEMPHOMEPAGE_RANDOMRESUME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblemphomepageRandomresume as(String alias) {
        return new TblemphomepageRandomresume(alias, this);
    }

    /**
     * Rename this table
     */
    public TblemphomepageRandomresume rename(String name) {
        return new TblemphomepageRandomresume(name, null);
    }
}
