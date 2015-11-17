package com.acclaris.hospital.comtroller;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.acclaris.hospital.service.HospitalService;

import java.util.Properties;
 
@RunWith(MockitoJUnitRunner.class)
public class StandaloneTodoControllerTest {
 
    private MockMvc mockMvc;
 
    @Mock
    private HospitalService hospitalService;
 
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HospitalManagementConrollerTest())
        		.setViewResolvers(viewResolver())
                .build();
    }
 
   
 
    private ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
 
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }
    
    @Test
    public void testHospitalService(){
    	
    }
    
    
  
}