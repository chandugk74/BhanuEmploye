package com.employesevice.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employesevice.springboot.repository.EmployeeRepository;

@Component
public class EmployeeService {

	static HashMap<Integer, EmployeeRepository> employeeIdMap;
	
	public EmployeeService() {
		employeeIdMap = new HashMap<Integer, EmployeeRepository>();
		EmployeeRepository chandruemp = new EmployeeRepository("chandru", 1, "Bangalore");
		EmployeeRepository bhanuemp = new EmployeeRepository("bhanu", 2, "Mysore");
		EmployeeRepository nalinaemp = new EmployeeRepository("nalina", 3, "huliyar");

		employeeIdMap.put(1, chandruemp);
		employeeIdMap.put(2, bhanuemp);
		employeeIdMap.put(3, nalinaemp);
	
	}
	
	public List gelAllemp() {
		List employee = new ArrayList(employeeIdMap.values());
		return employee;
	}
	
	public EmployeeRepository getemploybyId(int id) {
		EmployeeRepository employ = employeeIdMap.get(id);
		return employ;
	}
	public EmployeeRepository getEmploybyName(String empName) {
		EmployeeRepository employ = null;
		for (int i: employeeIdMap.keySet()) {
			if (employeeIdMap.get(i).getEmpName().equals(empName));
			employ = employeeIdMap.get(i);
					}
		return employ;
	}
	

}
