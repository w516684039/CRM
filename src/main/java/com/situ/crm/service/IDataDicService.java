package com.situ.crm.service;

import java.util.List;

import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.DataDic;
import com.situ.crm.entity.User;

public interface IDataDicService {
	DataGrideResult<DataDic> pageList(Integer page, Integer rows, DataDic dataDic);

	ServerResponse delete(String ids);

	ServerResponse add(DataDic dataDic);

	ServerResponse update(DataDic dataDic);

	List<DataDic> selectDataDicName();

}
