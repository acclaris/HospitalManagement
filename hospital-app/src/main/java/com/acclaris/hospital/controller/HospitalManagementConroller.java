package com.acclaris.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HospitalManagementConroller {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response){		
		return "index";	
	}	

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomePage(HttpServletRequest request, HttpServletResponse response){		
		return "home";	
	}	

	@RequestMapping(value="/success", method=RequestMethod.GET)
	public String getLoginSuccessView(HttpServletRequest request, HttpServletResponse response){	
		System.out.println("IN SUCCESS");
		return "successLogin";		
	}
	@RequestMapping(value="/error", method=RequestMethod.GET)
	@ExceptionHandler(value=Exception.class)
	public String getLoginErrorView(HttpServletRequest request, HttpServletResponse response, Exception exception){
		return "/errorLogin";
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getTestIndexPage(){		
		return "index";			
	}

}
