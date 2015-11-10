package com.acclaris.hospital.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acclaris.hospital.service.HospitalService;
import com.acclaris.model.User;

@Controller
public class HospitalManagementConroller {
	
	@Autowired
	@Qualifier("hospitalService")
	private HospitalService hospitalService;
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> getWelcomePage(HttpServletRequest request, HttpServletResponse response){
		
		return hospitalService.executeStuff();
		
		
	}

}
