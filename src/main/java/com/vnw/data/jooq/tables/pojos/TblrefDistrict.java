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
public class TblrefDistrict implements Serializable {

    private static final long serialVersionUID = 1170556078;

    private Integer districtid;
    private Short   languageid;
    private Short   cityid;
    private String  districtname;
    private Short   districtorder;

    public TblrefDistrict() {}

    public TblrefDistrict(TblrefDistrict value) {
        this.districtid = value.districtid;
        this.languageid = value.languageid;
        this.cityid = value.cityid;
        this.districtname = value.districtname;
        this.districtorder = value.districtorder;
    }

    public TblrefDistrict(
        Integer districtid,
        Short   languageid,
        Short   cityid,
        String  districtname,
        Short   districtorder
    ) {
        this.districtid = districtid;
        this.languageid = languageid;
        this.cityid = cityid;
        this.districtname = districtname;
        this.districtorder = districtorder;
    }

    public Integer getDistrictid() {
        return this.districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public Short getLanguageid() {
        return this.languageid;
    }

    public void setLanguageid(Short languageid) {
        this.languageid = languageid;
    }

    public Short getCityid() {
        return this.cityid;
    }

    public void setCityid(Short cityid) {
        this.cityid = cityid;
    }

    public String getDistrictname() {
        return this.districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public Short getDistrictorder() {
        return this.districtorder;
    }

    public void setDistrictorder(Short districtorder) {
        this.districtorder = districtorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefDistrict (");

        sb.append(districtid);
        sb.append(", ").append(languageid);
        sb.append(", ").append(cityid);
        sb.append(", ").append(districtname);
        sb.append(", ").append(districtorder);

        sb.append(")");
        return sb.toString();
    }
}