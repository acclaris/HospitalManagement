package com.acclaris.hospital.dao;

import com.acclaris.hospital.model.user.HospitalUser;

public interface HospitalUserDetailsDAO {
	
	public HospitalUser getUserDetailsByUserName(String userName) throws Exception;
	public HospitalUser resetUserPassword(String emailId) throws Exception;
	public HospitalUser getUserDetailsByEmailId(String emailId) throws Exception;

}
