package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerDemoAdvance {
	@Test
	public void pickDate() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
		Thread.sleep(3000);
		//It will store all webelements in List
		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		int total_node = dates.size();
		
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if(date.equals("23")){
				dates.get(i).click();
				break;
			}
		}
}
}
