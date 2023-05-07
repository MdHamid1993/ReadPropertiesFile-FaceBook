package com.fbCreateAccountTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

import com.fbCreateAccountPage.FbCreateAccountPage;

public class FbCreateAccountTest extends BaseTest {

	WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {
		 driver = openApp();
		//driver = ChromApp();
		// driver = edgeApp();
		// driver = fireFoxApp();

	}

	@Test
	public void registation() throws InterruptedException {
		FbCreateAccountPage r = new FbCreateAccountPage(driver);
		r.getcreateAccount();
		r.getFirstname("asiud");
		r.getLastName("jhgdyg");
		r.getmobileNumber("01454487");
		r.getPass("hg12");
		r.getDay("20");
		r.getMonth("Dec");
		r.getYear("1993");
		r.getMale();
	}

}
