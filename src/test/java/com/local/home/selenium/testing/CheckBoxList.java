package com.local.home.selenium.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxList {
	
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
	}
	
	@Test
	public void testChromeDriverSelenium() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.ironspider.ca/forms/checkradio.htm");
		
		List<WebElement> chbox = driver.findElements(By.name("color")); 
		for (int i = 0; i < chbox.size(); i++) {
			System.out.println(chbox.get(i).getAttribute("value"));
		}
		
	}

	

}
