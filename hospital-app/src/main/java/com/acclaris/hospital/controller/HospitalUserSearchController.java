package com.acclaris.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.service.HospitalUserSearchService;

@Controller
public class HospitalUserSearchController {


@Autowired
HospitalUserSearchService hospitalUserSearchservice;

/**
 * @return
 * @throws Exception
 */
@RequestMapping(value="/search", method=RequestMethod.GET)
public String getTestIndexPage(String searchString, String searchType, ModelMap model) throws Exception{	
	List<HospitalUser>  userList = hospitalUserSearchservice.getUserList("u%%Er*", "EMAIL_ID");
	model.addAttribute("userList", userList);
	for (HospitalUser hospitalUser : userList) {
		System.out.println("Name  "+ hospitalUser.getFirstName());
	}
	return "index";			
}


}
