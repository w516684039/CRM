package com.situ.crm.entity;

import java.io.Serializable;
import java.util.Date;

public class SaleChance implements Serializable {
    private Integer id;

    private String chanceSource;

    private String customerName;

    private Integer successRate;

    private String overview;

    private String linkMan;

    private String linkPhone;

    private String description;

    private String createMan;

    private Date createTime;

    private String assignMan;

    private Date assignTime;

    private Integer status;

    private Integer devResult;

    private static final long serialVersionUID = 1L;

    public SaleChance(Integer id, String chanceSource, String customerName, Integer successRate, String overview, String linkMan, String linkPhone, String description, String createMan, Date createTime, String assignMan, Date assignTime, Integer status, Integer devResult) {
        this.id = id;
        this.chanceSource = chanceSource;
        this.customerName = customerName;
        this.successRate = successRate;
        this.overview = overview;
        this.linkMan = linkMan;
        this.linkPhone = linkPhone;
        this.description = description;
        this.createMan = createMan;
        this.createTime = createTime;
        this.assignMan = assignMan;
        this.assignTime = assignTime;
        this.status = status;
        this.devResult = devResult;
    }

    public SaleChance() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChanceSource() {
        return chanceSource;
    }

    public void setChanceSource(String chanceSource) {
        this.chanceSource = chanceSource == null ? null : chanceSource.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan == null ? null : createMan.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAssignMan() {
        return assignMan;
    }

    public void setAssignMan(String assignMan) {
        this.assignMan = assignMan == null ? null : assignMan.trim();
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDevResult() {
        return devResult;
    }

    public void setDevResult(Integer devResult) {
        this.devResult = devResult;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chanceSource=").append(chanceSource);
        sb.append(", customerName=").append(customerName);
        sb.append(", successRate=").append(successRate);
        sb.append(", overview=").append(overview);
        sb.append(", linkMan=").append(linkMan);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", description=").append(description);
        sb.append(", createMan=").append(createMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", assignMan=").append(assignMan);
        sb.append(", assignTime=").append(assignTime);
        sb.append(", status=").append(status);
        sb.append(", devResult=").append(devResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}