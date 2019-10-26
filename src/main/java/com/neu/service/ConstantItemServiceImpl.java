package com.neu.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.ConstantItem;
import com.neu.entity.ConstantItemExample;
import com.neu.entity.ConstantItemExample.Criteria;
import com.neu.entity.ConstantType;
import com.neu.mapper.ConstantItemMapper;

@Service
public class ConstantItemServiceImpl implements ConstantItemService {
	@Autowired
	private ConstantItemMapper constantIemMapper;

	@Override
	public int insert(ConstantItem entity) {
		constantIemMapper.insertSelective(entity);
		return entity.getId();
	}

	@Override
	public int update(ConstantItem entity) {
		
		return constantIemMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int delete(int id) {
		return constantIemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public ConstantItem getById(int id) {
		ConstantItemExample example = new ConstantItemExample();
		example.or().andDelMarkEqualTo(1).andIdEqualTo(id);
		
		List<ConstantItem> list = constantIemMapper.selectByExample(example);
		
		if(list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public PageInfo<ConstantItem> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		PageHelper.startPage(pageNum, pageSize);
		ConstantItemExample example = new ConstantItemExample();
		Criteria criteria = example.or()
			.andCodeLike("%"+params.get("code")+"%")
			.andNameLike("%"+params.get("name"));
		
		if(params.get("constantType") != null) {
			ConstantType t = new ConstantType();
			
			t.setId(Integer.parseInt((String)params.get("constantType")));
			criteria.andConstantTypeEqualTo(t);			
		}		
		
		criteria.andDelMarkEqualTo(1);
		
		List<ConstantItem> list = constantIemMapper.selectByExample(example);
		PageInfo<ConstantItem> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public List<ConstantItem> getByTypeId(int typeId) {
		ConstantItemExample example = new ConstantItemExample();
		ConstantType type = new ConstantType();
		type.setId(typeId);
		example.or().andDelMarkEqualTo(1).andConstantTypeEqualTo(type);
		
		return constantIemMapper.selectByExample(example);
	}
	@Override
	public List<ConstantItem> getAll() {
		ConstantItemExample example = new ConstantItemExample();
		return constantIemMapper.selectByExample(example);
	}
}
