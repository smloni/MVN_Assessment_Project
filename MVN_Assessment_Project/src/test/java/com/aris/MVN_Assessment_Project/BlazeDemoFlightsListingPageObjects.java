package com.aris.MVN_Assessment_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeDemoFlightsListingPageObjects {
	
	WebDriver driver;

	public BlazeDemoFlightsListingPageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		
	}
	
	//Choose this Flight for United Airlines button.
	By ChooseThisFlightButton = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");
	
	public WebElement ChooseUnitedAirlinesFlight()
	{
		return driver.findElement(ChooseThisFlightButton);
	}

}
