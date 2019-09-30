package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandle {
	
	@Test
	public void handlingWebTable(){
		
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id='customers']/tbody/tr[2]/td[1]
		//*[@id='customers']/tbody/tr[3]/td[1]
		//*[@id='customers']/tbody/tr[7]/td[1]
		
		String beforeXpath ="//table[@id='customers']/tbody/tr[";
		String afterXpath ="]/td[1]";
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = list.size();
		System.out.println(rowCount);
		
		for (int i = 2; i <=rowCount; i++) {
			String actualXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Island Trading")){
				System.out.println("Company name "+element.getText()+"found in posiion::"+i);
			}
			
		}
		
		
	}

}
