package com.arun.framework.settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

	static Properties properties;

	/**
	 * This function initializes the test settings from the default properties file
	 * with the name "testsettings.properties" present in the current working
	 * directory
	 * 
	 * @throws IOException
	 */
	public static void initializeProperties() throws IOException {
		FileInputStream iStr = new FileInputStream("testsettings.properties");
		try {
			properties = new Properties();
			properties.load(iStr);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			iStr.close();
		}
	}

	/**
	 * This function is used to get the value of a particular test setting
	 * 
	 * @param propertyName
	 *            - The name of the property/key/setting
	 * @return
	 */
	public static String getProperty(String propertyName) {
		return properties.getProperty("baseURI", "Not Found");
	}

}