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
public class TblrefJobdefinitioncode implements Serializable {

    private static final long serialVersionUID = 1402901951;

    private Integer definitionId;
    private Integer groupId;
    private String  definitionCode;

    public TblrefJobdefinitioncode() {}

    public TblrefJobdefinitioncode(TblrefJobdefinitioncode value) {
        this.definitionId = value.definitionId;
        this.groupId = value.groupId;
        this.definitionCode = value.definitionCode;
    }

    public TblrefJobdefinitioncode(
        Integer definitionId,
        Integer groupId,
        String  definitionCode
    ) {
        this.definitionId = definitionId;
        this.groupId = groupId;
        this.definitionCode = definitionCode;
    }

    public Integer getDefinitionId() {
        return this.definitionId;
    }

    public void setDefinitionId(Integer definitionId) {
        this.definitionId = definitionId;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getDefinitionCode() {
        return this.definitionCode;
    }

    public void setDefinitionCode(String definitionCode) {
        this.definitionCode = definitionCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefJobdefinitioncode (");

        sb.append(definitionId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(definitionCode);

        sb.append(")");
        return sb.toString();
    }
}
