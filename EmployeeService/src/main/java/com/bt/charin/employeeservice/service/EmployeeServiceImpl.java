package com.bt.charin.employeeservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.charin.employeeservice.dao.EmployeeDAO;
import com.bt.charin.employeeservice.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;

	@Autowired
	DepartmentService department;

	public EmployeeModel addEmployee(EmployeeModel employee) {
		return dao.save(employee);
	}

	@Override
	public String updateDept(EmployeeModel employee) {
		dao.save(employee);
		return "Updated Employee Department";
	}

	@Override
	public EmployeeModel getEmployeeDetails(int empID) {
		Optional<EmployeeModel> empolyee = dao.findByDeptID(empID);
		if(empolyee.isPresent())
			return empolyee.get();
		else
			return null;
	}

	@Override
	public String deleteEmployee(EmployeeModel employee) {
		// TODO Auto-generated method stub
		return null;
	}

}