package com.situ.crm.entity;

import java.io.Serializable;
import java.util.Date;

public class CusDevPlan implements Serializable {
    private Integer id;

    private Integer saleChanceId;

    private String planItem;

    private Date planDate;

    private String exeAffect;

    private static final long serialVersionUID = 1L;

    public CusDevPlan(Integer id, Integer saleChanceId, String planItem, Date planDate, String exeAffect) {
        this.id = id;
        this.saleChanceId = saleChanceId;
        this.planItem = planItem;
        this.planDate = planDate;
        this.exeAffect = exeAffect;
    }

    public CusDevPlan() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleChanceId() {
        return saleChanceId;
    }

    public void setSaleChanceId(Integer saleChanceId) {
        this.saleChanceId = saleChanceId;
    }

    public String getPlanItem() {
        return planItem;
    }

    public void setPlanItem(String planItem) {
        this.planItem = planItem == null ? null : planItem.trim();
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getExeAffect() {
        return exeAffect;
    }

    public void setExeAffect(String exeAffect) {
        this.exeAffect = exeAffect == null ? null : exeAffect.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", saleChanceId=").append(saleChanceId);
        sb.append(", planItem=").append(planItem);
        sb.append(", planDate=").append(planDate);
        sb.append(", exeAffect=").append(exeAffect);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}