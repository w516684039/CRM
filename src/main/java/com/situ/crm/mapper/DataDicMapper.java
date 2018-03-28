package com.situ.crm.mapper;

import java.util.List;

import com.situ.crm.entity.DataDic;

public interface DataDicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDic record);

    int insertSelective(DataDic record);

    DataDic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DataDic record);

    int updateByPrimaryKey(DataDic record);

    List<DataDic> pageList(DataDic dataDic);

	int deleteAll(String[] idsArray);

	List<DataDic> selectDataDicName();
}