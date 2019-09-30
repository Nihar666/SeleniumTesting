package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Welcome/Desktop/epison.htm");
		
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='feed-courousel-card']"));
		
		for (int i = 0; i < list.size(); i++) {
			String list1 = list.get(i).getText();
			System.out.println(list1);
			
		}
	}

}
