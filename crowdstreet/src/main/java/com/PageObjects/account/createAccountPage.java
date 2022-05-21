package com.PageObjects.account;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class createAccountPage {

	public WebDriver driver;

	By createAccount = By.partialLinkText("Create");
	By fName = By.xpath("//input[@name='firstName']");
	By lName = By.xpath("//input[@name='lastName']");
	By email = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By confirmPassword = By.xpath("//input[@name='confirmPassword']");
	By yesNoRadioButton = By.xpath("//input[@id='accreditedNo']");
	By agreeCheckBox = By.xpath("//input[@id='hasAgreedTos']");
	By clickAccount = By.xpath("//*[text()='Create an account']");
	By switchIframe = By
			.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	By rCaptcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
	By investNowBtn = By.xpath("//*[@id='btn-invest-offer']");
	public createAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getCreateAccount() {
		return driver.findElement(createAccount);
	}

	public WebElement getFirstName() {
		return driver.findElement(fName);
	}

	public WebElement getLastName() {
		return driver.findElement(lName);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement GetConfirmPassword() {
		return driver.findElement(confirmPassword);
	}

	public WebElement getYesNoRadioButton() {
		return driver.findElement(yesNoRadioButton);
	}

	public WebElement getAgreeCheckBox() {
		return driver.findElement(agreeCheckBox);
	}

	public WebElement getSwitchIframe() {
		return driver.findElement(switchIframe);
	}

	public WebElement getrCaptcha() {
		return driver.findElement(rCaptcha);
	}

	public WebElement getclickAccount() {
		return driver.findElement(clickAccount);
	}
	public WebElement getInvestNowBtn() {
		return driver.findElement(investNowBtn);
	}

	
}
