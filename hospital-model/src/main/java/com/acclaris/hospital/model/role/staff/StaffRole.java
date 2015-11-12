package com.acclaris.hospital.model.role.staff;

import java.util.List;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.role.UserRole;

public abstract class StaffRole extends UserRole {


	protected List<Functionality> getFunctionalities() {
		return super.getFunctionalities();
	}

	protected void setFunctionalities(List<Functionality> functionalities) {
		super.setFunctionalities(functionalities);
	}

	protected abstract boolean isFunctionalityInRole(Functionality functionality);


}
