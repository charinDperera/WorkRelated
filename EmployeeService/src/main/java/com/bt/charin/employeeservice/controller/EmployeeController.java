package com.bt.charin.employeeservice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.charin.employeeservice.model.EmployeeModel;

@RestController
public class EmployeeController {

	@RequestMapping("/add")
	public EmployeeModel addEmployee(@RequestBody EmployeeModel employee) {
		return null;
	}
}
