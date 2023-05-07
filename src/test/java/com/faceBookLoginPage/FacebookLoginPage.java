package com.faceBookLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	WebDriver driver;

	public FacebookLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "email")
	private WebElement getEmail;

	public WebElement getEmail(String enteremail) {
		getEmail.sendKeys(enteremail);
		return getEmail;
	}

	@FindBy(how = How.ID, using = "pass")
	private WebElement getPass;

	public WebElement getPass(String enterPass) {
		getPass.sendKeys(enterPass);
		return getPass;
	}

	@FindBy(how = How.NAME, using = "login")
	private WebElement getLogin;

	public WebElement getLogin() {
		getLogin.click();
		return getLogin;

	}

}
