package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaittt {
	@Test
	public void waitMethod(){
		  System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://toolsqa.com/");
	      WebDriverWait wait =new WebDriverWait(driver,20);
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Enroll Your Self')]")));
		
	}

}
