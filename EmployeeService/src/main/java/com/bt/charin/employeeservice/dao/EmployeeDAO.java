package com.bt.charin.employeeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.charin.employeeservice.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
