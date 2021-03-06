/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblskillTermRecord;

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
public class TblskillTerm extends TableImpl<TblskillTermRecord> {

    private static final long serialVersionUID = -1584758012;

    /**
     * The reference instance of <code>vnw_core.tblskill_term</code>
     */
    public static final TblskillTerm TBLSKILL_TERM = new TblskillTerm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblskillTermRecord> getRecordType() {
        return TblskillTermRecord.class;
    }

    /**
     * The column <code>vnw_core.tblskill_term.skillId</code>.
     */
    public final TableField<TblskillTermRecord, UInteger> SKILLID = createField("skillId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblskill_term.skillName</code>. This is the name of skill. Ex.: MySQL, Symfony, ...
     */
    public final TableField<TblskillTermRecord, String> SKILLNAME = createField("skillName", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "This is the name of skill. Ex.: MySQL, Symfony, ...");

    /**
     * Create a <code>vnw_core.tblskill_term</code> table reference
     */
    public TblskillTerm() {
        this("tblskill_term", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblskill_term</code> table reference
     */
    public TblskillTerm(String alias) {
        this(alias, TBLSKILL_TERM);
    }

    private TblskillTerm(String alias, Table<TblskillTermRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblskillTerm(String alias, Table<TblskillTermRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblskillTermRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLSKILL_TERM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblskillTermRecord> getPrimaryKey() {
        return Keys.KEY_TBLSKILL_TERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblskillTermRecord>> getKeys() {
        return Arrays.<UniqueKey<TblskillTermRecord>>asList(Keys.KEY_TBLSKILL_TERM_PRIMARY, Keys.KEY_TBLSKILL_TERM_SKILLNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblskillTerm as(String alias) {
        return new TblskillTerm(alias, this);
    }

    /**
     * Rename this table
     */
    public TblskillTerm rename(String name) {
        return new TblskillTerm(name, null);
    }
}
