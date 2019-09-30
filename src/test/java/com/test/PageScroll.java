package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageScroll {
	@Test
	public void pageScroll(){
		  System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //driver.manage().window().maximize();
		  driver.get("https://www.google.co.in/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("sachin tendulkar");
		  driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		  ((JavascriptExecutor)driver).executeScript("scrollBy(0,500)");
		  
		 
		  
		  
	}

}
