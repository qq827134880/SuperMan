package com.neu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.ConstantType;
import com.neu.entity.ConstantTypeExample;
import com.neu.mapper.ConstantTypeMapper;

@Service
class ConstantTypeServiceImpl implements ConstantTypeService {
	@Autowired
	private ConstantTypeMapper constantTypeMapper;

	@Override
	public int insert(ConstantType entity) {
		
		return constantTypeMapper.insert(entity);
	}

	@Override
	public int update(ConstantType entity) {
		
		return constantTypeMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int delete(int id) {
		
		return constantTypeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public ConstantType getById(int id) {
		ConstantTypeExample example = new ConstantTypeExample();
		example.or().andIdEqualTo(id).andDelMarkEqualTo(1);
		
		List<ConstantType> list = constantTypeMapper.selectByExample(example);
		
		if(list != null && list.size()==1) {
			return list.get(0);
		}
		
		return null;
	}

	@Override
	public PageInfo<ConstantType> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		
		PageHelper.startPage(pageNum, pageSize);
		ConstantTypeExample example = new ConstantTypeExample();
		example.or().andDelMarkEqualTo(1)
			.andCodeLike("%"+params.get("code")+"%")
			.andNameLike("%"+params.get("name")+"%");
		
		List<ConstantType> list = constantTypeMapper.selectByExample(example);
		
		PageInfo<ConstantType> pageInfo = new PageInfo<>(list);
		
		return pageInfo;
	}
	
	@Override
	public List<ConstantType> getAll() {
		ConstantTypeExample example = new ConstantTypeExample();
		example.or().andDelMarkEqualTo(1);
		return constantTypeMapper.selectByExample(example);
	}
	
	
}
