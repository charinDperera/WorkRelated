package com.bt.charin.employeeservice.service;

import com.bt.charin.employeeservice.model.EmployeeModel;

public interface EmployeeService{
	EmployeeModel addEmployee(EmployeeModel employeeModel);
	
	String updateDept(EmployeeModel employeeModel);
	
	EmployeeModel getEmployeeDetails(int empID);
	
	String deleteEmployee(EmployeeModel employeeModel);
}