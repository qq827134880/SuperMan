package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.entity.User;

public interface UserService extends IService<User>{
	User login(String username,String password);
	int updatePasswird(int userId,String password);
	List<User> getByDL(Map<String, Object> params);
}
