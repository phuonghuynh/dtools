/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblsysRefpermissionRecord;

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
public class TblsysRefpermission extends TableImpl<TblsysRefpermissionRecord> {

    private static final long serialVersionUID = 1522696673;

    /**
     * The reference instance of <code>vnw_core.tblsys_refpermission</code>
     */
    public static final TblsysRefpermission TBLSYS_REFPERMISSION = new TblsysRefpermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblsysRefpermissionRecord> getRecordType() {
        return TblsysRefpermissionRecord.class;
    }

    /**
     * The column <code>vnw_core.tblsys_refpermission.permissionid</code>.
     */
    public final TableField<TblsysRefpermissionRecord, Byte> PERMISSIONID = createField("permissionid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblsys_refpermission.permissionname</code>.
     */
    public final TableField<TblsysRefpermissionRecord, String> PERMISSIONNAME = createField("permissionname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_refpermission.permissionorder</code>.
     */
    public final TableField<TblsysRefpermissionRecord, Byte> PERMISSIONORDER = createField("permissionorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblsys_refpermission</code> table reference
     */
    public TblsysRefpermission() {
        this("tblsys_refpermission", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblsys_refpermission</code> table reference
     */
    public TblsysRefpermission(String alias) {
        this(alias, TBLSYS_REFPERMISSION);
    }

    private TblsysRefpermission(String alias, Table<TblsysRefpermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblsysRefpermission(String alias, Table<TblsysRefpermissionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblsysRefpermissionRecord> getPrimaryKey() {
        return Keys.KEY_TBLSYS_REFPERMISSION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblsysRefpermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblsysRefpermissionRecord>>asList(Keys.KEY_TBLSYS_REFPERMISSION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysRefpermission as(String alias) {
        return new TblsysRefpermission(alias, this);
    }

    /**
     * Rename this table
     */
    public TblsysRefpermission rename(String name) {
        return new TblsysRefpermission(name, null);
    }
}
