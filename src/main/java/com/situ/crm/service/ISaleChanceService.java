package com.situ.crm.service;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.SaleChance;

public interface ISaleChanceService {

	DataGrideResult pageList(Integer page, Integer rows, SaleChance saleChance);

	ServerResponse delete(String ids);

	ServerResponse insert(SaleChance saleChance);

	ServerResponse update(SaleChance saleChance);

	ServerResponse<SaleChance> selectById(Integer id);

	ServerResponse<SaleChance> updateDevResult(Integer id, Integer devResult);
}
