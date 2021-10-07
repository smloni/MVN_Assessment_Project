package com.aris.MVN_Assessment_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeDemoHomePageObjects {

	WebDriver driver;
	
	public BlazeDemoHomePageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		
	}
	//Departure City drop down.
	By DepartureCitySelect = By.xpath("/html/body/div[3]/form/select[1]");
	//Destination City drop down.
	By DestinationCitySelect = By.xpath("/html/body/div[3]/form/select[2]");
	//Find Flights button.
	By FindFlightsButton = By.xpath("/html/body/div[3]/form/div/input");
	
	public WebElement DepartutureCity()
	{
		return driver.findElement(DepartureCitySelect);
	}
	
	public WebElement DestinationCity()
	{
		return driver.findElement(DestinationCitySelect);
		
	}

	public WebElement FindFlights()
	{
		return driver.findElement(FindFlightsButton);
	}
}
