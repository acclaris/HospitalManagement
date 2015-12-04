package com.acclaris.hospital.model;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9067188443753554174L;

	@XmlElement
	private String patientId;

	@XmlElement
	private String firstName;

	@XmlElement
	private String lastName;

	@XmlElement
	private String gender;

	@XmlElement
	private String age;

	@XmlElement
	private String contactNumber;

	@XmlElement
	private String emailId;
	
	@XmlElement
	private Set<Appointment> appointments;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "PatientDetail [patientId=" + patientId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", contactNumber=" + contactNumber
				+ ", emailId=" + emailId + ", appointments=" + appointments
				+ "]";
	}
	
	
	
	
	
	




}
