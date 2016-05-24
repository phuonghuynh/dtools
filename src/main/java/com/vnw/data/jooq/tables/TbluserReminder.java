/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TbluserReminderRecord;

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
import org.jooq.impl.DateAsTimestampBinding;
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
public class TbluserReminder extends TableImpl<TbluserReminderRecord> {

    private static final long serialVersionUID = -677346476;

    /**
     * The reference instance of <code>vnw_core.tbluser_reminder</code>
     */
    public static final TbluserReminder TBLUSER_REMINDER = new TbluserReminder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbluserReminderRecord> getRecordType() {
        return TbluserReminderRecord.class;
    }

    /**
     * The column <code>vnw_core.tbluser_reminder.reminder_id</code>.
     */
    public final TableField<TbluserReminderRecord, Integer> REMINDER_ID = createField("reminder_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbluser_reminder.activity</code>.
     */
    public final TableField<TbluserReminderRecord, String> ACTIVITY = createField("activity", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbluser_reminder.description</code>.
     */
    public final TableField<TbluserReminderRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbluser_reminder.data_id</code>.
     */
    public final TableField<TbluserReminderRecord, Integer> DATA_ID = createField("data_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbluser_reminder.data_type</code>.
     */
    public final TableField<TbluserReminderRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>vnw_core.tbluser_reminder.noofdays</code>.
     */
    public final TableField<TbluserReminderRecord, Integer> NOOFDAYS = createField("noofdays", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tbluser_reminder.sendingdate</code>.
     */
    public final TableField<TbluserReminderRecord, Timestamp> SENDINGDATE = createField("sendingdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "", new DateAsTimestampBinding());

    /**
     * The column <code>vnw_core.tbluser_reminder.noofsent</code>.
     */
    public final TableField<TbluserReminderRecord, Integer> NOOFSENT = createField("noofsent", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>vnw_core.tbluser_reminder</code> table reference
     */
    public TbluserReminder() {
        this("tbluser_reminder", null);
    }

    /**
     * Create an aliased <code>vnw_core.tbluser_reminder</code> table reference
     */
    public TbluserReminder(String alias) {
        this(alias, TBLUSER_REMINDER);
    }

    private TbluserReminder(String alias, Table<TbluserReminderRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbluserReminder(String alias, Table<TbluserReminderRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TbluserReminderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLUSER_REMINDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbluserReminderRecord> getPrimaryKey() {
        return Keys.KEY_TBLUSER_REMINDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbluserReminderRecord>> getKeys() {
        return Arrays.<UniqueKey<TbluserReminderRecord>>asList(Keys.KEY_TBLUSER_REMINDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbluserReminder as(String alias) {
        return new TbluserReminder(alias, this);
    }

    /**
     * Rename this table
     */
    public TbluserReminder rename(String name) {
        return new TbluserReminder(name, null);
    }
}