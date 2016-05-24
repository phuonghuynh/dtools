/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbljobAdmindeletejobidRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class TbljobAdmindeletejobid extends TableImpl<TbljobAdmindeletejobidRecord> {

    private static final long serialVersionUID = 908934359;

    /**
     * The reference instance of <code>vnw_core.tbljob_admindeletejobid</code>
     */
    public static final TbljobAdmindeletejobid TBLJOB_ADMINDELETEJOBID = new TbljobAdmindeletejobid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbljobAdmindeletejobidRecord> getRecordType() {
        return TbljobAdmindeletejobidRecord.class;
    }

    /**
     * The column <code>vnw_core.tbljob_admindeletejobid.jobid</code>.
     */
    public final TableField<TbljobAdmindeletejobidRecord, Integer> JOBID = createField("jobid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbljob_admindeletejobid</code> table reference
     */
    public TbljobAdmindeletejobid() {
        this("tbljob_admindeletejobid", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbljob_admindeletejobid</code> table reference
     */
    public TbljobAdmindeletejobid(String alias) {
        this(alias, TBLJOB_ADMINDELETEJOBID);
    }

    private TbljobAdmindeletejobid(String alias, Table<TbljobAdmindeletejobidRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbljobAdmindeletejobid(String alias, Table<TbljobAdmindeletejobidRecord> aliased, Field<?>[] parameters) {
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
    public TbljobAdmindeletejobid as(String alias) {
        return new TbljobAdmindeletejobid(alias, this);
    }

    /**
     * Rename this table
     */
    public TbljobAdmindeletejobid rename(String name) {
        return new TbljobAdmindeletejobid(name, null);
    }
}