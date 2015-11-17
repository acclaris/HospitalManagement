/*package com.acclaris.hospital.comtroller;

import static junit.framework.Assert.assertEquals;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import com.acclaris.hospital.controller.HospitalManagementConroller;
import com.acclaris.hospital.service.HospitalService;
import com.acclaris.hospital.service.impl.HospitalServiceImpl;

public class HospitalManagementConrollerTest {

	private HospitalManagementConroller controller;

	@Autowired
	private HospitalService hospitalService;

	HttpServletRequest request;
	HttpServletResponse response;

	@Before
	public void setUp() {
		System.out.println("Before");
		controller = new HospitalManagementConroller();
		hospitalService = new HospitalServiceImpl();
		ReflectionTestUtils.setField(controller, "hospitalService", hospitalService);
	}

	@Test
	public void showTestIndex() {
		System.out.println("Test Case");
		System.out.println(hospitalService);
		assertEquals("index", controller.getTestIndexPage());
	}

	@Test
	public void showIndex() {
		System.out.println("Test Case");
		System.out.println(hospitalService);
		assertEquals("index", controller.getIndexPage(request, response));
	}

	@After
	public void tearDown() {
		System.out.println("After");
		controller = new HospitalManagementConroller();

	}

}*/