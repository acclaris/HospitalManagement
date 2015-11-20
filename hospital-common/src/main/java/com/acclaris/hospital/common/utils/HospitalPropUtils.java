package com.acclaris.hospital.common.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.acclaris.hospital.common.constants.HospitalAppConstants;

@Component
public class HospitalPropUtils {

	private static Properties properties;

	@PostConstruct
	public void init() {
		try {
			properties = new Properties();
			InputStream inputStream = HospitalPropUtils.class.getResourceAsStream(HospitalAppConstants.COMMON_PROPERTIES);
			properties.load(inputStream);
			inputStream = HospitalPropUtils.class.getResourceAsStream(HospitalAppConstants.DAO_PROPERTIES);
			properties.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public final static String getPropertyValue(String key) {
		return properties.getProperty(key);
	}

}
