package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkPresent {
     
	@Test
    public void linkNamePresent(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present in the Pages are::"+links.size());
		for (WebElement ele : links) {
			System.out.println(ele.getAttribute("href"));
		}
}
}
