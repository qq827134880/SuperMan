package com.neu.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.ConstantItem;
import com.neu.entity.Department;
import com.neu.entity.Register;
import com.neu.entity.User;
import com.neu.service.ConstantItemService;
import com.neu.service.DepartmentService;
import com.neu.service.RegisterService;

@RestController
@RequestMapping("reg")
public class RegistController {
	@Autowired
	private ConstantItemService constantItemService;
	@Autowired 
	private DepartmentService deptService;
	
	@Autowired
	private RegisterService registerService;

	@RequestMapping("getGenderList")
	public List<ConstantItem> getGenderList(){
		return constantItemService.getByTypeId(7);
	}
	
	@RequestMapping("getRegistNum")
	public int getRegistNum(Register register) {
		return registerService.getRegistNum(register);
	}
	@RequestMapping("insert")
	public int insert(String deptno,Register register,HttpSession session) {
		int deptid = Integer.parseInt(deptno);
		Department byId = deptService.getById(deptid);
		User user = (User)session.getAttribute("user");
		register.setRegistTime(new Date());
		register.setRegisterID(user.getId());
		register.setVisitState(1);
		register.setDept(byId);
		return registerService.insert(register);
	}
	@RequestMapping("ByNum")
	public Register getByNum(@RequestParam String num) {
		return registerService.getByCaseNum(num);
	}
	
}
