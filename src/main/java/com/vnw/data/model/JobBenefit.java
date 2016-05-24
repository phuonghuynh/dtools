package com.vnw.data.model;

import com.vnw.data.jooq.tables.pojos.TbljobBenefit;
import com.vnw.data.jooq.tables.pojos.TblrefBenefit;

/**
 * Created by phuonghqh on 5/21/16.
 */
public class JobBenefit {

  private TblrefBenefit tblrefBenefit;

  private TbljobBenefit tbljobBenefit;

  public TblrefBenefit getTblrefBenefit() {
    return tblrefBenefit;
  }

  public JobBenefit setTblrefBenefit(TblrefBenefit tblrefBenefit) {
    this.tblrefBenefit = tblrefBenefit;
    return this;
  }

  public TbljobBenefit getTbljobBenefit() {
    return tbljobBenefit;
  }

  public JobBenefit setTbljobBenefit(TbljobBenefit tbljobBenefit) {
    this.tbljobBenefit = tbljobBenefit;
    return this;
  }
}
