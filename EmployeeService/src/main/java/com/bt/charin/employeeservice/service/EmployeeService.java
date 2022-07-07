package com.bt.charin.employeeservice.service;

import java.util.List;

import com.bt.charin.employeeservice.model.Department;
import com.bt.charin.employeeservice.model.Employee;

public interface EmployeeService{
	String addEmployee(Employee employee);
	
	String updateDept(int empID, Department department);
	
	List<Object> getEmployeeDetails(int empID);
	
	String deleteEmployee(Employee employee);
}