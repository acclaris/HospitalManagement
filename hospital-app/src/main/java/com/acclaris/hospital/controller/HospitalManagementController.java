package com.acclaris.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acclaris.hospital.common.constants.HospitalAppConstants;

@Controller
public class HospitalManagementController {

	@RequestMapping(value=HospitalAppConstants.CONTEXT_ROOT_MAPPING, method=RequestMethod.GET)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response){	

		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.INDEX_PAGE_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;


		}
	}	

	@RequestMapping(value=HospitalAppConstants.ANY_DOMAIN_MAPPING, method=RequestMethod.GET)
	private String handleRedirectToRoot(@PathVariable("directory") String directory, HttpServletRequest request, HttpServletResponse response) {
		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.INDEX_REDIRECT_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;


		}
	}
	@RequestMapping(value=HospitalAppConstants.LOGIN_MAPPING, method=RequestMethod.GET)
	public String getLoginView(HttpServletRequest request, HttpServletResponse response, Exception exception){

		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.LOGIN_PAGE_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;
		}
	}

	@RequestMapping(value=HospitalAppConstants.HOME_MAPPING, method=RequestMethod.GET)
	public String getUserHomePage(HttpServletRequest request, HttpServletResponse response, Exception exception){


		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.INDEX_REDIRECT_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_PAGE_URL;
		}
	}

	@RequestMapping(value=HospitalAppConstants.LOGIN_SUCCESS_MAPPING, method=RequestMethod.GET)
	public String getLoginSuccessView(HttpServletRequest request, HttpServletResponse response){	

		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.LOGIN_REDIRECT_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;
		}

	}

	@RequestMapping(value=HospitalAppConstants.LOGIN_ERROR_MAPPING, method=RequestMethod.GET)
	@ExceptionHandler(value=Exception.class)
	public String getLoginErrorView(HttpServletRequest request, HttpServletResponse response, Exception exception){
		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.LOGIN_REDIRECT_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;
		}
	}



	@RequestMapping(value=HospitalAppConstants.FORGOT_PASSWORD_MAPPING, method=RequestMethod.GET)
	public String getForgotPasswordPage(HttpServletRequest request, HttpServletResponse response, Exception exception){

		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.FORGOT_PASSWORD_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;
		}

	}

	@RequestMapping(value=HospitalAppConstants.RESET_PASSWORD_MAPPING, method=RequestMethod.POST)
	public String resetUserPassword(HttpServletRequest request, HttpServletResponse response, Exception exception){

		Authentication authentication = getAuthentication();
		if(isAnonymousPrincipal(authentication)){
			return HospitalAppConstants.FORGOT_PASSWORD_URL;
		}

		else {
			modifySession(request,authentication);
			return HospitalAppConstants.HOME_REDIRECT_URL;
		}

	}

	private Authentication getAuthentication(){

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication;

	}
	private boolean isAnonymousPrincipal(Authentication authentication){
		String principalName = authentication!=null ? authentication.getName() : null;
		if(HospitalAppConstants.ANONYMOUS_PRINCIPAL.equals(principalName)){
			return true;
		}
		return false;

	}

	private void modifySession(HttpServletRequest request, Authentication authentication){
		User user = (User)authentication.getPrincipal();
		HttpSession session=request.getSession();
		session.setAttribute("loggedUser", user);

	}


	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getTestIndexPage(){		
		return "index";			
	}

}
