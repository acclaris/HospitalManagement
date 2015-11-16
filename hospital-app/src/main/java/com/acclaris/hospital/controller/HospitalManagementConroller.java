package com.acclaris.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HospitalManagementConroller {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response){		
		return "index";	
	}	

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginModal(HttpServletRequest request, HttpServletResponse response){	
		return "userLogin";		
	}

	@RequestMapping(value="/success", method=RequestMethod.GET)
	public String getLoginSuccessView(HttpServletRequest request, HttpServletResponse response){	
		System.out.println("IN SUCCESS");
		return "success";		
	}
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String getLoginErrorView(HttpServletRequest request, HttpServletResponse response){	
		return "error";		
	}

}
