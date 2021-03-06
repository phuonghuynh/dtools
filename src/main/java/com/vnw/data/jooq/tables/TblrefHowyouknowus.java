/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefHowyouknowusRecord;

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
public class TblrefHowyouknowus extends TableImpl<TblrefHowyouknowusRecord> {

    private static final long serialVersionUID = 1134583754;

    /**
     * The reference instance of <code>vnw_core.tblref_howyouknowus</code>
     */
    public static final TblrefHowyouknowus TBLREF_HOWYOUKNOWUS = new TblrefHowyouknowus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefHowyouknowusRecord> getRecordType() {
        return TblrefHowyouknowusRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_howyouknowus.howyouknowusid</code>.
     */
    public final TableField<TblrefHowyouknowusRecord, Byte> HOWYOUKNOWUSID = createField("howyouknowusid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_howyouknowus.languageid</code>.
     */
    public final TableField<TblrefHowyouknowusRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_howyouknowus.howyouknowusname</code>.
     */
    public final TableField<TblrefHowyouknowusRecord, String> HOWYOUKNOWUSNAME = createField("howyouknowusname", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>vnw_core.tblref_howyouknowus.howyouknowusorder</code>.
     */
    public final TableField<TblrefHowyouknowusRecord, Byte> HOWYOUKNOWUSORDER = createField("howyouknowusorder", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>vnw_core.tblref_howyouknowus</code> table reference
     */
    public TblrefHowyouknowus() {
        this("tblref_howyouknowus", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_howyouknowus</code> table reference
     */
    public TblrefHowyouknowus(String alias) {
        this(alias, TBLREF_HOWYOUKNOWUS);
    }

    private TblrefHowyouknowus(String alias, Table<TblrefHowyouknowusRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefHowyouknowus(String alias, Table<TblrefHowyouknowusRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblrefHowyouknowusRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_HOWYOUKNOWUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefHowyouknowusRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefHowyouknowusRecord>>asList(Keys.KEY_TBLREF_HOWYOUKNOWUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefHowyouknowus as(String alias) {
        return new TblrefHowyouknowus(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefHowyouknowus rename(String name) {
        return new TblrefHowyouknowus(name, null);
    }
}
