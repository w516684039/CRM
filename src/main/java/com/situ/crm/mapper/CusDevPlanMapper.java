package com.situ.crm.mapper;

import java.util.List;

import com.situ.crm.entity.CusDevPlan;

public interface CusDevPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CusDevPlan record);

    int insertSelective(CusDevPlan record);

    CusDevPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CusDevPlan record);

    int updateByPrimaryKey(CusDevPlan record);

	List<CusDevPlan> selectAll(Integer saleChanceId);
	
	List<CusDevPlan> pageList(CusDevPlan user);

	int deleteAll(String[] idsArray);
}