/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbltrackAttachmentRecord;

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
public class TbltrackAttachment extends TableImpl<TbltrackAttachmentRecord> {

    private static final long serialVersionUID = -2088598029;

    /**
     * The reference instance of <code>vnw_core.tbltrack_attachment</code>
     */
    public static final TbltrackAttachment TBLTRACK_ATTACHMENT = new TbltrackAttachment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbltrackAttachmentRecord> getRecordType() {
        return TbltrackAttachmentRecord.class;
    }

    /**
     * The column <code>vnw_core.tbltrack_attachment.id</code>. track Id
     */
    public final TableField<TbltrackAttachmentRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "track Id");

    /**
     * The column <code>vnw_core.tbltrack_attachment.userId</code>. userId
     */
    public final TableField<TbltrackAttachmentRecord, UInteger> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "userId");

    /**
     * The column <code>vnw_core.tbltrack_attachment.jobId</code>. jobId
     */
    public final TableField<TbltrackAttachmentRecord, UInteger> JOBID = createField("jobId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "jobId");

    /**
     * The column <code>vnw_core.tbltrack_attachment.flowId</code>. 1 : Flow  1 , 2 : Flow  2  , 3: Flow  3
     */
    public final TableField<TbltrackAttachmentRecord, Byte> FLOWID = createField("flowId", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1 : Flow  1 , 2 : Flow  2  , 3: Flow  3");

    /**
     * The column <code>vnw_core.tbltrack_attachment.eventId</code>. A : Event A - Apply  ; B : Event B -  Continue ; C : Event C-  Cancel ; D: Event D - Finish ; E : Event E -Go Back ; F : Event F - do nothing
     */
    public final TableField<TbltrackAttachmentRecord, String> EVENTID = createField("eventId", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "A : Event A - Apply  ; B : Event B -  Continue ; C : Event C-  Cancel ; D: Event D - Finish ; E : Event E -Go Back ; F : Event F - do nothing");

    /**
     * The column <code>vnw_core.tbltrack_attachment.logDateTime</code>.  tracking time
     */
    public final TableField<TbltrackAttachmentRecord, Timestamp> LOGDATETIME = createField("logDateTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, " tracking time");

    /**
     * The column <code>vnw_core.tbltrack_attachment.clientIP</code>.  client Ip 
     */
    public final TableField<TbltrackAttachmentRecord, String> CLIENTIP = createField("clientIP", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, " client Ip ");

    /**
     * Create a <code>vnw_core.tbltrack_attachment</code> table reference
     */
    public TbltrackAttachment() {
        this("tbltrack_attachment", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbltrack_attachment</code> table reference
     */
    public TbltrackAttachment(String alias) {
        this(alias, TBLTRACK_ATTACHMENT);
    }

    private TbltrackAttachment(String alias, Table<TbltrackAttachmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbltrackAttachment(String alias, Table<TbltrackAttachmentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbltrackAttachmentRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TBLTRACK_ATTACHMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbltrackAttachmentRecord> getPrimaryKey() {
        return Keys.KEY_TBLTRACK_ATTACHMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbltrackAttachmentRecord>> getKeys() {
        return Arrays.<UniqueKey<TbltrackAttachmentRecord>>asList(Keys.KEY_TBLTRACK_ATTACHMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbltrackAttachment as(String alias) {
        return new TbltrackAttachment(alias, this);
    }

    /**
     * Rename this table
     */
    public TbltrackAttachment rename(String name) {
        return new TbltrackAttachment(name, null);
    }
}