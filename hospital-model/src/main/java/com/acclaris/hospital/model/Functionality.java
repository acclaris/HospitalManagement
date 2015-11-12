package com.acclaris.hospital.model;

import java.io.Serializable;

public class Functionality implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6847827074539504361L;
	
	private String functionalityId;
	
	private String shortCode;
	
	private String functionalityDesc;

	public String getFunctionalityId() {
		return functionalityId;
	}

	public void setFunctionalityId(String functionalityId) {
		this.functionalityId = functionalityId;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getFunctionalityDesc() {
		return functionalityDesc;
	}

	public void setFunctionalityDesc(String functionalityDesc) {
		this.functionalityDesc = functionalityDesc;
	}

	@Override
	public String toString() {
		return "Functionality [functionalityId=" + functionalityId + ", shortCode=" + shortCode + ", functionalityDesc="
				+ functionalityDesc + "]";
	}

}
