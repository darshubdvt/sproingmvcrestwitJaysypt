package com.evolvusion.easba.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.evolvusion.easba.bean.Employee;
import com.evolvusion.easba.controller.EasbaRestController;
import com.evolvusion.easba.repository.EasbaRepository;
@Repository
public class Easbadaoimpl implements EasbaDao{
	
	private static final Logger LOGGER = Logger.getLogger(EasbaRestController.class);
	
	@Autowired
	private EasbaRepository repository;
	
	@Autowired
	private EntityManager entitymanager;
	
	public String save(Employee emp) {
		LOGGER.info("inside save methos statr."+ emp);
		try {
			repository.save(emp);
		}catch (Exception e) {
			LOGGER.error("svae method.."+ e.getMessage());
		}
		return "success";
	}

	@Override
	public Employee getById(String id) {
		// TODO Auto-generated method stub
		LOGGER.info("inside dao save methos getById." + id);
		Employee emp=null;
		try {
			 List<Employee> emplt =  entitymanager.createQuery("from Employee em where em.id:=id")
					.setParameter("id", id).getResultList();
			 if(!emplt.isEmpty()) {
				 emp=emplt.get(0);
			 }
			 
		} catch (Exception e) {
			LOGGER.error("svae method.." + e.getMessage());
		}
		return emp;
	}

}
