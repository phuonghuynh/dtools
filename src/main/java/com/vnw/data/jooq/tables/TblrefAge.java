/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefAgeRecord;

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
public class TblrefAge extends TableImpl<TblrefAgeRecord> {

    private static final long serialVersionUID = 632499957;

    /**
     * The reference instance of <code>vnw_core.tblref_age</code>
     */
    public static final TblrefAge TBLREF_AGE = new TblrefAge();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefAgeRecord> getRecordType() {
        return TblrefAgeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_age.ageid</code>.
     */
    public final TableField<TblrefAgeRecord, Byte> AGEID = createField("ageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_age.agevalue</code>.
     */
    public final TableField<TblrefAgeRecord, String> AGEVALUE = createField("agevalue", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_age.ageorder</code>.
     */
    public final TableField<TblrefAgeRecord, Byte> AGEORDER = createField("ageorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_age</code> table reference
     */
    public TblrefAge() {
        this("tblref_age", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_age</code> table reference
     */
    public TblrefAge(String alias) {
        this(alias, TBLREF_AGE);
    }

    private TblrefAge(String alias, Table<TblrefAgeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefAge(String alias, Table<TblrefAgeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefAgeRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TBLREF_AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefAgeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_AGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefAgeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefAgeRecord>>asList(Keys.KEY_TBLREF_AGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefAge as(String alias) {
        return new TblrefAge(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefAge rename(String name) {
        return new TblrefAge(name, null);
    }
}