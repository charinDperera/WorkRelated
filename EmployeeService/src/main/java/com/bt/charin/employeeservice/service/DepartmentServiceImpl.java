package com.bt.charin.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.charin.employeeservice.dao.DepartmentDAO;
import com.bt.charin.employeeservice.model.DepartmentModel;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO dao;
	
	@Override
	public String updateDepartment(DepartmentModel departmentModel) {
		dao.save(departmentModel);
		return "\nUpdated Department Table";
	}
	
	public int getDepartmentID(String depName) {
		//dao.get
		return 1;
	}

}
