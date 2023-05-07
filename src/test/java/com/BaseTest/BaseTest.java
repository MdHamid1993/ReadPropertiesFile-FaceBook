package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook_Utilties.Readproperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	String browser = "chrome";
	
	Readproperties readproperties;

	public WebDriver openApp() { 
		
		readproperties = new Readproperties();

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(readproperties.propertiesUrl());
			return driver;
			
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(readproperties.propertiesUrl());
			return driver;
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(readproperties.propertiesUrl());
			return driver;
		}
		return driver;

	}

	public WebDriver ChromApp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(readproperties.propertiesUrl());
		return driver;

	}

	public WebDriver edgeApp() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(readproperties.propertiesUrl());
		return driver;

	}

	public WebDriver fireFoxApp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(readproperties.propertiesUrl());
		return driver;

	}

}
