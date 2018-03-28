package com.situ.crm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.SaleChance;
import com.situ.crm.mapper.SaleChanceMapper;
import com.situ.crm.service.ISaleChanceService;

public class SaleChanceServiceImpl implements ISaleChanceService {
	
	@Autowired
	private SaleChanceMapper saleChanceMapper;

	@Override
	public DataGrideResult pageList(Integer page, Integer rows, SaleChance saleChance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerResponse delete(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerResponse insert(SaleChance saleChance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerResponse update(SaleChance saleChance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerResponse<SaleChance> selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerResponse<SaleChance> updateDevResult(Integer id, Integer devResult) {
		// TODO Auto-generated method stub
		return null;
	}

}
