package com.acclaris.hospital.model.role.admin;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.role.UserRole;

@XmlRootElement
public abstract class AdminRole extends UserRole {

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

	protected abstract boolean isFunctionalityInRole(Functionality functionality);

}
