/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblcoverletterRecord;

import java.sql.Timestamp;
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
public class Tblcoverletter extends TableImpl<TblcoverletterRecord> {

    private static final long serialVersionUID = -1107172767;

    /**
     * The reference instance of <code>vnw_core.tblcoverletter</code>
     */
    public static final Tblcoverletter TBLCOVERLETTER = new Tblcoverletter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblcoverletterRecord> getRecordType() {
        return TblcoverletterRecord.class;
    }

    /**
     * The column <code>vnw_core.tblcoverletter.coverletterid</code>.
     */
    public final TableField<TblcoverletterRecord, Integer> COVERLETTERID = createField("coverletterid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblcoverletter.userid</code>.
     */
    public final TableField<TblcoverletterRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblcoverletter.coverlettertitle</code>.
     */
    public final TableField<TblcoverletterRecord, String> COVERLETTERTITLE = createField("coverlettertitle", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblcoverletter.coverletter</code>.
     */
    public final TableField<TblcoverletterRecord, String> COVERLETTER = createField("coverletter", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblcoverletter.createddate</code>.
     */
    public final TableField<TblcoverletterRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblcoverletter</code> table reference
     */
    public Tblcoverletter() {
        this("tblcoverletter", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblcoverletter</code> table reference
     */
    public Tblcoverletter(String alias) {
        this(alias, TBLCOVERLETTER);
    }

    private Tblcoverletter(String alias, Table<TblcoverletterRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tblcoverletter(String alias, Table<TblcoverletterRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblcoverletterRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLCOVERLETTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblcoverletterRecord> getPrimaryKey() {
        return Keys.KEY_TBLCOVERLETTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblcoverletterRecord>> getKeys() {
        return Arrays.<UniqueKey<TblcoverletterRecord>>asList(Keys.KEY_TBLCOVERLETTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tblcoverletter as(String alias) {
        return new Tblcoverletter(alias, this);
    }

    /**
     * Rename this table
     */
    public Tblcoverletter rename(String name) {
        return new Tblcoverletter(name, null);
    }
}
