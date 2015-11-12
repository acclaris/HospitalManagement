package com.acclaris.hospital.model.role.staff;

import java.io.Serializable;
import java.util.List;

import com.acclaris.hospital.model.Functionality;

public class DriverRole extends StaffRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4072788476301009562L;
	
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
		return "DriverRole [functionalities=" + getFunctionalities()!=null? getFunctionalities().toString():null + "]";
	}

}
