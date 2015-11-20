package com.acclaris.hospital.logger.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HospitalAppLogger {

	
	 private Logger log = Logger.getLogger(getClass());
	   
	 @After("execution(* com.acclaris.hospital.*.*.*(..))")
	    public void log(JoinPoint point) {
	        log.info(point.getSignature().getName() + " called...");
	    }

}
