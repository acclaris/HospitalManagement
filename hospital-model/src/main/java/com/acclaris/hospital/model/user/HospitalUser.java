package com.acclaris.hospital.model.user;

import javax.xml.bind.annotation.XmlElement;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.UserStatus;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.marker.User;
import com.acclaris.hospital.model.role.UserRole;

public abstract class HospitalUser implements User {


	@XmlElement
	private String userId;

	@XmlElement
	private transient String password;

	@XmlElement
	private String firstName;

	@XmlElement
	private String lastName;

	@XmlElement
	private String gender;

	@XmlElement
	private String emailId;

	@XmlElement
	private String address;

	@XmlElement
	private UserStatus userStatus;

	@XmlElement
	private UserRole userRole;

	@XmlElement
	private Department department;

	@XmlElement
	private Branch branchDetails;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Branch getBranchDetails() {
		return branchDetails;
	}

	public void setBranchDetails(Branch branchDetails) {
		this.branchDetails = branchDetails;
	}





}
