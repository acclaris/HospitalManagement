package com.acclaris.hospital.comtroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author Chaithanya Pejjai
 */
@Configuration
public class UnitTestContext {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
