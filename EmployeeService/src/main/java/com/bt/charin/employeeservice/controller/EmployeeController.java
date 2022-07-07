package com.bt.charin.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bt.charin.employeeservice.model.Department;
import com.bt.charin.employeeservice.model.Employee;
import com.bt.charin.employeeservice.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value = "/updateDepartment/{empID}", method = RequestMethod.POST)
	public String updateEmployeeDepartment(@PathVariable int empID, @RequestBody Department department) {
		return employeeService.updateDept(empID, department);
	}
	
	@RequestMapping(value = "/getEmployeeDetails/{empID}", method = RequestMethod.GET)
	public List<Object> getEmployeeDetails (@PathVariable int empID){
		return employeeService.getEmployeeDetails(empID);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteEmployee(@RequestBody Employee employee) {
		return employeeService.deleteEmployee(employee);
	}
}
