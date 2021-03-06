/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeJobfunctionRecord;

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
public class TblresumeJobfunction extends TableImpl<TblresumeJobfunctionRecord> {

    private static final long serialVersionUID = -1130152750;

    /**
     * The reference instance of <code>vnw_core.tblresume_jobfunction</code>
     */
    public static final TblresumeJobfunction TBLRESUME_JOBFUNCTION = new TblresumeJobfunction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeJobfunctionRecord> getRecordType() {
        return TblresumeJobfunctionRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_jobfunction.resumeid</code>.
     */
    public final TableField<TblresumeJobfunctionRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_jobfunction.jobfunctionid</code>.
     */
    public final TableField<TblresumeJobfunctionRecord, Short> JOBFUNCTIONID = createField("jobfunctionid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>vnw_core.tblresume_jobfunction</code> table reference
     */
    public TblresumeJobfunction() {
        this("tblresume_jobfunction", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_jobfunction</code> table reference
     */
    public TblresumeJobfunction(String alias) {
        this(alias, TBLRESUME_JOBFUNCTION);
    }

    private TblresumeJobfunction(String alias, Table<TblresumeJobfunctionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeJobfunction(String alias, Table<TblresumeJobfunctionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblresumeJobfunctionRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_JOBFUNCTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeJobfunctionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeJobfunctionRecord>>asList(Keys.KEY_TBLRESUME_JOBFUNCTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeJobfunction as(String alias) {
        return new TblresumeJobfunction(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeJobfunction rename(String name) {
        return new TblresumeJobfunction(name, null);
    }
}
