package com.acclaris.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acclaris.hospital.service.HospitalService;

@Controller
public class HospitalManagementConroller {
	
	@Autowired
	@Qualifier("hospitalService")
	private HospitalService hospitalService;
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getIndexPage(HttpServletRequest request, HttpServletResponse response){		
		return hospitalService.getIndex();			
	}	
	
	

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getTestIndexPage(){		
		return "index";			
	}

}
