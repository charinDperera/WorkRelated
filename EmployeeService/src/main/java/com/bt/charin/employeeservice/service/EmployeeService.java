package com.bt.charin.employeeservice.service;

import java.util.List;

import com.bt.charin.employeeservice.model.Employee;

public interface EmployeeService{
	Employee addEmployee(Employee employeeModel);
	
	String updateDept(Employee employeeModel);
	
	List<Object> getEmployeeDetails(int empID);
	
	String deleteEmployee(Employee employeeModel);
}