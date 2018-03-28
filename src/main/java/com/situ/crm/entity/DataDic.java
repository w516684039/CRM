package com.situ.crm.entity;

import java.io.Serializable;

public class DataDic implements Serializable {
    private Integer id;

    private String dataDicName;

    private String dataDicValue;

    private static final long serialVersionUID = 1L;

    public DataDic(Integer id, String dataDicName, String dataDicValue) {
        this.id = id;
        this.dataDicName = dataDicName;
        this.dataDicValue = dataDicValue;
    }

    public DataDic() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataDicName() {
        return dataDicName;
    }

    public void setDataDicName(String dataDicName) {
        this.dataDicName = dataDicName == null ? null : dataDicName.trim();
    }

    public String getDataDicValue() {
        return dataDicValue;
    }

    public void setDataDicValue(String dataDicValue) {
        this.dataDicValue = dataDicValue == null ? null : dataDicValue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dataDicName=").append(dataDicName);
        sb.append(", dataDicValue=").append(dataDicValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}