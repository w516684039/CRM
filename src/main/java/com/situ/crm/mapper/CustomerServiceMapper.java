package com.situ.crm.mapper;

import com.situ.crm.entity.CustomerService;

public interface CustomerServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerService record);

    int insertSelective(CustomerService record);

    CustomerService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerService record);

    int updateByPrimaryKey(CustomerService record);
}