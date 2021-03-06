/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefNationalitycodeRecord;

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
public class TblrefNationalitycode extends TableImpl<TblrefNationalitycodeRecord> {

    private static final long serialVersionUID = 1640215541;

    /**
     * The reference instance of <code>vnw_core.tblref_nationalitycode</code>
     */
    public static final TblrefNationalitycode TBLREF_NATIONALITYCODE = new TblrefNationalitycode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefNationalitycodeRecord> getRecordType() {
        return TblrefNationalitycodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_nationalitycode.nationalityid</code>.
     */
    public final TableField<TblrefNationalitycodeRecord, Byte> NATIONALITYID = createField("nationalityid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_nationalitycode.nationalitycode</code>.
     */
    public final TableField<TblrefNationalitycodeRecord, String> NATIONALITYCODE = createField("nationalitycode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_nationalitycode</code> table reference
     */
    public TblrefNationalitycode() {
        this("tblref_nationalitycode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_nationalitycode</code> table reference
     */
    public TblrefNationalitycode(String alias) {
        this(alias, TBLREF_NATIONALITYCODE);
    }

    private TblrefNationalitycode(String alias, Table<TblrefNationalitycodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefNationalitycode(String alias, Table<TblrefNationalitycodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefNationalitycodeRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_NATIONALITYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefNationalitycodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_NATIONALITYCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefNationalitycodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefNationalitycodeRecord>>asList(Keys.KEY_TBLREF_NATIONALITYCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefNationalitycode as(String alias) {
        return new TblrefNationalitycode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefNationalitycode rename(String name) {
        return new TblrefNationalitycode(name, null);
    }
}
