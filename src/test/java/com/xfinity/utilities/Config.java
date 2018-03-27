package com.xfinity.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	private static Properties config;
	static {
		try {
			String filePath = "./src/test/resources/com/xfinity"
					+ "/test_data/configuration.properties";
			
			FileInputStream input = new FileInputStream(filePath);
			config = new Properties();
			config.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public static String getProperty(String key) {
		return config.getProperty(key);
	}
}
