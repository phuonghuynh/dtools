/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblsaveSearchRecord;

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
public class TblsaveSearch extends TableImpl<TblsaveSearchRecord> {

    private static final long serialVersionUID = -269556012;

    /**
     * The reference instance of <code>vnw_core.tblsave_search</code>
     */
    public static final TblsaveSearch TBLSAVE_SEARCH = new TblsaveSearch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblsaveSearchRecord> getRecordType() {
        return TblsaveSearchRecord.class;
    }

    /**
     * The column <code>vnw_core.tblsave_search.entryid</code>.
     */
    public final TableField<TblsaveSearchRecord, Integer> ENTRYID = createField("entryid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblsave_search.userid</code>.
     */
    public final TableField<TblsaveSearchRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vnw_core.tblsave_search.descsave</code>.
     */
    public final TableField<TblsaveSearchRecord, String> DESCSAVE = createField("descsave", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsave_search.objectform</code>.
     */
    public final TableField<TblsaveSearchRecord, String> OBJECTFORM = createField("objectform", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblsave_search.sqlstring</code>.
     */
    public final TableField<TblsaveSearchRecord, String> SQLSTRING = createField("sqlstring", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblsave_search.createddate</code>.
     */
    public final TableField<TblsaveSearchRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblsave_search.lastupdated</code>.
     */
    public final TableField<TblsaveSearchRecord, Timestamp> LASTUPDATED = createField("lastupdated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblsave_search</code> table reference
     */
    public TblsaveSearch() {
        this("tblsave_search", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblsave_search</code> table reference
     */
    public TblsaveSearch(String alias) {
        this(alias, TBLSAVE_SEARCH);
    }

    private TblsaveSearch(String alias, Table<TblsaveSearchRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblsaveSearch(String alias, Table<TblsaveSearchRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblsaveSearchRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLSAVE_SEARCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblsaveSearchRecord> getPrimaryKey() {
        return Keys.KEY_TBLSAVE_SEARCH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblsaveSearchRecord>> getKeys() {
        return Arrays.<UniqueKey<TblsaveSearchRecord>>asList(Keys.KEY_TBLSAVE_SEARCH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsaveSearch as(String alias) {
        return new TblsaveSearch(alias, this);
    }

    /**
     * Rename this table
     */
    public TblsaveSearch rename(String name) {
        return new TblsaveSearch(name, null);
    }
}