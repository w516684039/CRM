package com.situ.crm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.Customer;
import com.situ.crm.mapper.CustomerMapper;
import com.situ.crm.service.ICustomerService;
import com.situ.crm.vo.CustomerCountVo;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public DataGrideResult<Customer> pageList() {
		int total = customerMapper.pageList().size();
		List<Customer> rows = customerMapper.pageList();
		return new DataGrideResult(total,rows);
	}

	@Override
	public ServerResponse getCustomerCountAnalysis() {
		List<CustomerCountVo> list = customerMapper.getCustomerCountAnalysis();
		for (CustomerCountVo customerCountVo : list) {
			System.out.println(customerCountVo);
		}
		if (list == null || list.size() == 0) {
			return ServerResponse.createERROR("查找失败");
		}
		return ServerResponse.createSUCCESS("查找成功",list);
		
	}

}
