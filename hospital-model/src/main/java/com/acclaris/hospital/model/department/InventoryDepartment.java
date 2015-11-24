package com.acclaris.hospital.model.department;

import java.io.Serializable;
import java.util.Set;

import com.acclaris.hospital.model.Shift;

public class InventoryDepartment extends Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5968475644893072446L;

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

	public Set<Shift> getDepartmentShifts() {
		return super.getDepartmentShifts();
	}

	public void setDepartmentShifts(Set<Shift> departmentShifts) {
		super.setDepartmentShifts(departmentShifts);
	}

	@Override
	public String toString() {
		return "InventoryDepartment [getDepartmentId()=" + getDepartmentId() + ", getDepartmentName()="
				+ getDepartmentName() + ", getDepartmentShifts()=" + getDepartmentShifts() + "]";
	}

	

	
	
}
