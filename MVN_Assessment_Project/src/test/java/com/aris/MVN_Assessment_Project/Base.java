package com.aris.MVN_Assessment_Project;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	public static String vBrowser;
	
	public static WebDriver BrowserCall() throws Exception
	{
		properties=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Automation_Shared\\workspace\\MVN_Assessment_Project\\data.properties");
		properties.load(fis);
		vBrowser=properties.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/drivers/chromedriver.exe");
		     driver = new ChromeDriver();
			
				}
		else if(vBrowser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/Automation_Shared/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		return driver;
		
	}

}
