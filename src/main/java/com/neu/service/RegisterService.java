package com.neu.service;

import java.util.Map;

import com.neu.entity.Register;

public interface RegisterService extends IService<Register> {
	int getRegistNum(Register register);
	Register getByCaseNum(String num);
}
