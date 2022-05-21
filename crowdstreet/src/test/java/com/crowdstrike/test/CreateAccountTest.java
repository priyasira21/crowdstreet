package com.crowdstrike.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PageObjects.account.createAccountPage;
import com.crowdstrike.account.BasePage;

public class CreateAccountTest extends BasePage {

	@Test
	public void createNewUser() {

		try {
			driver = initializeDriver();

			driver.get("https://test.crowdstreet.com/");
			createAccountPage cp = new createAccountPage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
			cp.getCreateAccount().click();
			cp.getFirstName().sendKeys("TestFname");
			cp.getLastName().sendKeys("TestLname");
			cp.getEmail().sendKeys("Test127interview@gmail.com");
			cp.getPassword().sendKeys("Testing123*");
			cp.GetConfirmPassword().sendKeys("Testing123*");

			WebElement rButton = cp.getYesNoRadioButton();
			if (rButton.isSelected()) {
				System.out.println("'No' Radio Button is already selected");
			} else {
				rButton.click();
			}

			WebElement checkBoxElement = cp.getAgreeCheckBox();
			boolean isSelected = checkBoxElement.isSelected();
			if (isSelected == false) {
				checkBoxElement.click();
			}
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(cp.getSwitchIframe()));

			wait.until(ExpectedConditions.elementToBeClickable(cp.getrCaptcha())).click();

			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			cp.getclickAccount().click();
			if (cp.getInvestNowBtn().isDisplayed()) {
				System.out.println("Account Registration is sucessful");
			}
		} catch (InterruptedException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
