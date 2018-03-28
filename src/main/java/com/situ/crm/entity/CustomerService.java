package com.situ.crm.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerService implements Serializable {
    private Integer id;

    private String serviceType;

    private String overview;

    private String customer;

    private String status;

    private String serviceRequest;

    private String createPeople;

    private Date createTime;

    private String assigner;

    private Date assignTime;

    private String serviceDeal;

    private String serviceDealPeople;

    private Date serviceDealTime;

    private String serviceDealResult;

    private String satisfy;

    private static final long serialVersionUID = 1L;

    public CustomerService(Integer id, String serviceType, String overview, String customer, String status, String serviceRequest, String createPeople, Date createTime, String assigner, Date assignTime, String serviceDeal, String serviceDealPeople, Date serviceDealTime, String serviceDealResult, String satisfy) {
        this.id = id;
        this.serviceType = serviceType;
        this.overview = overview;
        this.customer = customer;
        this.status = status;
        this.serviceRequest = serviceRequest;
        this.createPeople = createPeople;
        this.createTime = createTime;
        this.assigner = assigner;
        this.assignTime = assignTime;
        this.serviceDeal = serviceDeal;
        this.serviceDealPeople = serviceDealPeople;
        this.serviceDealTime = serviceDealTime;
        this.serviceDealResult = serviceDealResult;
        this.satisfy = satisfy;
    }

    public CustomerService() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(String serviceRequest) {
        this.serviceRequest = serviceRequest == null ? null : serviceRequest.trim();
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople == null ? null : createPeople.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner == null ? null : assigner.trim();
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getServiceDeal() {
        return serviceDeal;
    }

    public void setServiceDeal(String serviceDeal) {
        this.serviceDeal = serviceDeal == null ? null : serviceDeal.trim();
    }

    public String getServiceDealPeople() {
        return serviceDealPeople;
    }

    public void setServiceDealPeople(String serviceDealPeople) {
        this.serviceDealPeople = serviceDealPeople == null ? null : serviceDealPeople.trim();
    }

    public Date getServiceDealTime() {
        return serviceDealTime;
    }

    public void setServiceDealTime(Date serviceDealTime) {
        this.serviceDealTime = serviceDealTime;
    }

    public String getServiceDealResult() {
        return serviceDealResult;
    }

    public void setServiceDealResult(String serviceDealResult) {
        this.serviceDealResult = serviceDealResult == null ? null : serviceDealResult.trim();
    }

    public String getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy == null ? null : satisfy.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", overview=").append(overview);
        sb.append(", customer=").append(customer);
        sb.append(", status=").append(status);
        sb.append(", serviceRequest=").append(serviceRequest);
        sb.append(", createPeople=").append(createPeople);
        sb.append(", createTime=").append(createTime);
        sb.append(", assigner=").append(assigner);
        sb.append(", assignTime=").append(assignTime);
        sb.append(", serviceDeal=").append(serviceDeal);
        sb.append(", serviceDealPeople=").append(serviceDealPeople);
        sb.append(", serviceDealTime=").append(serviceDealTime);
        sb.append(", serviceDealResult=").append(serviceDealResult);
        sb.append(", satisfy=").append(satisfy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}