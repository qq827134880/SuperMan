package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.entity.Scheduling;

public interface SchedulingService extends IService<Scheduling> {
	List<Map<String, Object>> getDocList(Map<String, Object> params);
}
