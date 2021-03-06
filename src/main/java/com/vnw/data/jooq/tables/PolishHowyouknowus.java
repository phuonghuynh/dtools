/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.PolishHowyouknowusRecord;

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
public class PolishHowyouknowus extends TableImpl<PolishHowyouknowusRecord> {

    private static final long serialVersionUID = 1091396830;

    /**
     * The reference instance of <code>vnw_core.polish_howyouknowus</code>
     */
    public static final PolishHowyouknowus POLISH_HOWYOUKNOWUS = new PolishHowyouknowus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PolishHowyouknowusRecord> getRecordType() {
        return PolishHowyouknowusRecord.class;
    }

    /**
     * The column <code>vnw_core.polish_howyouknowus.item_id</code>.
     */
    public final TableField<PolishHowyouknowusRecord, Integer> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.polish_howyouknowus.howyouknowus_name</code>.
     */
    public final TableField<PolishHowyouknowusRecord, String> HOWYOUKNOWUS_NAME = createField("howyouknowus_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.polish_howyouknowus.howyouknowus_order</code>.
     */
    public final TableField<PolishHowyouknowusRecord, Integer> HOWYOUKNOWUS_ORDER = createField("howyouknowus_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>vnw_core.polish_howyouknowus</code> table reference
     */
    public PolishHowyouknowus() {
        this("polish_howyouknowus", null);
    }

    /**
     * Create an aliased <code>vnw_core.polish_howyouknowus</code> table reference
     */
    public PolishHowyouknowus(String alias) {
        this(alias, POLISH_HOWYOUKNOWUS);
    }

    private PolishHowyouknowus(String alias, Table<PolishHowyouknowusRecord> aliased) {
        this(alias, aliased, null);
    }

    private PolishHowyouknowus(String alias, Table<PolishHowyouknowusRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PolishHowyouknowusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_POLISH_HOWYOUKNOWUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PolishHowyouknowusRecord> getPrimaryKey() {
        return Keys.KEY_POLISH_HOWYOUKNOWUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PolishHowyouknowusRecord>> getKeys() {
        return Arrays.<UniqueKey<PolishHowyouknowusRecord>>asList(Keys.KEY_POLISH_HOWYOUKNOWUS_PRIMARY, Keys.KEY_POLISH_HOWYOUKNOWUS_IDX_POLISH_HOWYOUKNOWUS1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolishHowyouknowus as(String alias) {
        return new PolishHowyouknowus(alias, this);
    }

    /**
     * Rename this table
     */
    public PolishHowyouknowus rename(String name) {
        return new PolishHowyouknowus(name, null);
    }
}
