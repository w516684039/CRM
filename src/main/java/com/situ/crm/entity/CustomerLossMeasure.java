package com.situ.crm.entity;

import java.io.Serializable;

public class CustomerLossMeasure implements Serializable {
    private Integer id;

    private Integer lossId;

    private String measure;

    private static final long serialVersionUID = 1L;

    public CustomerLossMeasure(Integer id, Integer lossId, String measure) {
        this.id = id;
        this.lossId = lossId;
        this.measure = measure;
    }

    public CustomerLossMeasure() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLossId() {
        return lossId;
    }

    public void setLossId(Integer lossId) {
        this.lossId = lossId;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lossId=").append(lossId);
        sb.append(", measure=").append(measure);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}