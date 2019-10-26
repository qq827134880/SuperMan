package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.ConstantType;
import com.neu.entity.ConstantTypeExample;
import com.neu.entity.Department;
import com.neu.entity.DepartmentExample;
import com.neu.mapper.DepartmentMapper;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> getAll() {
		DepartmentExample example = new DepartmentExample();
		example.or().andDelMarkEqualTo(1);
		
		example.setOrderByClause("id asc");
		return departmentMapper.selectByExample(example);
	}

	@Override
	public int insert(Department entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Department entity) {
		
		return departmentMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int delete(int id) {
		
		return departmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Department getById(int id) {
		
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<Department> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		PageHelper.startPage(pageNum, pageSize);
		DepartmentExample example = new DepartmentExample();
		example.or().andDelMarkEqualTo(1)
			
			.andNameLike("%"+params.get("name")+"%");
		example.or().andDelMarkEqualTo(1).andCodeLike("%"+params.get("code")+"%");
		List<Department> list = departmentMapper.selectByExample(example);
		
		PageInfo<Department> pageInfo = new PageInfo<>(list);
		
		return pageInfo;
	}
	

}
