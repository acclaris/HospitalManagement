package com.acclaris.hospital.model.role.manager;

import java.util.List;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.role.UserRole;

public abstract class ManagerRole extends UserRole {

	protected List<Functionality> getFunctionalities() {
		return super.getFunctionalities();
	}

	protected void setFunctionalities(List<Functionality> functionalities) {
		super.setFunctionalities(functionalities);
	}

	protected abstract boolean isFunctionalityInRole(Functionality functionality);


}
