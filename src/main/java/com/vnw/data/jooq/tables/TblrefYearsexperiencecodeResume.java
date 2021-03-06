/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefYearsexperiencecodeResumeRecord;

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
public class TblrefYearsexperiencecodeResume extends TableImpl<TblrefYearsexperiencecodeResumeRecord> {

    private static final long serialVersionUID = 527180423;

    /**
     * The reference instance of <code>vnw_core.tblref_yearsexperiencecode_resume</code>
     */
    public static final TblrefYearsexperiencecodeResume TBLREF_YEARSEXPERIENCECODE_RESUME = new TblrefYearsexperiencecodeResume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefYearsexperiencecodeResumeRecord> getRecordType() {
        return TblrefYearsexperiencecodeResumeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_yearsexperiencecode_resume.yearsexperienceid</code>.
     */
    public final TableField<TblrefYearsexperiencecodeResumeRecord, Byte> YEARSEXPERIENCEID = createField("yearsexperienceid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_yearsexperiencecode_resume.yearsexperiencecode</code>.
     */
    public final TableField<TblrefYearsexperiencecodeResumeRecord, String> YEARSEXPERIENCECODE = createField("yearsexperiencecode", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * Create a <code>vnw_core.tblref_yearsexperiencecode_resume</code> table reference
     */
    public TblrefYearsexperiencecodeResume() {
        this("tblref_yearsexperiencecode_resume", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_yearsexperiencecode_resume</code> table reference
     */
    public TblrefYearsexperiencecodeResume(String alias) {
        this(alias, TBLREF_YEARSEXPERIENCECODE_RESUME);
    }

    private TblrefYearsexperiencecodeResume(String alias, Table<TblrefYearsexperiencecodeResumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefYearsexperiencecodeResume(String alias, Table<TblrefYearsexperiencecodeResumeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefYearsexperiencecodeResumeRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_YEARSEXPERIENCECODE_RESUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefYearsexperiencecodeResumeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_YEARSEXPERIENCECODE_RESUME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefYearsexperiencecodeResumeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefYearsexperiencecodeResumeRecord>>asList(Keys.KEY_TBLREF_YEARSEXPERIENCECODE_RESUME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperiencecodeResume as(String alias) {
        return new TblrefYearsexperiencecodeResume(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefYearsexperiencecodeResume rename(String name) {
        return new TblrefYearsexperiencecodeResume(name, null);
    }
}
