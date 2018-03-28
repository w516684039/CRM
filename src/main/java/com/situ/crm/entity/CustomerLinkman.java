package com.situ.crm.entity;

import java.io.Serializable;

public class CustomerLinkman implements Serializable {
    private Integer id;

    private Integer customerId;

    private String linkName;

    private String gender;

    private String position;

    private String officePhone;

    private String phone;

    private static final long serialVersionUID = 1L;

    public CustomerLinkman(Integer id, Integer customerId, String linkName, String gender, String position, String officePhone, String phone) {
        this.id = id;
        this.customerId = customerId;
        this.linkName = linkName;
        this.gender = gender;
        this.position = position;
        this.officePhone = officePhone;
        this.phone = phone;
    }

    public CustomerLinkman() {
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

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", linkName=").append(linkName);
        sb.append(", gender=").append(gender);
        sb.append(", position=").append(position);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}