package com.clubkitchen.qa.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.clubkitchen.qa.base.TestBase;
import com.clubkitchen.qa.pages.HomePage;
import com.clubkitchen.qa.pages.MamacitaMenuPage;

public class MamacitaMenuPageTest extends TestBase{
	

	HomePage homePage;
	MamacitaMenuPage mamacitaMenuPage;
	String baseurl = prop.getProperty("url");
	

	public MamacitaMenuPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		homePage = new HomePage();
		mamacitaMenuPage= new MamacitaMenuPage();

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
	
	@Test(priority=4)
	public void QuesadillasMenu() {
		mamacitaMenuPage.ClickToTheQuesadillasMenu();
		System.out.println("Quesadillas Menu Clicked");
	}
	
	@Test(priority=5)
	public void SelectOneItemQuesadillasMenu() throws InterruptedException {
		mamacitaMenuPage.AddAnItemFromQuesadillasMenu();
		System.out.println("Quesadillas Menu Item Clicked");
		
	}
	
	@Test(priority=6)
	public void GetAllExtras() {
		List<WebElement> anchorTagsList=mamacitaMenuPage.findallAncherTagOfPage();
		System.out.println("Toatl extra Items: " +anchorTagsList.size());
		for(int i=0;i<=anchorTagsList.size();i++) {
			System.out.println("Extras Text:" + anchorTagsList.get(i).getText());
		}
	}

	
	
	/*@Test(priority=7)
	public void AddToCartItemQuesadillasMenu() throws InterruptedException {
		//GoToHomePage();
		mamacitaMenuPage.AddToCartFromQuesadillasMenu();
		System.out.println("Item Added to Cart");
		Thread.sleep(5000);
	}*/
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	
}

	
}
