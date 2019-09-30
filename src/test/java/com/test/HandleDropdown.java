package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdown {
	@Test
	public void getAllSelected(){
		  System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://toolsqa.com/automation-practice-form/");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  
		  WebElement ele = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		  Select sle = new Select(ele);
		  List<WebElement> list = sle.getOptions();
		  
		  for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		  
		  
	}
}
