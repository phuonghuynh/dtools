/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbltrackUser_0Record;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
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
public class TbltrackUser_0 extends TableImpl<TbltrackUser_0Record> {

    private static final long serialVersionUID = -831364428;

    /**
     * The reference instance of <code>vnw_core.tbltrack_user_0</code>
     */
    public static final TbltrackUser_0 TBLTRACK_USER_0 = new TbltrackUser_0();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbltrackUser_0Record> getRecordType() {
        return TbltrackUser_0Record.class;
    }

    /**
     * The column <code>vnw_core.tbltrack_user_0.versionId</code>.
     */
    public final TableField<TbltrackUser_0Record, UByte> VERSIONID = createField("versionId", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbltrack_user_0.appId</code>.
     */
    public final TableField<TbltrackUser_0Record, String> APPID = createField("appId", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbltrack_user_0.userid</code>.
     */
    public final TableField<TbltrackUser_0Record, UInteger> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbltrack_user_0.functionId</code>.
     */
    public final TableField<TbltrackUser_0Record, UByte> FUNCTIONID = createField("functionId", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbltrack_user_0.objectId</code>.
     */
    public final TableField<TbltrackUser_0Record, UInteger> OBJECTID = createField("objectId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbltrack_user_0.accessTime</code>.
     */
    public final TableField<TbltrackUser_0Record, Timestamp> ACCESSTIME = createField("accessTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>vnw_core.tbltrack_user_0</code> table reference
     */
    public TbltrackUser_0() {
        this("tbltrack_user_0", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbltrack_user_0</code> table reference
     */
    public TbltrackUser_0(String alias) {
        this(alias, TBLTRACK_USER_0);
    }

    private TbltrackUser_0(String alias, Table<TbltrackUser_0Record> aliased) {
        this(alias, aliased, null);
    }

    private TbltrackUser_0(String alias, Table<TbltrackUser_0Record> aliased, Field<?>[] parameters) {
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
    public TbltrackUser_0 as(String alias) {
        return new TbltrackUser_0(alias, this);
    }

    /**
     * Rename this table
     */
    public TbltrackUser_0 rename(String name) {
        return new TbltrackUser_0(name, null);
    }
}
