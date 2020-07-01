package com.mycompany.web.tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandaloneTest {

	static long pathdir = System.currentTimeMillis();
	static int counter = 1;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/deepikaagarwal/Desktop/Programs/Selenium/BrowserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		Thread.sleep(2000);
		initializeReportFolder(driver);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		initializeReportFolder(driver);
		driver.navigate().back();
		Thread.sleep(5000);
		initializeReportFolder(driver);
		driver.navigate().forward();
		Thread.sleep(5000);
		initializeReportFolder(driver);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		initializeReportFolder(driver);
		driver.navigate().to(new URL("https://www.gmail.com"));
		Thread.sleep(5000);
		initializeReportFolder(driver);
		
		driver.close();
		
	}
	
	static void initializeReportFolder(WebDriver driver) throws IOException
	{
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File("target/" + pathdir + "/" + (counter++) + ".png");
		targetFile.getParentFile().mkdirs();
		Files.copy(srcFile.toPath(), targetFile.toPath());
	}

}
