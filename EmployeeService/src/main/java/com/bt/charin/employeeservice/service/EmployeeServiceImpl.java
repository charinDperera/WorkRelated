package com.bt.charin.employeeservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.charin.employeeservice.dao.EmployeeDAO;
import com.bt.charin.employeeservice.model.DepartmentModel;
import com.bt.charin.employeeservice.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO dao;
	DepartmentServiceImpl department;
	
	public EmployeeModel addEmployee(EmployeeModel employeeModel) {
		return dao.save(employeeModel);
	}

	@Override
	public EmployeeModel updateDept(EmployeeModel employeeModel) {
		
		return dao.save(employeeModel);
		
	}

	@Override
	public EmployeeModel getEmployee(String departmentName) {
		department.getDepartmentID(departmentName);
//		List<EmployeeModel> employees = dao.find;
		return null;
	}

	@Override
	public String deleteEmployee(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return null;
	}
	
}