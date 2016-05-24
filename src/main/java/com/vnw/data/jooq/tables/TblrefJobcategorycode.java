/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJobcategorycodeRecord;

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
public class TblrefJobcategorycode extends TableImpl<TblrefJobcategorycodeRecord> {

    private static final long serialVersionUID = 857662034;

    /**
     * The reference instance of <code>vnw_core.tblref_jobcategorycode</code>
     */
    public static final TblrefJobcategorycode TBLREF_JOBCATEGORYCODE = new TblrefJobcategorycode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJobcategorycodeRecord> getRecordType() {
        return TblrefJobcategorycodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_jobcategorycode.jobcategoryid</code>.
     */
    public final TableField<TblrefJobcategorycodeRecord, Short> JOBCATEGORYID = createField("jobcategoryid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_jobcategorycode.jobcategorycode</code>.
     */
    public final TableField<TblrefJobcategorycodeRecord, String> JOBCATEGORYCODE = createField("jobcategorycode", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblref_jobcategorycode.industryid</code>.
     */
    public final TableField<TblrefJobcategorycodeRecord, Short> INDUSTRYID = createField("industryid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_jobcategorycode</code> table reference
     */
    public TblrefJobcategorycode() {
        this("tblref_jobcategorycode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_jobcategorycode</code> table reference
     */
    public TblrefJobcategorycode(String alias) {
        this(alias, TBLREF_JOBCATEGORYCODE);
    }

    private TblrefJobcategorycode(String alias, Table<TblrefJobcategorycodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJobcategorycode(String alias, Table<TblrefJobcategorycodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefJobcategorycodeRecord, Short> getIdentity() {
        return Keys.IDENTITY_TBLREF_JOBCATEGORYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefJobcategorycodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBCATEGORYCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJobcategorycodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJobcategorycodeRecord>>asList(Keys.KEY_TBLREF_JOBCATEGORYCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobcategorycode as(String alias) {
        return new TblrefJobcategorycode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJobcategorycode rename(String name) {
        return new TblrefJobcategorycode(name, null);
    }
}