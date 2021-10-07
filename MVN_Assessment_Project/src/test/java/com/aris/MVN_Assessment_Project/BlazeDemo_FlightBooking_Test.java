package com.aris.MVN_Assessment_Project;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**********************************************************************************************************
 * @Purpose:To verify that BlazeDemo application for Flight Booking service.
 * @author:Shivaningappa Loni
 * @Date :10-Oct-2021
 * @Pre-requisite: data.properties & Browser driver path should set accordingly.
 * @Updated by and when:
 **********************************************************************************************************/

public class BlazeDemo_FlightBooking_Test extends Base
{
	@Test
	public void ValidateBlazeDemoHome() throws Exception {
		
		myPrint("Assessemnt Assignment Begins");
		
		driver=BrowserCall();
		driver.get(properties.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Validate You have navigated to a Blaze Demo Page
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "BlazeDemo");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void ValidateReservePage() throws Exception{
		//Select Departure City & New York as Destination city in Home Page.
		BlazeDemoHomePageObjects home = new BlazeDemoHomePageObjects(driver);
		home.DepartutureCity().sendKeys("Bostan");
		home.DestinationCity().sendKeys("New York");
			
		home.FindFlights().click();
				
		//Validate Reserve page.
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Reserve page Assert :"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "BlazeDemo - reserve");
	}
	@Test(priority=2)
	public void ValidatePurchasePage() throws Exception{
		//Click Choose this Flight for United Airlines
		BlazeDemoFlightsListingPageObjects flightsList = new BlazeDemoFlightsListingPageObjects(driver);
		flightsList.ChooseUnitedAirlinesFlight().click();
			
		Thread.sleep(2000);
		//Validate purchase page.
		System.out.println("Reserve page Assert :"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "BlazeDemo Purchase");
	}
	@Test(priority=3)
	public void ValidateCinfirmationPage() throws Exception{
		//Purchase Page Elements  -Enter First name, Card number, name on card and select remember me check box & click on purchase fight.
		BlazeDemoPurchasePageObjects purchase = new BlazeDemoPurchasePageObjects(driver);
		purchase.FirstName().sendKeys("Shivaning Loni");
		purchase.CardNumber().sendKeys("1234567890123456");
		purchase.NameOnCard().sendKeys("Shiv Loni");
		purchase.RememberMe().click();
		//click on purchase Flight
		purchase.PurchaseFlight().click();		
		Thread.sleep(2000);
		//Validate you have navigated to a confirmation page
		System.out.println("Reserve page Assert :"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "BlazeDemo Confirmation");
	}
	@Test(priority=4)
	public void PrintConfirmedData() throws Exception{
		//Print – Amount, Card Number and Expiration
		BlazeDemoConfirmationPageObjects dataPrint = new BlazeDemoConfirmationPageObjects(driver);
		String vAmount = dataPrint.AmountPrint().getText();
		String vCardNumber = dataPrint.CardNumberPrint().getText();
		String vExpiration = dataPrint.ExpirationDatePrint().getText();

		System.out.println("Amount :"+vAmount);
		Assert.assertEquals(vAmount, "555 USD");
		System.out.println("Card Number :"+vCardNumber);
		Assert.assertEquals(vCardNumber, "xxxxxxxxxxxx1111");
		System.out.println("Expiration :"+vExpiration);
		Assert.assertEquals(vExpiration, "11 /2018");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	public static void myPrint(String vText)
	{
		System.out.println(vText);
	}
	
	

}
