package com.acclaris.hospital.model.user.admin;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.role.UserRole;
import com.acclaris.hospital.model.user.HospitalUser;

public abstract class Admin extends HospitalUser {

	protected UserRole getUserRole() {
		return super.getUserRole();
	}

	protected void setUserRole(UserRole userRole) {
		super.setUserRole(userRole);
	}

	protected Department getDepartment() {
		return super.getDepartment();
	}

	protected void setDepartment(Department department) {
		super.setDepartment(department);
	}

	protected Branch getBranchDetails() {
		return super.getBranchDetails();
	}

	protected void setBranchDetails(Branch branchDetails) {
		super.setBranchDetails(branchDetails);
	}

}
