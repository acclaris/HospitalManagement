package com.acclaris.hospital.model.role.manager;

import java.io.Serializable;
import java.util.List;

import com.acclaris.hospital.model.Functionality;

public class VendorManagerRole extends ManagerRole implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1484439652271043104L;

	
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
		return "VendorManagerRole [functionalities=" + getFunctionalities()!=null? getFunctionalities().toString():null + "]";
	}

	
}
