package com.bt.charin.employeeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.charin.employeeservice.model.Department;

public interface DepartmentDAO extends JpaRepository<Department, Integer>  {

}
