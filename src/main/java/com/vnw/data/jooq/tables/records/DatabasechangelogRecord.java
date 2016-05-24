/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.records;


import com.vnw.data.jooq.tables.Databasechangelog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


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
public class DatabasechangelogRecord extends TableRecordImpl<DatabasechangelogRecord> implements Record11<String, String, String, Timestamp, Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 143920909;

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.AUTHOR</code>.
     */
    public void setAuthor(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.AUTHOR</code>.
     */
    public String getAuthor() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.FILENAME</code>.
     */
    public void setFilename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.FILENAME</code>.
     */
    public String getFilename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    public void setDateexecuted(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    public Timestamp getDateexecuted() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    public void setOrderexecuted(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    public Integer getOrderexecuted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.EXECTYPE</code>.
     */
    public void setExectype(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.EXECTYPE</code>.
     */
    public String getExectype() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.MD5SUM</code>.
     */
    public void setMd5sum(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.MD5SUM</code>.
     */
    public String getMd5sum() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.COMMENTS</code>.
     */
    public void setComments(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.COMMENTS</code>.
     */
    public String getComments() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.TAG</code>.
     */
    public void setTag(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.TAG</code>.
     */
    public String getTag() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vnw_core.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    public void setLiquibase(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>vnw_core.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    public String getLiquibase() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Timestamp, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Timestamp, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Databasechangelog.DATABASECHANGELOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Databasechangelog.DATABASECHANGELOG.AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Databasechangelog.DATABASECHANGELOG.FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Databasechangelog.DATABASECHANGELOG.DATEEXECUTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Databasechangelog.DATABASECHANGELOG.ORDEREXECUTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Databasechangelog.DATABASECHANGELOG.EXECTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Databasechangelog.DATABASECHANGELOG.MD5SUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Databasechangelog.DATABASECHANGELOG.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Databasechangelog.DATABASECHANGELOG.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Databasechangelog.DATABASECHANGELOG.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Databasechangelog.DATABASECHANGELOG.LIQUIBASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDateexecuted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOrderexecuted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getExectype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMd5sum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLiquibase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value2(String value) {
        setAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value3(String value) {
        setFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value4(Timestamp value) {
        setDateexecuted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value5(Integer value) {
        setOrderexecuted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value6(String value) {
        setExectype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value7(String value) {
        setMd5sum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value9(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value10(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord value11(String value) {
        setLiquibase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangelogRecord values(String value1, String value2, String value3, Timestamp value4, Integer value5, String value6, String value7, String value8, String value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatabasechangelogRecord
     */
    public DatabasechangelogRecord() {
        super(Databasechangelog.DATABASECHANGELOG);
    }

    /**
     * Create a detached, initialised DatabasechangelogRecord
     */
    public DatabasechangelogRecord(String id, String author, String filename, Timestamp dateexecuted, Integer orderexecuted, String exectype, String md5sum, String description, String comments, String tag, String liquibase) {
        super(Databasechangelog.DATABASECHANGELOG);

        set(0, id);
        set(1, author);
        set(2, filename);
        set(3, dateexecuted);
        set(4, orderexecuted);
        set(5, exectype);
        set(6, md5sum);
        set(7, description);
        set(8, comments);
        set(9, tag);
        set(10, liquibase);
    }
}
