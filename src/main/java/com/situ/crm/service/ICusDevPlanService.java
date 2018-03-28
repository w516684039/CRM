package com.situ.crm.service;

import java.util.List;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.CusDevPlan;

public interface ICusDevPlanService {
	ServerResponse delete(Integer id);

	ServerResponse add(CusDevPlan cusDevPlan);

	ServerResponse update(CusDevPlan cusDevPlan);

	DataGrideResult selectAll(Integer saleChanceId);

}