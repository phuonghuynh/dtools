/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefJobpromotioncodeRecord;

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
import org.jooq.types.UByte;


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
public class TblrefJobpromotioncode extends TableImpl<TblrefJobpromotioncodeRecord> {

    private static final long serialVersionUID = -297395009;

    /**
     * The reference instance of <code>vnw_core.tblref_jobpromotioncode</code>
     */
    public static final TblrefJobpromotioncode TBLREF_JOBPROMOTIONCODE = new TblrefJobpromotioncode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefJobpromotioncodeRecord> getRecordType() {
        return TblrefJobpromotioncodeRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_jobpromotioncode.jobpromotionid</code>.
     */
    public final TableField<TblrefJobpromotioncodeRecord, UByte> JOBPROMOTIONID = createField("jobpromotionid", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_jobpromotioncode.jobpromotionincode</code>.
     */
    public final TableField<TblrefJobpromotioncodeRecord, String> JOBPROMOTIONINCODE = createField("jobpromotionincode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_jobpromotioncode.jobpromotioninbitmask</code>.
     */
    public final TableField<TblrefJobpromotioncodeRecord, UByte> JOBPROMOTIONINBITMASK = createField("jobpromotioninbitmask", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * Create a <code>vnw_core.tblref_jobpromotioncode</code> table reference
     */
    public TblrefJobpromotioncode() {
        this("tblref_jobpromotioncode", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_jobpromotioncode</code> table reference
     */
    public TblrefJobpromotioncode(String alias) {
        this(alias, TBLREF_JOBPROMOTIONCODE);
    }

    private TblrefJobpromotioncode(String alias, Table<TblrefJobpromotioncodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefJobpromotioncode(String alias, Table<TblrefJobpromotioncodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefJobpromotioncodeRecord, UByte> getIdentity() {
        return Keys.IDENTITY_TBLREF_JOBPROMOTIONCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefJobpromotioncodeRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_JOBPROMOTIONCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefJobpromotioncodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefJobpromotioncodeRecord>>asList(Keys.KEY_TBLREF_JOBPROMOTIONCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefJobpromotioncode as(String alias) {
        return new TblrefJobpromotioncode(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefJobpromotioncode rename(String name) {
        return new TblrefJobpromotioncode(name, null);
    }
}
