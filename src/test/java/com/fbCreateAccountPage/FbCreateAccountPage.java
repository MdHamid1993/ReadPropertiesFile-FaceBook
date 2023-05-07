package com.fbCreateAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAccountPage {

	WebDriver driver;

	public FbCreateAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "(//a[@role='button'])[2]")
	private WebElement createAccount;

	public WebElement getcreateAccount() {
		createAccount.click();
		return createAccount;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	private WebElement firstname;

	public WebElement getFirstname(String enterName) throws InterruptedException {
		Thread.sleep(5000);
		firstname.sendKeys(enterName);
		return firstname;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	private WebElement lastname;

	public WebElement getLastName(String enterName) {
		lastname.sendKeys(enterName);
		return lastname;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='reg_email__']")
	private WebElement mobilenuber;

	public WebElement getmobileNumber(String mobilenumber) throws InterruptedException {
		Thread.sleep(5000);
		mobilenuber.sendKeys(mobilenumber);
		return mobilenuber;
	}

	@FindBy(how = How.ID, using = "password_step_input")
	private WebElement password;

	public WebElement getPass(String enterPassword) {
		password.sendKeys(enterPassword);
		return password;
	}

	@FindBy(how = How.ID, using = "day")
	private WebElement day;

	public WebElement getDay(String enterDay) {
		Select select = new Select(day);
		select.selectByVisibleText(enterDay);
		return day;

	}

	@FindBy(how = How.ID, using = "month")
	private WebElement month;

	public WebElement getMonth(String enterMonth) {
		Select select = new Select(month);
		select.selectByVisibleText(enterMonth);
		return month;
	}

	@FindBy(how = How.ID, using = "year")
	private WebElement year;

	public WebElement getYear(String enterYear) {
		Select select = new Select(year);
		select.selectByVisibleText(enterYear);
		return year;

	}

	@FindBy(how = How.XPATH, using = "//input[@value='1']")
	private WebElement MaleButton;

	public WebElement getMale() {
		MaleButton.click();
		return MaleButton;
	}

}
