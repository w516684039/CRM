package com.situ.crm.service;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.Product;
import com.situ.crm.entity.User;

public interface IProductService {
	DataGrideResult<Product> pageList(Integer page, Integer rows, Product product);

	ServerResponse delete(String ids);

	

	ServerResponse update(Product product);

	ServerResponse add(Product product);

}