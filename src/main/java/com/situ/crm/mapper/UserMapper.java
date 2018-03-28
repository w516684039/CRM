package com.situ.crm.mapper;

import java.util.List;

import com.situ.crm.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> pageList(User user);

	int deleteAll(String[] idsArray);
}