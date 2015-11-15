package com.acclaris.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HospitalManagementConroller {

	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response){		
		return "index";	
	}	

	@RequestMapping(value="/app/login", method=RequestMethod.GET)
	public String getLoginModal(HttpServletRequest request, HttpServletResponse response){	
		return "userLogin";		
	}
	
}
