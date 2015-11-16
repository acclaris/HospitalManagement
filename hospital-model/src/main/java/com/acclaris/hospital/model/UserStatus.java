package com.acclaris.hospital.model;

import java.io.Serializable;

public class UserStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 637067111537730402L;

	private String statusCode;

	private String statusDesc;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	@Override
	public String toString() {
		return "UserStatus [statusCode=" + statusCode + ", statusDesc=" + statusDesc + "]";
	}


}
