package com.situ.crm.entity;

import java.io.Serializable;

public class OrderItem implements Serializable {
    private Integer id;

    private Integer orderId;

    private String productName;

    private Integer productNum;

    private String unit;

    private Float price;

    private Float sum;

    private static final long serialVersionUID = 1L;

    public OrderItem(Integer id, Integer orderId, String productName, Integer productNum, String unit, Float price, Float sum) {
        this.id = id;
        this.orderId = orderId;
        this.productName = productName;
        this.productNum = productNum;
        this.unit = unit;
        this.price = price;
        this.sum = sum;
    }

    public OrderItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", productName=").append(productName);
        sb.append(", productNum=").append(productNum);
        sb.append(", unit=").append(unit);
        sb.append(", price=").append(price);
        sb.append(", sum=").append(sum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}