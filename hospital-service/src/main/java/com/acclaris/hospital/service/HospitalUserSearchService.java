package com.acclaris.hospital.service;

import java.util.List;

import com.acclaris.hospital.model.user.HospitalUser;

public interface HospitalUserSearchService {
	
	List<HospitalUser> getUserList(String searchString, String searchType)
			throws Exception;


}
