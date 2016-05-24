/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeExtraInfoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TblresumeExtraInfo extends TableImpl<TblresumeExtraInfoRecord> {

    private static final long serialVersionUID = -507005706;

    /**
     * The reference instance of <code>vnw_core.tblresume_extra_info</code>
     */
    public static final TblresumeExtraInfo TBLRESUME_EXTRA_INFO = new TblresumeExtraInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeExtraInfoRecord> getRecordType() {
        return TblresumeExtraInfoRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_extra_info.resumeId</code>. foreign key from tblresume
     */
    public final TableField<TblresumeExtraInfoRecord, UInteger> RESUMEID = createField("resumeId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "foreign key from tblresume");

    /**
     * The column <code>vnw_core.tblresume_extra_info.completionRate</code>. The completion rate (percentage) for a resume, maximum is 100%
     */
    public final TableField<TblresumeExtraInfoRecord, Byte> COMPLETIONRATE = createField("completionRate", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "The completion rate (percentage) for a resume, maximum is 100%");

    /**
     * The column <code>vnw_core.tblresume_extra_info.completionLevelId</code>. New type of suggestion, ref to tblref_completion_level
     */
    public final TableField<TblresumeExtraInfoRecord, Byte> COMPLETIONLEVELID = createField("completionLevelId", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "New type of suggestion, ref to tblref_completion_level");

    /**
     * The column <code>vnw_core.tblresume_extra_info.completionSuggestion</code>.
     */
    public final TableField<TblresumeExtraInfoRecord, String> COMPLETIONSUGGESTION = createField("completionSuggestion", org.jooq.impl.SQLDataType.VARCHAR.length(2048), this, "");

    /**
     * The column <code>vnw_core.tblresume_extra_info.completionSuggestionVersion</code>.
     */
    public final TableField<TblresumeExtraInfoRecord, Short> COMPLETIONSUGGESTIONVERSION = createField("completionSuggestionVersion", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>vnw_core.tblresume_extra_info</code> table reference
     */
    public TblresumeExtraInfo() {
        this("tblresume_extra_info", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_extra_info</code> table reference
     */
    public TblresumeExtraInfo(String alias) {
        this(alias, TBLRESUME_EXTRA_INFO);
    }

    private TblresumeExtraInfo(String alias, Table<TblresumeExtraInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeExtraInfo(String alias, Table<TblresumeExtraInfoRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblresumeExtraInfoRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_EXTRA_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeExtraInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeExtraInfoRecord>>asList(Keys.KEY_TBLRESUME_EXTRA_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeExtraInfo as(String alias) {
        return new TblresumeExtraInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeExtraInfo rename(String name) {
        return new TblresumeExtraInfo(name, null);
    }
}
