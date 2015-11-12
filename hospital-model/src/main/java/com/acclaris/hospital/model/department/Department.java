package com.acclaris.hospital.model.department;

import java.util.List;

import com.acclaris.hospital.model.Shift;

public abstract class Department {
	
	protected String departmentId;
	
	protected String departmentName;
	
	protected List<Shift> departmentShifts;

	protected String getDepartmentId() {
		return this.departmentId;
	}

	protected void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	protected String getDepartmentName() {
		return this.departmentName;
	}

	protected void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	protected List<Shift> getDepartmentShifts() {
		return this.departmentShifts;
	}

	protected void setDepartmentShifts(List<Shift> departmentShifts) {
		this.departmentShifts = departmentShifts;
	}
	
	

}
