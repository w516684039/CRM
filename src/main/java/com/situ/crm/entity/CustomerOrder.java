package com.situ.crm.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerOrder implements Serializable {
    private Integer id;

    private Integer customerId;

    private String orderNo;

    private Date orderDate;

    private String address;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public CustomerOrder(Integer id, Integer customerId, String orderNo, Date orderDate, String address, Integer status) {
        this.id = id;
        this.customerId = customerId;
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.address = address;
        this.status = status;
    }

    public CustomerOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}