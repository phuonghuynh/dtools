/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Reference to table tblref_industry & tblemployer_companyinfo
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblemployerCompanyIndustry implements Serializable {

    private static final long serialVersionUID = 772740871;

    private UInteger entryid;
    private UInteger companyid;
    private UByte    industryid;

    public TblemployerCompanyIndustry() {}

    public TblemployerCompanyIndustry(TblemployerCompanyIndustry value) {
        this.entryid = value.entryid;
        this.companyid = value.companyid;
        this.industryid = value.industryid;
    }

    public TblemployerCompanyIndustry(
        UInteger entryid,
        UInteger companyid,
        UByte    industryid
    ) {
        this.entryid = entryid;
        this.companyid = companyid;
        this.industryid = industryid;
    }

    public UInteger getEntryid() {
        return this.entryid;
    }

    public void setEntryid(UInteger entryid) {
        this.entryid = entryid;
    }

    public UInteger getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(UInteger companyid) {
        this.companyid = companyid;
    }

    public UByte getIndustryid() {
        return this.industryid;
    }

    public void setIndustryid(UByte industryid) {
        this.industryid = industryid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblemployerCompanyIndustry (");

        sb.append(entryid);
        sb.append(", ").append(companyid);
        sb.append(", ").append(industryid);

        sb.append(")");
        return sb.toString();
    }
}
