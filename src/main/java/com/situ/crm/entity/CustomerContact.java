package com.situ.crm.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerContact implements Serializable {
    private Integer id;

    private Integer customerId;

    private Date time;

    private String address;

    private String overview;

    private static final long serialVersionUID = 1L;

    public CustomerContact(Integer id, Integer customerId, Date time, String address, String overview) {
        this.id = id;
        this.customerId = customerId;
        this.time = time;
        this.address = address;
        this.overview = overview;
    }

    public CustomerContact() {
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", time=").append(time);
        sb.append(", address=").append(address);
        sb.append(", overview=").append(overview);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}