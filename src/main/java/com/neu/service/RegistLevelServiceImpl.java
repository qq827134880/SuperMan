package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.neu.entity.RegistLevel;
import com.neu.entity.RegistLevelExample;
import com.neu.mapper.RegistLevelMapper;

@Service
public class RegistLevelServiceImpl implements RegistLevelService {
	@Autowired
	private RegistLevelMapper registLevelMapper;
	
	@Override
	public List<RegistLevel> getAll() {
		RegistLevelExample example = new RegistLevelExample();
		example.or().andDelMarkEqualTo(1);
		example.setOrderByClause("id asc");
		return registLevelMapper.selectByExample(example);
	}

	@Override
	public int insert(RegistLevel entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RegistLevel entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RegistLevel getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<RegistLevel> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
