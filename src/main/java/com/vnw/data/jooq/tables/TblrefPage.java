/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblrefPageRecord;

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
public class TblrefPage extends TableImpl<TblrefPageRecord> {

    private static final long serialVersionUID = 1035753529;

    /**
     * The reference instance of <code>vnw_core.tblref_page</code>
     */
    public static final TblrefPage TBLREF_PAGE = new TblrefPage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblrefPageRecord> getRecordType() {
        return TblrefPageRecord.class;
    }

    /**
     * The column <code>vnw_core.tblref_page.pageid</code>.
     */
    public final TableField<TblrefPageRecord, Integer> PAGEID = createField("pageid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vnw_core.tblref_page.languageid</code>.
     */
    public final TableField<TblrefPageRecord, Byte> LANGUAGEID = createField("languageid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_page.pageurl</code>.
     */
    public final TableField<TblrefPageRecord, String> PAGEURL = createField("pageurl", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_page.pagedesc</code>.
     */
    public final TableField<TblrefPageRecord, String> PAGEDESC = createField("pagedesc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_page.title</code>.
     */
    public final TableField<TblrefPageRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblref_page.footer</code>.
     */
    public final TableField<TblrefPageRecord, String> FOOTER = createField("footer", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblref_page.robots</code>.
     */
    public final TableField<TblrefPageRecord, String> ROBOTS = createField("robots", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("index,all", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tblref_page.keywords</code>.
     */
    public final TableField<TblrefPageRecord, String> KEYWORDS = createField("keywords", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblref_page.description</code>.
     */
    public final TableField<TblrefPageRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>vnw_core.tblref_page.menuid</code>.
     */
    public final TableField<TblrefPageRecord, Integer> MENUID = createField("menuid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblref_page.submenuid</code>.
     */
    public final TableField<TblrefPageRecord, Integer> SUBMENUID = createField("submenuid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vnw_core.tblref_page.usertype</code>.
     */
    public final TableField<TblrefPageRecord, Byte> USERTYPE = createField("usertype", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>vnw_core.tblref_page.criteria</code>. total of criteria
     */
    public final TableField<TblrefPageRecord, Byte> CRITERIA = createField("criteria", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "total of criteria");

    /**
     * The column <code>vnw_core.tblref_page.criteria_detail</code>. example: 1-3-2
     */
    public final TableField<TblrefPageRecord, String> CRITERIA_DETAIL = createField("criteria_detail", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "example: 1-3-2");

    /**
     * Create a <code>vnw_core.tblref_page</code> table reference
     */
    public TblrefPage() {
        this("tblref_page", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblref_page</code> table reference
     */
    public TblrefPage(String alias) {
        this(alias, TBLREF_PAGE);
    }

    private TblrefPage(String alias, Table<TblrefPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblrefPage(String alias, Table<TblrefPageRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblrefPageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLREF_PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblrefPageRecord> getPrimaryKey() {
        return Keys.KEY_TBLREF_PAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblrefPageRecord>> getKeys() {
        return Arrays.<UniqueKey<TblrefPageRecord>>asList(Keys.KEY_TBLREF_PAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblrefPage as(String alias) {
        return new TblrefPage(alias, this);
    }

    /**
     * Rename this table
     */
    public TblrefPage rename(String name) {
        return new TblrefPage(name, null);
    }
}
