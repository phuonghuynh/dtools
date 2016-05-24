/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJobdefinitioncodeRecord;

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
public class TblrefJobdefinitioncode extends TableImpl<TblrefJobdefinitioncodeRecord> {

    private static final long serialVersionUID = -2068371033;

    /**
     * The reference instance of <code>vnw_core.tblref_jobdefinitioncode</code>
     */
    public static final TblrefJobdefinitioncode TBLREF_JOBDEFINITIONCODE = new TblrefJobdefinitioncode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJobdefinitioncodeRecord> getRecordType() {
        return TblrefJobdefinitioncodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_jobdefinitioncode.definition_id</code>.
     */
    public final TableField<TblrefJobdefinitioncodeRecord, Integer> DEFINITION_ID = createField("definition_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_jobdefinitioncode.group_id</code>.
     */
    public final TableField<TblrefJobdefinitioncodeRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblref_jobdefinitioncode.definition_code</code>.
     */
    public final TableField<TblrefJobdefinitioncodeRecord, String> DEFINITION_CODE = createField("definition_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_jobdefinitioncode</code> table reference
     */
    public TblrefJobdefinitioncode() {
        this("tblref_jobdefinitioncode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_jobdefinitioncode</code> table reference
     */
    public TblrefJobdefinitioncode(String alias) {
        this(alias, TBLREF_JOBDEFINITIONCODE);
    }

    private TblrefJobdefinitioncode(String alias, Table<TblrefJobdefinitioncodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJobdefinitioncode(String alias, Table<TblrefJobdefinitioncodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefJobdefinitioncodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLREF_JOBDEFINITIONCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefJobdefinitioncodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBDEFINITIONCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJobdefinitioncodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJobdefinitioncodeRecord>>asList(Keys.KEY_TBLREF_JOBDEFINITIONCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobdefinitioncode as(String alias) {
        return new TblrefJobdefinitioncode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJobdefinitioncode rename(String name) {
        return new TblrefJobdefinitioncode(name, null);
    }
}
