/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblcustomerNpsRecord;

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
import org.jooq.types.UInteger;


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
public class TblcustomerNps extends TableImpl<TblcustomerNpsRecord> {

    private static final long serialVersionUID = 168337256;

    /**
     * The reference instance of <code>vnw_core.tblcustomer_nps</code>
     */
    public static final TblcustomerNps TBLCUSTOMER_NPS = new TblcustomerNps();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblcustomerNpsRecord> getRecordType() {
        return TblcustomerNpsRecord.class;
    }

    /**
     * The column <code>vnw_core.tblcustomer_nps.entryId</code>.
     */
    public final TableField<TblcustomerNpsRecord, UInteger> ENTRYID = createField("entryId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblcustomer_nps.userId</code>.
     */
    public final TableField<TblcustomerNpsRecord, Integer> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblcustomer_nps.templateType</code>. 1: Simple (Link to survey monkey), 2: Built-in
     */
    public final TableField<TblcustomerNpsRecord, Byte> TEMPLATETYPE = createField("templateType", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1: Simple (Link to survey monkey), 2: Built-in");

    /**
     * The column <code>vnw_core.tblcustomer_nps.sentDate</code>.
     */
    public final TableField<TblcustomerNpsRecord, Timestamp> SENTDATE = createField("sentDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblcustomer_nps.feedbackDate</code>.
     */
    public final TableField<TblcustomerNpsRecord, Timestamp> FEEDBACKDATE = createField("feedbackDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblcustomer_nps.npsScore</code>.
     */
    public final TableField<TblcustomerNpsRecord, Byte> NPSSCORE = createField("npsScore", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblcustomer_nps</code> table reference
     */
    public TblcustomerNps() {
        this("tblcustomer_nps", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblcustomer_nps</code> table reference
     */
    public TblcustomerNps(String alias) {
        this(alias, TBLCUSTOMER_NPS);
    }

    private TblcustomerNps(String alias, Table<TblcustomerNpsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblcustomerNps(String alias, Table<TblcustomerNpsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblcustomerNpsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLCUSTOMER_NPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblcustomerNpsRecord> getPrimaryKey() {
        return Keys.KEY_TBLCUSTOMER_NPS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblcustomerNpsRecord>> getKeys() {
        return Arrays.<UniqueKey<TblcustomerNpsRecord>>asList(Keys.KEY_TBLCUSTOMER_NPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblcustomerNps as(String alias) {
        return new TblcustomerNps(alias, this);
    }

    /**
     * Rename this table
     */
    public TblcustomerNps rename(String name) {
        return new TblcustomerNps(name, null);
    }
}
