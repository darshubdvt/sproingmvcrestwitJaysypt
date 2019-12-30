package com.evolvusion.easba.dao;


import org.springframework.stereotype.Repository;

import com.evolvusion.easba.bean.Employee;

@Repository
public interface EasbaDao {

	public String save(Employee emp);
	
	public Employee getById(String id);
}
