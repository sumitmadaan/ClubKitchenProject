package com.clubkitchen.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clubkitchen.qa.base.TestBase;

public class MamacitaMenuPage extends TestBase {

	@FindBy(xpath = "//li[@class='navigation--entry js--menu-scroller--item icon-active-class']//div[@class='navigation--link']")
	WebElement Burritos;

	@FindBy(xpath = "//a[@id='menu-quesadillas']")
	WebElement Quesadillas;

	@FindBy(xpath = "//body[@class='is--ctl-listing is--act-index clubkitchen club']/div[@class='page-wrap']/header[@id='header-listing']/div[@class='container header--navigation']/div[@id='header-container']/div[@id='header-left']/nav[@class='navigation-main']/div[@class='container js--menu-scroller']/div[@class='navigation--list-wrapper']/ul[@class='navigation--list container js--menu-scroller--list']/li[3]/div[1]")
	static WebElement BuritoBowls;

	@FindBy(xpath = "//body[@class='is--ctl-listing is--act-index clubkitchen club']/div[@class='page-wrap']/header[@id='header-listing']/div[@class='container header--navigation']/div[@id='header-container']/div[@id='header-left']/nav[@class='navigation-main']/div[@class='container js--menu-scroller']/div[@class='navigation--list-wrapper']/ul[@class='navigation--list container js--menu-scroller--list']/li[4]/div[1]")
	WebElement BeilagenNachos;

	@FindBy(xpath = "//div[@class='product--category category--596']//div[2]//div[1]//div[2]//div[4]//form[1]//button[1]")
	WebElement Desserts;

	@FindBy(xpath = "//div[@class='product--category category--598']//div[2]//div[1]//div[2]//div[1]//form[1]//button[1]")
	WebElement AddAnItemQuesadillas;

	@FindBy(xpath = "//button[@id='topup-modal--close']")
	WebElement AddToCartQuesadillas;

	// Initializing the Page Objects:
	public MamacitaMenuPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnBurritosMenu() {
		Burritos.click();
	}

	public void ClickToTheQuesadillasMenu() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Quesadillas).click().build().perform();
		
	}

	public void AddAnItemFromQuesadillasMenu() {
		Actions actions = new Actions(driver);
		actions.moveToElement(AddAnItemQuesadillas).click().build().perform();
		
	}

	public void AddToCartFromQuesadillasMenu() {
		// Actions actions = new Actions(driver);
		// actions.moveToElement(AddToCartQuesadillas).click().build().perform();
		AddToCartQuesadillas.click();

	}

	public void ClickToTheBuritoBowlsMenu() {
		BuritoBowls.click();
	}

	public void ClickToTheBeilagenNachosMenu() {
		BeilagenNachos.click();
	}

	public void ClickToTheDessertsMenu() {
		Desserts.click();

	}

	public List<WebElement> findallAncherTagOfPage() {
		List<WebElement> anchorTagsList = driver.findElements(By.xpath("//li[@class='top-up-item']"));
		return anchorTagsList;
	}
}
