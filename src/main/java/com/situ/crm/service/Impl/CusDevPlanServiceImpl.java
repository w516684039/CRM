package com.situ.crm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.CusDevPlan;
import com.situ.crm.mapper.CusDevPlanMapper;
import com.situ.crm.service.ICusDevPlanService;
@Service
public class CusDevPlanServiceImpl implements ICusDevPlanService {
	
	@Autowired
	private CusDevPlanMapper cusDevPlanMapper;

	@Override
	public ServerResponse delete(Integer id) {
		int count = cusDevPlanMapper.deleteByPrimaryKey(id);
		if (count > 0) {
			return ServerResponse.createSUCCESS("删除成功");
		}
		return ServerResponse.createERROR("删除失败");
	}

	@Override
	public ServerResponse add(CusDevPlan cusDevPlan) {
		int count = cusDevPlanMapper.insert(cusDevPlan);
		if (count > 0) {
			return ServerResponse.createSUCCESS("添加成功");
		}
		return ServerResponse.createERROR("添加失败");
	}
	
	@Override
	public ServerResponse update(CusDevPlan cusDevPlan) {
		int count = cusDevPlanMapper.updateByPrimaryKey(cusDevPlan);
		if (count > 0) {
			return ServerResponse.createSUCCESS("更新成功");
		}
		return ServerResponse.createERROR("更新失败");
	}

	@Override
	public DataGrideResult selectAll(Integer saleChanceId) {
		List<CusDevPlan> list = cusDevPlanMapper.selectAll(saleChanceId);
		return new DataGrideResult<>(list.size(), list);
	}

}
