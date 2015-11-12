package com.acclaris.hospital.model.department;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.acclaris.hospital.model.Shift;

public class BillingDepartment extends Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3389130833370988726L;

	public BillingDepartment(){

		this.departmentShifts = new ArrayList<Shift>();

	}

	public String getDepartmentId() {
		return super.getDepartmentId();
	}

	public void setDepartmentId(String departmentId) {
		super.setDepartmentId(departmentId);
	}

	public String getDepartmentName() {
		return super.getDepartmentName();
	}

	public void setDepartmentName(String departmentName) {
		super.setDepartmentName(departmentName);
	}

	public List<Shift> getDepartmentShifts() {
		return this.departmentShifts;
	}

	public void setDepartmentShifts(List<Shift> departmentShifts) {
		this.departmentShifts = departmentShifts;
	}

}
