package com.bt.charin.employeeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KT_DEPARTMENT")
public class DepartmentModel {
	
	@Id
	@Column(name = "DEP_ID")
	private int deptID;
	
	@Column(name = "DEP_NAME")
	private String deptName;
}
