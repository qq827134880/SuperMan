package com.neu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.RegistLevel;
import com.neu.service.RegistLevelService;

@RestController
@RequestMapping("registLevel")
public class RegistLevelController {
	@Autowired
	private RegistLevelService registLevelService;
	
	@RequestMapping("getAll")
	public List<RegistLevel> getAll(){
		return registLevelService.getAll();
	}
}
