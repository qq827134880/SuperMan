package com.neu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neu.entity.Department;
import com.neu.service.DepartmentService;

@RestController
@RequestMapping("dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("text1")
	@ResponseBody
	public int text1(int id,String name) {
		System.out.println(id+name);
		return 0;
	}
	
	@RequestMapping("text2")
	@ResponseBody
	public int text2(@RequestBody Map<String,Object>map) {
		System.out.println(map);
		return 0;
	}
	
	
	
	@RequestMapping("getAll")
	public List<Department> getAll(){
		 List<Department> list = departmentService.getAll();
		 return list;
	}
	@RequestMapping("getPaged")
	public PageInfo<Department> getPaged(@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="10")int pageSize,
			@RequestBody Map<String, Object> params){
		return departmentService.getPaged(pageNum, pageSize, params);
	}
	
	@RequestMapping("update")
	public int update(Department department) {
		return departmentService.update(department);
	}
	
	@RequestMapping("delete")
	public int delete(int id) {
		return departmentService.delete(id);
	}
	
	
}
