package com.acclaris.hospital.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.model.user.admin.StaffAdmin;

public class UserDetailRowMapper implements RowMapper<HospitalUser> {

	@Override
	public HospitalUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		HospitalUser hospitalUserDetails = new StaffAdmin();
		if(rs!=null && !rs.isBeforeFirst()){
			hospitalUserDetails.setFirstName(rs.getString("FIRST_NAME"));
			hospitalUserDetails.setLastName(rs.getString("LAST_NAME"));
			hospitalUserDetails.setPassword(rs.getString("USER_PASSWORD"));
			hospitalUserDetails.setEmailId(rs.getString("EMAIl_ID"));

		}
		return hospitalUserDetails;
	}
}
