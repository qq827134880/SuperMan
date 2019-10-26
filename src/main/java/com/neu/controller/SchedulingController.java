package com.neu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neu.service.SchedulingService;

@RestController
@RequestMapping("scheduling")
public class SchedulingController {
	@Autowired
	private SchedulingService schedulingService;
	
	@RequestMapping("getDocList")
	public List<Map<String, Object>> getDocList(@RequestParam Map<String, Object> params){
		return schedulingService.getDocList(params);
	}
}
