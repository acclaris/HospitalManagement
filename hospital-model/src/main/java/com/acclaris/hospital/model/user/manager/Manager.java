package com.acclaris.hospital.model.user.manager;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.UserStatus;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.role.UserRole;
import com.acclaris.hospital.model.user.HospitalUser;

public abstract class Manager extends HospitalUser {

	protected String getUserId() {
		return super.getUserId();
	}

	protected void setUserId(String userId) {
		super.setUserId(userId);

	}

	protected String getPassword() {
		return super.getPassword();
	}

	protected void setPassword(String password) {
		super.setPassword(password);
	}

	protected String getFirstName() {
		return super.getFirstName();
	}

	protected void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}

	protected String getLastName() {
		return super.getLastName();
	}

	protected void setLastName(String lastName) {
		super.setLastName(lastName);
	}

	protected String getGender() {
		return super.getGender();
	}

	protected void setGender(String gender) {
		super.setGender(gender);
	}

	protected String getEmailId() {
		return super.getEmailId();
	}

	protected void setEmailId(String emailId) {
		super.setEmailId(emailId);
	}

	protected String getAddress() {
		return super.getAddress();
	}

	protected void setAddress(String address) {
		super.setAddress(address);
	}

	protected UserStatus getUserStatus() {
		return super.getUserStatus();
	}

	protected void setUserStatus(UserStatus userStatus) {
		super.setUserStatus(userStatus);
	}

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
