package com.local.home.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
	}
	
	
	@Test
	public void testChromeDriverSelenium() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: " + appTitle);
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("nihar");
		//driver.quit();
	}

}