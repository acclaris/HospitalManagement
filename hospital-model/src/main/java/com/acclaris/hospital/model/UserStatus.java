package com.acclaris.hospital.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 637067111537730402L;

	@XmlElement
	private String statusCode;

	@XmlElement
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
