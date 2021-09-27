package com.urbanladder.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.uistore.HomePageUI;

public class HomePageObjects {

	public WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	HomePageUI hpui=new HomePageUI();
	public WebElement popUp() {
//		if(driver.findElement(hpui.popUp).isDisplayed()) {
//			
//		}
		return driver.findElement(hpui.popUp);
	}
	public WebElement getClosePopUp()
	{
		return driver.findElement(hpui.closePopUp);
	}
	//Test case 2
	public WebElement getCart() {
		return driver.findElement(hpui.cartId);
	}
	public WebElement getDigitalcards()
	{
		return driver.findElement(hpui.dcId);
	}
	
	//Test case 3
	public WebElement getSearch() {
		return driver.findElement(hpui.searchId);
	}
	//Test case 4 methods
	public WebElement getInsta()	{
		return driver.findElement(hpui.instaId);
	}
	//test case 5 Methods
	public WebElement getTvUnits() {
		return driver.findElement(hpui.TvUnitsId);
	}
	
	public WebElement getTvName() {
		return driver.findElement(hpui.TvItemId);
	}
	//Test case 5 Methods Completed
	
	//Test case 6 Methods
	public WebElement getBRoom() {
		return driver.findElement(hpui.bedRoomsId);
	}
	
	public WebElement getBRItem() {
		return driver.findElement(hpui.brItem);
	}
	
	public WebElement getSelectType() {
		return driver.findElement(hpui.selectType);
	}
	
	public WebElement getNArrivals() {
		return driver.findElement(hpui.newId);
	}
	//Test case 6 Methods Completed	
	
	//Test case 7 Methods
	public WebElement getGiftCardsPage() {
		return driver.findElement(hpui.giftCardsId);
	}
	//Test case 7 Methods Completed
	
	//Test case 8 Methods
	public WebElement getTrackOrder() {
		return driver.findElement(hpui.trackId);
	}
	public WebElement getLoginOfTrackOrder() {
		return driver.findElement(hpui.logtoTrackId);
	}
	//Test case 8 Methods Completed
	
	//Test case 9 Methods
	public WebElement getStores() {
		return driver.findElement(hpui.storeId);
	}
		
	public WebElement getSpecificLoc() {
		return driver.findElement(hpui.locId);
	}
		
	public WebElement getOnMaps() {
		return driver.findElement(hpui.mapId);
	}
	//Test case 9 Methods Completed
	
	//Test case 10 Methods
	public WebElement getHelpPage() {
		return driver.findElement(hpui.helpId);
	}
	
	public WebElement getContactUs() {
		return driver.findElement(hpui.cusId);
	}
	//Test case 10 Methods Completed
	public WebElement getEmailentered()
	{
		return driver.findElement(hpui.emailId);
	}
	public WebElement getPasswordentered()
	{
		return driver.findElement(hpui.passId);
	}
	//Checkout
	public WebElement SearchBox()
	{
		return driver.findElement(hpui.searchBox);
	}
	public WebElement SearchButton()
	{
		return driver.findElement(hpui.searchButton);
	}
	public WebElement SearchItem()
	{
		return driver.findElement(hpui.Item);
	}
	public WebElement Addtocart()
	{
		return driver.findElement(hpui.addcart);
	}
	public WebElement SelectQuantity()
	{
		return driver.findElement(hpui.quantity); 
	}
	public WebElement getFinalPrice()
	{
		return driver.findElement(hpui.price);
	}

}
