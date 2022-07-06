package com.bt.charin.employeeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KT_DEPARTMENT")
public class Department {
	
	@Id
	@Column(name = "DEP_ID")
	private int deptID;
	
	@Column(name = "DEP_NAME")
	private String deptName;

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
