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

	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public String updateDept(Employee employee) {
		dao.save(employee);
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