/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefExtraadverRecord;

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
public class TblrefExtraadver extends TableImpl<TblrefExtraadverRecord> {

    private static final long serialVersionUID = -301852685;

    /**
     * The reference instance of <code>vnw_core.tblref_extraadver</code>
     */
    public static final TblrefExtraadver TBLREF_EXTRAADVER = new TblrefExtraadver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefExtraadverRecord> getRecordType() {
        return TblrefExtraadverRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_extraadver.extraadverid</code>.
     */
    public final TableField<TblrefExtraadverRecord, Byte> EXTRAADVERID = createField("extraadverid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_extraadver.languageid</code>.
     */
    public final TableField<TblrefExtraadverRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_extraadver.extraadvername</code>.
     */
    public final TableField<TblrefExtraadverRecord, String> EXTRAADVERNAME = createField("extraadvername", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_extraadver.extraadverorder</code>.
     */
    public final TableField<TblrefExtraadverRecord, Byte> EXTRAADVERORDER = createField("extraadverorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_extraadver</code> table reference
     */
    public TblrefExtraadver() {
        this("tblref_extraadver", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_extraadver</code> table reference
     */
    public TblrefExtraadver(String alias) {
        this(alias, TBLREF_EXTRAADVER);
    }

    private TblrefExtraadver(String alias, Table<TblrefExtraadverRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefExtraadver(String alias, Table<TblrefExtraadverRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefExtraadverRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_EXTRAADVER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefExtraadverRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefExtraadverRecord>>asList(Keys.KEY_TBLREF_EXTRAADVER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefExtraadver as(String alias) {
        return new TblrefExtraadver(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefExtraadver rename(String name) {
        return new TblrefExtraadver(name, null);
    }
}
