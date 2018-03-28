package com.situ.crm.mapper;

import java.util.List;

import com.situ.crm.entity.Product;
import com.situ.crm.entity.User;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

	int deleteAll(String[] idsArray);

	List<Product> pageList(Product product);

	
}