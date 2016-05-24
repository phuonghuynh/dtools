/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblUserloginbyRecord;

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
public class TblUserloginby extends TableImpl<TblUserloginbyRecord> {

    private static final long serialVersionUID = -1294064798;

    /**
     * The reference instance of <code>vnw_core.tbl_userloginby</code>
     */
    public static final TblUserloginby TBL_USERLOGINBY = new TblUserloginby();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblUserloginbyRecord> getRecordType() {
        return TblUserloginbyRecord.class;
    }

    /**
     * The column <code>vnw_core.tbl_userloginby.userid</code>.
     */
    public final TableField<TblUserloginbyRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbl_userloginby.loginbyid</code>.  1: vietnamworks  2: Facebook  3: Google  4: Linkedin 
     */
    public final TableField<TblUserloginbyRecord, Byte> LOGINBYID = createField("loginbyid", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, " 1: vietnamworks  2: Facebook  3: Google  4: Linkedin ");

    /**
     * The column <code>vnw_core.tbl_userloginby.createddate</code>.  First day of login by other account
     */
    public final TableField<TblUserloginbyRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, " First day of login by other account");

    /**
     * The column <code>vnw_core.tbl_userloginby.lastdatelogin</code>.  the last login date by other account
     */
    public final TableField<TblUserloginbyRecord, Timestamp> LASTDATELOGIN = createField("lastdatelogin", org.jooq.impl.SQLDataType.TIMESTAMP, this, " the last login date by other account");

    /**
     * The column <code>vnw_core.tbl_userloginby.isrealuser</code>. 1 : yes 0: no  -- set 1 when this account signed up successfully or updated profile in tblregistrationinfo
     */
    public final TableField<TblUserloginbyRecord, Byte> ISREALUSER = createField("isrealuser", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1 : yes 0: no  -- set 1 when this account signed up successfully or updated profile in tblregistrationinfo");

    /**
     * Create a <code>vnw_core.tbl_userloginby</code> table reference
     */
    public TblUserloginby() {
        this("tbl_userloginby", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbl_userloginby</code> table reference
     */
    public TblUserloginby(String alias) {
        this(alias, TBL_USERLOGINBY);
    }

    private TblUserloginby(String alias, Table<TblUserloginbyRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblUserloginby(String alias, Table<TblUserloginbyRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblUserloginbyRecord> getPrimaryKey() {
        return Keys.KEY_TBL_USERLOGINBY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblUserloginbyRecord>> getKeys() {
        return Arrays.<UniqueKey<TblUserloginbyRecord>>asList(Keys.KEY_TBL_USERLOGINBY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblUserloginby as(String alias) {
        return new TblUserloginby(alias, this);
    }

    /**
     * Rename this table
     */
    public TblUserloginby rename(String name) {
        return new TblUserloginby(name, null);
    }
}
