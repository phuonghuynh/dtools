/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefYearsexperienceResumeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TblrefYearsexperienceResume extends TableImpl<TblrefYearsexperienceResumeRecord> {

    private static final long serialVersionUID = -395203491;

    /**
     * The reference instance of <code>vnw_core.tblref_yearsexperience_resume</code>
     */
    public static final TblrefYearsexperienceResume TBLREF_YEARSEXPERIENCE_RESUME = new TblrefYearsexperienceResume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefYearsexperienceResumeRecord> getRecordType() {
        return TblrefYearsexperienceResumeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_yearsexperience_resume.yearsexperienceid</code>.
     */
    public final TableField<TblrefYearsexperienceResumeRecord, Byte> YEARSEXPERIENCEID = createField("yearsexperienceid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_yearsexperience_resume.languageid</code>.
     */
    public final TableField<TblrefYearsexperienceResumeRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_yearsexperience_resume.yearsexperiencename</code>.
     */
    public final TableField<TblrefYearsexperienceResumeRecord, String> YEARSEXPERIENCENAME = createField("yearsexperiencename", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_yearsexperience_resume.yearsexperienceorder</code>.
     */
    public final TableField<TblrefYearsexperienceResumeRecord, Byte> YEARSEXPERIENCEORDER = createField("yearsexperienceorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_yearsexperience_resume</code> table reference
     */
    public TblrefYearsexperienceResume() {
        this("tblref_yearsexperience_resume", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_yearsexperience_resume</code> table reference
     */
    public TblrefYearsexperienceResume(String alias) {
        this(alias, TBLREF_YEARSEXPERIENCE_RESUME);
    }

    private TblrefYearsexperienceResume(String alias, Table<TblrefYearsexperienceResumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefYearsexperienceResume(String alias, Table<TblrefYearsexperienceResumeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefYearsexperienceResumeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_YEARSEXPERIENCE_RESUME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefYearsexperienceResumeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefYearsexperienceResumeRecord>>asList(Keys.KEY_TBLREF_YEARSEXPERIENCE_RESUME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefYearsexperienceResume as(String alias) {
        return new TblrefYearsexperienceResume(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefYearsexperienceResume rename(String name) {
        return new TblrefYearsexperienceResume(name, null);
    }
}
