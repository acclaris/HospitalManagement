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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.acclaris.hospital.common.exception.ServiceException;
import com.acclaris.hospital.dao.HospitalUserDetailsDAO;
import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.service.HospitalUserCommonService;


public class HospitalUserServiceImpl implements UserDetailsService, HospitalUserCommonService{

	@Autowired
	private HospitalUserDetailsDAO hospitalUserDetailsDAO;

	public void setHospitalUserDetailsDAO(HospitalUserDetailsDAO hospitalUserDetailsDAO) {
		this.hospitalUserDetailsDAO = hospitalUserDetailsDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = null;

		try {

			HospitalUser hospitalUser = hospitalUserDetailsDAO.getUserDetailsByUserName(userName);
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

	@Override
	@Transactional(propagation=Propagation.MANDATORY, rollbackFor=Exception.class)
	public void resetUserPassword(String emailId) throws ServiceException {
			
		if(getUserDetailsByEmailId(emailId)!=null){
			
		}
		
		
	}
	
	private HospitalUser getUserDetailsByEmailId(String emailId) throws ServiceException {
		return null;
	}

}
