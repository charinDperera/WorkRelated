package com.bt.charin.employeeservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.charin.employeeservice.dao.DepartmentDAO;
import com.bt.charin.employeeservice.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO dao;
	
	public Department findByID(int deptID) {
		Optional<Department> department = dao.findById(deptID);
		if(department.isPresent())
			return department.get();
		else
			return null;
	}

}
