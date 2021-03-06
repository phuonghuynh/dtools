/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobLanguageskillRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class TbljobLanguageskill extends TableImpl<TbljobLanguageskillRecord> {

    private static final long serialVersionUID = -1697253998;

    /**
     * The reference instance of <code>vnw_core.tbljob_languageskill</code>
     */
    public static final TbljobLanguageskill TBLJOB_LANGUAGESKILL = new TbljobLanguageskill();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobLanguageskillRecord> getRecordType() {
        return TbljobLanguageskillRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_languageskill.jobid</code>.
     */
    public final TableField<TbljobLanguageskillRecord, Integer> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_languageskill.languageproficiencyid</code>.
     */
    public final TableField<TbljobLanguageskillRecord, Integer> LANGUAGEPROFICIENCYID = createField("languageproficiencyid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_languageskill.languagelevelid</code>.
     */
    public final TableField<TbljobLanguageskillRecord, Short> LANGUAGELEVELID = createField("languagelevelid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljob_languageskill.isrequire</code>.
     */
    public final TableField<TbljobLanguageskillRecord, Short> ISREQUIRE = createField("isrequire", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>vnw_core.tbljob_languageskill</code> table reference
     */
    public TbljobLanguageskill() {
        this("tbljob_languageskill", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_languageskill</code> table reference
     */
    public TbljobLanguageskill(String alias) {
        this(alias, TBLJOB_LANGUAGESKILL);
    }

    private TbljobLanguageskill(String alias, Table<TbljobLanguageskillRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobLanguageskill(String alias, Table<TbljobLanguageskillRecord> aliased, Field<?>[] parameters) {
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
    public TbljobLanguageskill as(String alias) {
        return new TbljobLanguageskill(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobLanguageskill rename(String name) {
        return new TbljobLanguageskill(name, null);
    }
}
