package com.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.xpath("//input[@name='usernameOrEmail']")).sendKeys("niharpatelblogs");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sachinnihar");
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();*/
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		WebElement sddele=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		
		Select ele = new Select(sddele);
		ele.selectByIndex(0);
		List<WebElement> list = ele.getOptions();
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		
	}
	

}
