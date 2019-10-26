package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.neu.entity.SettleCategory;
import com.neu.entity.SettleCategoryExample;
import com.neu.entity.SettleCategoryExample.Criteria;
import com.neu.mapper.SettleCategoryMapper;

@Service
public class SettleCategoryServiceImpl implements SettleCategoryService {
	@Autowired
	private SettleCategoryMapper settleCategoryMapper;

	@Override
	public int insert(SettleCategory entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(SettleCategory entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SettleCategory getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<SettleCategory> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<SettleCategory> getAll() {
		SettleCategoryExample example = new SettleCategoryExample();
		example.or().andDelMarkEqualTo(1);
		
		example.setOrderByClause("SequenceNo asc");
		return settleCategoryMapper.selectByExample(example);
	}

	

}
