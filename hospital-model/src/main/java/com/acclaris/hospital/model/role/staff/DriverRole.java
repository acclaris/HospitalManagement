package com.acclaris.hospital.model.role.staff;

import java.io.Serializable;
import java.util.Set;

import com.acclaris.hospital.model.Functionality;

public class DriverRole extends StaffRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4072788476301009562L;

	public String getRoleId() {
		return super.getRoleId();
	}
	public void setRoleId(String roleId) {
		super.setRoleId(roleId);
	}

	public String getShortCode() {
		return super.getShortCode();
	}

	public void setShortCode(String shortCode) {
		super.setShortCode(shortCode);
	}

	public String getRoleDescription() {
		return super.getRoleDescription();
	}

	public void setRoleDescription(String roleDescription) {
		super.setRoleDescription(roleDescription);
	}

	public Set<Functionality> getFunctionalities() {
		return super.getFunctionalities();
	}

	public void setFunctionalities(Set<Functionality> functionalities) {
		super.setFunctionalities(functionalities);
	}
	
	
	@Override
	public boolean isFunctionalityInRole(Functionality functionality) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		return "DriverRole [getRoleId()=" + getRoleId() + ", getShortCode()="
				+ getShortCode() + ", getRoleDescription()="
				+ getRoleDescription() + ", getFunctionalities()="
				+ getFunctionalities() + "]";
	}



}
