package com.situ.crm.entity;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer id;

    private String num;

    private String name;

    private String region;

    private String managerName;

    private String level;

    private String satisfy;

    private String credit;

    private String address;

    private String postCode;

    private String phone;

    private String fax;

    private String webSite;

    private String licenceNo;

    private String legalPerson;

    private String bankroll;

    private String turnover;

    private String bankName;

    private String bankAccount;

    private String localTaxNo;

    private String nationalTaxNo;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Customer(Integer id, String num, String name, String region, String managerName, String level, String satisfy, String credit, String address, String postCode, String phone, String fax, String webSite, String licenceNo, String legalPerson, String bankroll, String turnover, String bankName, String bankAccount, String localTaxNo, String nationalTaxNo, Integer status) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.region = region;
        this.managerName = managerName;
        this.level = level;
        this.satisfy = satisfy;
        this.credit = credit;
        this.address = address;
        this.postCode = postCode;
        this.phone = phone;
        this.fax = fax;
        this.webSite = webSite;
        this.licenceNo = licenceNo;
        this.legalPerson = legalPerson;
        this.bankroll = bankroll;
        this.turnover = turnover;
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.localTaxNo = localTaxNo;
        this.nationalTaxNo = nationalTaxNo;
        this.status = status;
    }

    public Customer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy == null ? null : satisfy.trim();
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite == null ? null : webSite.trim();
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo == null ? null : licenceNo.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getBankroll() {
        return bankroll;
    }

    public void setBankroll(String bankroll) {
        this.bankroll = bankroll == null ? null : bankroll.trim();
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover == null ? null : turnover.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getLocalTaxNo() {
        return localTaxNo;
    }

    public void setLocalTaxNo(String localTaxNo) {
        this.localTaxNo = localTaxNo == null ? null : localTaxNo.trim();
    }

    public String getNationalTaxNo() {
        return nationalTaxNo;
    }

    public void setNationalTaxNo(String nationalTaxNo) {
        this.nationalTaxNo = nationalTaxNo == null ? null : nationalTaxNo.trim();
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
        sb.append(", num=").append(num);
        sb.append(", name=").append(name);
        sb.append(", region=").append(region);
        sb.append(", managerName=").append(managerName);
        sb.append(", level=").append(level);
        sb.append(", satisfy=").append(satisfy);
        sb.append(", credit=").append(credit);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", webSite=").append(webSite);
        sb.append(", licenceNo=").append(licenceNo);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", bankroll=").append(bankroll);
        sb.append(", turnover=").append(turnover);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", localTaxNo=").append(localTaxNo);
        sb.append(", nationalTaxNo=").append(nationalTaxNo);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}