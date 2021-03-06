/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class TblscreenTestJsAnswer implements Serializable {

    private static final long serialVersionUID = 1960673787;

    private UInteger jstestid;
    private UInteger questionid;
    private Byte     optionid;

    public TblscreenTestJsAnswer() {}

    public TblscreenTestJsAnswer(TblscreenTestJsAnswer value) {
        this.jstestid = value.jstestid;
        this.questionid = value.questionid;
        this.optionid = value.optionid;
    }

    public TblscreenTestJsAnswer(
        UInteger jstestid,
        UInteger questionid,
        Byte     optionid
    ) {
        this.jstestid = jstestid;
        this.questionid = questionid;
        this.optionid = optionid;
    }

    public UInteger getJstestid() {
        return this.jstestid;
    }

    public void setJstestid(UInteger jstestid) {
        this.jstestid = jstestid;
    }

    public UInteger getQuestionid() {
        return this.questionid;
    }

    public void setQuestionid(UInteger questionid) {
        this.questionid = questionid;
    }

    public Byte getOptionid() {
        return this.optionid;
    }

    public void setOptionid(Byte optionid) {
        this.optionid = optionid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblscreenTestJsAnswer (");

        sb.append(jstestid);
        sb.append(", ").append(questionid);
        sb.append(", ").append(optionid);

        sb.append(")");
        return sb.toString();
    }
}
