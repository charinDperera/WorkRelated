package com.bt.charin.employeeservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.charin.employeeservice.model.EmployeeModel;

public interface EmployeeDAO extends JpaRepository<EmployeeModel, Integer> {
	Optional<EmployeeModel> findByDeptID(int deptID);
}
