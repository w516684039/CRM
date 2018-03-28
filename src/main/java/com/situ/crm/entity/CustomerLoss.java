package com.situ.crm.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerLoss implements Serializable {
    private Integer id;

    private String customerNo;

    private String customerName;

    private String customerManager;

    private Date lastOrderTime;

    private Date confirmLossTime;

    private Integer status;

    private String lossReason;

    private static final long serialVersionUID = 1L;

    public CustomerLoss(Integer id, String customerNo, String customerName, String customerManager, Date lastOrderTime, Date confirmLossTime, Integer status, String lossReason) {
        this.id = id;
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.customerManager = customerManager;
        this.lastOrderTime = lastOrderTime;
        this.confirmLossTime = confirmLossTime;
        this.status = status;
        this.lossReason = lossReason;
    }

    public CustomerLoss() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(String customerManager) {
        this.customerManager = customerManager == null ? null : customerManager.trim();
    }

    public Date getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(Date lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public Date getConfirmLossTime() {
        return confirmLossTime;
    }

    public void setConfirmLossTime(Date confirmLossTime) {
        this.confirmLossTime = confirmLossTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLossReason() {
        return lossReason;
    }

    public void setLossReason(String lossReason) {
        this.lossReason = lossReason == null ? null : lossReason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerNo=").append(customerNo);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerManager=").append(customerManager);
        sb.append(", lastOrderTime=").append(lastOrderTime);
        sb.append(", confirmLossTime=").append(confirmLossTime);
        sb.append(", status=").append(status);
        sb.append(", lossReason=").append(lossReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}