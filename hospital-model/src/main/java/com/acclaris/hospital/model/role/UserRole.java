package com.acclaris.hospital.model.role;

import java.util.List;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.marker.Role;

public abstract class UserRole implements Role {
	
	private String roleId;
	
	private String shortCode;
	
	private String roleDescription;
	
	private List<Functionality> functionalities;

	public List<Functionality> getFunctionalities() {
		return this.functionalities;
	}

	public void setFunctionalities(List<Functionality> functionalities) {
		this.functionalities = functionalities;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
	
	

}
