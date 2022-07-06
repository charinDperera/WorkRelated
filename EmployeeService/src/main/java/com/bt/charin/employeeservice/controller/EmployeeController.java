package com.bt.charin.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bt.charin.employeeservice.model.EmployeeModel;
import com.bt.charin.employeeservice.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeeModel employee) {
		employeeService.addEmployee(employee);
		return "New employee added...";
	}
	
	@RequestMapping(value = "/updateDepartment", method = RequestMethod.POST)
	public String updateEmployeeDepartment() {
		
		
		return "Employee Department updated";
	}
	
	@RequestMapping(value = "/getEmployeeDetails/{empID}", method = RequestMethod.GET)
	public EmployeeModel getEmployeeDetails (@PathVariable int empID){
		return employeeService.getEmployeeDetails(empID);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteEmployee(@RequestBody EmployeeModel employee) {
		
		return employeeService.deleteEmployee(employee);
	}
}
