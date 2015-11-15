package com.acclaris.hospital.model.role.manager;

import java.util.List;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.role.UserRole;

public abstract class ManagerRole extends UserRole {
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

	protected abstract boolean isFunctionalityInRole(Functionality functionality);


}
