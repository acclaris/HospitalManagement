package com.acclaris.hospital.model.department;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;

import com.acclaris.hospital.model.Shift;

public abstract class Department {
	
	@XmlElement
	private String departmentId;
	
	@XmlElement
	private String departmentName;
	
	@XmlElement
	private Set<Shift> departmentShifts;

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

	public Set<Shift> getDepartmentShifts() {
		return departmentShifts;
	}

	public void setDepartmentShifts(Set<Shift> departmentShifts) {
		this.departmentShifts = departmentShifts;
	}


	
	

}
