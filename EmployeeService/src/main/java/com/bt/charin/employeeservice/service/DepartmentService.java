package com.bt.charin.employeeservice.service;

import com.bt.charin.employeeservice.model.DepartmentModel;

public interface DepartmentService {
	
	DepartmentModel findByDeptName(String deptName);
}
