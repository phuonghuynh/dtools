/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobApplicationMatchingscoreRecord;

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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class TbljobApplicationMatchingscore extends TableImpl<TbljobApplicationMatchingscoreRecord> {

    private static final long serialVersionUID = 751362306;

    /**
     * The reference instance of <code>vnw_core.tbljob_application_matchingscore</code>
     */
    public static final TbljobApplicationMatchingscore TBLJOB_APPLICATION_MATCHINGSCORE = new TbljobApplicationMatchingscore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobApplicationMatchingscoreRecord> getRecordType() {
        return TbljobApplicationMatchingscoreRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_application_matchingscore.id</code>.
     */
    public final TableField<TbljobApplicationMatchingscoreRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_application_matchingscore.applicationType</code>. 1 - Apply online; 2 - Sent directly
     */
    public final TableField<TbljobApplicationMatchingscoreRecord, UByte> APPLICATIONTYPE = createField("applicationType", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "1 - Apply online; 2 - Sent directly");

    /**
     * The column <code>vnw_core.tbljob_application_matchingscore.applicationId</code>. Ref to tbljob_applyonline (applyType = 1) or tblresume_sentdirectly (applyType = 2)
     */
    public final TableField<TbljobApplicationMatchingscoreRecord, UInteger> APPLICATIONID = createField("applicationId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "Ref to tbljob_applyonline (applyType = 1) or tblresume_sentdirectly (applyType = 2)");

    /**
     * The column <code>vnw_core.tbljob_application_matchingscore.matchingScore</code>.
     */
    public final TableField<TbljobApplicationMatchingscoreRecord, Double> MATCHINGSCORE = createField("matchingScore", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.FLOAT)), this, "");

    /**
     * Create a <code>vnw_core.tbljob_application_matchingscore</code> table reference
     */
    public TbljobApplicationMatchingscore() {
        this("tbljob_application_matchingscore", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_application_matchingscore</code> table reference
     */
    public TbljobApplicationMatchingscore(String alias) {
        this(alias, TBLJOB_APPLICATION_MATCHINGSCORE);
    }

    private TbljobApplicationMatchingscore(String alias, Table<TbljobApplicationMatchingscoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobApplicationMatchingscore(String alias, Table<TbljobApplicationMatchingscoreRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobApplicationMatchingscoreRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TBLJOB_APPLICATION_MATCHINGSCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobApplicationMatchingscoreRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_APPLICATION_MATCHINGSCORE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobApplicationMatchingscoreRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobApplicationMatchingscoreRecord>>asList(Keys.KEY_TBLJOB_APPLICATION_MATCHINGSCORE_PRIMARY, Keys.KEY_TBLJOB_APPLICATION_MATCHINGSCORE_IDX_APPLICATIONTYPE_APPLICATIONID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobApplicationMatchingscore as(String alias) {
        return new TbljobApplicationMatchingscore(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobApplicationMatchingscore rename(String name) {
        return new TbljobApplicationMatchingscore(name, null);
    }
}
