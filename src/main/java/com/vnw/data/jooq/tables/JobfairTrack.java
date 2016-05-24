/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.JobfairTrackRecord;

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
public class JobfairTrack extends TableImpl<JobfairTrackRecord> {

    private static final long serialVersionUID = -683527118;

    /**
     * The reference instance of <code>vnw_core.jobfair_track</code>
     */
    public static final JobfairTrack JOBFAIR_TRACK = new JobfairTrack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobfairTrackRecord> getRecordType() {
        return JobfairTrackRecord.class;
    }

    /**
     * The column <code>vnw_core.jobfair_track.track_id</code>.
     */
    public final TableField<JobfairTrackRecord, Integer> TRACK_ID = createField("track_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.jobfair_track.track_name</code>. Function name
     */
    public final TableField<JobfairTrackRecord, String> TRACK_NAME = createField("track_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "Function name");

    /**
     * The column <code>vnw_core.jobfair_track.track_no</code>. total number
     */
    public final TableField<JobfairTrackRecord, Integer> TRACK_NO = createField("track_no", org.jooq.impl.SQLDataType.INTEGER, this, "total number");

    /**
     * The column <code>vnw_core.jobfair_track.track_group</code>. track function
     */
    public final TableField<JobfairTrackRecord, String> TRACK_GROUP = createField("track_group", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "track function");

    /**
     * The column <code>vnw_core.jobfair_track.track_user</code>. 1: js 2:emp
     */
    public final TableField<JobfairTrackRecord, Integer> TRACK_USER = createField("track_user", org.jooq.impl.SQLDataType.INTEGER, this, "1: js 2:emp");

    /**
     * Create a <code>vnw_core.jobfair_track</code> table reference
     */
    public JobfairTrack() {
        this("jobfair_track", null);
    }

    /**
     * Create an aliased <code>vnw_core.jobfair_track</code> table reference
     */
    public JobfairTrack(String alias) {
        this(alias, JOBFAIR_TRACK);
    }

    private JobfairTrack(String alias, Table<JobfairTrackRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobfairTrack(String alias, Table<JobfairTrackRecord> aliased, Field<?>[] parameters) {
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
    public Identity<JobfairTrackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOBFAIR_TRACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobfairTrackRecord> getPrimaryKey() {
        return Keys.KEY_JOBFAIR_TRACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobfairTrackRecord>> getKeys() {
        return Arrays.<UniqueKey<JobfairTrackRecord>>asList(Keys.KEY_JOBFAIR_TRACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobfairTrack as(String alias) {
        return new JobfairTrack(alias, this);
    }

    /**
     * Rename this table
     */
    public JobfairTrack rename(String name) {
        return new JobfairTrack(name, null);
    }
}
