/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblclientServiceCommentRecord;
import com.vnw.data.jooq.tables.records.TblclientServiceRecord;

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
public class TblclientService extends TableImpl<TblclientServiceRecord> {

    private static final long serialVersionUID = 1598821599;

    /**
     * The reference instance of <code>vnw_core.tblclient_service</code>
     */
    public static final TblclientService TBLCLIENT_SERVICE = new TblclientService();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblclientServiceRecord> getRecordType() {
        return TblclientServiceRecord.class;
    }

    /**
     * The column <code>vnw_core.tblclient_service.serviceid</code>.
     */
    public final TableField<TblclientServiceRecord, UInteger> SERVICEID = createField("serviceid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblclient_service.clientid</code>.
     */
    public final TableField<TblclientServiceRecord, UInteger> CLIENTID = createField("clientid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>vnw_core.tblclient_service.position</code>.
     */
    public final TableField<TblclientServiceRecord, String> POSITION = createField("position", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblclient_service.qualified</code>.
     */
    public final TableField<TblclientServiceRecord, UByte> QUALIFIED = createField("qualified", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>vnw_core.tblclient_service.result</code>.
     */
    public final TableField<TblclientServiceRecord, UByte> RESULT = createField("result", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>vnw_core.tblclient_service.comment</code>.
     */
    public final TableField<TblclientServiceRecord, TblclientServiceCommentRecord> COMMENT = createField("comment", com.vnw.data.jooq.tables.TblclientServiceComment.TBLCLIENT_SERVICE_COMMENT.getDataType(), this, "");

    /**
     * The column <code>vnw_core.tblclient_service.feedbackdate</code>.
     */
    public final TableField<TblclientServiceRecord, Timestamp> FEEDBACKDATE = createField("feedbackdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>vnw_core.tblclient_service</code> table reference
     */
    public TblclientService() {
        this("tblclient_service", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblclient_service</code> table reference
     */
    public TblclientService(String alias) {
        this(alias, TBLCLIENT_SERVICE);
    }

    private TblclientService(String alias, Table<TblclientServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblclientService(String alias, Table<TblclientServiceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblclientServiceRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLCLIENT_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblclientServiceRecord> getPrimaryKey() {
        return Keys.KEY_TBLCLIENT_SERVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblclientServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<TblclientServiceRecord>>asList(Keys.KEY_TBLCLIENT_SERVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblclientService as(String alias) {
        return new TblclientService(alias, this);
    }

    /**
     * Rename this table
     */
    public TblclientService rename(String name) {
        return new TblclientService(name, null);
    }
}
