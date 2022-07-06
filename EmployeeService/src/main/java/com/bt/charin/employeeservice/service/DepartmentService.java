package com.bt.charin.employeeservice.service;

import com.bt.charin.employeeservice.model.DepartmentModel;

public interface DepartmentService {
	String updateDepartment(DepartmentModel departmentModel);

	int getDepartmentID(String depName);
}
