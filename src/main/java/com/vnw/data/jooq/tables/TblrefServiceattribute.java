/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefServiceattributeRecord;

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
public class TblrefServiceattribute extends TableImpl<TblrefServiceattributeRecord> {

    private static final long serialVersionUID = -392032560;

    /**
     * The reference instance of <code>vnw_core.tblref_serviceattribute</code>
     */
    public static final TblrefServiceattribute TBLREF_SERVICEATTRIBUTE = new TblrefServiceattribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefServiceattributeRecord> getRecordType() {
        return TblrefServiceattributeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_id</code>.
     */
    public final TableField<TblrefServiceattributeRecord, Integer> ATTR_ID = createField("attr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_codetable</code>.
     */
    public final TableField<TblrefServiceattributeRecord, String> ATTR_CODETABLE = createField("attr_codetable", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_desctable</code>.
     */
    public final TableField<TblrefServiceattributeRecord, String> ATTR_DESCTABLE = createField("attr_desctable", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_namefield</code>.
     */
    public final TableField<TblrefServiceattributeRecord, String> ATTR_NAMEFIELD = createField("attr_namefield", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_idfield</code>.
     */
    public final TableField<TblrefServiceattributeRecord, String> ATTR_IDFIELD = createField("attr_idfield", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_langfield</code>.
     */
    public final TableField<TblrefServiceattributeRecord, String> ATTR_LANGFIELD = createField("attr_langfield", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_orderfield</code>.
     */
    public final TableField<TblrefServiceattributeRecord, String> ATTR_ORDERFIELD = createField("attr_orderfield", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>vnw_core.tblref_serviceattribute.attr_issync</code>.
     */
    public final TableField<TblrefServiceattributeRecord, Integer> ATTR_ISSYNC = createField("attr_issync", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.tblref_serviceattribute</code> table reference
     */
    public TblrefServiceattribute() {
        this("tblref_serviceattribute", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_serviceattribute</code> table reference
     */
    public TblrefServiceattribute(String alias) {
        this(alias, TBLREF_SERVICEATTRIBUTE);
    }

    private TblrefServiceattribute(String alias, Table<TblrefServiceattributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefServiceattribute(String alias, Table<TblrefServiceattributeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefServiceattributeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLREF_SERVICEATTRIBUTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefServiceattributeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SERVICEATTRIBUTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefServiceattributeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefServiceattributeRecord>>asList(Keys.KEY_TBLREF_SERVICEATTRIBUTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefServiceattribute as(String alias) {
        return new TblrefServiceattribute(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefServiceattribute rename(String name) {
        return new TblrefServiceattribute(name, null);
    }
}
