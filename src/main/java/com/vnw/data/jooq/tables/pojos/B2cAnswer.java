/**
 * This class is generated by jOOQ
 */
package com.vnw.data.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class B2cAnswer implements Serializable {

    private static final long serialVersionUID = -924050520;

    private Integer   answerid;
    private Integer   questionid;
    private Integer   userid;
    private String    answer;
    private Timestamp answerDate;
    private Integer   ispublished;
    private Integer   isapproved;
    private Integer   views;

    public B2cAnswer() {}

    public B2cAnswer(B2cAnswer value) {
        this.answerid = value.answerid;
        this.questionid = value.questionid;
        this.userid = value.userid;
        this.answer = value.answer;
        this.answerDate = value.answerDate;
        this.ispublished = value.ispublished;
        this.isapproved = value.isapproved;
        this.views = value.views;
    }

    public B2cAnswer(
        Integer   answerid,
        Integer   questionid,
        Integer   userid,
        String    answer,
        Timestamp answerDate,
        Integer   ispublished,
        Integer   isapproved,
        Integer   views
    ) {
        this.answerid = answerid;
        this.questionid = questionid;
        this.userid = userid;
        this.answer = answer;
        this.answerDate = answerDate;
        this.ispublished = ispublished;
        this.isapproved = isapproved;
        this.views = views;
    }

    public Integer getAnswerid() {
        return this.answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getQuestionid() {
        return this.questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Timestamp getAnswerDate() {
        return this.answerDate;
    }

    public void setAnswerDate(Timestamp answerDate) {
        this.answerDate = answerDate;
    }

    public Integer getIspublished() {
        return this.ispublished;
    }

    public void setIspublished(Integer ispublished) {
        this.ispublished = ispublished;
    }

    public Integer getIsapproved() {
        return this.isapproved;
    }

    public void setIsapproved(Integer isapproved) {
        this.isapproved = isapproved;
    }

    public Integer getViews() {
        return this.views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("B2cAnswer (");

        sb.append(answerid);
        sb.append(", ").append(questionid);
        sb.append(", ").append(userid);
        sb.append(", ").append(answer);
        sb.append(", ").append(answerDate);
        sb.append(", ").append(ispublished);
        sb.append(", ").append(isapproved);
        sb.append(", ").append(views);

        sb.append(")");
        return sb.toString();
    }
}
