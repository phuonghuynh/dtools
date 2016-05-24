/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobseekerEventregistrationSeminarRecord;

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
public class TbljobseekerEventregistrationSeminar extends TableImpl<TbljobseekerEventregistrationSeminarRecord> {

    private static final long serialVersionUID = -145779309;

    /**
     * The reference instance of <code>vnw_core.tbljobseeker_eventregistration_seminar</code>
     */
    public static final TbljobseekerEventregistrationSeminar TBLJOBSEEKER_EVENTREGISTRATION_SEMINAR = new TbljobseekerEventregistrationSeminar();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobseekerEventregistrationSeminarRecord> getRecordType() {
        return TbljobseekerEventregistrationSeminarRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljobseeker_eventregistration_seminar.id</code>.
     */
    public final TableField<TbljobseekerEventregistrationSeminarRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_eventregistration_seminar.registrationId</code>.
     */
    public final TableField<TbljobseekerEventregistrationSeminarRecord, UInteger> REGISTRATIONID = createField("registrationId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbljobseeker_eventregistration_seminar.seminarId</code>. 1/2/3/4/5/6
     */
    public final TableField<TbljobseekerEventregistrationSeminarRecord, Short> SEMINARID = createField("seminarId", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "1/2/3/4/5/6");

    /**
     * Create a <code>vnw_core.tbljobseeker_eventregistration_seminar</code> table reference
     */
    public TbljobseekerEventregistrationSeminar() {
        this("tbljobseeker_eventregistration_seminar", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljobseeker_eventregistration_seminar</code> table reference
     */
    public TbljobseekerEventregistrationSeminar(String alias) {
        this(alias, TBLJOBSEEKER_EVENTREGISTRATION_SEMINAR);
    }

    private TbljobseekerEventregistrationSeminar(String alias, Table<TbljobseekerEventregistrationSeminarRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobseekerEventregistrationSeminar(String alias, Table<TbljobseekerEventregistrationSeminarRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbljobseekerEventregistrationSeminarRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLJOBSEEKER_EVENTREGISTRATION_SEMINAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbljobseekerEventregistrationSeminarRecord> getPrimaryKey() {
        return Keys.KEY_TBLJOBSEEKER_EVENTREGISTRATION_SEMINAR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbljobseekerEventregistrationSeminarRecord>> getKeys() {
        return Arrays.<UniqueKey<TbljobseekerEventregistrationSeminarRecord>>asList(Keys.KEY_TBLJOBSEEKER_EVENTREGISTRATION_SEMINAR_PRIMARY, Keys.KEY_TBLJOBSEEKER_EVENTREGISTRATION_SEMINAR_EVENTREG_SEMINAR_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbljobseekerEventregistrationSeminar as(String alias) {
        return new TbljobseekerEventregistrationSeminar(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobseekerEventregistrationSeminar rename(String name) {
        return new TbljobseekerEventregistrationSeminar(name, null);
    }
}
