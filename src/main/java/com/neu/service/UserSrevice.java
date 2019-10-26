package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.neu.entity.User;
import com.neu.entity.UserExample;
import com.neu.entity.UserExample.Criteria;
import com.neu.mapper.UserMapper;

@Service
public class UserSrevice implements UserService {
	@Autowired
	private UserMapper userMapper;
	

	@Override
	public User login(String username, String password) {
		UserExample example = new UserExample();
		example.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		
		if(list.size() == 1) {
			return list.get(0);
		}
		
		return null;
	}


	@Override
	public int updatePasswird(int userId, String password) {
		User user  = new User();
		user.setId(userId);
		user.setPassword(password);
		
		return userMapper.updateByPrimaryKeySelective(user);
		 
	}


	@Override
	public int insert(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int update(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PageInfo<User> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> getByDL(Map<String, Object> params) {
		UserExample example = new UserExample();
		Criteria criteria = example.or().andIsschedulingEqualTo("是");
		if(params.get("deptid")!=null) {
			int deptid=Integer.parseInt((String)params.get("deptid"));
			if(deptid>0) {
			criteria.andDeptidEqualTo(deptid);}
		};
		if(params.get("registLeid")!=null) {
			int registleid=Integer.parseInt((String)params.get("registLeid"));
			if(registleid>0) {
			criteria.andRegistleidEqualTo(registleid);}
		}
		return userMapper.selectByExample(example);
	}
	

}
