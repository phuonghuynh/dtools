/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefExtrapriorityRecord;

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
public class TblrefExtrapriority extends TableImpl<TblrefExtrapriorityRecord> {

    private static final long serialVersionUID = -179567901;

    /**
     * The reference instance of <code>vnw_core.tblref_extrapriority</code>
     */
    public static final TblrefExtrapriority TBLREF_EXTRAPRIORITY = new TblrefExtrapriority();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefExtrapriorityRecord> getRecordType() {
        return TblrefExtrapriorityRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_extrapriority.extrapriorityid</code>.
     */
    public final TableField<TblrefExtrapriorityRecord, Byte> EXTRAPRIORITYID = createField("extrapriorityid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_extrapriority.languageid</code>.
     */
    public final TableField<TblrefExtrapriorityRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_extrapriority.extrapriorityname</code>.
     */
    public final TableField<TblrefExtrapriorityRecord, String> EXTRAPRIORITYNAME = createField("extrapriorityname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_extrapriority.extrapriorityorder</code>.
     */
    public final TableField<TblrefExtrapriorityRecord, Byte> EXTRAPRIORITYORDER = createField("extrapriorityorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_extrapriority</code> table reference
     */
    public TblrefExtrapriority() {
        this("tblref_extrapriority", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_extrapriority</code> table reference
     */
    public TblrefExtrapriority(String alias) {
        this(alias, TBLREF_EXTRAPRIORITY);
    }

    private TblrefExtrapriority(String alias, Table<TblrefExtrapriorityRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefExtrapriority(String alias, Table<TblrefExtrapriorityRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefExtrapriorityRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_EXTRAPRIORITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefExtrapriorityRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefExtrapriorityRecord>>asList(Keys.KEY_TBLREF_EXTRAPRIORITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtrapriority as(String alias) {
        return new TblrefExtrapriority(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefExtrapriority rename(String name) {
        return new TblrefExtrapriority(name, null);
    }
}
