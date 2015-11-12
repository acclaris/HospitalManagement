package com.acclaris.hospital.model;

import java.io.Serializable;

public class Branch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6933093120387787885L;
	
	private String branchId;
	
	private String branchName;
	
	private String branchAddress;

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchAddress=" + branchAddress + "]";
	}

}
