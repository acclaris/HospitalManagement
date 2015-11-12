package com.acclaris.hospital.model.user.manager;

import java.io.Serializable;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.role.UserRole;

public class DoctorManager extends Manager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6896937998095671162L;

	public UserRole getUserRole() {
		return super.getUserRole();
	}

	public void setUserRole(UserRole userRole) {
		super.setUserRole(userRole);
	}

	public Department getDepartment() {
		return super.getDepartment();
	}

	public void setDepartment(Department department) {
		super.setDepartment(department);
	}

	public Branch getBranchDetails() {
		return super.getBranchDetails();
	}

	public void setBranchDetails(Branch branchDetails) {
		super.setBranchDetails(branchDetails);
	}

	@Override
	public String toString() {
		return "DoctorManager [getUserRole()=" + getUserRole() + ", getDepartment()=" + getDepartment()
				+ ", getBranchDetails()=" + getBranchDetails() + "]";
	}

	
	
}
