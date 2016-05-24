/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables;


import com.vnw.data.jooq.Keys;
import com.vnw.data.jooq.VnwCore;
import com.vnw.data.jooq.tables.records.TblsysParameterRecord;

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
public class TblsysParameter extends TableImpl<TblsysParameterRecord> {

    private static final long serialVersionUID = 1227009386;

    /**
     * The reference instance of <code>vnw_core.tblsys_parameter</code>
     */
    public static final TblsysParameter TBLSYS_PARAMETER = new TblsysParameter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblsysParameterRecord> getRecordType() {
        return TblsysParameterRecord.class;
    }

    /**
     * The column <code>vnw_core.tblsys_parameter.parcode</code>.
     */
    public final TableField<TblsysParameterRecord, String> PARCODE = createField("parcode", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vnw_core.tblsys_parameter.parname</code>.
     */
    public final TableField<TblsysParameterRecord, String> PARNAME = createField("parname", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>vnw_core.tblsys_parameter.parvalue</code>.
     */
    public final TableField<TblsysParameterRecord, String> PARVALUE = createField("parvalue", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>vnw_core.tblsys_parameter</code> table reference
     */
    public TblsysParameter() {
        this("tblsys_parameter", null);
    }

    /**
     * Create an aliased <code>vnw_core.tblsys_parameter</code> table reference
     */
    public TblsysParameter(String alias) {
        this(alias, TBLSYS_PARAMETER);
    }

    private TblsysParameter(String alias, Table<TblsysParameterRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblsysParameter(String alias, Table<TblsysParameterRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TblsysParameterRecord> getPrimaryKey() {
        return Keys.KEY_TBLSYS_PARAMETER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblsysParameterRecord>> getKeys() {
        return Arrays.<UniqueKey<TblsysParameterRecord>>asList(Keys.KEY_TBLSYS_PARAMETER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblsysParameter as(String alias) {
        return new TblsysParameter(alias, this);
    }

    /**
     * Rename this table
     */
    public TblsysParameter rename(String name) {
        return new TblsysParameter(name, null);
    }
}
