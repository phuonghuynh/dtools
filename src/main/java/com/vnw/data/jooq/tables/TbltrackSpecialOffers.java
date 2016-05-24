/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbltrackSpecialOffersRecord;

import java.sql.Timestamp;
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
public class TbltrackSpecialOffers extends TableImpl<TbltrackSpecialOffersRecord> {

    private static final long serialVersionUID = 1397416367;

    /**
     * The reference instance of <code>vnw_core.tbltrack_special_offers</code>
     */
    public static final TbltrackSpecialOffers TBLTRACK_SPECIAL_OFFERS = new TbltrackSpecialOffers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbltrackSpecialOffersRecord> getRecordType() {
        return TbltrackSpecialOffersRecord.class;
    }

    /**
     * The column <code>vnw_core.tbltrack_special_offers.email</code>.  email of special offers 
     */
    public final TableField<TbltrackSpecialOffersRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, " email of special offers ");

    /**
     * The column <code>vnw_core.tbltrack_special_offers.createdDate</code>.  Submit Date
     */
    public final TableField<TbltrackSpecialOffersRecord, Timestamp> CREATEDDATE = createField("createdDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, " Submit Date");

    /**
     * The column <code>vnw_core.tbltrack_special_offers.clientIp</code>.  client IP 
     */
    public final TableField<TbltrackSpecialOffersRecord, String> CLIENTIP = createField("clientIp", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, " client IP ");

    /**
     * Create a <code>vnw_core.tbltrack_special_offers</code> table reference
     */
    public TbltrackSpecialOffers() {
        this("tbltrack_special_offers", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbltrack_special_offers</code> table reference
     */
    public TbltrackSpecialOffers(String alias) {
        this(alias, TBLTRACK_SPECIAL_OFFERS);
    }

    private TbltrackSpecialOffers(String alias, Table<TbltrackSpecialOffersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbltrackSpecialOffers(String alias, Table<TbltrackSpecialOffersRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TbltrackSpecialOffersRecord> getPrimaryKey() {
        return Keys.KEY_TBLTRACK_SPECIAL_OFFERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbltrackSpecialOffersRecord>> getKeys() {
        return Arrays.<UniqueKey<TbltrackSpecialOffersRecord>>asList(Keys.KEY_TBLTRACK_SPECIAL_OFFERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackSpecialOffers as(String alias) {
        return new TbltrackSpecialOffers(alias, this);
    }

    /**
     * Rename this table
     */
    public TbltrackSpecialOffers rename(String name) {
        return new TbltrackSpecialOffers(name, null);
    }
}
