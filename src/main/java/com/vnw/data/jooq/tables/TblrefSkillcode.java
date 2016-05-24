/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefSkillcodeRecord;

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
public class TblrefSkillcode extends TableImpl<TblrefSkillcodeRecord> {

    private static final long serialVersionUID = 163628002;

    /**
     * The reference instance of <code>vnw_core.tblref_skillcode</code>
     */
    public static final TblrefSkillcode TBLREF_SKILLCODE = new TblrefSkillcode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefSkillcodeRecord> getRecordType() {
        return TblrefSkillcodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_skillcode.skill_id</code>.
     */
    public final TableField<TblrefSkillcodeRecord, Integer> SKILL_ID = createField("skill_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_skillcode.skillgroup_id</code>.
     */
    public final TableField<TblrefSkillcodeRecord, Byte> SKILLGROUP_ID = createField("skillgroup_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_skillcode.skill_code</code>.
     */
    public final TableField<TblrefSkillcodeRecord, String> SKILL_CODE = createField("skill_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_skillcode</code> table reference
     */
    public TblrefSkillcode() {
        this("tblref_skillcode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_skillcode</code> table reference
     */
    public TblrefSkillcode(String alias) {
        this(alias, TBLREF_SKILLCODE);
    }

    private TblrefSkillcode(String alias, Table<TblrefSkillcodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefSkillcode(String alias, Table<TblrefSkillcodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefSkillcodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLREF_SKILLCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefSkillcodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SKILLCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefSkillcodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefSkillcodeRecord>>asList(Keys.KEY_TBLREF_SKILLCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSkillcode as(String alias) {
        return new TblrefSkillcode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefSkillcode rename(String name) {
        return new TblrefSkillcode(name, null);
    }
}
