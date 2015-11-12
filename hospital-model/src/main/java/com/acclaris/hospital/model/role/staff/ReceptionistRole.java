package com.acclaris.hospital.model.role.staff;

import java.io.Serializable;
import java.util.List;

import com.acclaris.hospital.model.Functionality;

public class ReceptionistRole extends StaffRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5150405626433689547L;

	public List<Functionality> getFunctionalities() {
		return super.getFunctionalities();
	}

	public void setFunctionalities(List<Functionality> functionalities) {
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
