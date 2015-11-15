package com.acclaris.hospital.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.acclaris.hospital.dao.HospitalUserDetailsDAO;
import com.acclaris.hospital.dao.rowmapper.UserDetailRowMapper;
import com.acclaris.hospital.model.user.HospitalUser;

public class HospitalUserDetailsDAOImpl implements HospitalUserDetailsDAO {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	private String userDetailsSql;

	public String getUserDetailsSql() {
		return userDetailsSql;
	}

	public void setUserDetailsSql(String userDetailsSql) {
		this.userDetailsSql = userDetailsSql;
	}


	@Override
	public HospitalUser getUserDetails(String userName)
			throws SQLException, DataAccessException {
		
		final String sql = getUserDetailsSql();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("userName",userName);
		List<HospitalUser> resultSet = jdbcTemplate.query(sql, new UserDetailRowMapper());
		assert (resultSet!=null);
		assert (resultSet.size()==0 || resultSet.size()==1);
		return resultSet.get(0);
	}
	
	
	public void insertAdmin(){
		
		final String sql = "INSERT INTO HOSPITAL_MGMT.HM_USERS VALUES(";
		
	}

}
