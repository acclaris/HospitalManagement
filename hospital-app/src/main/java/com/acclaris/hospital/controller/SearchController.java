package com.acclaris.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acclaris.hospital.model.marker.User;
import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.model.user.staff.Doctor;

@Controller
public class SearchController {
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response, ModelMap model){		
		
		model.addAttribute("message", "This is a message");
		model.addAttribute("userList", getUserList());
		return "search";		
	}
	
	private List<HospitalUser> getUserList() {
		Doctor user = new Doctor();
		user.setUserId("1");
		user.setFirstName("Chaithanya");
		List<HospitalUser> userList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			userList.add(user);
		}
		return userList;
	}
	

}
