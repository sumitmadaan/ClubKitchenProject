package com.clubkitchen.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clubkitchen.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Zur Speisekarte')]")
	WebElement ClickOnMenu;

	@FindBy(xpath = "//input[@id='address-input']")
	WebElement EnterAddress;

	@FindBy(xpath = "//input[@class='btn--honest blattgold--form-banner-submit']")
	WebElement ToThemenuButton;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnMenu() {
		ClickOnMenu.click();
	}

	public void EnterAddress() {
		EnterAddress.sendKeys("Semperstraße 44, 1180 Wien, Austria");
	}

	public void ClickToTheMenuButton() {
		ToThemenuButton.click();
	}

}
