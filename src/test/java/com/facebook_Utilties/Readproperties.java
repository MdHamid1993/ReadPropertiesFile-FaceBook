package com.facebook_Utilties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {

	private Properties properties; // instance variable.

	public Readproperties() { // creating a constructor.
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/test.properties");
			properties.load(fis);
		} catch (IOException e) {
			System.out.println("Cold not find the file : " + e.getMessage());

		}

	}

	public String propertiesUrl() {
		return properties.getProperty("URL");
	}

	public String propertiesUserName() {
		return properties.getProperty("UserName");
	}

	public String propertiesPassword() {
		return properties.getProperty("Password");
	}

	public String propertiesBrowser() {
		return properties.getProperty("Browser");
	}

	
	public static void main(String[] args) {		// is not necessary main method.	
		Readproperties rp = new Readproperties();
		System.out.println(rp.propertiesUrl());
		System.out.println(rp.propertiesPassword());
	}

}
