package com.acclaris.hospital.model.role.admin;

import java.io.Serializable;
import java.util.List;

import com.acclaris.hospital.model.Functionality;

public class StaffAdminRole extends AdminRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3410657716499702552L;
	
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

	public List<Functionality> getFunctionalities() {
		return super.getFunctionalities();
	}

	public void setFunctionalities(List<Functionality> functionalities) {
		super.setFunctionalities(functionalities);
	}
	
	@Override
	public boolean isFunctionalityInRole(Functionality functionality){
		
		return false;
	}
	@Override
	public String toString() {
		return "StaffAdminRole [getRoleId()=" + getRoleId()
				+ ", getShortCode()=" + getShortCode()
				+ ", getRoleDescription()=" + getRoleDescription()
				+ ", getFunctionalities()=" + getFunctionalities() + "]";
	}


	
	
	
}
