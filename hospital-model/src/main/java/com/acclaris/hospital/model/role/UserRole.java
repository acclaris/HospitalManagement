package com.acclaris.hospital.model.role;

import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.marker.Role;

public abstract class UserRole implements Role {
	
	@XmlElement
	private String roleId;
	
	@XmlElement
	private String shortCode;
	
	@XmlElement
	private String roleDescription;
	
	private Set<Functionality> functionalities;

	public Set<Functionality> getFunctionalities() {
		return this.functionalities;
	}

	public void setFunctionalities(Set<Functionality> functionalities) {
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
