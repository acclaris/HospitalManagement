package com.acclaris.hospital.dao;

import com.acclaris.hospital.model.user.HospitalUser;

public interface HospitalUserDetailsDAO {
	
	public HospitalUser getUserDetails(String userName) throws Exception;

}
