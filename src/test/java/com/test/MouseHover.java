package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void mouseHoverExample(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[contains(text(),'TRAININGS')])[1]"));
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Corporate Trainings')]")).click();
	}

}
