/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblresumeViewedRecord;

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
public class TblresumeViewed extends TableImpl<TblresumeViewedRecord> {

    private static final long serialVersionUID = 1519578391;

    /**
     * The reference instance of <code>vnw_core.tblresume_viewed</code>
     */
    public static final TblresumeViewed TBLRESUME_VIEWED = new TblresumeViewed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblresumeViewedRecord> getRecordType() {
        return TblresumeViewedRecord.class;
    }

    /**
     * The column <code>vnw_core.tblresume_viewed.userid</code>.
     */
    public final TableField<TblresumeViewedRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed.resumeid</code>.
     */
    public final TableField<TblresumeViewedRecord, Integer> RESUMEID = createField("resumeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed.lastviewed</code>.
     */
    public final TableField<TblresumeViewedRecord, Timestamp> LASTVIEWED = createField("lastviewed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed.expireddate</code>.
     */
    public final TableField<TblresumeViewedRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed.noofviewed</code>.
     */
    public final TableField<TblresumeViewedRecord, Integer> NOOFVIEWED = createField("noofviewed", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed.isbought</code>.
     */
    public final TableField<TblresumeViewedRecord, Byte> ISBOUGHT = createField("isbought", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblresume_viewed.isviewedbysearching</code>.
     */
    public final TableField<TblresumeViewedRecord, UByte> ISVIEWEDBYSEARCHING = createField("isviewedbysearching", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * Create a <code>vnw_core.tblresume_viewed</code> table reference
     */
    public TblresumeViewed() {
        this("tblresume_viewed", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblresume_viewed</code> table reference
     */
    public TblresumeViewed(String alias) {
        this(alias, TBLRESUME_VIEWED);
    }

    private TblresumeViewed(String alias, Table<TblresumeViewedRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblresumeViewed(String alias, Table<TblresumeViewedRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblresumeViewedRecord> getPrimaryKey() {
        return Keys.KEY_TBLRESUME_VIEWED_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblresumeViewedRecord>> getKeys() {
        return Arrays.<UniqueKey<TblresumeViewedRecord>>asList(Keys.KEY_TBLRESUME_VIEWED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblresumeViewed as(String alias) {
        return new TblresumeViewed(alias, this);
    }

    /**
     * Rename this table
     */
    public TblresumeViewed rename(String name) {
        return new TblresumeViewed(name, null);
    }
}
