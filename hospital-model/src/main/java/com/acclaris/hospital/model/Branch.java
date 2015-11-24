package com.acclaris.hospital.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Branch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6933093120387787885L;

	@XmlElement
	private String branchId;

	@XmlElement
	private String branchName;

	@XmlElement
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
