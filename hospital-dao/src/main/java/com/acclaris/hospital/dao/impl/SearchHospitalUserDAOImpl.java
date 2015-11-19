package com.acclaris.hospital.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.acclaris.hospital.dao.HospitalUserSearchDAO;
import com.acclaris.hospital.dao.rowmapper.UserDetailRowMapper;
import com.acclaris.hospital.model.UserStatus;
import com.acclaris.hospital.model.user.HospitalUser;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class SearchHospitalUserDAOImpl implements HospitalUserSearchDAO {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;	
	@Autowired
	private SimpleJdbcCall jdbcCall;	
	private String searchUserStoredProcedure;

	public String getSearchUserStoredProcedure() {
		return searchUserStoredProcedure;
	}


	public void setSearchUserStoredProcedure(String searchUserStoredProcedure) {
		this.searchUserStoredProcedure = searchUserStoredProcedure;
	}


	@Override
	public List<HospitalUser> getUserList(String searchString, String searchType) throws Exception {
		// TODO Auto-generated method stub
		final String sql = getSearchUserStoredProcedure();			
		Map<String, Object> resultMap = callProcedure(searchString,searchType);
		System.out.println(resultMap.get("OUT_CUR_USERLIST"));
		List<Map<String, Object>> resultList = (List<Map<String, Object>>) resultMap.get("OUT_CUR_USERLIST");
		List<HospitalUser> resultSet = getHospitalUserFromMapList(resultList);
		return ((resultSet!=null && resultSet.isEmpty())? null : resultSet) ;
	}
	
	
	private Map<String, Object> callProcedure(String searchString, String searchType){		
				SqlParameterSource in = new MapSqlParameterSource().
				addValue("in_search_string",searchString)
				.addValue("in_search_cond", searchType);		
			return jdbcCall.withProcedureName(getSearchUserStoredProcedure()).execute(in);
	}
	
	
	public List<HospitalUser> getHospitalUserFromMapList(List<Map<String, Object>> resultList){
		 List<HospitalUser> hospitalUserList = new ArrayList<>();
		for (Map<String, Object> map : resultList) {
			 HospitalUser user = fromMap(map);
			 hospitalUserList.add(user);
		}
		return hospitalUserList;
	}
	 private  HospitalUser fromMap(Map<String, Object> properties) {		 
		System.out.println(properties.get("ROLE_ID")); ;
	        HospitalUser user = HospitalUserFactory.getHospitalUser(properties.get("ROLE_ID").toString());
	        user.setFirstName(properties.get("FIRST_NAME").toString());
	        user.setLastName(properties.get("LAST_NAME").toString());
	        user.setEmailId(properties.get("EMAIL_ID").toString());
	        String status = properties.get("USER_STATUS_CDE").toString();
	        UserStatus userStatus = new UserStatus();
	        userStatus.setStatusCode(status);
	        user.setUserStatus(userStatus);
	        return user;
	    }

	

}
