package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTable {

	@Test
	public void table(){
		
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  //driver.manage().window().maximize();
		  driver.get("http://toolsqa.com/automation-practice-table/");
		  
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='content']/table")));
		  WebElement table=driver.findElement(By.xpath(".//*[@id='content']/table/tbody"));
		  
		  List<WebElement> rowCount=table.findElements(By.tagName("tr"));
		  for(int i=0;i<rowCount.size();i++){
			  
			  String trVal=rowCount.get(i).findElement(By.tagName("td")).getText();
			  System.out.println(trVal);
			 /* List<WebElement> colCount=rowCount.get(i).findElements(By.tagName("td"));
			  
			  for(int j=0;j<colCount.size();j++){
				  
				  System.out.println(colCount.get(j).getText());
			  }*/
		  }
		  
		
	}
	
	
}
