/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.B2cVoteRecord;

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
public class B2cVote extends TableImpl<B2cVoteRecord> {

    private static final long serialVersionUID = 585014154;

    /**
     * The reference instance of <code>vnw_core.b2c_vote</code>
     */
    public static final B2cVote B2C_VOTE = new B2cVote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<B2cVoteRecord> getRecordType() {
        return B2cVoteRecord.class;
    }

    /**
     * The column <code>vnw_core.b2c_vote.answerid</code>.
     */
    public final TableField<B2cVoteRecord, Integer> ANSWERID = createField("answerid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.b2c_vote.userid</code>.
     */
    public final TableField<B2cVoteRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.b2c_vote.guess_number</code>.
     */
    public final TableField<B2cVoteRecord, Integer> GUESS_NUMBER = createField("guess_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>vnw_core.b2c_vote</code> table reference
     */
    public B2cVote() {
        this("b2c_vote", null);
    }

    /**
     * Create an aliased <code>vnw_core.b2c_vote</code> table reference
     */
    public B2cVote(String alias) {
        this(alias, B2C_VOTE);
    }

    private B2cVote(String alias, Table<B2cVoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private B2cVote(String alias, Table<B2cVoteRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<B2cVoteRecord> getPrimaryKey() {
        return Keys.KEY_B2C_VOTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<B2cVoteRecord>> getKeys() {
        return Arrays.<UniqueKey<B2cVoteRecord>>asList(Keys.KEY_B2C_VOTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B2cVote as(String alias) {
        return new B2cVote(alias, this);
    }

    /**
     * Rename this table
     */
    public B2cVote rename(String name) {
        return new B2cVote(name, null);
    }
}