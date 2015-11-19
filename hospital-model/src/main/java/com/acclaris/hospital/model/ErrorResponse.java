package com.acclaris.hospital.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9050726259802953356L;
	
	@XmlElement
	private String errorMessage;
	
	@XmlElement
	private String errorCode;
	
	@XmlElement
	private String errorDescription;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	
	

}
