package com.acclaris.hospital.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Functionality implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6847827074539504361L;

	@XmlElement
	private String functionalityId;

	@XmlElement
	private String shortCode;

	@XmlElement
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((functionalityDesc == null) ? 0 : functionalityDesc
						.hashCode());
		result = prime * result
				+ ((functionalityId == null) ? 0 : functionalityId.hashCode());
		result = prime * result
				+ ((shortCode == null) ? 0 : shortCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Functionality other = (Functionality) obj;
		if (functionalityDesc == null) {
			if (other.functionalityDesc != null)
				return false;
		} else if (!functionalityDesc.equals(other.functionalityDesc))
			return false;
		if (functionalityId == null) {
			if (other.functionalityId != null)
				return false;
		} else if (!functionalityId.equals(other.functionalityId))
			return false;
		if (shortCode == null) {
			if (other.shortCode != null)
				return false;
		} else if (!shortCode.equals(other.shortCode))
			return false;
		return true;
	}
	
	

}
