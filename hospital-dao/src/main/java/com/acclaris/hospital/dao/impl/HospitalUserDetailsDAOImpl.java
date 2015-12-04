package com.acclaris.hospital.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.acclaris.hospital.common.constants.HospitalAppConstants;
import com.acclaris.hospital.common.utils.HospitalPropUtils;
import com.acclaris.hospital.dao.HospitalUserDetailsDAO;
import com.acclaris.hospital.dao.rowmapper.UserDetailRowMapper;
import com.acclaris.hospital.model.user.HospitalUser;

public class HospitalUserDetailsDAOImpl implements HospitalUserDetailsDAO {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public HospitalUser getUserDetailsByUserName(String userName)
			throws SQLException, DataAccessException {
		
		final String sql = HospitalPropUtils.getPropertyValue(HospitalAppConstants.SELECT_USER_DETAILS_SQL);	
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("userName",userName);
		List<HospitalUser> resultSet = jdbcTemplate.query(sql, paramMap, new UserDetailRowMapper());
		return ((resultSet!=null && resultSet.isEmpty())? null : resultSet.get(0)) ;
	}

	@Override
	public HospitalUser getUserDetailsByEmailId(String emailId) throws SQLException, DataAccessException {
		
		final String sql = HospitalPropUtils.getPropertyValue(HospitalAppConstants.SELECT_USER_DETAILS_EMAIL_SQL);	
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("emailId",emailId);
		List<HospitalUser> resultSet = jdbcTemplate.query(sql, paramMap, new UserDetailRowMapper());
		return ((resultSet!=null && resultSet.isEmpty())? null : resultSet.get(0)) ;
	
	}

	@Override
	public HospitalUser resetUserPassword(String emailId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	
	
	
	
}
