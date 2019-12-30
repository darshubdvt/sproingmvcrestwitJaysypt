package com.evolvusion.easba.service;

import org.springframework.stereotype.Service;

import com.evolvusion.easba.bean.Employee;
@Service
public interface EasbaSerice {

	public String save(Employee emp);
	
	public Employee getById(String id);
	
}
