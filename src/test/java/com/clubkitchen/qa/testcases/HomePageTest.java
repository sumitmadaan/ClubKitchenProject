package com.clubkitchen.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.clubkitchen.qa.base.TestBase;
import com.clubkitchen.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	String baseurl = prop.getProperty("url");
	

	public HomePageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		homePage = new HomePage();

	}

	@Test(priority = 1)
	public void NavigateHomePageTest() {
	
		Assert.assertEquals(baseurl+"/", driver.getCurrentUrl());
	}

	@Test(priority = 2)
	public void HomePageTitleTest() {
		String title = homePage.validateHomePageTitle();
	
		Assert.assertEquals(title, "Clubkitchen- Dein Lieferservice für die besten Onlinerestaurants | Clubkitchen");
	}
	
	@Test(priority=3)
	public void GoToHomePage() {
		
		homePage.clickOnMenu();
		System.out.println("<=====To The Menu Option Clicked======>");
		homePage.EnterAddress();
		System.out.println("Address Entered Successfully");
		homePage.ClickToTheMenuButton();
		System.out.println("User is on MAMACITA club kitchen Page");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	
}
}
