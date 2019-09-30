package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropdown {
		@Test
		public void selectDDvalues(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement month_dropdown = driver.findElement(By.id("month"));
			
			Select sle = new Select(month_dropdown);
			sle.selectByIndex(0);
		}
	}

