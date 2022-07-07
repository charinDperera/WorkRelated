package com.bt.charin.employeeservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.charin.employeeservice.dao.EmployeeDAO;
import com.bt.charin.employeeservice.model.Department;
import com.bt.charin.employeeservice.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;

	@Autowired
	DepartmentService department;

	public String addEmployee(Employee employee) {
		dao.save(employee);
		return "New Employee Added";
	}

	@Override
	public String updateDept(int empID, Department department) {
		Optional<Employee> employee = dao.findById(empID);
		if (employee.isPresent()) {
			Employee emp = employee.get();
			emp.setDeptID(department.getDeptID());
			dao.save(emp);
		}
		return "Updated Employee Department";
	}

	@Override
	public List<Object> getEmployeeDetails(int empID) {
		Optional<Employee> employee = dao.findById(empID);
		if (employee.isPresent()) {
			Employee emp = employee.get();
			Department dept = department.findByID(emp.getDeptID());
			List<Object> list = new ArrayList<>();
			list.add(emp);
			list.add(dept.getDeptName());
			return list;
		} else
			return null;
	}

	@Override
	public String deleteEmployee(Employee employee) {
		dao.delete(employee);
		return "Deleted employee " + employee.getEmpID();
	}

}