/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJoblevelcodeRecord;

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
public class TblrefJoblevelcode extends TableImpl<TblrefJoblevelcodeRecord> {

    private static final long serialVersionUID = 1743260760;

    /**
     * The reference instance of <code>vnw_core.tblref_joblevelcode</code>
     */
    public static final TblrefJoblevelcode TBLREF_JOBLEVELCODE = new TblrefJoblevelcode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJoblevelcodeRecord> getRecordType() {
        return TblrefJoblevelcodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_joblevelcode.joblevelid</code>.
     */
    public final TableField<TblrefJoblevelcodeRecord, Byte> JOBLEVELID = createField("joblevelid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_joblevelcode.joblevelcode</code>.
     */
    public final TableField<TblrefJoblevelcodeRecord, String> JOBLEVELCODE = createField("joblevelcode", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>vnw_core.tblref_joblevelcode</code> table reference
     */
    public TblrefJoblevelcode() {
        this("tblref_joblevelcode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_joblevelcode</code> table reference
     */
    public TblrefJoblevelcode(String alias) {
        this(alias, TBLREF_JOBLEVELCODE);
    }

    private TblrefJoblevelcode(String alias, Table<TblrefJoblevelcodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJoblevelcode(String alias, Table<TblrefJoblevelcodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefJoblevelcodeRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_JOBLEVELCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefJoblevelcodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBLEVELCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJoblevelcodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJoblevelcodeRecord>>asList(Keys.KEY_TBLREF_JOBLEVELCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJoblevelcode as(String alias) {
        return new TblrefJoblevelcode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJoblevelcode rename(String name) {
        return new TblrefJoblevelcode(name, null);
    }
}
