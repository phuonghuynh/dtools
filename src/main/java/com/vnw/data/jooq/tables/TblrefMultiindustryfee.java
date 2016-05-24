/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefMultiindustryfeeRecord;

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
public class TblrefMultiindustryfee extends TableImpl<TblrefMultiindustryfeeRecord> {

    private static final long serialVersionUID = 799086774;

    /**
     * The reference instance of <code>vnw_core.tblref_multiindustryfee</code>
     */
    public static final TblrefMultiindustryfee TBLREF_MULTIINDUSTRYFEE = new TblrefMultiindustryfee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefMultiindustryfeeRecord> getRecordType() {
        return TblrefMultiindustryfeeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_multiindustryfee.optionid</code>.
     */
    public final TableField<TblrefMultiindustryfeeRecord, Byte> OPTIONID = createField("optionid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_multiindustryfee.languageid</code>.
     */
    public final TableField<TblrefMultiindustryfeeRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_multiindustryfee.optionname</code>.
     */
    public final TableField<TblrefMultiindustryfeeRecord, String> OPTIONNAME = createField("optionname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_multiindustryfee.optionfee</code>.
     */
    public final TableField<TblrefMultiindustryfeeRecord, Double> OPTIONFEE = createField("optionfee", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>vnw_core.tblref_multiindustryfee.currencytype</code>.
     */
    public final TableField<TblrefMultiindustryfeeRecord, String> CURRENCYTYPE = createField("currencytype", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.field("USD", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tblref_multiindustryfee.optiondesc</code>.
     */
    public final TableField<TblrefMultiindustryfeeRecord, String> OPTIONDESC = createField("optiondesc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblref_multiindustryfee</code> table reference
     */
    public TblrefMultiindustryfee() {
        this("tblref_multiindustryfee", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_multiindustryfee</code> table reference
     */
    public TblrefMultiindustryfee(String alias) {
        this(alias, TBLREF_MULTIINDUSTRYFEE);
    }

    private TblrefMultiindustryfee(String alias, Table<TblrefMultiindustryfeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefMultiindustryfee(String alias, Table<TblrefMultiindustryfeeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefMultiindustryfeeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_MULTIINDUSTRYFEE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefMultiindustryfeeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefMultiindustryfeeRecord>>asList(Keys.KEY_TBLREF_MULTIINDUSTRYFEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefMultiindustryfee as(String alias) {
        return new TblrefMultiindustryfee(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefMultiindustryfee rename(String name) {
        return new TblrefMultiindustryfee(name, null);
    }
}
