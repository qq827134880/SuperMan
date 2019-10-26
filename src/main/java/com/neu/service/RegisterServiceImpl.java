package com.neu.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import com.neu.entity.Register;
import com.neu.entity.RegisterExample;
import com.neu.mapper.RegisterMapper;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterMapper registerMapper;
	
	@Override
	public int insert(Register entity) {
		
		return registerMapper.insert(entity);
	}

	@Override
	public int update(Register entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Register getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Register> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRegistNum(Register register) {
		RegisterExample example = new RegisterExample();
		example.or()
			.andVisitDateEqualTo(register.getVisitDate())
			.andNoonEqualTo(register.getNoon())
			.andUserIDEqualTo(register.getUserID())
			.andVisitStateNotEqualTo(4);
		return (int)registerMapper.countByExample(example);
	}

	@Override
	public Register getByCaseNum(String num) {
		RegisterExample example = new RegisterExample();
		example.or().andCaseNumberEqualTo(num);
		 Register register = registerMapper.selectByExample(example).get(0);
		 
		 return register;
	}
	
	

}
