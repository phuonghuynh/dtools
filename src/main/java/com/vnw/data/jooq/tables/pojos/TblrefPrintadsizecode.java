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
public class TblrefPrintadsizecode implements Serializable {

    private static final long serialVersionUID = 1589155553;

    private Byte   printadsizeid;
    private String printadsizecode;

    public TblrefPrintadsizecode() {}

    public TblrefPrintadsizecode(TblrefPrintadsizecode value) {
        this.printadsizeid = value.printadsizeid;
        this.printadsizecode = value.printadsizecode;
    }

    public TblrefPrintadsizecode(
        Byte   printadsizeid,
        String printadsizecode
    ) {
        this.printadsizeid = printadsizeid;
        this.printadsizecode = printadsizecode;
    }

    public Byte getPrintadsizeid() {
        return this.printadsizeid;
    }

    public void setPrintadsizeid(Byte printadsizeid) {
        this.printadsizeid = printadsizeid;
    }

    public String getPrintadsizecode() {
        return this.printadsizecode;
    }

    public void setPrintadsizecode(String printadsizecode) {
        this.printadsizecode = printadsizecode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TblrefPrintadsizecode (");

        sb.append(printadsizeid);
        sb.append(", ").append(printadsizecode);

        sb.append(")");
        return sb.toString();
    }
}
