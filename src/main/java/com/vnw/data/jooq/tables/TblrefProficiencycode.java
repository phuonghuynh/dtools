/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefProficiencycodeRecord;

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
public class TblrefProficiencycode extends TableImpl<TblrefProficiencycodeRecord> {

    private static final long serialVersionUID = -1561312109;

    /**
     * The reference instance of <code>vnw_core.tblref_proficiencycode</code>
     */
    public static final TblrefProficiencycode TBLREF_PROFICIENCYCODE = new TblrefProficiencycode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefProficiencycodeRecord> getRecordType() {
        return TblrefProficiencycodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_proficiencycode.proficiency_id</code>.
     */
    public final TableField<TblrefProficiencycodeRecord, Byte> PROFICIENCY_ID = createField("proficiency_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_proficiencycode.proficiency_code</code>.
     */
    public final TableField<TblrefProficiencycodeRecord, String> PROFICIENCY_CODE = createField("proficiency_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_proficiencycode</code> table reference
     */
    public TblrefProficiencycode() {
        this("tblref_proficiencycode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_proficiencycode</code> table reference
     */
    public TblrefProficiencycode(String alias) {
        this(alias, TBLREF_PROFICIENCYCODE);
    }

    private TblrefProficiencycode(String alias, Table<TblrefProficiencycodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefProficiencycode(String alias, Table<TblrefProficiencycodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefProficiencycodeRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_PROFICIENCYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefProficiencycodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_PROFICIENCYCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefProficiencycodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefProficiencycodeRecord>>asList(Keys.KEY_TBLREF_PROFICIENCYCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefProficiencycode as(String alias) {
        return new TblrefProficiencycode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefProficiencycode rename(String name) {
        return new TblrefProficiencycode(name, null);
    }
}
