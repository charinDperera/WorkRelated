package com.bt.charin.employeeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.charin.employeeservice.model.DepartmentModel;

public interface DepartmentDAO extends JpaRepository<DepartmentModel, Integer>  {
	DepartmentModel findByDeptName(String deptName);
}
