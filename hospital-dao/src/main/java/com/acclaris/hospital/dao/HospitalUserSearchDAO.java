package com.acclaris.hospital.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.acclaris.hospital.model.user.HospitalUser;

public interface HospitalUserSearchDAO {
	
	List<HospitalUser> getUserList(String searchString, String searchType)
			throws Exception;

}
