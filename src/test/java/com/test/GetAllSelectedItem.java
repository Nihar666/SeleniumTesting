package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GetAllSelectedItem {
	@Test
	public void getAllSelected(){
		  System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://toolsqa.com/automation-practice-form/");
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='selenium_commands']")));
		  
		  /*List<WebElement> list = driver.findElements(By.xpath("//select[@id='selenium_commands']"));
		  
		  for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());//getAllOptions from dropdownlist
		}*/
		  
		 /* WebElement ele = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		  Select sle = new Select(ele);
		  sle.selectByIndex(0);
		  sle.selectByIndex(1);
		  sle.selectByIndex(3);
		  sle.selectByIndex(4);
		  
		  System.out.println("After selected options====");
		  List<WebElement> list = sle.getAllSelectedOptions();//Get all selected options
		  for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}*/
		  
		  
		 // List list = driver.findElements(By.xpath("//select[@id='selenium_commands']"));
		  WebElement ele = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		  Select sle = new Select(ele);
		  List<WebElement> list = sle.getOptions();//GEt all options from dropdown
		  for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		  
	}

}
