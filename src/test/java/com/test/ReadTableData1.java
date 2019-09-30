package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTableData1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
  	      driver.manage().window().maximize();
  	      
  	      driver.get("http://www.seleniumpoint.com/index.php/testhome");
  	      
  	      List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));
  	      
  	      for (int i = 0; i < list.size(); i++) {
			
  	    	  String str=list.get(i).getText();
  	    	  
  	    	  System.out.print(str);  
		}
  	     
	}

}
