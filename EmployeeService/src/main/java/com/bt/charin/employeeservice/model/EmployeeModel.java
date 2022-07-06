package com.bt.charin.employeeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KT_EMPLOYEE")
public class EmployeeModel {

	@Id
	@Column(name = "EMP_ID")
	private int empID;

	@Column(name = "DEPARTMENT")
	private int deptID;
	@Column(name = "EMP_NAME")
	private String empName;
	@Column(name = "DOB")
	private int dob;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}
}
