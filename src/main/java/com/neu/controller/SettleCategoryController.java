package com.neu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.SettleCategory;
import com.neu.service.SettleCategoryService;

@RestController
@RequestMapping("settleCategory")
public class SettleCategoryController {
	@Autowired
	private SettleCategoryService settleCategoryService;
	
	@RequestMapping("getAll")
	public List<SettleCategory> getAll(){
		return settleCategoryService.getAll();
	}
}
