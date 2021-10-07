package com.aris.MVN_Assessment_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeDemoPurchasePageObjects {
	
	WebDriver driver;
	
	public BlazeDemoPurchasePageObjects(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//Enter First name.
	By FirstNameText = By.id("inputName");
	//Card number.		
	By CardNumberText = By.name("creditCardNumber");
	//Name on card
	By NameOnCardText =By.id("nameOnCard");
	//'Remember me' check box.
	By RememberMeCheckBox = By.name("rememberMe");
	//Purchase Flight button
	By PurchaseFlightButton = By.xpath("/html/body/div[2]/form/div[11]/div/input");
	
	public WebElement FirstName()
	{
		return driver.findElement(FirstNameText);
	}
	public WebElement CardNumber()
	{
		return driver.findElement(CardNumberText);
	}
	public WebElement NameOnCard()
	{
		return driver.findElement(NameOnCardText);
	}
	public WebElement RememberMe()
	{
		return driver.findElement(RememberMeCheckBox);
	}
	public WebElement PurchaseFlight()
	{
		return driver.findElement(PurchaseFlightButton);
	}

}
