package com.acclaris.hospital.common.constants;

import java.io.Serializable;

public class HospitalAppConstants implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4369141469644063038L;
	
	/* Controller and redirection constants */
	
	public static final String ANONYMOUS_PRINCIPAL = "anonymousUser";
	public static final String INDEX_REDIRECT_URL  = "redirect:/";
	public static final String INDEX_PAGE_URL = "index";
	public static final String HOME_REDIRECT_URL = "redirect:/home";
	public static final String HOME_PAGE_URL = "home";
	public static final String LOGIN_REDIRECT_URL="redirect:/login";
	public static final String LOGIN_PAGE_URL="errorLogin";
	public static final String FORGOT_PASSWORD_URL="forgotPassword";
	
	/* RequestMapping Value Constants */
	
	public static final String CONTEXT_ROOT_MAPPING = "/";
	public static final String LOGIN_MAPPING = "/login";
	public static final String HOME_MAPPING = "/home";
	public static final String LOGIN_SUCCESS_MAPPING = "/login/success";
	public static final String LOGIN_ERROR_MAPPING = "/login/error";
	public static final String FORGOT_PASSWORD_MAPPING = "/login/forgotpassword";
	public static final String RESET_PASSWORD_MAPPING = "/reset";
	public static final String ANY_DOMAIN_MAPPING = "/{directory:.+}";
	public static final String NEW_APPOINTMENT_PAGE_MAPPING = "/appointment/book/new";
	
	/* Property Files List*/
	
	public static final String COMMON_PROPERTIES = "/hospital_mgmt_common.properties";
	public static final String DAO_PROPERTIES = "/hospital_mgmt_dao.properties";
	
	/* DAO Layer Constants */
	
	public static final String SELECT_USER_DETAILS_SQL="hospital.db.select.user.details.sql";
	public static final String SELECT_USER_DETAILS_EMAIL_SQL="hospital.db.select.user.details.email.sql";

}
