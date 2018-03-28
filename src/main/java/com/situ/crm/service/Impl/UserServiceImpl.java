package com.situ.crm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.User;
import com.situ.crm.mapper.UserMapper;
import com.situ.crm.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper usermapper;
	
	/*@Override
	public DataGrideResult<User> pageList() {
		int total = usermapper.pageList().size();
		List<User> rows = usermapper.pageList();
		return new DataGrideResult(total,rows);
	}*/
	@Override
	public DataGrideResult<User> pageList(Integer page, Integer rows, User user) {
		//设置分页
		PageHelper.startPage(page, rows);
		//查询
		List<User> list = usermapper.pageList(user);
		//3.得到满足条件的所有数据的数量，而上面的list是满足这个条件的某一页的数据
		PageInfo pageInfo = new PageInfo<>(list);
		Integer total = (int) pageInfo.getTotal();
		return new DataGrideResult<>(total,list);
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idsArray = ids.split(",");//[1,2,3]
		int count = usermapper.deleteAll(idsArray);
		if (count == idsArray.length) {
			return ServerResponse.createSUCCESS("删除成功");
		}
		return ServerResponse.createERROR("删除失败");
	}

	@Override
	public ServerResponse add(User user) {
		int count = usermapper.insert(user);
		if (count > 0) {
			return ServerResponse.createSUCCESS("添加成功");
		}
		return ServerResponse.createERROR("添加失败");
	}

	@Override
	public ServerResponse update(User user) {
		int count = usermapper.updateByPrimaryKey(user);
		if (count > 0) {
			return ServerResponse.createSUCCESS("更新成功");
		}
		return ServerResponse.createERROR("更新失败");
	}

}
