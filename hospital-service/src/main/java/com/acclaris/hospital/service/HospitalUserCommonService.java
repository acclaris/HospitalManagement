package com.acclaris.hospital.service;

import com.acclaris.hospital.common.exception.ServiceException;

public interface HospitalUserCommonService {
	
	public void resetUserPassword(String emailId) throws ServiceException;

}
