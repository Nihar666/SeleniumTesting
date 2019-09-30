package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithOutSendKeys {
	
	@Test
	public void withOtSendKeys(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.freecrm.com/index.html");
    	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
    	
    	JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
    	myExecutor.executeScript("arguments[0].value='Nihar123';", userName);
    	
    	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    	myExecutor.executeScript("arguments[0].value='nihar@123';", password);
    	
    	driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
    	
    	
    	
    	//driver.quit();
    	
	}

}
