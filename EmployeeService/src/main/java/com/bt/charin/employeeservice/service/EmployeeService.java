package com.bt.charin.employeeservice.service;

import com.bt.charin.employeeservice.model.EmployeeModel;

public interface EmployeeService{
	EmployeeModel addEmployee(EmployeeModel employeeModel);
	
	EmployeeModel updateDept(EmployeeModel employeeModel);
	
	EmployeeModel getEmployee(String department);
	
	String deleteEmployee(EmployeeModel employeeModel);
}