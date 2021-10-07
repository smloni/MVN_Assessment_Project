package com.aris.MVN_Assessment_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeDemoConfirmationPageObjects {
	
	WebDriver driver;

	public BlazeDemoConfirmationPageObjects(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Amount
	By AmountField = By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]");
	//Card Number
	By CradNumberField = By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]");
	//Expiration
	By ExpirationField = By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]");
	
	public WebElement AmountPrint()
	{
		return driver.findElement(AmountField);
		
	}
	public WebElement CardNumberPrint()
	{
		return driver.findElement(CradNumberField);
		
	}
	public WebElement ExpirationDatePrint()
	{
		return driver.findElement(ExpirationField);
		
	}

}
