package com.situ.crm.mapper;

import java.util.List;

import com.situ.crm.entity.Customer;
import com.situ.crm.vo.CustomerCountVo;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	List<Customer> pageList();

	List<CustomerCountVo> getCustomerCountAnalysis();
}