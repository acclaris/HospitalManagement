package com.acclaris.hospital.model.user;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.marker.User;
import com.acclaris.hospital.model.role.UserRole;

public abstract class HospitalUser implements User {
	
	private UserRole userRole;
	
	private Department department;
	
	private Branch branchDetails;

	protected UserRole getUserRole() {
		return userRole;
	}

	protected void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	protected Department getDepartment() {
		return department;
	}

	protected void setDepartment(Department department) {
		this.department = department;
	}

	protected Branch getBranchDetails() {
		return branchDetails;
	}

	protected void setBranchDetails(Branch branchDetails) {
		this.branchDetails = branchDetails;
	}
	
	

}
