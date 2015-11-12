package com.acclaris.hospital.model.user;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.UserStatus;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.marker.User;
import com.acclaris.hospital.model.role.UserRole;

public abstract class HospitalUser implements User {
	
	
	private String userId;
	
	private transient String password;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private String emailId;
	
	private String address;
	
	private UserStatus userStatus;
	
	private UserRole userRole;
	
	private Department department;
	
	private Branch branchDetails;

	protected String getUserId() {
		return userId;
	}

	protected void setUserId(String userId) {
		this.userId = userId;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}

	protected String getEmailId() {
		return emailId;
	}

	protected void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected UserStatus getUserStatus() {
		return userStatus;
	}

	protected void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

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
