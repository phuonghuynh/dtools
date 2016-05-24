/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobPromotionRecord;

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
import org.jooq.types.UByte;
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
public class TbljobPromotion extends TableImpl<TbljobPromotionRecord> {

    private static final long serialVersionUID = 995341791;

    /**
     * The reference instance of <code>vnw_core.tbljob_promotion</code>
     */
    public static final TbljobPromotion TBLJOB_PROMOTION = new TbljobPromotion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobPromotionRecord> getRecordType() {
        return TbljobPromotionRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_promotion.entryid</code>.
     */
    public final TableField<TbljobPromotionRecord, UInteger> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_promotion.jobid</code>.
     */
    public final TableField<TbljobPromotionRecord, UInteger> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbljob_promotion.jobpromote_bitmask</code>.
     */
    public final TableField<TbljobPromotionRecord, UByte> JOBPROMOTE_BITMASK = createField("jobpromote_bitmask", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>vnw_core.tbljob_promotion.createdate</code>.
     */
    public final TableField<TbljobPromotionRecord, Timestamp> CREATEDATE = createField("createdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_promotion.lastupdate</code>.
     */
    public final TableField<TbljobPromotionRecord, Timestamp> LASTUPDATE = createField("lastupdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_promotion.expireddate</code>.
     */
    public final TableField<TbljobPromotionRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tbljob_promotion.onlinedate</code>.
     */
    public final TableField<TbljobPromotionRecord, Timestamp> ONLINEDATE = createField("onlinedate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tbljob_promotion</code> table reference
     */
    public TbljobPromotion() {
        this("tbljob_promotion", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_promotion</code> table reference
     */
    public TbljobPromotion(String alias) {
        this(alias, TBLJOB_PROMOTION);
    }

    private TbljobPromotion(String alias, Table<TbljobPromotionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobPromotion(String alias, Table<TbljobPromotionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobPromotionRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOB_PROMOTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobPromotionRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOB_PROMOTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobPromotionRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobPromotionRecord>>asList(Keys.KEY_TBLJOB_PROMOTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobPromotion as(String alias) {
        return new TbljobPromotion(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobPromotion rename(String name) {
        return new TbljobPromotion(name, null);
    }
}
