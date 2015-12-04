package com.acclaris.hospital.model.user.manager;

import java.io.Serializable;

import com.acclaris.hospital.model.Branch;
import com.acclaris.hospital.model.UserStatus;
import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.role.UserRole;

public class InventoryManager extends Manager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7359154067468070751L;

	public String getUserId() {
		return super.getUserId();
	}

	public void setUserId(String userId) {
		super.setUserId(userId);

	}

	public String getPassword() {
		return super.getPassword();
	}

	public void setPassword(String password) {
		super.setPassword(password);
	}

	public String getFirstName() {
		return super.getFirstName();
	}

	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}

	public String getLastName() {
		return super.getLastName();
	}

	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}

	public String getGender() {
		return super.getGender();
	}

	public void setGender(String gender) {
		super.setGender(gender);
	}

	public String getEmailId() {
		return super.getEmailId();
	}

	public void setEmailId(String emailId) {
		super.setEmailId(emailId);
	}

	public String getAddress() {
		return super.getAddress();
	}

	public void setAddress(String address) {
		super.setAddress(address);
	}

	public UserStatus getUserStatus() {
		return super.getUserStatus();
	}

	public void setUserStatus(UserStatus userStatus) {
		super.setUserStatus(userStatus);
	}

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
		return "InventoryManager [getUserId()=" + getUserId() + ", getPassword()=" + getPassword() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getGender()=" + getGender()
				+ ", getEmailId()=" + getEmailId() + ", getAddress()=" + getAddress() + ", getUserStatus()="
				+ getUserStatus() + ", getUserRole()=" + getUserRole() + ", getDepartment()=" + getDepartment()
				+ ", getBranchDetails()=" + getBranchDetails() + "]";
	}

	



}
