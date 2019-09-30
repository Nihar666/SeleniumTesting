package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadTableData {
    @Test
	public void readData(){
      System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.com/automation-practice-table/");
	  String txt = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText(); 
	  System.out.println(txt);
	}
}
