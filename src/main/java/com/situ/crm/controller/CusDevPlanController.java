package com.situ.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.CusDevPlan;
import com.situ.crm.service.ICusDevPlanService;

@Controller
@RequestMapping("/cusDevPlan")
public class CusDevPlanController {
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }
	@Autowired
	private ICusDevPlanService cusDevPlanService;

	@RequestMapping("/index")
	public String index() {
		return "cus_dev_plan_item_index";
	}
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public DataGrideResult selectAll(Integer saleChanceId) {
		return cusDevPlanService.selectAll(saleChanceId);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(Integer id) {
		return cusDevPlanService.delete(id);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CusDevPlan cusDevPlan) {
		return cusDevPlanService.add(cusDevPlan);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CusDevPlan cusDevPlan) {
		return cusDevPlanService.update(cusDevPlan);
	}
	
}