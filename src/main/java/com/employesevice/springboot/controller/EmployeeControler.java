package com.employesevice.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employesevice.springboot.repository.EmployeeRepository;
import com.employesevice.springboot.service.EmployeeService;

@RestController
public class EmployeeControler {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getallemployes")
	public List getAllEmp() {
		return employeeService.gelAllemp();
		 
	}
	@GetMapping("/getallemployes/{id}")
	public EmployeeRepository getemploybyId(@PathVariable (value= "id") int id) {
		return employeeService.getemploybyId(id);
	}
	@GetMapping("/getallemployes/getbyname")
	public EmployeeRepository getemploybyName(@RequestParam (value = "name")String empName) {
		return employeeService.getEmploybyName(empName);
	}

}
