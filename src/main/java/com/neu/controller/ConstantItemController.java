package com.neu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neu.entity.ConstantItem;
import com.neu.service.ConstantItemService;

@RestController
@RequestMapping("constantItem")
public class ConstantItemController {
	@Autowired
	private ConstantItemService constantItemService;
	
	@RequestMapping("getGenderList")
	public List<ConstantItem> getGenderList(){
		return constantItemService.getByTypeId(7);
	}
	
	@RequestMapping("getFeeTypeList")
	public List<ConstantItem> getFeeTypeList(){
		return constantItemService.getByTypeId(5);
	}
	
	@RequestMapping("getPaged")
	public PageInfo<ConstantItem> getPaged(
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="10") int pageSize,
			@RequestBody Map<String, Object> params
	){
		return constantItemService.getPaged(pageNum, pageSize, params);
	}
	@RequestMapping("delete")
	public int delete(int id) {
		return constantItemService.delete(id);
	}
	
	@RequestMapping("update")
	public int update(ConstantItem constantItem) {
		return constantItemService.update(constantItem);
	}
	
	@RequestMapping("insert")
	public int insert(ConstantItem constantItem) {
		return constantItemService.insert(constantItem);
	}
	@RequestMapping("getAll")
	public List<ConstantItem> getAll(){
		return constantItemService.getAll();
	}

}
