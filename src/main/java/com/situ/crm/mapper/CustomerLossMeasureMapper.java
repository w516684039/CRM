package com.situ.crm.mapper;

import com.situ.crm.entity.CustomerLossMeasure;

public interface CustomerLossMeasureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLossMeasure record);

    int insertSelective(CustomerLossMeasure record);

    CustomerLossMeasure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLossMeasure record);

    int updateByPrimaryKey(CustomerLossMeasure record);
}