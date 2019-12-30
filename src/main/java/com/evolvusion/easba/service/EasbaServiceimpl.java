package com.evolvusion.easba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolvusion.easba.bean.Employee;
import com.evolvusion.easba.dao.EasbaDao;

@Service
public class EasbaServiceimpl implements EasbaSerice{
	
	@Autowired
	private EasbaDao easbadao;
	
	public void setEasbadao(EasbaDao easbadao) {
		this.easbadao = easbadao;
	}
	
	@Transactional
	public String save(Employee emp) {
		return easbadao.save(emp);
	}

	@Override
	public Employee getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
