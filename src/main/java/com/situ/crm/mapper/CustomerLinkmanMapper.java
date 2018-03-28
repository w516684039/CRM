package com.situ.crm.mapper;

import com.situ.crm.entity.CustomerLinkman;

public interface CustomerLinkmanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLinkman record);

    int insertSelective(CustomerLinkman record);

    CustomerLinkman selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLinkman record);

    int updateByPrimaryKey(CustomerLinkman record);
}