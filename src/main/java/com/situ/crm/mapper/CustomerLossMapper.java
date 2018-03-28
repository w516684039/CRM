package com.situ.crm.mapper;

import com.situ.crm.entity.CustomerLoss;

public interface CustomerLossMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLoss record);

    int insertSelective(CustomerLoss record);

    CustomerLoss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLoss record);

    int updateByPrimaryKey(CustomerLoss record);
}