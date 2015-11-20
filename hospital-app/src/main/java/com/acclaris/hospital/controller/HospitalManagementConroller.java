package com.acclaris.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HospitalManagementConroller {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response){	

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String principalName = authentication!=null ? authentication.getName() : null;
		if("anonymousUser".equals(principalName)){
			return "index";
		}

		else {
			User user = (User)authentication.getPrincipal();
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", user);
			return "redirect:/home";


		}
	}	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginView(HttpServletRequest request, HttpServletResponse response, Exception exception){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String principalName = authentication!=null ? authentication.getName() : null;
		if("anonymousUser".equals(principalName)){
			return "errorLogin";
		}

		else {
			User user = (User)authentication.getPrincipal();
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", user);
			return "redirect:/home";


		}
	}

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getUserHomePage(HttpServletRequest request, HttpServletResponse response, Exception exception){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String principalName = authentication!=null ? authentication.getName() : null;
		if("anonymousUser".equals(principalName)){
			return "redirect:/";
		}

		else {
			User user = (User)authentication.getPrincipal();
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", user);
			return "home";


		}
	}

	@RequestMapping(value="/login/success", method=RequestMethod.GET)
	public String getLoginSuccessView(HttpServletRequest request, HttpServletResponse response){	
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String principalName = authentication!=null ? authentication.getName() : null;
		if("anonymousUser".equals(principalName)){
			return "redirect:/login";
		}

		else {
			User user = (User)authentication.getPrincipal();
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", user);
			return "redirect:/home";


		}	
	}

	@RequestMapping(value="/login/error", method=RequestMethod.GET)
	@ExceptionHandler(value=Exception.class)
	public String getLoginErrorView(HttpServletRequest request, HttpServletResponse response, Exception exception){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String principalName = authentication!=null ? authentication.getName() : null;
		if("anonymousUser".equals(principalName)){
			return "redirect:/login";
		}

		else {
			User user = (User)authentication.getPrincipal();
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", user);
			return "redirect:/home";


		}
	}

	@RequestMapping(value="/login/forgotpassword", method=RequestMethod.GET)
	public String getForgotPasswordPage(HttpServletRequest request, HttpServletResponse response, Exception exception){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String principalName = authentication!=null ? authentication.getName() : null;
		if("anonymousUser".equals(principalName)){
			return "forgotPassword";
		}

		else {
			User user = (User)authentication.getPrincipal();
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", user);
			return "redirect:/home";


		}
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getTestIndexPage(){		
		return "index";			
	}

}
