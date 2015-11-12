package com.acclaris.hospital.model.role.admin;

import java.io.Serializable;
import java.util.List;

import com.acclaris.hospital.model.Functionality;

public class StaffAdminRole extends AdminRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3410657716499702552L;

	public List<Functionality> getFunctionalities() {
		return super.getFunctionalities();
	}

	public void setFunctionalities(List<Functionality> functionalities) {
		super.setFunctionalities(functionalities);
	}
	
	@Override
	public boolean isFunctionalityInRole(Functionality functionality){
		
		return false;
	}


	@Override
	public String toString() {
		return "StaffAdminRole [functionalities=" + getFunctionalities()!=null? getFunctionalities().toString():null + "]";
	}
	
	
}
