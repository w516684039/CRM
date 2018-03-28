package com.situ.crm.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;

    private String name;

    private String model;

    private String unit;

    private Float price;

    private Double stock;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Product(Integer id, String name, String model, String unit, Float price, Double stock, String remark) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.unit = unit;
        this.price = price;
        this.stock = stock;
        this.remark = remark;
    }

    public Product() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", model=").append(model);
        sb.append(", unit=").append(unit);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}