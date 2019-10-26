package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Scheduling;
import com.neu.mapper.SchedulingMapper;
@Service
public class SchedulingServiceImpl implements SchedulingService {

	@Autowired
	private SchedulingMapper schedulingMapper;
	
	@Override
	public int insert(Scheduling entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Scheduling entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Scheduling getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Scheduling> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getDocList(Map<String, Object> params) {
		
		return schedulingMapper.getDocList(params);
	}

}
