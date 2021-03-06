/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefReasondenycodeRecord;

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
public class TblrefReasondenycode extends TableImpl<TblrefReasondenycodeRecord> {

    private static final long serialVersionUID = 1591452682;

    /**
     * The reference instance of <code>vnw_core.tblref_reasondenycode</code>
     */
    public static final TblrefReasondenycode TBLREF_REASONDENYCODE = new TblrefReasondenycode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefReasondenycodeRecord> getRecordType() {
        return TblrefReasondenycodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_reasondenycode.reasonid</code>.
     */
    public final TableField<TblrefReasondenycodeRecord, Integer> REASONID = createField("reasonid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_reasondenycode.reasoncode</code>.
     */
    public final TableField<TblrefReasondenycodeRecord, String> REASONCODE = createField("reasoncode", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tblref_reasondenycode</code> table reference
     */
    public TblrefReasondenycode() {
        this("tblref_reasondenycode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_reasondenycode</code> table reference
     */
    public TblrefReasondenycode(String alias) {
        this(alias, TBLREF_REASONDENYCODE);
    }

    private TblrefReasondenycode(String alias, Table<TblrefReasondenycodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefReasondenycode(String alias, Table<TblrefReasondenycodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefReasondenycodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLREF_REASONDENYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefReasondenycodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_REASONDENYCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefReasondenycodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefReasondenycodeRecord>>asList(Keys.KEY_TBLREF_REASONDENYCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefReasondenycode as(String alias) {
        return new TblrefReasondenycode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefReasondenycode rename(String name) {
        return new TblrefReasondenycode(name, null);
    }
}
