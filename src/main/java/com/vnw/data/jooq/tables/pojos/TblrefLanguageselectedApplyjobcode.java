/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class TblrefLanguageselectedApplyjobcode implements Serializable {

    private static final long serialVersionUID = -2107828138;

    private Byte   selectedid;
    private String selectedcode;
    private Short  selectedorder;

    public TblrefLanguageselectedApplyjobcode() {}

    public TblrefLanguageselectedApplyjobcode(TblrefLanguageselectedApplyjobcode value) {
        this.selectedid = value.selectedid;
        this.selectedcode = value.selectedcode;
        this.selectedorder = value.selectedorder;
    }

    public TblrefLanguageselectedApplyjobcode(
        Byte   selectedid,
        String selectedcode,
        Short  selectedorder
    ) {
        this.selectedid = selectedid;
        this.selectedcode = selectedcode;
        this.selectedorder = selectedorder;
    }

    public Byte getSelectedid() {
        return this.selectedid;
    }

    public void setSelectedid(Byte selectedid) {
        this.selectedid = selectedid;
    }

    public String getSelectedcode() {
        return this.selectedcode;
    }

    public void setSelectedcode(String selectedcode) {
        this.selectedcode = selectedcode;
    }

    public Short getSelectedorder() {
        return this.selectedorder;
    }

    public void setSelectedorder(Short selectedorder) {
        this.selectedorder = selectedorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefLanguageselectedApplyjobcode (");

        sb.append(selectedid);
        sb.append(", ").append(selectedcode);
        sb.append(", ").append(selectedorder);

        sb.append(")");
        return sb.toString();
    }
}
