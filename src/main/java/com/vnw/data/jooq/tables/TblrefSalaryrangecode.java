/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefSalaryrangecodeRecord;

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
public class TblrefSalaryrangecode extends TableImpl<TblrefSalaryrangecodeRecord> {

    private static final long serialVersionUID = -1357319852;

    /**
     * The reference instance of <code>vnw_core.tblref_salaryrangecode</code>
     */
    public static final TblrefSalaryrangecode TBLREF_SALARYRANGECODE = new TblrefSalaryrangecode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefSalaryrangecodeRecord> getRecordType() {
        return TblrefSalaryrangecodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_salaryrangecode.salaryrangeid</code>.
     */
    public final TableField<TblrefSalaryrangecodeRecord, Byte> SALARYRANGEID = createField("salaryrangeid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_salaryrangecode.salaryrangecode</code>.
     */
    public final TableField<TblrefSalaryrangecodeRecord, String> SALARYRANGECODE = createField("salaryrangecode", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * Create a <code>vnw_core.tblref_salaryrangecode</code> table reference
     */
    public TblrefSalaryrangecode() {
        this("tblref_salaryrangecode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_salaryrangecode</code> table reference
     */
    public TblrefSalaryrangecode(String alias) {
        this(alias, TBLREF_SALARYRANGECODE);
    }

    private TblrefSalaryrangecode(String alias, Table<TblrefSalaryrangecodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefSalaryrangecode(String alias, Table<TblrefSalaryrangecodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefSalaryrangecodeRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_SALARYRANGECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefSalaryrangecodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_SALARYRANGECODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefSalaryrangecodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefSalaryrangecodeRecord>>asList(Keys.KEY_TBLREF_SALARYRANGECODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefSalaryrangecode as(String alias) {
        return new TblrefSalaryrangecode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefSalaryrangecode rename(String name) {
        return new TblrefSalaryrangecode(name, null);
    }
}
