package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Generic.Utility;

public class ScreenshotOnFailureee1 {
	WebDriver driver;
	@Test
	public void screenshotCapture(){
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Utility.capturedScreenshot(driver, "Browser Started");
		driver.findElement(By.xpath("//input[@id='emailll']")).sendKeys("nihar");
		//Utility.capturedScreenshot(driver, screenshotName);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			Utility.capturedScreenshot(driver, result.getName());
		}
	}

}
