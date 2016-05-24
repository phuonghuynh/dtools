/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefLanguageproficiencyRecord;

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
public class TblrefLanguageproficiency extends TableImpl<TblrefLanguageproficiencyRecord> {

    private static final long serialVersionUID = -303839697;

    /**
     * The reference instance of <code>vnw_core.tblref_languageproficiency</code>
     */
    public static final TblrefLanguageproficiency TBLREF_LANGUAGEPROFICIENCY = new TblrefLanguageproficiency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefLanguageproficiencyRecord> getRecordType() {
        return TblrefLanguageproficiencyRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_languageproficiency.languageproficiencyid</code>.
     */
    public final TableField<TblrefLanguageproficiencyRecord, Short> LANGUAGEPROFICIENCYID = createField("languageproficiencyid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_languageproficiency.languageproficiencyname</code>.
     */
    public final TableField<TblrefLanguageproficiencyRecord, String> LANGUAGEPROFICIENCYNAME = createField("languageproficiencyname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_languageproficiency.languageproficiencyorder</code>.
     */
    public final TableField<TblrefLanguageproficiencyRecord, Short> LANGUAGEPROFICIENCYORDER = createField("languageproficiencyorder", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_languageproficiency</code> table reference
     */
    public TblrefLanguageproficiency() {
        this("tblref_languageproficiency", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_languageproficiency</code> table reference
     */
    public TblrefLanguageproficiency(String alias) {
        this(alias, TBLREF_LANGUAGEPROFICIENCY);
    }

    private TblrefLanguageproficiency(String alias, Table<TblrefLanguageproficiencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefLanguageproficiency(String alias, Table<TblrefLanguageproficiencyRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefLanguageproficiencyRecord, Short> getIdentity() {
        return Keys.IDENTITY_TBLREF_LANGUAGEPROFICIENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefLanguageproficiencyRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_LANGUAGEPROFICIENCY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefLanguageproficiencyRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefLanguageproficiencyRecord>>asList(Keys.KEY_TBLREF_LANGUAGEPROFICIENCY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefLanguageproficiency as(String alias) {
        return new TblrefLanguageproficiency(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefLanguageproficiency rename(String name) {
        return new TblrefLanguageproficiency(name, null);
    }
}