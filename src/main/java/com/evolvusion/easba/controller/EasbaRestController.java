package com.evolvusion.easba.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evolvusion.easba.bean.Employee;
import com.evolvusion.easba.service.EasbaSerice;

@RestController
public class EasbaRestController {

	private static final Logger LOGGER = Logger.getLogger(EasbaRestController.class);
	@Autowired
	private EasbaSerice easbaservice;

	// @Qualifier(value="EasbaSerice")
	public void setEasbaservice(EasbaSerice easbaservice) {
		this.easbaservice = easbaservice;
	}

	@PostMapping(value = "/save", consumes = "application/json", produces = "application/json", headers = "content-type=application/x-www-form-urlencoded")
	public @ResponseBody String welCome(@RequestBody Employee employee) {
		LOGGER.debug("save  "+ employee);

		return easbaservice.save(employee);

		// return "saved";
	}
	
	
	@GetMapping(value = "/getbyid", consumes = "application/json", produces = "application/json", headers = "content-type=application/x-www-form-urlencoded")
	public @ResponseBody Employee getByid(@PathVariable("id") String id) {
		LOGGER.debug("getByid  "+ id);

		return easbaservice.getById(id);

		// return "saved";
	}

}
