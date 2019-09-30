package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleRadioButtons {
	
	@Test
     public void handleRadio(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/");
		List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		
		for (int i = 0; i < radioButtons.size(); i++) {
			WebElement radio=radioButtons.get(i);
			String value=radio.getAttribute("value");
			System.out.println(value);
			
			if(value.equalsIgnoreCase("Ruby")){
				radio.click();
			}
		}
     }
}
