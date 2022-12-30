package com.employesevice.springboot.repository;


public class EmployeeRepository {
	String empName;
	int empId;
	String empCapital;
	
	public EmployeeRepository(String empName, int empId, String empCapital) {
		this.empName = empName;
		this.empId = empId;
		this.empCapital=empCapital;
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpCapital() {
		return empCapital;
	}

	public void setEmpCapital(String empCapital) {
		this.empCapital = empCapital;
	}

}
