package com.acclaris.hospital.model.role.staff;

import java.io.Serializable;
import java.util.List;

import com.acclaris.hospital.model.Functionality;

public class DoctorRole extends StaffRole implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6095404898741682481L;
		
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
		return "DoctorRole [functionalities=" + getFunctionalities()!=null? getFunctionalities().toString():null + "]";
	}

	
}
