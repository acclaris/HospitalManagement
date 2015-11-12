package com.acclaris.hospital.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Shift implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8190233792454631527L;
	
	private String shiftId;
	
	private Timestamp shiftStartTime;
	
	private Timestamp shiftEndTime;

	private String shortCode;
	
	private String shiftDesc;

	public String getShiftId() {
		return shiftId;
	}

	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}

	public Timestamp getShiftStartTime() {
		return shiftStartTime;
	}

	public void setShiftStartTime(Timestamp shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}

	public Timestamp getShiftEndTime() {
		return shiftEndTime;
	}

	public void setShiftEndTime(Timestamp shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getShiftDesc() {
		return shiftDesc;
	}

	public void setShiftDesc(String shiftDesc) {
		this.shiftDesc = shiftDesc;
	}

	@Override
	public String toString() {
		return "Shift [shiftId=" + shiftId + ", shiftStartTime=" + shiftStartTime + ", shiftEndTime=" + shiftEndTime
				+ ", shortCode=" + shortCode + ", shiftDesc=" + shiftDesc + "]";
	}
	
	
	
}
