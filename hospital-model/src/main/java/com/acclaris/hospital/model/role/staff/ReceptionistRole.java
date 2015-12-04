package com.acclaris.hospital.model.role.staff;

import java.io.Serializable;
import java.util.Set;

import com.acclaris.hospital.model.Functionality;

public class ReceptionistRole extends StaffRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5150405626433689547L;

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
		return "ReceptionistRole [functionalities=" + getFunctionalities()!=null? getFunctionalities().toString():null + "]";
	}


}
