package com.acclaris.hospital.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.acclaris.hospital.model.department.Department;
import com.acclaris.hospital.model.user.staff.Doctor;

@XmlRootElement
public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 888319765479071962L;


	@XmlElement
	private String appointmentId;

	@XmlElement
	private Branch branchDetails;

	@XmlElement
	private Department departmentDetails;

	@XmlElement
	private Doctor doctorDetails;
	
	@XmlElement
	private Timestamp appointmentDate;

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Branch getBranchDetails() {
		return branchDetails;
	}

	public void setBranchDetails(Branch branchDetails) {
		this.branchDetails = branchDetails;
	}

	public Department getDepartmentDetails() {
		return departmentDetails;
	}

	public void setDepartmentDetails(Department departmentDetails) {
		this.departmentDetails = departmentDetails;
	}

	public Doctor getDoctorDetails() {
		return doctorDetails;
	}

	public void setDoctorDetails(Doctor doctorDetails) {
		this.doctorDetails = doctorDetails;
	}

	public Timestamp getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Timestamp appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId
				+ ", branchDetails=" + branchDetails + ", departmentDetails="
				+ departmentDetails + ", doctorDetails=" + doctorDetails
				+ ", appointmentDate=" + appointmentDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
		result = prime * result
				+ ((appointmentId == null) ? 0 : appointmentId.hashCode());
		result = prime * result
				+ ((branchDetails == null) ? 0 : branchDetails.hashCode());
		result = prime
				* result
				+ ((departmentDetails == null) ? 0 : departmentDetails
						.hashCode());
		result = prime * result
				+ ((doctorDetails == null) ? 0 : doctorDetails.hashCode());
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
		Appointment other = (Appointment) obj;
		if (appointmentDate == null) {
			if (other.appointmentDate != null)
				return false;
		} else if (!appointmentDate.equals(other.appointmentDate))
			return false;
		if (appointmentId == null) {
			if (other.appointmentId != null)
				return false;
		} else if (!appointmentId.equals(other.appointmentId))
			return false;
		if (branchDetails == null) {
			if (other.branchDetails != null)
				return false;
		} else if (!branchDetails.equals(other.branchDetails))
			return false;
		if (departmentDetails == null) {
			if (other.departmentDetails != null)
				return false;
		} else if (!departmentDetails.equals(other.departmentDetails))
			return false;
		if (doctorDetails == null) {
			if (other.doctorDetails != null)
				return false;
		} else if (!doctorDetails.equals(other.doctorDetails))
			return false;
		return true;
	}
	
	
	



}
