package com.acclaris.hospital.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.acclaris.hospital.dao.HospitalUserDetailsDAO;
import com.acclaris.hospital.model.user.HospitalUser;


public class HospitalUserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private HospitalUserDetailsDAO hospitalUserDetailsDAO;

	public void setHospitalUserDetailsDAO(HospitalUserDetailsDAO hospitalUserDetailsDAO) {
		this.hospitalUserDetailsDAO = hospitalUserDetailsDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = null;

		try {

			HospitalUser hospitalUser = hospitalUserDetailsDAO.getUserDetails(userName);
			if(hospitalUser==null) {
				throw new UsernameNotFoundException("Invalid Username or Password");
			}
			user = new User(hospitalUser.getEmailId(), hospitalUser.getPassword(), new ArrayList<GrantedAuthority>());
			

		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		catch(DataAccessException dae){
			dae.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

}
