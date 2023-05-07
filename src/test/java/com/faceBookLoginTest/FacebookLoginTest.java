package com.faceBookLoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.faceBookLoginPage.FacebookLoginPage;
import com.facebook_Utilties.Readproperties;

public class FacebookLoginTest extends BaseTest {

	WebDriver driver;

	private Readproperties readproperties;

	@BeforeMethod
	public void init() {
		driver = openApp();
		// driver = ChromApp ();
		// driver = edgeApp();
		// driver = fireFoxApp();
	}

	@Test
	public void LoginTest() {
		
		readproperties = new Readproperties();
		
		FacebookLoginPage f = new FacebookLoginPage(driver);
			f.getEmail(readproperties.propertiesUserName());
			f.getPass(readproperties.propertiesPassword());
			f.getLogin();

	}

}
