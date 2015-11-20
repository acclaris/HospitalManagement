package com.acclaris.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.model.user.staff.Doctor;

@Controller
public class SearchController {

	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String getWelcomePage(HttpServletRequest request, HttpServletResponse response, ModelMap model){		

		String input = request.getParameter("search");
		String searchby= request.getParameter("selected");
		model.addAttribute("message", "List Of Users");
		model.addAttribute("userList", getUserList());
		return "search";
		
		
		
		
	}
	

	private List<HospitalUser> getUserList() {

		String [] names = {"2,Chaithanya,Pejjai,cp@gmail.com", "2,Satyakam,Pattanaik,sp@gmail.com", "3,Shubham,Ghatak,sg@gmail.com", "4,Snehalata,Choudhury,sc@gmail.com","5,Ayan,Chakrabarty,ac@gmail.com"};

		List<HospitalUser> userList = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			String userDetails = names[i];  
			String [] userDetailsParts = userDetails.split(",");
			HospitalUser user = new Doctor();
			user.setUserId(userDetailsParts[0]);
			user.setFirstName(userDetailsParts[1]);
			user.setLastName(userDetailsParts[2]);
			user.setEmailId(userDetailsParts[3]);
			userList.add(user);
		}
		return userList;
	}




}
