package com.acclaris.hospital.comtroller;
import org.mockito.Mockito;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.acclaris.hospital.service.HospitalService;
 
@Configuration
public class TestContext {
	
	
	
    @Bean
    public HospitalService hospitalService() {
        return Mockito.mock(HospitalService.class);
    }
}