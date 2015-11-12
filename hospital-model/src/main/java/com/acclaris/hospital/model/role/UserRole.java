package com.acclaris.hospital.model.role;

import java.util.List;

import com.acclaris.hospital.model.Functionality;
import com.acclaris.hospital.model.marker.Role;

public abstract class UserRole implements Role {
	
	private List<Functionality> functionalities;

	protected List<Functionality> getFunctionalities() {
		return this.functionalities;
	}

	protected void setFunctionalities(List<Functionality> functionalities) {
		this.functionalities = functionalities;
	}
	
	

}
