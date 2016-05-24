/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblproductSemiautoRecord;

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
public class TblproductSemiauto extends TableImpl<TblproductSemiautoRecord> {

    private static final long serialVersionUID = -130119004;

    /**
     * The reference instance of <code>vnw_core.tblproduct_semiauto</code>
     */
    public static final TblproductSemiauto TBLPRODUCT_SEMIAUTO = new TblproductSemiauto();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblproductSemiautoRecord> getRecordType() {
        return TblproductSemiautoRecord.class;
    }

    /**
     * The column <code>vnw_core.tblproduct_semiauto.id</code>. Product Status Id
     */
    public final TableField<TblproductSemiautoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Product Status Id");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.vnw_employer_id</code>. Employer Id from sims
     */
    public final TableField<TblproductSemiautoRecord, Integer> VNW_EMPLOYER_ID = createField("vnw_employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Employer Id from sims");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.poproduct_id</code>. PO Product Id
     */
    public final TableField<TblproductSemiautoRecord, String> POPRODUCT_ID = createField("poproduct_id", org.jooq.impl.SQLDataType.VARCHAR.length(11).nullable(false), this, "PO Product Id");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.expireddate</code>. Expired Date for this product status
     */
    public final TableField<TblproductSemiautoRecord, Timestamp> EXPIREDDATE = createField("expireddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "Expired Date for this product status");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.objectid</code>. Object Id
     */
    public final TableField<TblproductSemiautoRecord, Integer> OBJECTID = createField("objectid", org.jooq.impl.SQLDataType.INTEGER, this, "Object Id");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.objectname</code>. Object Name: now it is name of Campaign
     */
    public final TableField<TblproductSemiautoRecord, String> OBJECTNAME = createField("objectname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "Object Name: now it is name of Campaign");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.activeconfirm_status</code>. Number of times the product is actived
     */
    public final TableField<TblproductSemiautoRecord, Integer> ACTIVECONFIRM_STATUS = createField("activeconfirm_status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Number of times the product is actived");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.status</code>. Status of product: 0: inactive - 1: active
     */
    public final TableField<TblproductSemiautoRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "Status of product: 0: inactive - 1: active");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.available</code>. Product activate is available or not: 0: not - 1: avai
     */
    public final TableField<TblproductSemiautoRecord, Byte> AVAILABLE = createField("available", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Product activate is available or not: 0: not - 1: avai");

    /**
     * The column <code>vnw_core.tblproduct_semiauto.servicecode</code>. Code for the product: FM: Focus Mail, ...
     */
    public final TableField<TblproductSemiautoRecord, String> SERVICECODE = createField("servicecode", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "Code for the product: FM: Focus Mail, ...");

    /**
     * Create a <code>vnw_core.tblproduct_semiauto</code> table reference
     */
    public TblproductSemiauto() {
        this("tblproduct_semiauto", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblproduct_semiauto</code> table reference
     */
    public TblproductSemiauto(String alias) {
        this(alias, TBLPRODUCT_SEMIAUTO);
    }

    private TblproductSemiauto(String alias, Table<TblproductSemiautoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblproductSemiauto(String alias, Table<TblproductSemiautoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblproductSemiautoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBLPRODUCT_SEMIAUTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblproductSemiautoRecord> getPrimaryKey() {
        return Keys.KEY_TBLPRODUCT_SEMIAUTO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblproductSemiautoRecord>> getKeys() {
        return Arrays.<UniqueKey<TblproductSemiautoRecord>>asList(Keys.KEY_TBLPRODUCT_SEMIAUTO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblproductSemiauto as(String alias) {
        return new TblproductSemiauto(alias, this);
    }

    /**
     * Rename this table
     */
    public TblproductSemiauto rename(String name) {
        return new TblproductSemiauto(name, null);
    }
}