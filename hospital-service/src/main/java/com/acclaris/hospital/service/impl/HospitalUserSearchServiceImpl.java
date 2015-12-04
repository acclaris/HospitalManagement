package com.acclaris.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.acclaris.hospital.dao.HospitalUserSearchDAO;
import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.service.HospitalUserSearchService;

public class HospitalUserSearchServiceImpl implements HospitalUserSearchService {
	
	@Autowired
	HospitalUserSearchDAO hospitalUserSearchDAO;

	@Override
	public List<HospitalUser> getUserList(String searchString, String searchType) throws Exception {
		// TODO Auto-generated method stub
		return hospitalUserSearchDAO.getUserList(searchString, searchType);
	}

}
