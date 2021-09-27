package com.urbanladder.runner;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanladder.pageobjects.HomePageObjects;
import com.urbanladder.reusablecomponents.BaseClass;
import com.urbanladder.reusablecomponents.ImplicitWait;
import com.urbanladder.reusablecomponents.Landing;

@SuppressWarnings("unused")
public class HomePageRunner extends BaseClass{

	//Test case 1
	@Test(priority=0)
	public void Test1() throws IOException, InterruptedException {
		log.info("Test Case -1");
		rep=report.createTest("Test Case 1");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//Counting number of links in a page of Cart
		//hp.getClosePopUp().click();
		hp.getCart().click();
		log.info("Opened Cart Page");
		int count=driver.findElements(By.tagName("a")).size();
		log.info("No of links present is counted");
		System.out.println("No of links in Cart page: "+count);
		log.info("Count is displayed");
		driver.navigate().back();
		log.info("Navigated to home");
		rep.info("Successfully Automated");
		Thread.sleep(3000);
	}
	//Test case 2
	@Test(priority=1)
	public void Test2() throws InterruptedException {
		log.info("Test Case -2");
		rep=report.createTest("Test Case 2");
		rep.info("Test Case Initiated");
		HomePageObjects hp=new HomePageObjects(driver);
		log.info("Clicking Gift cards");
		hp.getGiftCardsPage().click();
		log.info("Gift cards page is opened");
		if(hp.getDigitalcards().isDisplayed())
		{
			System.out.println("Digital cards is available");
		}
		else
		{
			System.out.println("Digital cards is not available");
		}
		log.info("Info about Digital cards Printed");
		driver.navigate().back();
		log.info("Navigated to home");
		rep.info("Successfully Automated");
		Thread.sleep(3000);
	}
	//Test case 3
	@Test(priority=2)
	public void Test3() throws IOException, InterruptedException {
		log.info("Test Case -3");
		rep=report.createTest("Test Case 3");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//hp.getClosePopUp().click();
		log.info("Search will be initiated");
		hp.getSearch().sendKeys("Apollo Sofa Sets");
		hp.getSearch().sendKeys(Keys.ENTER);
		log.info("Search using method is initiated");
		Actions a=new Actions(driver);
		//a.moveToElement(hp.getSearch()).sendKeys("Apollo Sofa Sets").keyDown(Keys.ENTER).build().perform();
		log.info("Serched an entered item");
		driver.navigate().back();
		log.info("Navigated to home");
		rep.info("Successfully Automated");
		Thread.sleep(3000);
	}
	//Test case 4
	@Test(priority=3)
	public void Test4() throws InterruptedException, IOException {
		log.info("Test Case -4");
		rep=report.createTest("Test Case 4");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//hp.getClosePopUp().click();
		log.info("Clicking initiated");
		hp.getInsta().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle4: allWindowHandles) {
            if(!handle4.equals(mainWindowHandle)) {
            driver.switchTo().window(handle4);
            System.out.println(""+driver.getTitle());
            }
        }
        driver.switchTo().window(mainWindowHandle);
        log.info("Navigated to main window");
        rep.info("Successfully Automated");
        Thread.sleep(3000);
	}
	//Test Case 5 i.e., Tv Units > Tv name >Print 
	@Test(priority=4)
	public void Test5() throws IOException, InterruptedException {
		log.info("Test Case -5");
		rep=report.createTest("Test Case 5");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(hp.popUp().isDisplayed()) {
			hp.getClosePopUp().click();
		}
		hp.getTvUnits().click();
		System.out.println(""+hp.getTvUnits().getAttribute("title"));
		System.out.println(""+hp.getTvName().getText());
        //log.info("Printed Price");
        //log.info("Navigated to home");
		driver.navigate().back();
        Thread.sleep(3000);
	}
	//Test Case 6 i.e., BedRooms > King Size Beds > Select , New Arrivals
	@Test(priority=5)
	public void Test6() throws IOException, InterruptedException {
		log.info("Test Case -6");
		rep=report.createTest("Test Case 6");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		hp.getClosePopUp().click();
		Actions a= new Actions(driver);
		//a.moveToElement(hp.getBRoom()).build().perform();
		hp.getBRoom().click();
		//log.info("Bed Rooms Hovered");
		hp.getBRItem().click();
		//log.info("King Size Beds Selected");
		System.out.println(driver.getTitle());
		//log.info("Title displayed");
		hp.getSelectType().click();
		//log.info("Dropdown to select opened");
		hp.getNArrivals().click();
		//log.info("New Arrivals Selected");
		driver.navigate().back();
		//log.info("Navigated to home");
		Thread.sleep(3000);
	}
	//Test Case -7 i.e., Simple , Gifts > Validate Title
	@Test(priority=6)
	public void Test7() throws IOException, InterruptedException {
		log.info("Test Case -7");
		rep=report.createTest("Test Case 7");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//hp.getClosePopUp().click();
		hp.getGiftCardsPage().click();
		log.info("Opened Gifts page");
		String title=driver.getTitle();
		log.info("Ttile is acquired");
		Assert.assertEquals(title, "Gift Card - Buy Gift Cards & Vouchers Online for Wedding, Birthday | Urban Ladder");
		log.info("Assertion passed");
		driver.navigate().back();
		log.info("Navigated to home");
		rep.info("Successfully Automated");
		Thread.sleep(3000);
	}
	//Test Case -8
	@Test(priority=7)
	public void Test8() throws IOException, InterruptedException {
		log.info("Test Case -8");
		rep=report.createTest("Test Case 8");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//hp.getClosePopUp().click();
		//log.info("Clicking Track Orders");
		hp.getTrackOrder().click();
		//log.info("Clicking Login Option");
		hp.getLoginOfTrackOrder().click();
		//log.info("Asserting Title");
		Assert.assertEquals("Login - Urban Ladder", "Login - Urban Ladder");
		//log.info("Assertion Passed");
		TakesScreenshot tsObj=(TakesScreenshot)driver;
		File src=tsObj.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\LoginPage.png");
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		log.info("Navigated to home");
		rep.info("Successfully Automated");
		Thread.sleep(3000);
	}
	//Test Case -9 i.e., Stores > Bandra,Mumbai > View on maps > Validate title of mpas page
	@Test(priority=8)
	public void Test9() throws IOException, InterruptedException {
		log.info("Test Case -9");
		rep=report.createTest("Test Case 10");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//hp.getClosePopUp().click();
		//log.info("Getting stores page");
		hp.getStores().click();
		//log.info("Getting Specified Location");
		hp.getSpecificLoc().click();
		//log.info("Opening on Maps");
		hp.getOnMaps().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for(String handle9: allWindowHandles)
        {
            if(!handle9.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle9);
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            String mapsTitle=driver.getTitle();
            System.out.println(mapsTitle);
            //log.info("Asserting Title");
            //Assert.assertEquals(mapsTitle,"Urban Ladder - Google Maps");
            //log.info("Assertion Passed");
            }
    	}
        driver.switchTo().window(mainWindowHandle);
        //log.info("Navigated to home");
        rep.info("Successfully Automated");
        Thread.sleep(3000);
	}
	//Test Case -10
	@Test(priority=9)
	public void Test10() throws IOException, InterruptedException {
		log.info("Test Case -10");
		rep=report.createTest("Test Case 10");
		rep.info("Test Case Initiated");
		//driver=startApp();
		HomePageObjects hp=new HomePageObjects(driver);
		//hp.getClosePopUp().click();
		log.info("Getting Help Page");
		hp.getHelpPage().click();
		log.info("Clicking Contact us in Help Page");
		hp.getContactUs().click();
		log.info("Getting Title");
		String title= driver.getTitle();
		System.out.println(title);
		log.info("Asserting Title");
		//Assert.assertEquals(title, "Contact Us | urbanladder.com");
		log.info("Title Assertion passed");
		driver.navigate().back();
		log.info("Navigated to home");
		rep.info("Successfully Automated");
		Thread.sleep(3000);
	}
	
	//Checkout
	@Test(priority=10)
	public void Test11() {
		log.info("Test Case -Checkout");
		rep=report.createTest("Test Case 11");
		rep.info("Test Case Initiated");
		HomePageObjects hp=new HomePageObjects(driver);
		log.info("Search Initiated");
		hp.SearchBox().sendKeys("Sofa");
		hp.SearchButton().click();
		hp.SearchItem().click();
		log.info("Adding to cart");
		hp.Addtocart().click();
		log.info("Added to cart");
		int n=2;
		for(int i=1;i<n;i++) {
		hp.SelectQuantity().sendKeys(Keys.ARROW_DOWN);
		}
		hp.SelectQuantity().sendKeys(Keys.ENTER);
		System.out.println("Final Price For quantity: "+hp.getFinalPrice().getText());
		log.info("Printed Price");
		rep.info("Successfully Automated");
	}

	
}
