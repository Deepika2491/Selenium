package com.mycompany.web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		initializeReportFolder();
		
		System.setProperty("webdriver.chrome.driver","/Users/deepikaagarwal/Desktop/Programs/Selenium/BrowserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		Thread.sleep(2000);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		
	}
	
	static void initializeReportFolder()
	{
		//File 
	}

}
