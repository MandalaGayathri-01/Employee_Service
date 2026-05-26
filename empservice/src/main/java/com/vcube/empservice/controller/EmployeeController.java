package com.vcube.empservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.empservice.response.EmployeeResponse;
import com.vcube.empservice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@GetMapping("/getEmp/{eid}")
	EmployeeResponse getEmpDetails(@PathVariable Integer eid) {
		return empService.getEmpDetails(eid);
	}

}
