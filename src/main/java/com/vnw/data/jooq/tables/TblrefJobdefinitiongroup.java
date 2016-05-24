/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJobdefinitiongroupRecord;

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
public class TblrefJobdefinitiongroup extends TableImpl<TblrefJobdefinitiongroupRecord> {

    private static final long serialVersionUID = 95337549;

    /**
     * The reference instance of <code>vnw_core.tblref_jobdefinitiongroup</code>
     */
    public static final TblrefJobdefinitiongroup TBLREF_JOBDEFINITIONGROUP = new TblrefJobdefinitiongroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJobdefinitiongroupRecord> getRecordType() {
        return TblrefJobdefinitiongroupRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_jobdefinitiongroup.group_id</code>.
     */
    public final TableField<TblrefJobdefinitiongroupRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_jobdefinitiongroup.languageid</code>.
     */
    public final TableField<TblrefJobdefinitiongroupRecord, Short> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_jobdefinitiongroup.group_name</code>.
     */
    public final TableField<TblrefJobdefinitiongroupRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_jobdefinitiongroup.group_order</code>.
     */
    public final TableField<TblrefJobdefinitiongroupRecord, Short> GROUP_ORDER = createField("group_order", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_jobdefinitiongroup</code> table reference
     */
    public TblrefJobdefinitiongroup() {
        this("tblref_jobdefinitiongroup", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_jobdefinitiongroup</code> table reference
     */
    public TblrefJobdefinitiongroup(String alias) {
        this(alias, TBLREF_JOBDEFINITIONGROUP);
    }

    private TblrefJobdefinitiongroup(String alias, Table<TblrefJobdefinitiongroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJobdefinitiongroup(String alias, Table<TblrefJobdefinitiongroupRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefJobdefinitiongroupRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBDEFINITIONGROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJobdefinitiongroupRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJobdefinitiongroupRecord>>asList(Keys.KEY_TBLREF_JOBDEFINITIONGROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobdefinitiongroup as(String alias) {
        return new TblrefJobdefinitiongroup(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJobdefinitiongroup rename(String name) {
        return new TblrefJobdefinitiongroup(name, null);
    }
}