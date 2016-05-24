/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefServiceattributedescRecord;

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
public class TblrefServiceattributedesc extends TableImpl<TblrefServiceattributedescRecord> {

    private static final long serialVersionUID = -798346771;

    /**
     * The reference instance of <code>vnw_core.tblref_serviceattributedesc</code>
     */
    public static final TblrefServiceattributedesc TBLREF_SERVICEATTRIBUTEDESC = new TblrefServiceattributedesc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefServiceattributedescRecord> getRecordType() {
        return TblrefServiceattributedescRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_serviceattributedesc.attr_id</code>.
     */
    public final TableField<TblrefServiceattributedescRecord, Integer> ATTR_ID = createField("attr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributedesc.languageid</code>.
     */
    public final TableField<TblrefServiceattributedescRecord, Short> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributedesc.attrdesc_name</code>.
     */
    public final TableField<TblrefServiceattributedescRecord, String> ATTRDESC_NAME = createField("attrdesc_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattributedesc.attrdesc_description</code>.
     */
    public final TableField<TblrefServiceattributedescRecord, String> ATTRDESC_DESCRIPTION = createField("attrdesc_description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_serviceattributedesc</code> table reference
     */
    public TblrefServiceattributedesc() {
        this("tblref_serviceattributedesc", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_serviceattributedesc</code> table reference
     */
    public TblrefServiceattributedesc(String alias) {
        this(alias, TBLREF_SERVICEATTRIBUTEDESC);
    }

    private TblrefServiceattributedesc(String alias, Table<TblrefServiceattributedescRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefServiceattributedesc(String alias, Table<TblrefServiceattributedescRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefServiceattributedescRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SERVICEATTRIBUTEDESC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefServiceattributedescRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefServiceattributedescRecord>>asList(Keys.KEY_TBLREF_SERVICEATTRIBUTEDESC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattributedesc as(String alias) {
        return new TblrefServiceattributedesc(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefServiceattributedesc rename(String name) {
        return new TblrefServiceattributedesc(name, null);
    }
}
