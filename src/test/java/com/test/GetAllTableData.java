package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllTableData {
	@Test
   public void getAllTableData(){
	  System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://toolsqa.com/automation-practice-table/");
	  
	  List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));
	  
	  for (int i = 0; i < list.size(); i++) {
		String tabledata = list.get(i).getText();
		System.out.println(tabledata);
	}
   }
}
